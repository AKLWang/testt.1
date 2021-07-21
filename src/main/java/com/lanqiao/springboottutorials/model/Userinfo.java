package com.lanqiao.springboottutorials.model;

import java.io.Serializable;
import lombok.Data;
import lombok.ToString;

/**
 * 用户表
 * @TableName userinfo
 */
@Data
@ToString
public class Userinfo implements Serializable {
    /**
     * 自增id
     */
    private Integer userid;

    /**
     * 
     */
    private String loginname;

    /**
     * 
     */
    private String loginpass;

    private static final long serialVersionUID = 1L;
}