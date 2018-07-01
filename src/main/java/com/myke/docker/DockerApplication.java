package com.myke.docker;

import com.spring4all.swagger.EnableSwagger2Doc;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * user: zhangjianbin <br/>
 * date: 2018/7/1 15:38
 */
@Slf4j
@EnableSwagger2Doc
@SpringBootApplication
public class DockerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(DockerApplication.class, args);
        log.info("docker spring boot demo");
    }
}
