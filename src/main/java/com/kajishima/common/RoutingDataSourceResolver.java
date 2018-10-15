package com.kajishima.common;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class RoutingDataSourceResolver extends AbstractRoutingDataSource {

	@Override
	protected Object determineCurrentLookupKey() {
		// TODO 自動生成されたメソッド・スタブ
		if (SchemaContextHolder.getSchemaType() == null) {
			return "Primary";
		}
		if (SchemaContextHolder.getSchemaType().matches("Secondary")) {
			return "Secondary";
		}
		return "Primary";
	}

}
