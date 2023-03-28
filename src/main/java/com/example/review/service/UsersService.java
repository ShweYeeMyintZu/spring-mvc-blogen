package com.example.review.service;

import com.example.review.dao.CategoryDao;
import com.example.review.dao.UsersDao;
import com.example.review.entity.Category;
import com.example.review.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsersService {
    @Autowired
    private UsersDao usersDao;

    public void saveUser(Users user){
        usersDao.save(user);
    }
    public List<Users> findAllUsers(){
        return usersDao.findAll();
    }

}

