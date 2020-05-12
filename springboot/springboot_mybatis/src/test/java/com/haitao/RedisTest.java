package com.haitao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author 涛
 * @create 2020/5/11 - 15:26
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes=SpringbootMybatisApplication.class)
public class RedisTest {
    @Autowired
    private RedisTemplate<String,String> redisTemplate;
    @Test
    public void test(){
        //1.从redis中获得数据，以json字符串
        String s = redisTemplate.boundValueOps("user.findAll").get();
        if (s==null){

        }
    }
}
