package com.guweibit.service;

import com.guweibit.entity.User;

import java.util.List;

public interface UserService {
    int addUser(User user);
    List<User> findAllUser(int pageNum, int pageSize);
}
