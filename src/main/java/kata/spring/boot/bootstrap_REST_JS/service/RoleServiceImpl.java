package kata.spring.boot.bootstrap_REST_JS.service;

import kata.spring.boot.bootstrap_REST_JS.entity.Role;
import kata.spring.boot.bootstrap_REST_JS.repository.RoleRepository;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;


@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }


    @Transactional
    @Override
    public List<Role> getRolesList() {
        return roleRepository.findAll();
    }


}
