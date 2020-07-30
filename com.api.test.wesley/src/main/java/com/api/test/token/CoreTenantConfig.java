package com.api.test.token;

public class CoreTenantConfig {
    public String client_id="uts";
    public String  client_secret="Jo97yD8UPJgcGPxpevHMDpU1ndNsn911O9FURw4fGolcDy7CVjsaK7FBsj8nqZWj";
    public String grant_type="client_credentials";
    public String iam_action="client_credentials.tenant-impersonation";
    public String tenant="core";
    public  String Content_Type="application/x-www-form-urlencoded";
    public  String  conten_type = "application/json";


    private  static CoreTenantConfig coretenantConfig;
    public static CoreTenantConfig getInstance(){
        if (coretenantConfig==null){
            coretenantConfig = new CoreTenantConfig();
        }
        return coretenantConfig;
    }
    public static void loaddata(String filepath){

    }

}
