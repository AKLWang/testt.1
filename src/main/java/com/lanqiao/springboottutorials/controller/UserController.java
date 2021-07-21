package com.lanqiao.springboottutorials.controller;

import com.lanqiao.springboottutorials.mapper.UserinfoMapper;
import com.lanqiao.springboottutorials.model.Userinfo;
import com.lanqiao.springboottutorials.service.UserinfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: 王宏玮    Date: 2021/07/16/10:44
 */
@Controller
@Slf4j
//@RequestMapping("/user")
public class UserController {

    @Autowired
    UserinfoService userinfoService;

    @GetMapping("/")
    public String index(){
        return "user/login";
    }

    @RequestMapping("/user/login")
    public String login(Model model,Userinfo userinfo){
        //log.info(userinfo.toString());
        Userinfo user = userinfoService.selectUserinfo(userinfo);
        if(user==null){
            return "redirect:/";
        }
        model.addAttribute("loginUser",userinfo);
        return "redirect:/emps";
    }







}
