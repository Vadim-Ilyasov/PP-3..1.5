package kata.spring.boot.bootstrap_REST_JS.repository;



import kata.spring.boot.bootstrap_REST_JS.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
