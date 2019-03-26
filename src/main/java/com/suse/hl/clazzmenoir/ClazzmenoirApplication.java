package com.suse.hl.clazzmenoir;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.suse.hl.clazzmenoir.mapper")
public class ClazzmenoirApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClazzmenoirApplication.class, args);
    }

}
