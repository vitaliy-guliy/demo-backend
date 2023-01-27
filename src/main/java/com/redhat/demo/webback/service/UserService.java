package com.redhat.demo.webback.service;

import com.redhat.demo.webback.models.User;
import com.redhat.demo.webback.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepo userRepo;
    public List<User> listAllUser() {
        return userRepo.findAll();
    }

    public void saveUser(User user) {
        userRepo.save(user);
    }

    public User getUser(Integer id) {
        return userRepo.findById(id).get();
    }

    public void deleteUser(Integer id) {
        userRepo.deleteById(id);
    }

}
