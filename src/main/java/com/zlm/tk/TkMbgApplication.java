package com.zlm.tk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author heps
 * @date 2019/8/16 20:44
 */
@MapperScan("com.hps.tk.mapper")
@SpringBootApplication
public class TkMbgApplication {

    public static void main(String[] args) {
        SpringApplication.run(TkMbgApplication.class, args);
    }
}
