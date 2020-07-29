package com.api.test.token;

import static io.restassured.RestAssured.given;

public class CoreTenant {
    private  static String token;
    public static String getToken(){

       return    given().log().all()
                .header("Content-Type",CoreTenantConfig.getInstance().Content_Type)
                .param("client_id",CoreTenantConfig.getInstance().client_id)
                .param("client_secret",CoreTenantConfig.getInstance().client_secret)
                .param("grant_type",CoreTenantConfig.getInstance().grant_type)
                .param("iam-action",CoreTenantConfig.getInstance().iam_action)
                .param("tenant",CoreTenantConfig.getInstance().tenant)
                .when().post("https://core.piam.cn1-cert.mindsphere-in.cn/uaa/oauth/token").prettyPeek()
                .then()
                .statusCode(200).extract().path("access_token");
    }
    public  static String return_token(){
        if (token==null){
            token = getToken();
        }
        return token;
    }

}
