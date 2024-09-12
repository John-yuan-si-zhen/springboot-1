package com.example.springboot1;

import com.example.springboot1.mapper.UserMapper;
import com.example.springboot1.pojo.User;
import org.apache.ibatis.logging.stdout.StdOutImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Springboot1ApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Test
    void testfindall() {
        List<User> findall = userMapper.findall();
        for (User user:findall) {
            System.out.println(user.toString());
        }
    }

}
