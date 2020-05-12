package com.haitao.mapper;

import com.haitao.domain.Account;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 涛
 * @create 2020/5/10 - 21:34
 */
@Mapper
public interface UserMapper {
    public List<Account> queryAccount();
}
