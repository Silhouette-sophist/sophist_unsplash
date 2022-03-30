package com.example.sophist_unsplash.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UnsplashPhoto {

    private String id;
    private String created_at;
    private Integer width;
    private Integer height;
    private String color;
    private Integer likes;
    private String description;
    private String unsplashUrlKey;
    private String unsplashLinksKey;
    private String unsplashUserKey;
    private String searchResultKey;
}
