package com.score.service.impl;

import com.github.pagehelper.PageInfo;
import com.score.bean.User;
import com.score.dao.UserDao;
import com.score.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserDao userDao;
    @Override
    public List<User> getUser(User user) {
        return null;
    }

    @Override
    public PageInfo<User> getUsersLimit(int page, int size) {
        return null;
    }
}
