package com.form.user.controller;


import com.form.user.service.privService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * 权限控制器
 */
@Controller
@RequestMapping("priv")
public class PrivController {

    @Autowired
    private privService privService;

    /**
     * 根据身份和权限id修改权限
     * @param idenName
     * @param privIds
     * @return
     */
    @RequestMapping("/modPrivIds")
    public String modifyPriv(String idenName,Long[] privIds){
        privService.modifyPriv(idenName,privIds);
        return "priv/priv";
    }

    /**
     * 根据身份查询权限-身份列表
     * @param idenName
     * @return
     */
    @RequestMapping("/getPrivsByIden")
    @ResponseBody
    public List<Long> getPrivByIden(String idenName){
        if(StringUtils.isNotEmpty(idenName)){
            List<Long> privIdslist=privService.getPrivIds(idenName);
            return privIdslist;
        }
        return null;
    }
}
