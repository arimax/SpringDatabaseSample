package com.kajishima.common;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class RoutingDataSourceResolver extends AbstractRoutingDataSource {

	@Override
	protected Object determineCurrentLookupKey() {
		// TODO 自動生成されたメソッド・スタブ
		if (SchemaContextHolder.getSchemaType() == null) {
			return "FieldManager";
		}
		if (SchemaContextHolder.getSchemaType().matches("IDM")) {
			return "IDM";
		}
		return "FieldManager";
	}

}
