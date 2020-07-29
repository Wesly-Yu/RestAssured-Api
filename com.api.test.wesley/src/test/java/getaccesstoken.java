import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import  org.junit.runners.Parameterized;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.useRelaxedHTTPSValidation;
import static org.hamcrest.Matchers.equalTo;

public class getaccesstoken {
    @BeforeClass
    public static void beforeclass(){
        useRelaxedHTTPSValidation();

    }
    @Test
    public void topic(){
        given().log().all()
                .header("Content-Type",CoreTenantConfig.getInstance().Content_Type)
                .param("client_id",CoreTenantConfig.getInstance().client_id)
                .param("client_secret",CoreTenantConfig.getInstance().client_secret)
                .param("grant_type",CoreTenantConfig.getInstance().grant_type)
                .param("iam-action",CoreTenantConfig.getInstance().iam_action)
                .param("tenant",CoreTenantConfig.getInstance().tenant)
                .when().post("https://core.piam.cn1-cert.mindsphere-in.cn/uaa/oauth/token").prettyPeek()
                .then()
                .statusCode(200);

    }

}
