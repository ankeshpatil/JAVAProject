package com.yash.oas.swaggercfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import io.swagger.models.Contact;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Component
@Configuration
@EnableSwagger2

	public class SpringFoxConfig implements WebMvcConfigurer {       



	    @Bean
	    public Docket apiDocket() {

	        return new Docket(DocumentationType.SWAGGER_2)
	                .apiInfo(getApiInfo())
	                .select()
	                .apis(RequestHandlerSelectors.any())
	                .paths(PathSelectors.any())
	                .build();
	    }
	    
	    public void addResourceHandlers(ResourceHandlerRegistry registry) {

	        registry
	                .addResourceHandler("swagger-ui.html")
	                .addResourceLocations("classpath:/META-INF/resources/");

	        registry
	                .addResourceHandler("/webjars/**")
	                .addResourceLocations("classpath:/META-INF/resources/webjars/");
	    }
	 
	    

		private ApiInfo getApiInfo() {
	        return new ApiInfoBuilder()
	                .title("Online Assessment System")
	                .description("Devloped By:-Ankesh")
	                .version("1.0.0")
	                .build();
	    }
}

