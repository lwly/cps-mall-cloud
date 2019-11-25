package com.xm.cron_service;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

//开启分布式事务
@EnableDistributedTransaction
@ComponentScan("com.xm")
@MapperScan(basePackages = {"com.xm.*.mapper","com.xm.*.mapper.custom"})
@EnableFeignClients(basePackages = {"com.xm.comment.module.*.feign"})
@EnableDiscoveryClient
@SpringBootApplication
public class CronServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(CronServiceApplication.class, args);
    }
}