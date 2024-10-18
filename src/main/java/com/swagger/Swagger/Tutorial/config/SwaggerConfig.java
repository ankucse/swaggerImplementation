package com.swagger.Swagger.Tutorial.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * SwaggerConfig class to configure Swagger for the project.
 * The @Configuration annotation indicates that this is a configuration class.
 */
@Configuration
public class SwaggerConfig {
    /**
     * Creates a Docket bean to configure Swagger.
     * The Docket object customizes how Swagger generates documentation for your APIs.
     *
     * @return Docket - Swagger configuration bean.
     */
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)  // Use Swagger 2 documentation type
                .select()
                // Scan the com.example.swaggertutorial package for APIs
                .apis(RequestHandlerSelectors.basePackage("com.swagger.Swagger.Tutorial"))
                .paths(PathSelectors.any())  // Document all paths in this package
                .build()
                .apiInfo(apiInfo());  // Add API metadata
    }

    /**
     * Builds the API information for Swagger documentation.
     * This includes the title, description, version, and contact details of the API.
     *
     * @return ApiInfo - Contains metadata about the API.
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Swagger Tutorial API")  // Title of the API
                .description("This is a demo API for learning how to integrate Swagger with Spring Boot.")  // API description
                .version("1.0")  // Version of the API
                .contact(new Contact("Shreya", "www.dummyEmail.com", "shreya@example.com"))  // Contact information
                .build();
    }
}
