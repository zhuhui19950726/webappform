package com.form.user.service.impl;

import com.form.user.bean.Manager;
import com.form.user.dao.ManagerMapper;
import com.form.user.service.ManagerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/4/12.
 */
@Service
public class ManagerServiceImpl implements ManagerService{

    @Resource
    private ManagerMapper managerMapper;

    /**
     * 根据用户名来进行查询
     * @param username
     *            管理员名
     * @return
     */
    @Override
    public Manager queryManagerByName(String username) {
        return managerMapper.selectByName(username);
    }
}
