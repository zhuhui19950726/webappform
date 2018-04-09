package com.form.activity.dao;

import com.form.activity.bean.FormActivity;

public interface FormActivityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(FormActivity record);

    int insertSelective(FormActivity record);

    FormActivity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FormActivity record);

    int updateByPrimaryKey(FormActivity record);
}