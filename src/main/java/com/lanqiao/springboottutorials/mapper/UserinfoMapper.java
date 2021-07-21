package com.lanqiao.springboottutorials.mapper;

import com.lanqiao.springboottutorials.model.Userinfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Entity com.lanqiao.springboottutorials.model.Userinfo
 */
@Mapper
public interface UserinfoMapper{
    public Userinfo selectUserinfo(Userinfo userinfo);
}




