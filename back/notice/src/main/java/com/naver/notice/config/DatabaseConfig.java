package com.naver.notice.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.naver.notice.repo")
public class DatabaseConfig {
}
