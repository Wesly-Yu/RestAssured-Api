package com.api.test.uts;
import com.api.test.token.CoreTenant;
import com.api.test.token.CoreTenantConfig;
import com.jayway.jsonpath.JsonPath;

import static io.restassured.RestAssured.given;

public class GetDataBase {


    public String senddata(String date){
        String body = JsonPath.parse(this.getClass()
        .getResourceAsStream("/data/uts.json")).set("$.usageDate",date).jsonString();
         return given()
                .contentType(CoreTenantConfig.getInstance().conten_type)
                .header("Authorization", "Bearer" +CoreTenant.return_token())
                .body(body)
                .when().post("https://gateway.cn1-cert.mindsphere-in.cn/api/usagetransparency/v3/usages")
                .then()
                .statusCode(200)
                .extract().response().asString();
            }
}
