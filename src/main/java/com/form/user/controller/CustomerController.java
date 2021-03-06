package com.form.user.controller;


import com.form.user.bean.Customer;
import com.form.user.bean.Manager;
import com.form.user.bean.PrivInfo;
import com.form.user.service.CustomerService;
import com.form.user.service.ManagerService;
import com.form.user.service.privService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


/**
 * Created by zhuhui
 */
@Controller
@RequestMapping("/customer")
public class CustomerController {
    //日志文件使用slf4j比较好(al)
    private  static  final Logger LOGGER= LoggerFactory.getLogger(CustomerController.class);

    private Manager manager;
    private static final String USERNAME = "username";
    @Autowired
    private CustomerService customerService;
    @Autowired
    private ManagerService managerService;
    @Autowired
    private privService privService;

    /**
     * boss后台登录控制器
     * @param username
     * @param userkey
     * @param request
     * @return
     */
    @RequestMapping(value = "/login")
    @ResponseBody
    public int login(String username,String userkey,HttpServletRequest request){

        if (null != username) {
            LOGGER.info("管理员【" + username + "】登陆");
        }
           return customerService.loginManager(request,username,userkey);
    }

    /**
     * 登录的人员对权限的控制，对应的权限获取链接
     * @param request
     * @return
     */
    @RequestMapping("/index_new")
    public ModelAndView index(HttpServletRequest request){
        LOGGER.info("跳转到首页");
        ModelAndView mav=new ModelAndView("index");
        //根据用户名查询用户的信息
        Manager manager = managerService.queryManagerByName((String) request.getSession().getAttribute(USERNAME));
        if(null!=manager){
            List<PrivInfo> pList = privService.getPrivsByIden(manager.getIdentify());
            mav.addObject("pList",pList);
        }
        return mav;
    }

    /**
     * 获取用户列表的数据
     * @return
     */
    @RequestMapping("userList")
    public ModelAndView shouUser(Customer customer){
        ModelAndView mav=new ModelAndView("user/customers");
        List<Customer> customerList = customerService.getAllCustomer(customer);
        mav.addObject("customerList",customerList);
        return mav;
    }
}
