package com.form.user.service.impl;

import com.form.user.bean.IdenPrivRefInfo;
import com.form.user.bean.PrivInfo;
import com.form.user.dao.IdenPrivRefInfoMapper;
import com.form.user.dao.PrivInfoMapper;
import com.form.user.service.privService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhuhui on 2018/4/12.
 */
@Service
public class privServiceImpl implements privService {
    @Resource
    private IdenPrivRefInfoMapper iprMapper;
    @Resource
    private PrivInfoMapper privInfoMapper;
    /**
     * 根据管理员的身份进行查询
     * @param indentify
     * @return
     */
    @Override
    public List<PrivInfo> getPrivsByIden(String indentify) {
        List<PrivInfo> privInfoList= new ArrayList<PrivInfo>();
        //先根据身份获取权限的Id
        List<IdenPrivRefInfo> idenInfoList = iprMapper.selectByIden(indentify);
        //在根据权限的id获取权限数据表的数据
        for(IdenPrivRefInfo ipr:idenInfoList){
            privInfoList.add(privInfoMapper.selectByPrimaryKey(ipr.getPrivId()));
        }
        return privInfoList;
    }
}
