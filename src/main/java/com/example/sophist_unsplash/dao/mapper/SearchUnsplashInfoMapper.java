package com.example.sophist_unsplash.dao.mapper;

import com.example.sophist_unsplash.bean.UnsplashSearchInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Mapper : 表示本类是一个 MyBatis 的 Mapper，等价于以前 Spring 整合 MyBatis 时的 Mapper 接口
@Mapper
@Repository
public interface SearchUnsplashInfoMapper {

    //选择全部
    List<UnsplashSearchInfo> selectAllUnsplashSearchInfo();

    //添加一个
    int insertUnsplashSearchInfo(UnsplashSearchInfo unsplashSearchInfo);

    //根据id选择
   /* UnsplashSearchInfo selectUnsplashSearchInfoById(int id);

    //添加一个
    int insertUnsplashSearchInfo(UnsplashSearchInfo user);

    //修改一个
    int updateUnsplashSearchInfo(UnsplashSearchInfo user);

    //根据id删除
    int deleteUnsplashSearchInfo(int id);
*/
}
