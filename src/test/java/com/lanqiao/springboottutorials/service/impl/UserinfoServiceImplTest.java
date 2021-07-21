package com.lanqiao.springboottutorials.service.impl;

import com.lanqiao.springboottutorials.model.Userinfo;
import com.lanqiao.springboottutorials.service.DepartmentService;
import com.lanqiao.springboottutorials.service.UserinfoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Auther: 王宏玮    Date: 2021/07/16/17:15
 */
@SpringBootTest
class UserinfoServiceImplTest {
    @Autowired
    UserinfoService userinfoService;
    @Test
    void selectUserinfo() {
        Userinfo userinfo = new Userinfo();
        userinfo.setLoginname("scott");
        userinfo.setLoginpass("scott");
        System.out.println(userinfoService.selectUserinfo(userinfo));
    }
}