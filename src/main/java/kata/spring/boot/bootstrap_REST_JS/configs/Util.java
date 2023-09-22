package kata.spring.boot.bootstrap_REST_JS.configs;

import kata.spring.boot.bootstrap_REST_JS.entity.Role;
import kata.spring.boot.bootstrap_REST_JS.entity.User;
import kata.spring.boot.bootstrap_REST_JS.repository.RoleRepository;
import kata.spring.boot.bootstrap_REST_JS.service.UserService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collection;


@Component
public class Util {

    private final RoleRepository roleRepository;
    private final UserService userService;

    public Util(RoleRepository roleRepository, UserService userService) {
        this.roleRepository = roleRepository;
        this.userService = userService;
    }

    @PostConstruct
    public void initUsers() {
        Role admin = new Role("ROLE_ADMIN");
        roleRepository.save(admin);
        Collection<Role> roles = new ArrayList<>();
        roles.add(admin);
        userService.editUser(new User("Admin", "Adminov",
                (byte)23, "fdfe@mail.ru",  "Admin", "admin", roles));

        Role user = new Role("ROLE_USER");
        roleRepository.save(user);
        Collection<Role> users = new ArrayList<>();
        users.add(user);
        userService.editUser(new User("User", "Us",
                (byte)22, "gtr@mail.ru",   "User", "user", users));

    }
}