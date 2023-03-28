package com.example.review.service;

import com.example.review.dao.CategoryDao;
import com.example.review.dao.PostDao;
import com.example.review.dao.UsersDao;
import com.example.review.entity.Category;
import com.example.review.entity.Post;
import com.example.review.entity.Users;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class PostService {
    private CategoryDao categoryDao;
    private PostDao postDao;
    private UsersDao usersDao;

    public PostService(CategoryDao categoryDao, PostDao postDao, UsersDao usersDao) {
        this.categoryDao = categoryDao;
        this.postDao = postDao;
        this.usersDao = usersDao;
    }

    public List<Post> findAllPost(){
        return postDao.findAll();

    }
    @Transactional
    public void savePost(Post post){
        Category category=categoryDao.findById(post.getCategory().getId()).orElseThrow(EntityNotFoundException::new);
        Users users=usersDao.findById(post.getUsers().getId()).orElseThrow(EntityNotFoundException::new);
        category.addPost(post);
        users.addPost(post);
        postDao.save(post);
    }

}
