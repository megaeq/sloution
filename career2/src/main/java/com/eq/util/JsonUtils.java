package com.eq.util;

import java.util.Map;

import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class JsonUtils {
	public static void prettyPrintedJson(Object object) {
		String uglyJSONString = new Gson().toJson(object);
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonParser jp = new JsonParser();
        JsonElement je = jp.parse(uglyJSONString);
        System.out.println(gson.toJson(je));
	}
	
	public static void main(String[] args) {
		Map<String, Object> map = Maps.newHashMap();
		map.put("a", 1);
		map.put("b",2);
		prettyPrintedJson(map);
		prettyPrintedJson("a");
	}
}
