package com.form.user.dao;

import com.form.user.bean.PrivInfo;

public interface PrivInfoMapper {
    int deleteByPrimaryKey(Long privId);

    int insert(PrivInfo record);

    int insertSelective(PrivInfo record);

    PrivInfo selectByPrimaryKey(Long privId);

    int updateByPrimaryKeySelective(PrivInfo record);

    int updateByPrimaryKey(PrivInfo record);


}