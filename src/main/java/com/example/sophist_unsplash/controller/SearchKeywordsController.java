package com.example.sophist_unsplash.controller;

import com.example.sophist_unsplash.bean.UnsplashSearchInfo;
import com.example.sophist_unsplash.dao.SqlSessionProvider;
import com.example.sophist_unsplash.dao.UnsplashDao;
import com.example.sophist_unsplash.mapper.SearchUnsplashInfoMapper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class SearchKeywordsController {

    @Autowired
    private SearchUnsplashInfoMapper searchUnsplashInfoMapper;

    @ResponseBody
    @PostMapping("api/upload/search")
    public String uploadSearch(
            @RequestParam(name = "keywords") String keywords,
            @RequestBody(required = false) String searchResults
    ) {

        Gson gson = new Gson();
        List<UnsplashSearchInfo> searchPhotoList = gson.fromJson(searchResults, new TypeToken<List<UnsplashSearchInfo>>(){}.getType());
        System.out.println(Arrays.toString(searchPhotoList.toArray()) + "uploadSearch " + keywords);
        searchPhotoList.forEach(it -> {
            System.out.println("it unsplash " + it);
            List<UnsplashSearchInfo> unsplashPhotos = SqlSessionProvider.INSTANCE.getSqlSessionFactory()
                    .openSession().getMapper(UnsplashDao.class)
                    .selectAll();
        });
        return "uploadSearch" + searchPhotoList;
    }


    public String obtainSearchInfo() {
        List<UnsplashSearchInfo> unsplashSearchInfos = searchUnsplashInfoMapper.selectAllUnsplashSearchInfo();
        unsplashSearchInfos.forEach( info -> {
            System.out.println(info);
        });
        return unsplashSearchInfos + "";
    }
}
