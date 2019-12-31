package com.nacl.myba;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.nacl.myba.mapper")
public class MybaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybaApplication.class, args);
    }

}
