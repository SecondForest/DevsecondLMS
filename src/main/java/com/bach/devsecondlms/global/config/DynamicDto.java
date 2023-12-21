package com.bach.devsecondlms.global.config;

import java.util.Map;

public class DynamicDto {
	private Map<String, Object> data;

	public DynamicDto() {
	}

	// Getter, Setter
	public Map<String, Object> getData() {
		return data;
	}

	public void setData(Map<String, Object> data) {
		this.data = data;
	}
}
