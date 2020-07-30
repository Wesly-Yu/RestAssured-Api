package com.api.test.token;

public class CoreTenantConfig {
    public String client_id="uts";
    public String  client_secret="Jo97yD8UPJgcGPxpevHMDpU1ndNsn911O9FURw4fGolcDy7CVjsaK7FBsj8nqZWj";
    public String grant_type="client_credentials";
    public String iam_action="client_credentials.tenant-impersonation";
    public String tenant="core";
    public  String Content_Type="application/x-www-form-urlencoded";
    public  String  conten_type = "application/json";
    public String utsjsonbody = "{\n" +
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
