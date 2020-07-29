import com.api.test.token.CoreTenant;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.useRelaxedHTTPSValidation;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class getaccesstoken {
    @BeforeClass
    public static void beforeclass(){
        useRelaxedHTTPSValidation();

    }
    @Test
    public void topic(){
                 CoreTenant coretenant = new CoreTenant();
                 String token = coretenant.getToken();
                 assertThat(token,not(equalTo(null)));

    }

}
