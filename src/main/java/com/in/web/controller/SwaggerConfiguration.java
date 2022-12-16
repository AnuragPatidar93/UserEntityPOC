/*
package com.in.web.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.HashSet;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    @Bean
    public Docket api(){
    return new Docket(DocumentationType.SWAGGER_2)
            .apiInfo(ApiInfo.DEFAULT)
            .produces(new HashSet<>(Arrays.asList("application/json", "application/xml")))
            .consumes(new HashSet<>(Arrays.asList("application/json", "application/xml")));
    }
}
*/
