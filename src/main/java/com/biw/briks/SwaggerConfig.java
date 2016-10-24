
package com.biw.briks;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	// Don't forget the @Bean annotation
	@Bean
	public Docket briksApi() {
		return new Docket(DocumentationType.SWAGGER_2).select().paths(briksPaths()).build().apiInfo(apiInfo());

	}

	private Predicate<String> briksPaths() {
		return new Predicate<String>() {
			@Override
			public boolean apply(String input) {
				return input.contains("/services/");
			}
		};
	}

	private static ApiInfo apiInfo() {
		return new ApiInfo("Briks Services", "", "", "Briks terms of service",
				new Contact("Adam Dehnel", "", "Adam.Dehnel@biworldwide.com"), "", "");
	}
}