package com.wf.shop.user;

import com.wf.shop.user.service.UserBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @Auther: wangfa
 * @Date: 2018/12/2 11:36
 * @Description:
 */
@Controller
@RequestMapping("/user")
public class UserBaseContorller {



    @Autowired
    private UserBaseService userBaseServiceImpl;


    @RequestMapping(value ="/login.htm")
    @ResponseBody
    public String logginUser(@RequestParam String name,@RequestParam String password){
        System.out.println(name+"==========="+password);
        String string = userBaseServiceImpl.logginByNameAndPwd(name, password).toString();
        System.out.println(string);
        return string;
    }

}
