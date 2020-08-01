package com.api.test;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

public class Restful {
    HashMap<String, Object> query = new HashMap<String, Object>();
    public RequestSpecification requestSpecification;

    public static String template(String path, HashMap<String, Object> map) {
        DocumentContext doucumentContext = JsonPath.parse(Restful.class.getResourceAsStream(path));
        map.entrySet().forEach(entry -> {
            doucumentContext.set(entry.getKey(), entry.getValue());
        });
        return doucumentContext.jsonString();


    }

}
