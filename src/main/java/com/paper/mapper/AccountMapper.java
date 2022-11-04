package com.paper.mapper;

import com.paper.entity.Account;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountMapper {
    Account selectByUsername(String username);
}
