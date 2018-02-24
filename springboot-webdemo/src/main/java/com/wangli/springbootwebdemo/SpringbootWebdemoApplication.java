package com.wangli.springbootwebdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wangli
 */
@SpringBootApplication
@MapperScan("com.wangli.springbootwebdemo.mapper")
public class SpringbootWebdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWebdemoApplication.class, args);
	}
}
