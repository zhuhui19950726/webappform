package com.form.user.dao;

import com.form.user.bean.Customer;

import java.util.List;
import java.util.Map;

public interface CustomerMapper {
    int deleteByPrimaryKey(Long customerId);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Long customerId);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);

    List<Customer> selectSelective(Customer customer);

    /**
     * 根据用户名验证用户是否存在
     *
     * @param customerName
     *            用户名
     * @return Long 1存在 0不存在
     */
    Long checkexistsByCustName(String customerName);

    /**
     * 查找管理员
     *
     * @param paramMap
     *            参数列表
     * @return 管理员 {@link Customer}
     */
    Customer selectCustomerByNamePwd(Map<String, Object> paramMap);
}