package com.example.sophist_unsplash.dao;

import com.example.sophist_unsplash.bean.UnsplashSearchInfo;

import java.util.List;

public interface UnsplashDao {

    List<UnsplashSearchInfo> selectAll();
}
