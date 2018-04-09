package com.form.user.dao;

import com.form.user.bean.IdenPrivRefInfo;

public interface IdenPrivRefInfoMapper {
    int insert(IdenPrivRefInfo record);

    int insertSelective(IdenPrivRefInfo record);
}