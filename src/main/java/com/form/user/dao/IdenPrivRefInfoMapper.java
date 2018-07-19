package com.form.user.dao;

import com.form.user.bean.IdenPrivRefInfo;

import java.util.List;

public interface IdenPrivRefInfoMapper {

    int insert(IdenPrivRefInfo record);

    int insertSelective(IdenPrivRefInfo record);

    List<IdenPrivRefInfo> selectByIden(String identify);

    void delByIden(String idenName);
}