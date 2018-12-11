package com.guweibit.service.impl;

import com.github.pagehelper.PageHelper;
import com.guweibit.entity.User;
import com.guweibit.mapper.UserMapper;
import com.guweibit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int addUser(User user) {
        if (user == null || ObjectUtils.isEmpty(user)) {
            return 0;
        }
        return userMapper.insert(user);
    }

    @Override
    public List<User> findAllUser(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return userMapper.selectAllUser();
    }
}
