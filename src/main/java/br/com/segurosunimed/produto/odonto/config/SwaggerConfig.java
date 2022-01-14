package br.com.segurosunimed.produto.odonto.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMethod;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.ResponseMessage;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    /*http://localhost:8080/swagger-ui.html*/
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("br.com.segurosunimed.produto.odonto"))
                .paths(PathSelectors.any())
                .build()
                .globalResponseMessage(RequestMethod.GET, responseMessageForGET())
                .globalResponseMessage(RequestMethod.POST, responseMessageForPOST())
                .forCodeGeneration(true)
                .apiInfo(apiInfo());
    }

    @SuppressWarnings("serial")
    private List<ResponseMessage> responseMessageForGET() {
        return new ArrayList<ResponseMessage>() {{
            add(new ResponseMessageBuilder()
                    .code(200)
                    .message("successful operation")
                    .build());
            add(new ResponseMessageBuilder()
                    .code(400)
                    .message("Bad request")
                    .build());
            add(new ResponseMessageBuilder()
                    .code(404)
                    .message("Not found")
                    .build());
            add(new ResponseMessageBuilder()
                    .code(405)
                    .message("Method Not Allowed")
                    .build());
            add(new ResponseMessageBuilder()
                    .code(500)
                    .message("Internal error")
                    .build());
        }};
    }

    private List<ResponseMessage> responseMessageForPOST() {
        return new ArrayList<ResponseMessage>() {
            private static final long serialVersionUID = 1L;

            {
                add(new ResponseMessageBuilder()
                        .code(200)
                        .message("successful operation")
                        .build());
                add(new ResponseMessageBuilder()
                        .code(400)
                        .message("Bad request")
                        .build());
                add(new ResponseMessageBuilder()
                        .code(404)
                        .message("Not found")
                        .build());
                add(new ResponseMessageBuilder()
                        .code(405)
                        .message("Method Not Allowed")
                        .build());
                add(new ResponseMessageBuilder()
                        .code(500)
                        .message("Internal error")
                        .build());
            }};
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Api Produto Odonto")
                .description("API/Micro serviço responsável pelo Serviço de Segurado para o ramo de Odonto")
                .version("0.0.1")
                .license("Apache License Version 2.0")
                .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
                .contact(new Contact("Manoel Marçal", null, "manoel.marcal@segurosunimed.com.br"))
                .build();
    }


}

