package com.example.sophist_unsplash.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UnsplashSearchInfo implements Serializable {

    private Integer searchIndex;
    private String keywords;
    private String searchUploadDate;
    private String searchResult;
}
