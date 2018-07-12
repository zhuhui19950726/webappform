package com.form.user.service;

import com.form.user.bean.Customer;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by zhuhui on 2018/4/11.
 */
public interface CustomerService {
    /**
     * 根据用户名判断管理员状态
     *
     * @param username
     *            用户名
     * @return int 3:表示账户被冻结 2:密码错误 1:表示正常 0:用户名不存在
     */
    int loginManager(HttpServletRequest request, String username, String userkey);


    List<Customer> getAllCustomer(Customer customer);
}
