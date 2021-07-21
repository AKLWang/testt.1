package com.lanqiao.springboottutorials;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import javax.sql.DataSource;

@SpringBootApplication
@MapperScan(basePackages = {"com.lanqiao.springboottutorials.mapper"})
public class SpringbootTutorialsApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootTutorialsApplication.class, args);

    }
}
