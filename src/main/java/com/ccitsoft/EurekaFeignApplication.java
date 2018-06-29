package com.ccitsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
/**
 * <p>Description: [集成1,Feign 采用的是基于接口的注解---接口--接口
 * 					   2,Feign 整合了ribbon (ribbon+resful)
 *  				   3,路由服务，注册在eureka-server。路由多个eureka-client请求
 *					]</p>
 * Created on 2018年6月20日
 * @author  <a href="mailto: lichao8941188@163.com">李超</a>
 * @version 1.0 
 * Copyright (c) 2018
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients // 开启Feign的功能
public class EurekaFeignApplication {
	public static void main(String[] args) {
		SpringApplication.run(EurekaFeignApplication.class, args);
	}
}
