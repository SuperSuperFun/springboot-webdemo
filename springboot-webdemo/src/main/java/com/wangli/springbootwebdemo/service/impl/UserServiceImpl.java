package com.wangli.springbootwebdemo.service.impl;

import com.wangli.springbootwebdemo.mapper.UserMapper;
import com.wangli.springbootwebdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wangli
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean addUser(Integer age, String name) {
        Boolean flag;
        try {
            flag = userMapper.insertUser(age, name);
        } catch (Exception e) {
            return false;
        }
        return flag;
    }
}
