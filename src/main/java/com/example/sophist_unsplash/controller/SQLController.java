package com.example.sophist_unsplash.controller;

import com.example.sophist_unsplash.bean.UnsplashSearchInfo;
import com.example.sophist_unsplash.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SQLController {

    @Autowired
    private SearchUnsplashInfoMapper searchUnsplashInfoMapper;

    @Autowired
    private SearchUnsplashPhotoMapper searchUnsplashPhotoMapper;

    @Autowired
    private SearchUnsplashUserMapper searchUnsplashUserMapper;

    @Autowired
    private SearchUnsplashLinksMapper searchUnsplashLinksMapper;

    @Autowired
    private SearchUnsplashUrlsMapper searchUnsplashUrlsMapper;

    @ResponseBody
    @GetMapping("/api/show")
    public String show() {

        System.out.println("request.....");

        List<UnsplashSearchInfo> unsplashSearchInfos = searchUnsplashInfoMapper.selectAllUnsplashSearchInfo();
        System.out.println(unsplashSearchInfos);
        return "result";
    }
}
