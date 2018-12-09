package com.wf.shop.user.service;

import com.wf.shop.user.bean.ShopUser;
import org.springframework.stereotype.Service;

/**
 * @Auther: wangfa
 * @Date: 2018/12/2 11:38
 * @Description:
 */

public interface UserBaseService {

    ShopUser logginByNameAndPwd(String name, String password);

}

