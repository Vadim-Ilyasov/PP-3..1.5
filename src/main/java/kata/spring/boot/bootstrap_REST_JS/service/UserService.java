package kata.spring.boot.bootstrap_REST_JS.service;


import kata.spring.boot.bootstrap_REST_JS.entity.User;

import java.util.List;

public interface UserService  {
    List<User> getUsersList();
    User getById(Long id);
    void addUser(User user);
    void deleteUser(Long id);
    void editUser(User user);
    User findByUsername(String username);

}