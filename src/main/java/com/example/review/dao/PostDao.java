package com.example.review.dao;

import com.example.review.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostDao extends JpaRepository<Post,Integer> {
}
