package com.api.test;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import  org.junit.runners.Parameterized;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.useRelaxedHTTPSValidation;
import static org.hamcrest.Matchers.equalTo;

public class gettoken {
    @BeforeClass
    public static void beforeclass(){
        useRelaxedHTTPSValidation();

    }
    //    @Test
    public void topic(){
        given().when().get("https://testerhome/api/v3/topics.json").prettyPeek()
                .then()
                .body("topic.id[0]",equalTo(15159))
                .statusCode(200);

    }
    @Test
    public void parameterdata(){

    }
}
