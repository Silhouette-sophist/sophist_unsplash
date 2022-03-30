package com.example.sophist_unsplash.dao

import org.apache.ibatis.io.Resources
import org.apache.ibatis.session.SqlSession
import org.apache.ibatis.session.SqlSessionFactory
import org.apache.ibatis.session.SqlSessionFactoryBuilder
import java.io.IOException
import java.io.InputStream

object SqlSessionProvider {

    val sqlSessionFactory  by lazy {
        val resource = "mybatis-config.xml"
        var inputStream: InputStream? = null
        var sqlSessionFactory : SqlSessionFactory? = null
        try {
            inputStream = Resources.getResourceAsStream(resource)
            sqlSessionFactory = SqlSessionFactoryBuilder().build(inputStream)
        } catch (e: IOException) {
            println("IOException " + e.stackTrace)
        }
        return@lazy sqlSessionFactory
    }
}