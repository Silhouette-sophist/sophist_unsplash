package com.example.sophist_unsplash.mapper;

import com.example.sophist_unsplash.bean.UnsplashUrls;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Mapper : 表示本类是一个 MyBatis 的 Mapper，等价于以前 Spring 整合 MyBatis 时的 Mapper 接口
@Mapper
@Repository
public interface SearchUnsplashUrlsMapper {

    //选择全部
    List<UnsplashUrls> selectAllUnsplashUrls();

    //根据id选择
    /*UnsplashUrls selectUnsplashUrlsById(int id);

    //添加一个
    int insertUnsplashUrls(UnsplashUrls user);

    //修改一个
    int updateUnsplashUrls(UnsplashUrls user);

    //根据id删除
    int deleteUnsplashUrls(int id);*/
}
