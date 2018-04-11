package com.form.user.service.impl;

import com.form.user.bean.Customer;
import com.form.user.bean.Manager;
import com.form.user.dao.CustomerMapper;
import com.form.user.dao.ManagerMapper;
import com.form.user.service.CustomerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhuhui on 2018/4/11.
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    private static final int THIRD = 3;

    private static final int MANAGER_BASE_CODE = 10000;

    private static final String USERNAME = "username";

    private static final String PASSWORD = "userkey";

    private Manager manager;
    @Resource
    private CustomerMapper customerMapper;
    @Resource
    private ManagerMapper managerMapper;

    /**
     * 登录的service
     * @param request
     * @param username
     *            用户名
     * @param userkey
     * @return
     */
    @Override
    public int loginManager(HttpServletRequest request, String username, String userkey) {
        //0用户名不存在  1用户名存在
        Long existsFlag =managerMapper.checkexistsByName(username);
        Map<String, Object> paramMap = null;
        if("0".equals(existsFlag.toString())){
            paramMap = new HashMap<String, Object>();
            paramMap.put(USERNAME, username);
            paramMap.put(PASSWORD, userkey);
            manager=managerMapper.selectManagerByNamePwd(paramMap);
            if(manager!=null && "0".equals(manager.getFlag())){
                // 将登陆名存在session
                request.getSession().setAttribute("name", username);
                request.getSession().setAttribute("loginUserId", manager.getId());
                request.getSession().setAttribute("photoImg", manager.getPhotoImg());

                //登陆后把验证码的session清除
                request.getSession().removeAttribute("PATCHCA");
                return MANAGER_BASE_CODE + manager.getId().intValue();
            }else if(manager != null && !"0".equals(manager.getFlag())){
                // 冻结
                return THIRD;
            }else{
                // 密码错误
                return 2;
            }
        }else{
            return 0;
        }
    }

//    @Override
//    public Customer login(String customerName, String customerPwd) {
//        Customer customer=new Customer();
//        customer.setCustomerName(customerName);
//        customer.setCustomerPwd(customerPwd);
//        //查询用户的信息
//        List<Customer> listCustomer=customerMapper.selectSelective(customer);
//        return null!=listCustomer && listCustomer.size()>0 ?listCustomer.get(0):null;
//    }
}
