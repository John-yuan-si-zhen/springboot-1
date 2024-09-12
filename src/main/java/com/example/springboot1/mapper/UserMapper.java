package com.example.springboot1.mapper;

import com.example.springboot1.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @auther ysz
 * @date 2024/9/11
 **/
@Mapper
public interface UserMapper {
    @Select("select * from user")
    public List<User> findall();
}
