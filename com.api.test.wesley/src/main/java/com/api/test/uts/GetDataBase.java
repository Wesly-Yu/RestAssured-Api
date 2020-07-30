package com.api.test.uts;
import com.api.test.token.CoreTenant;
import com.api.test.token.CoreTenantConfig;
import io.restassured.response.Response;
import org.junit.Test;
import static io.restassured.RestAssured.given;

public class GetDataBase {

    @Test
    public static String senddata(){
         return given()
                .contentType(CoreTenantConfig.getInstance().conten_type)
                .header("Authorization", "Bearer" +CoreTenant.return_token())
                .body(CoreTenantConfig.getInstance().utsjsonbody)
                .when().post("https://gateway.cn1-cert.mindsphere-in.cn/api/usagetransparency/v3/usages")
                .then()
                .statusCode(200)
                .extract().response().asString();


            }
}
