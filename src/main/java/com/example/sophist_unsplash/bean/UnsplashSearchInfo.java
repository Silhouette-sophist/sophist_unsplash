package com.example.sophist_unsplash.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UnsplashSearchInfo {

    private Integer searchIndex;
    private String keywords;
    private String searchResultKey;
}
