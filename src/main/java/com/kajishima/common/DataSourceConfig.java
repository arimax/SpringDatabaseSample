package com.kajishima.common;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.handler.MappedInterceptor;

@Component
@Configuration
public class DataSourceConfig {

	@Autowired
	private FieldManagerConfiguration fieldManagerConfiguration;

	@Autowired
	private IdmConfiguration idmConfiguration;

	@Bean
	@Primary
	public RoutingDataSourceResolver getRoutingdataSource() {
		RoutingDataSourceResolver resolver = new RoutingDataSourceResolver();

		Map<Object, Object> dataSources = new HashMap<Object, Object>();
		dataSources.put("FieldManager", fieldManagerConfiguration.createDataSource());
		dataSources.put("IDM", idmConfiguration.createDataSource());

		resolver.setTargetDataSources(dataSources);

		// default datasource
		resolver.setDefaultTargetDataSource(fieldManagerConfiguration.createDataSource());

		return resolver;
	}

	@Bean
	public HandlerInterceptor datasourceInterceptor() {
		// Interceptorの設定
		return new com.kajishima.common.Interceptor();
	}

	@Bean
	public MappedInterceptor interceptorMapping() {
		return new MappedInterceptor(new String[] { "/**" }, datasourceInterceptor());
	}

}
