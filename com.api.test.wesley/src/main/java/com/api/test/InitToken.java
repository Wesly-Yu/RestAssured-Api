package com.api.test;

import com.api.test.token.CoreTenant;

public class InitToken extends Restful {
    public InitToken(){
        requestSpecification.log().all().queryParam("access_token", CoreTenant.getToken())
                .expect().log().all().statusCode(200);
    }
}
