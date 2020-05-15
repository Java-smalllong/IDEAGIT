package com.liuxiaochang.service.com.liuxiaochang.service.impl;

import com.liuxiaochang.mapper.UsersMapper;
import com.liuxiaochang.pojo.Users;
import com.liuxiaochang.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: 刘小长
 * @Date: 2020/5/15
 * @Description: com.liuxiaochang.service.com.liuxiaochang.service.impl
 * @version: 1.0
 */
@Service
public class UsersServiceImpl implements UsersService{
    @Autowired
    private UsersMapper usersMapper;
    @Override
    public int addUsers(Users users) {
      return this.usersMapper.insUsers(users);
    }

    @Override
    public List<Users> findAllUsers() {
        return this.usersMapper.selAllUsers();
    }
}
