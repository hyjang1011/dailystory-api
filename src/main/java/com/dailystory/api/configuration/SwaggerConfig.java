package com.dailystory.api.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket swaggerApi(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(swaggerInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("com.dailystory.api.controller"))
                //.paths(PathSelectors.ant("/api/**")
                .paths(PathSelectors.any())
                .build()
                .useDefaultResponseMessages(false); //기본으로 세팅되는 200,401,403,404 메시지를 표시하지 않음
    }

    private ApiInfo swaggerInfo(){
        return new ApiInfoBuilder().title("Spring Boot 2 API Documentation")
                .description("앱 개발시 사용되는 서버 API 연동 문서")
                .license("hyjang").licenseUrl("-").version("1").build();
    }

}
