package com.wf.shop.user.service.impl;

import com.wf.shop.user.bean.ShopUser;
import com.wf.shop.user.mapper.ShopUserMapper;
import com.wf.shop.user.service.UserBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: wangfa
 * @Date: 2018/12/2 13:57
 * @Description:
 */
@Service
public class UserBaseServiceImpl implements UserBaseService {

    @Autowired
    private ShopUserMapper shopUserMapper;


    @Override
    public ShopUser logginByNameAndPwd(String name, String password) {
        ShopUser shopUser=shopUserMapper.queryByNameAndPwd(name,password);
        return shopUser;
    }
}
