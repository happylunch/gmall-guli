package com.happy.gmall.pms;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 配置整合dubbo
 * 配置整个mybatis-plus
 *
 */

@MapperScan(basePackages = "com.happy.gmall.pms.mapper")
@EnableDubbo
@SpringBootApplication
public class GmallPmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GmallPmsApplication.class, args);
	}

}
