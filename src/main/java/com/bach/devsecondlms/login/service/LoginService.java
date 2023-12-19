package com.bach.devsecondlms.login.service;

import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public interface LoginService {
	public Map<String, Object> select(Map<String, Object> map);
}
