package com.lanqiao.springboottutorials.model;


import lombok.Data;
import lombok.ToString;

/**
 * 
 * @TableName department
 */
@Data
@ToString
public class Department{
    /**
     * 
     */
    private Integer deptno;

    /**
     * 
     */
    private String dname;

    /**
     * 
     */
    private String loc;

    private static final long serialVersionUID = 1L;
}