package com.max.b2c.item;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;
@Configuration
@EnableSwagger2
public class SwaggerConfig {

        /**
         * 创建API应用
         * apiInfo（）增加API相关信息
         * 通过select（）函数返回一个ApiSelectorBuilder实例，用来控制哪些接口暴露给Swagger来展现
         * 采用指定的扫描包路径来定义指定要建立API的目录
         * @return
         */
        @Bean
        public Docket createRestApi(){
            //添加head参数配置start
            ParameterBuilder tokenPar = new ParameterBuilder();
            List<Parameter> pars = new ArrayList<>();
            tokenPar.name("Authorization").description("令牌").modelRef(new ModelRef("string")).parameterType("header").required(false).build();
            pars.add(tokenPar.build());
            //添加head参数配置end
            return new Docket(DocumentationType.SWAGGER_2)
                    .apiInfo(apiInfo())
                    .select()
                    .apis(RequestHandlerSelectors.basePackage("com.max.b2c.item.controller"))
                    .paths(PathSelectors.any())
                    .build()
                    .globalOperationParameters(pars);
        }


        /**
         * 创建api的基本信息
         * 访问地址：http://项目实际地址/swagger-ui.html
         * @return
         */
        private ApiInfo apiInfo() {
            return new ApiInfoBuilder()
                    .title("B2C Restful API目录")
                    .description("spring boot使用swagger2构建restfulapi")
                    .termsOfServiceUrl("http://127.0.0.1:8888/swagger-ui.html")
                    .version("1.0")
                    .build();
        }
    }
