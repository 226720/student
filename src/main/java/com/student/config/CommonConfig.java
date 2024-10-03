//package com.student.config;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import io.swagger.v3.oas.models.Components;
//import io.swagger.v3.oas.models.OpenAPI;
//import io.swagger.v3.oas.models.info.Info;
//import io.swagger.v3.oas.models.info.License;
//import io.swagger.v3.oas.models.security.SecurityRequirement;
//import io.swagger.v3.oas.models.security.SecurityScheme;
//import io.swagger.v3.oas.models.servers.Server;
//
///**
// * Class to configure common configurations required for Account onboarding application
// *
// */
//@Configuration
//public class CommonConfig {
//	
//	@Bean
//	public OpenAPI customOpenAPI() {
//		
//		return new OpenAPI()
//				.info(new Info().title("sample application API").version("1").description("student description"))
//			//	.addServersItem(new Server().url(appURL))
//				.components(new Components().addSecuritySchemes("basicScheme", new SecurityScheme()
//						.type(SecurityScheme.Type.HTTP).scheme("basic")));
//
//	}
//
//
//}
