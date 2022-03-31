package com.example.sophist_unsplash.dao.mapper;

import com.example.sophist_unsplash.bean.UnsplashUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Mapper : 表示本类是一个 MyBatis 的 Mapper，等价于以前 Spring 整合 MyBatis 时的 Mapper 接口
@Mapper
@Repository
public interface SearchUnsplashUserMapper {

    //选择全部
    List<UnsplashUser> selectAllUnsplashUser();

    int insertUnsplashUser(UnsplashUser unsplashUser);

    //根据id选择
    /*UnsplashUser selectUnsplashUserById(int id);
    
    //添加一个
    int insertUnsplashUser(UnsplashUser user);
    
    //修改一个
    int updateUnsplashUser(UnsplashUser user);
    
    //根据id删除
    int deleteUnsplashUser(int id);*/
    
}
