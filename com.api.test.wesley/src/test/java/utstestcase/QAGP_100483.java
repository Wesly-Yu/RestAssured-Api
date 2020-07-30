package utstestcase;

import com.api.test.uts.GetDataBase;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class QAGP_100483 {

    @Test
    public  void  testcase_QAGP_100483(){
        GetDataBase  uploaddata = new GetDataBase();
        String  dataresponse = uploaddata.senddata();
        System.out.println("---------------");
        System.out.println(dataresponse);
        assertThat(dataresponse,equalTo("Data is successfully saved to the database"));
    }
}
