package br.com.petcare.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.RequestHandler;
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
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_12)
                .select()
                .apis(RequestHandlerSelectors.basePackage("br.com.petcare.controllers"))
                .paths(PathSelectors.ant("*/**"))
                .build()
                .useDefaultResponseMessages(true)
                .apiInfo(apiInformations());

    }


    private ApiInfo apiInformations(){
        return new ApiInfoBuilder()
                .title("Pet Care")
                .description("REST API do sistema de agendamento e gerenciamento de serviços para pets e petshops. ")
                .version("Version 0.0.1")
                .contact("luis.fragment.code@gmail.com")
                .build();
    }


}
