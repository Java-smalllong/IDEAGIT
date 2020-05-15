package com.liuxiaochang.mapper;

import com.liuxiaochang.pojo.Users;

import java.util.List;

/**
 * @Auther: 刘小长
 * @Date: 2020/5/15
 * @Description: com.liuxiaochang.mapper
 * @version: 1.0
 */
public interface UsersMapper {
    int insUsers(Users users);
    List<Users> selAllUsers();
}
