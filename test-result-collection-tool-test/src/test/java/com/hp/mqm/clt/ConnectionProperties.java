package com.hp.mqm.clt;

public class ConnectionProperties {

	public static String getLocation() {
		return getStringValue("mqm.location", "http://localhost:8080");
	}

	public static int getSharedSpaceId() {
		return getIntValue("mqm.sharedSpace", 1001);
	}

	public static int getWorkspaceId() {
		return getIntValue("mqm.workspace", 1002);
	}

	public static String getUsername() {
		return getStringValue("mqm.user", "admin");
	}

	public static String getPassword() {
		return getStringValue("mqm.password", "changeit");
	}

	private static Integer getIntValue(String propName, Integer defaultValue) {
		String value = System.getProperty(propName);
		return value != null ? Integer.valueOf(value) : defaultValue;
	}

	private static String getStringValue(String propName, String defaultValue) {
		String value = System.getProperty(propName);
		return value != null ? value : defaultValue;
	}
}