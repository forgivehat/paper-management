package com.paper.util;

import com.paper.entity.Account;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



/**
 * @author weish
 * @create 2021/5/29 21:07
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Param<T> {
    public Account account;
    public T t;
}
