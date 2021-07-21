package com.lanqiao.springboottutorials.service.impl;


import com.lanqiao.springboottutorials.model.Userinfo;
import com.lanqiao.springboottutorials.service.UserinfoService;
import com.lanqiao.springboottutorials.mapper.UserinfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 */
@Service("userinfoService")
@Transactional(propagation = Propagation.SUPPORTS,rollbackFor = Exception.class)
public class UserinfoServiceImpl implements UserinfoService{
    @Autowired
    UserinfoMapper userinfoMapper;
    @Override
    public Userinfo selectUserinfo(Userinfo userinfo) {
        return userinfoMapper.selectUserinfo(userinfo);
    }
}




