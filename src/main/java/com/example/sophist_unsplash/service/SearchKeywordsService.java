package com.example.sophist_unsplash.service;

import com.example.sophist_unsplash.bean.*;
import com.example.sophist_unsplash.dao.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchKeywordsService {

    @Autowired
    private SearchUnsplashInfoMapper searchUnsplashInfoMapper;

    @Autowired
    private SearchUnsplashPhotoMapper searchUnsplashPhotoMapper;

    @Autowired
    private SearchUnsplashLinksMapper searchUnsplashLinksMapper;

    @Autowired
    private SearchUnsplashUrlsMapper searchUnsplashUrlsMapper;

    @Autowired
    private SearchUnsplashUserMapper searchUnsplashUserMapper;

    public void insertSearchKeywords(String keywords, List<UnsplashPhoto> unsplashPhotoList) {
        String searchHashCode = unsplashPhotoList.hashCode() + "";
        int i = searchUnsplashInfoMapper.insertUnsplashSearchInfo(new UnsplashSearchInfo(0, keywords, System.currentTimeMillis() + "", searchHashCode));
        System.out.println("change counts = " + i);
        for (UnsplashPhoto unsplashPhoto : unsplashPhotoList) {
            //1.先存储UnsplashLinks
            UnsplashLinks unsplashLinks = unsplashPhoto.getLinks();
            String unsplashLinksKey = "";
            if(unsplashLinks != null) {
                unsplashLinksKey += unsplashLinks.hashCode();
                unsplashLinks.setUnsplashLinksKey(unsplashLinksKey);
                searchUnsplashLinksMapper.insertUnsplashLinks(unsplashLinks);
            }
            unsplashPhoto.setUnsplashLinksKey(unsplashLinksKey);

            //2.存储UnsplashUrl
            UnsplashUrls unsplashUrls = unsplashPhoto.getUrls();
            String unsplashUrlsKey = "";
            if(unsplashUrls != null) {
                unsplashUrlsKey += unsplashUrls.hashCode();
                unsplashUrls.setUnsplashUrlsKey(unsplashUrlsKey);
                searchUnsplashUrlsMapper.insertUnsplashUrls(unsplashUrls);
            }
            unsplashPhoto.setUnsplashUrlKey(unsplashUrlsKey);

            //3.存储UnsplashUser
            UnsplashUser unsplashUser = unsplashPhoto.getUser();
            String unsplashUserKey = "";
            if(unsplashUser != null) {
                unsplashUserKey += unsplashUser.hashCode();
                unsplashUser.setUnsplashUserKey(unsplashUserKey);
                searchUnsplashUserMapper.insertUnsplashUser(unsplashUser);
            }
            unsplashPhoto.setUnsplashUserKey(unsplashUserKey);

            //4.最后存储UnsplashPhoto
            unsplashPhoto.setSearchResultKey(searchHashCode);
            searchUnsplashPhotoMapper.insertUnsplashPhoto(unsplashPhoto);
        }
    }
}
