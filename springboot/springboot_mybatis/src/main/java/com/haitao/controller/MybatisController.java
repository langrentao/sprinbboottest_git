package com.haitao.controller;

import com.haitao.domain.Account;
import com.haitao.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 涛
 * @create 2020/5/10 - 21:50
 */
@Controller
public class MybatisController {
    @Autowired
    private UserMapper mapper;

    @RequestMapping("/query")
    @ResponseBody
    public List<Account> query(){
       List<Account> list=mapper.queryAccount();
       return  list;
    }
}
