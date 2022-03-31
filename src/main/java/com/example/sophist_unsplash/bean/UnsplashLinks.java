package com.example.sophist_unsplash.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UnsplashLinks implements Serializable {
    private String self;
    private String html;
    private String photos;
    private String likes;
    private String portfolio;
    private String download;
    private String downloadLocation;
    private String unsplashLinksKey;
}
