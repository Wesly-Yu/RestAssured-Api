package com.api.test.uts;
import com.api.test.token.CoreTenant;
import com.api.test.token.CoreTenantConfig;
import org.junit.Test;
import static io.restassured.RestAssured.given;
import static java.util.concurrent.TimeUnit.SECONDS;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

public class GetDataBase {
    String utsjsonbody = "{\n" +
            "\t\"CustomerTenantID\": \"core\",\n" +
            "\t\"CustomerUserID\": \"wesley.yu@siemens.com\",\n" +
            "\t\"UTSUsageData\": [\n" +
            "\t\t{\n" +
            "\t\t\t\"resourceName\": \"markAsset\",\n" +
            "\t\t\t\"resourceAlias\": \"managemymachines\",\n" +
            "\t\t\t\"UsageData\": [\n" +
            "\t\t\t\t{\n" +
            "\t\t\t\t\t\"usage\": 1,\n" +
            "\t\t\t\t\t\"usageUnit\": \"manage-mymachine-unit\",\n" +
            "\t\t\t\t\t\"usageDate\": \"2020-07-30T23:55:37+0100\"\n" +
            "        }\n" +
            "      ]\n" +
            "    }\n" +
            "  ]\n" +
            "}";
    @Test
    public void senddata(){
        given()
                .contentType(CoreTenantConfig.getInstance().conten_type)
                .header("Authorization", "Bearer" +CoreTenant.return_token())
                .body(utsjsonbody)
                .when().post("https://gateway.cn1-cert.mindsphere-in.cn/api/usagetransparency/v3/usages")
                .then()
                .statusCode(200)
                .time(lessThan(2L),SECONDS)
                .log().all()
                .assertThat().body(equalTo("Data is successfully saved to the database"));



    }

}
