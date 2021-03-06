package com.example.sophist_unsplash.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UnsplashUser  implements Serializable {

    private String id;
    private String username;
    private String name;
    private String portfolioUrl;
    private String bio;
    private String location;
    private Integer totalLikes;
    private Integer totalPhotos;
    private Integer totalCollection;
    private String unsplashUserKey;
}
