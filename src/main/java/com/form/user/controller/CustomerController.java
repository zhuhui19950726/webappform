package com.form.user.controller;


import com.form.user.service.CustomerService;
import com.form.user.util.MyLogger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;


/**
 * Created by zhuhui on 2018/4/11.
 */
@Controller
@RequestMapping("/customer")
public class CustomerController {
    private static final MyLogger LOGGER = new MyLogger(CustomerController.class);
    @Resource
    private CustomerService customerService;

    /**
     * boss后台登录控制器
     * @param username
     * @param userkey
     * @param request
     * @param code
     * @param patchaFlag
     * @return
     */
    @RequestMapping("/login")
    @ResponseBody
    public int login(String username, String userkey,HttpServletRequest request,String code, String patchaFlag){

//        if ("1".equals(patchaFlag) && null == code || !code.equals(request.getSession().getAttribute("PATCHCA"))) {
//            // 验证码匹配
//            return -1;
//        }
        // 非空验证 用户名
        if (null != username) {
            LOGGER.info("管理员【" + username + "】登陆");
        }
           return customerService.loginManager(request,username,userkey);

    }
}
