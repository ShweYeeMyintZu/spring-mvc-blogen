package com.example.review.dao;

import com.example.review.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersDao extends JpaRepository<Users,Integer> {
}
