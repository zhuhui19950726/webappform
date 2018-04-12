package com.form.user.dao;

import com.form.user.bean.Customer;
import com.form.user.bean.Manager;

import java.util.Map;

public interface ManagerMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Manager record);

    int insertSelective(Manager record);

    Manager selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Manager record);

    int updateByPrimaryKey(Manager record);

    /**
     * 根据用户名验证用户是否存在
     *
     * @param username
     *            用户名
     * @return Long 1存在 0不存在
     */
    Long checkexistsByName(String username);

    /**
     * 查找管理员
     *
     * @param paramMap
     *            参数列表
     * @return 管理员 {@link Customer}
     */
    Manager selectManagerByNamePwd(Map<String, Object> paramMap);


    /**
     * 通过用户名称选取用户信息
     *
     * @param username
     *            用户名称
     * @return <code>Manager</code>对象
     *         用户信息
     */
    Manager selectByName(String username);
}