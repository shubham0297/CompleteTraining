package com.example.demo.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.servlet.ModelAndView;

@Configuration
public class AppConfig {

	
	@Bean
	@ConfigurationProperties(prefix="spring.datasource")
	public DataSource datasource() {
		return DataSourceBuilder.create().build();
	}
	
	@Bean
	public JdbcTemplate template(@Qualifier("datasource") DataSource ds) {
		return new JdbcTemplate(ds);
	}
	
	
	// Another datasource and template. So many connections from same application properties.
	@Bean
	@ConfigurationProperties(prefix="spring.dstwo")
	public DataSource datasource2() {
		return DataSourceBuilder.create().build();
	}
	
	@Bean
	public JdbcTemplate template2(@Qualifier("datasource2") DataSource ds) {				//Qualifier name is same as function name of DataSource
		return new JdbcTemplate(ds);
	}
	
	@Bean
	ModelAndView modelAndView() {
		return new ModelAndView();
	}
}
