package cn.sweetz.exercise.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages = {"cn.sweetz.exercise.dao.mapper"})
@ComponentScan(basePackages = {"cn.sweetz.exercise.service",
                                "cn.sweetz.exercise.web"
                                })
@SpringBootApplication
public class AdminWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminWebApplication.class, args);
    }

}

