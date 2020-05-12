package com.haitao;

import com.haitao.domain.Account;
import com.haitao.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author 涛
 * @create 2020/5/11 - 10:19
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootMybatisApplication.class)
public class MybatisTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void test1(){
        List<Account> list = userMapper.queryAccount();
        System.out.println(list);
    }
}
