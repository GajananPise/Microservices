package com.user.service;

import com.user.dao.UserRepository;
import com.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{

    List<User> list = List.of(
            new User(111, "Suresh", "1111"),
            new User(222, "Ramesh", "2222"),
            new User(333, "Mahesh", "3333")
    );
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUser() {
        List<User> list = (List<User>)userRepository.findAll();
        return list;
    }

    @Override
    public User getUser(int id) {
      // return  this.userRepository.findById(id);
        return list.stream().filter(user->user.getUserId()==id).findAny().orElse(null);
    }
}
