package com.Admin.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class swaggerConfig {

    @Bean
	public Docket mySwaggerConfiguration () {
		return new Docket(DocumentationType.SWAGGER_2)
		.select() // configuration object
		
		.paths(PathSelectors.ant("/api/v1/**"))
		.apis(RequestHandlerSelectors.basePackage("com.Admin.controller"))
		
		.build()
        .apiInfo(metadata())
        ;
	}

    private ApiInfo metadata() {
        return new ApiInfoBuilder()
            .title( "My awesome API" )
            .description( "All the requests that the server will respond to." )
            .version( "1.0.0" )
            .contact(new Contact("Mark", "http://example.com", "mark@gmail.com"))
            .license("Free to use")
            .licenseUrl("licenseUrl")
            .build();
    }
    
}
