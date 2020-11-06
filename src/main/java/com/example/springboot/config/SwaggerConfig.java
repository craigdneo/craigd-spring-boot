package com.example.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.net.JarURLConnection;
import java.net.URL;
import java.time.LocalDate;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    /*
        to see Swagger documentation go to url: http://localhost:8080/swagger-ui.html
        
     */
    @Bean
    public Docket serviceApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

    private springfox.documentation.service.ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("spring-boot-sample")
                .description("spring boot sample project")
                .license("©" + LocalDate.now().getYear() + " all rights reserved.")
                .version(readVersionInfoInManifest())
                .build();
    }

    private String readVersionInfoInManifest() {
        URL res = SwaggerConfig.class.getResource(SwaggerConfig.class.getSimpleName() + ".class");

        try {
            JarURLConnection e = (JarURLConnection) res.openConnection();
            Manifest mn = e.getManifest();
            Attributes attr = mn.getMainAttributes();

            return attr.getValue("Implementation-Version");
        } catch (Exception ignored) {
            return "1.0";
        }
    }
}
