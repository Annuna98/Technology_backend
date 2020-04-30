package com.myamikova.blog.service;

import com.myamikova.blog.Models.User;
import com.myamikova.blog.Models.UserDto;
import com.myamikova.blog.dao.UserDAO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Transactional
@Service(value = "userService")
public class UserServiceImp implements UserService {

    @Autowired
    private UserDAO userDao;

    public List<User> findAll() {
        List<User> list = new ArrayList<>();
        userDao.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Override
    public void delete(int id) {
        userDao.deleteById(id);
    }

    @Override
    public User findOne(String username) {
        return userDao.findByUsername(username);
    }

    @Override
    public User findById(int id) {
        Optional<User> optionalUser = userDao.findById(id);
        return optionalUser.isPresent() ? optionalUser.get() : null;
    }

    @Override
    public UserDto update(UserDto userDto) {
        User user = findById(userDto.getId());
        if(user != null) {
            BeanUtils.copyProperties(userDto, user, "password", "username");
            userDao.save(user);
        }
        return userDto;
    }

    @Override
    public User save(UserDto user){
        User newUser = new User();
        newUser.setUsername(user.getUsername());
        newUser.setFname(user.getFname());
        newUser.setSurname(user.getSurname());
        newUser.setGender(user.getGender());
        newUser.setWeight(user.getWeight());
        newUser.setHeight(user.getHeight());
        newUser.setAge(user.getAge());
        newUser.setDesired_weight(user.getDesired_weight());

        return userDao.save(newUser);
    }
}
