package com.cronworker.cron.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Configuration
public class CronConfiguration extends WebMvcConfigurerAdapter{
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.viewResolver(getViewResolver());
	}

	@Bean
	public ViewResolver getViewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
}
