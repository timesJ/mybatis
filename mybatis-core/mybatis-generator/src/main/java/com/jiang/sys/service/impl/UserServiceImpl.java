package com.jiang.sys.service.impl;

import com.jiang.sys.pojo.User;
import com.jiang.sys.mapper.UserDao;
import com.jiang.sys.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ShiJiang
 * @since 2019-04-23
 */
@Service
@Transactional(isolation = Isolation.DEFAULT,
        propagation = Propagation.REQUIRED,
        rollbackFor = {SQLException.class}) // 配置当前service事务
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

}
