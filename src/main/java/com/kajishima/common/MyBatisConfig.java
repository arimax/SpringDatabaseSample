package com.kajishima.common;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternUtils;

@Configuration
@MapperScan("com.kajishima.repository")
public class MyBatisConfig {
	@Bean
	public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource) throws Exception {
		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		// DataSourceの設定
        sessionFactory.setDataSource(dataSource);
        ResourcePatternResolver resolver =
                ResourcePatternUtils.getResourcePatternResolver(new DefaultResourceLoader());
        // mybatis-configの設定
        sessionFactory.setConfigLocation(resolver.getResource("classpath:mybatis-config.xml"));
        // Mapperのパスを設定
        sessionFactory.setMapperLocations(resolver.getResources("classpath:**/dao/**/*.xml"));
        return sessionFactory;
	}

}
