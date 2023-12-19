package com.bach.devsecondlms.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.fasterxml.jackson.databind.JsonNode;

@Mapper
public interface LoginMapper {
	public Map<String, Object> getData(@Param("data") JsonNode data);
}
