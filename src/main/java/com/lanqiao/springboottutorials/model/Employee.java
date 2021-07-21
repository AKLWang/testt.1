package com.lanqiao.springboottutorials.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 员工表
 * @TableName employee
 */
@Data
@ToString
public class Employee implements Serializable {
    /**
     *
     */
    private Integer empno;

    /**
     *
     */
    private String ename;

    /**
     *
     */
    private String job;

    /**
     *
     */
    private Integer mgr;

    /**
     *
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date hiredate;

    /**
     *
     */
    private Double sal;

    /**
     *
     */
    private Double comm;

    /**
     *
     */
    private Integer deptno;

    private static final long serialVersionUID = 1L;


}