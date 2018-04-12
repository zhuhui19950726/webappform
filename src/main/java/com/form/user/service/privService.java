package com.form.user.service;

import com.form.user.bean.PrivInfo;

import java.util.List;

/**
 * Created by zhuhui on 2018/4/12.
 */
public interface privService {

    List<PrivInfo> getPrivsByIden(String indentify);
}
