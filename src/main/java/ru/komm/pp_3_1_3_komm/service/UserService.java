package ru.komm.pp_3_1_3_komm.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.komm.pp_3_1_3_komm.model.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    public List<User> getAllUsers();
    public User getUser(int id);
    public void addUser(User user);
    public void editUser(int id, User user);
    public void deleteUser(int id);


}
