package kata.spring.boot.bootstrap_REST_JS.entity;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;


@Entity
@Table(name = "roles")
public class Role implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "role")
    private String roleCase;


    public Role() {
    }

    public Role(String roleCase) {
        this.roleCase = roleCase;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleCase() {
        return roleCase;
    }

    public void setRoleCase(String roleCase) {
        this.roleCase = roleCase;
    }

    @Override
    public String getAuthority() {
        return getRoleCase();
    }

    @Override
    public String toString() {
        return roleCase.substring(5);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return id == role.id && Objects.equals(role, role.roleCase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, roleCase);
    }
}