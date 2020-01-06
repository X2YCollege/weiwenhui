package com.group.weiwenhui;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()
@MapperScan("com.group.weiwenhui.mapper")
public class WeiwenhuiApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeiwenhuiApplication.class, args);
    }

}
