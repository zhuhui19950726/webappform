package com.form.user.service.impl;

import com.form.user.bean.IdenPrivRefInfo;
import com.form.user.bean.PrivInfo;
import com.form.user.dao.IdenPrivRefInfoMapper;
import com.form.user.dao.PrivInfoMapper;
import com.form.user.service.privService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collections;
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
     * 根据身份和权限id修改权限
     * @param idenName
     * @param privIds
     */
    @Override
    public void modifyPriv(String idenName, Long[] privIds) {
       //根据登录进来的身份对所对应的权限进行修改(先清空用户的权限)
        iprMapper.delByIden(idenName);
        //根据用户从页面设置的权限进行修改
        IdenPrivRefInfo ipr;
        if(null!=privIds && privIds.length>0){
              for(Long pids:privIds){
                  ipr=new IdenPrivRefInfo();
                  ipr.setIdenName(idenName);
                  ipr.setPrivId(pids);
                  iprMapper.insertSelective(ipr);
              }
        }
    }

    /**
     * 根据身份查询权限-身份表
     * @param idenName
     * @return
     */
    @Override
    public List<Long> getPrivIds(String idenName) {
        //根据权限的名查询权限-身份表的信息
        List<IdenPrivRefInfo> listInfo = iprMapper.selectByIden(idenName);
        //新建一个list集合用来存放listinfo中的privIds
        List<Long> privIds=new ArrayList<>();
        if(CollectionUtils.isNotEmpty(listInfo)){
            for (IdenPrivRefInfo idr:listInfo){
                privIds.add(idr.getPrivId());
            }
            return privIds;
        }
        return null;
    }

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
