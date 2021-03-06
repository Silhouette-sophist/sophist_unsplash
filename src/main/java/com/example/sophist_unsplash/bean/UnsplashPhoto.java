package com.example.sophist_unsplash.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UnsplashPhoto implements Serializable {

    private String id;
    private String createdAt;
    private Integer width;
    private Integer height;
    private String color;
    private Integer likes;
    private String description;
    private String unsplashUrlKey;
    private String unsplashLinksKey;
    private String unsplashUserKey;
    private String searchResultKey;
    private UnsplashUrls urls;
    private UnsplashLinks links;
    private UnsplashUser user;
}
