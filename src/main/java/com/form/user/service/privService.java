package com.form.user.service;

import com.form.user.bean.PrivInfo;

import java.util.List;

/**
 * Created by zhuhui on 2018/4/12.
 */
public interface privService {
    void modifyPriv(String idenName,Long[] privIds );

    List<Long> getPrivIds(String idenName);

    List<PrivInfo> getPrivsByIden(String indentify);
}
