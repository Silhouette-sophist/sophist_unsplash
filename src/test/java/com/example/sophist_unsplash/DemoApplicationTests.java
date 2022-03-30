package com.example.sophist_unsplash;

import com.example.sophist_unsplash.bean.UnsplashSearchInfo;
import com.example.sophist_unsplash.dao.mapper.SearchUnsplashInfoMapper;
import com.example.sophist_unsplash.dao.mapper.SearchUnsplashPhotoMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private SearchUnsplashInfoMapper searchUnsplashInfoMapper;
    @Autowired
    private SearchUnsplashPhotoMapper searchUnsplashPhotoMapper;

    @Test
    void contextLoads() throws SQLException, IOException {

        System.out.println(searchUnsplashInfoMapper);
        System.out.println(searchUnsplashPhotoMapper);

        List<UnsplashSearchInfo> unsplashPhotos = searchUnsplashPhotoMapper.selectAllUnsplashPhoto();
        System.out.println(unsplashPhotos);
    }

}
