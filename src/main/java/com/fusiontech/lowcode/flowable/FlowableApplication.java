package com.fusiontech.lowcode.flowable;

import com.fusiontech.lowcode.flowable.common.config.AppDispatcherServletConfiguration;
import com.fusiontech.lowcode.flowable.common.config.ApplicationConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import({
        ApplicationConfiguration.class,
        AppDispatcherServletConfiguration.class
})
@SpringBootApplication
@MapperScan(basePackages = {"com.fusiontech.lowcode.flowable.biz.mapper"}, sqlSessionFactoryRef = "sqlSessionFactory")
public class FlowableApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlowableApplication.class, args);
    }

}
