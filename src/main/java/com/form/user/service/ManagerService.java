package com.form.user.service;

import com.form.user.bean.Manager;

/**
 * Created by zhuhui on 2018/4/12.
 */

public interface ManagerService {
    /**
     * 通过用户名查询管理员
     *
     * @param username
     *            管理员名
     * @return manager
     */
    Manager queryManagerByName(String username);
}
