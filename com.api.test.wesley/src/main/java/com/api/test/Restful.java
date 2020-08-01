package com.api.test;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;
import java.util.HashMap;

public class Restful {
    HashMap<String,Object> query = new HashMap<String, Object>();
    public RequestSpecification requestSpecification;
    public Response send(){
        final RequestSpecification  requestSpecification = given().log().all();
        query.entrySet().forEach( entry-> {
            requestSpecification.queryParam(entry.getKey(),entry.getValue());
        });
        return  requestSpecification.when().request("get","www.baidu.com");
    }

}
