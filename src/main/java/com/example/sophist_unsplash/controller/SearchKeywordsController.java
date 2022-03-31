package com.example.sophist_unsplash.controller;

import com.example.sophist_unsplash.bean.UnsplashPhoto;
import com.example.sophist_unsplash.service.SearchKeywordsService;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SearchKeywordsController {

    @Autowired
    private SearchKeywordsService searchKeywordsService;

    @ResponseBody
    @PostMapping("api/upload/search")
    public String uploadSearch(
            @RequestParam(name = "keywords") String keywords,
            @RequestBody(required = false) String searchResults
    ) {

        Gson gson = new Gson();
        List<UnsplashPhoto> searchPhotoList = gson.fromJson(searchResults, new TypeToken<List<UnsplashPhoto>>(){}.getType());
        searchKeywordsService.insertSearchKeywords(keywords, searchPhotoList);
        return "ok";
    }
}
