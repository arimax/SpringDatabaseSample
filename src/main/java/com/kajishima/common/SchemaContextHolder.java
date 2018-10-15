package com.kajishima.common;

public class SchemaContextHolder {

	private static ThreadLocal<String> contextHolder = new ThreadLocal<String>();

	public static void setSchemaType(String type) {
		contextHolder.set(type);
	}

	public static String getSchemaType() {
		 if (contextHolder.get() != null) {
			 return contextHolder.get();
		 }

		 return "Primary";
	}

	public static void clear() {
		contextHolder.remove();
	}

}
