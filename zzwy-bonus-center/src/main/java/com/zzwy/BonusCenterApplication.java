package com.zzwy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * server application
 *
 * @author zzwy
 */
@SpringBootApplication
@MapperScan(basePackages = "com.zzwy.dao")
@EnableDiscoveryClient
public class BonusCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(BonusCenterApplication.class, args);
    }
}
