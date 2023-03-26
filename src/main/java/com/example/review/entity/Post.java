package com.example.review.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;
@Column(columnDefinition = "text")
    private String body;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate datePosted;

    @ManyToOne
    private Users users;
    @ManyToOne
    private Category category;


}
