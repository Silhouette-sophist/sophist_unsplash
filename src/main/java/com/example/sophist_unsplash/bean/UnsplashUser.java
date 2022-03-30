package com.example.sophist_unsplash.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UnsplashUser {

    private String id;
    private String username;
    private String name;
    private String portfolio_url;
    private String bio;
    private String location;
    private Integer total_likes;
    private Integer total_photos;
    private Integer total_collection;
    private String unsplashUserKey;
}
