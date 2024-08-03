package org.example.banbanh_be.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class AppConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/public/**")
                .addResourceLocations("file:C:\\Users\\admin\\Desktop\\b\\BANHKEM_BA\\src\\main\\resources\\file_upload" );
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/static/" );
    }
}