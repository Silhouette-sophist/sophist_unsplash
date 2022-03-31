package com.example.sophist_unsplash.dao.mapper;

import com.example.sophist_unsplash.bean.UnsplashLinks;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Mapper : 表示本类是一个 MyBatis 的 Mapper，等价于以前 Spring 整合 MyBatis 时的 Mapper 接口
@Mapper
@Repository
public interface SearchUnsplashLinksMapper {

    //选择全部
    List<UnsplashLinks> selectAllUnsplashLinks();

    int insertUnsplashLinks(UnsplashLinks unsplashLinks);

    //根据id选择
    /*UnsplashLinks selectUnsplashLinksById(int id);

    //添加一个
    int insertUnsplashLinks(UnsplashLinks user);

    //修改一个
    int updateUnsplashLinks(UnsplashLinks user);

    //根据id删除
    int deleteUnsplashLinks(int id);*/
}
