package com.kajishima.common;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix="spring.datasource.secondary")
public class SecondConfiguration {

	private String driverClassName;
	private String url;
	private String username;
	private String password;

	@Bean
	public DataSource createDataSource() {
		return DataSourceBuilder
				.create()
				.driverClassName(driverClassName)
				.url(url)
				.username(username)
				.password(password)
				.build();
	}

}
