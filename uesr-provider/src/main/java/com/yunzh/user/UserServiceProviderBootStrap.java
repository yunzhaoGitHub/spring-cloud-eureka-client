package com.yunzh.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 用户服务 {@link com.yunzh.user.service.IUserService} 引导类
 */

@SpringBootApplication
@EnableDiscoveryClient
public class UserServiceProviderBootStrap {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceProviderBootStrap.class, args);
    }
}
