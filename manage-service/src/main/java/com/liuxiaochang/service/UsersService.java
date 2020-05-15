package com.liuxiaochang.service;

import com.liuxiaochang.pojo.Users;

import java.util.List;

/**
 * @Auther: 刘小长
 * @Date: 2020/5/15
 * @Description: com.liuxiaochang.service
 * @version: 1.0
 */
public interface UsersService {
    int addUsers(Users users);
    List<Users> findAllUsers();
}
