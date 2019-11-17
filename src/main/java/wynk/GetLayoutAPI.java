package wynk;

import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;
import wynk.wynk.pojo.GetLayoutAPIResponse;

import java.util.*;

public class GetLayoutAPI {


    RequestSpecification rs;
    Gson g;
    String[] keys;

    public String getATVKeysFromAPIResponses() {
        GetLayoutAPI getLayoutAPI = new GetLayoutAPI();
        Response getlayoutAPIresponse = getLayoutAPI.getLayoutAPIRespone();
        System.out.println(getlayoutAPIresponse.asString());
        g = new Gson();
        ArrayList<GetLayoutAPIResponse> listContents  = g.fromJson(getlayoutAPIresponse.asString(),ArrayList.class);

        // method 1 - which first converts LinkedTreeMap Response  OBJ into JSON  and then again send this JSON for mapping to
        // ObjectClass we want to map
        // Directly using below Line will Fail
         GetLayoutAPIResponse getrespone   = listContents.get(0);
        String s2 = g.toJson(listContents.get(0));
        GetLayoutAPIResponse getLayoutResponseMapper = new Gson().fromJson(s2, GetLayoutAPIResponse .class);
        System.out.println(getLayoutResponseMapper.getId());


        int count = 0;
       // Map<Object,Object> map = (Map<Object, Object>) listContents.get(0);
        String s ="";
        // object = new Gson().fromJson(new Gson().toJson(((LinkedTreeMap<String, Object>) listContents.get(0))), GetLayoutAPIResponse .class);
        for ( int i =0 ;i<listContents.size(); i++)
       {
           Map<Object,Object> map = (Map<Object, Object>) listContents.get(i);
           if(map.get("contents")!=null) {
               if (map.get("id").equals("5a815b91e4b0f9f21d74962a")) {
                      List<Object> obj = (List<Object>) map.get("contents");
                       s = (String) ((LinkedTreeMap) obj.get(0)).get("packageId");
                   System.out.println("KEY fetched " + s);
                   }

           }
       }
      /*  for (GetLayoutAPIResponse getLayoutAPIResponseArrayList : listContents) {

            if (getLayoutAPIResponseArrayList.getId().equals("5a815b91e4b0f9f21d74962a") || getLayoutAPIResponseArrayList.getId().equals("5a815cece4b0f9f21d74962b ")) {
                keys[count] = getLayoutAPIResponseArrayList.getContents().get(0).getPackageId();
                count++;
            }
        }*/
        return s;
    }


    public Response  getLayoutAPIRespone()
    {

        RestAssured.baseURI = "https://layoutapi-dev2.wynk.in/tv/layout/v1/page";
        RequestSpecification httpRequest = RestAssured.given();

        Map<String , String >  header = new HashMap<String, String>();
        header.put("x-atv-did","f61c007377159398|Phone|Android|28|12603|1.21.0");
        header.put("data_source","BOTH");
        header.put("content-type","application/json");
        header.put("x-atv-utkn","hAT6KpR_D1PfgB3AM0:mzLZB97lcRrtYaUX8oPYMBgdOV0=");
        header.put("cache-control","max-age=3600");
        header.put("accept-encoding","gzip");
        header.put("user-agent","okhttp/3.13.1");
        header.put("Pragma","no-cache");
        Response response = httpRequest.headers(header)
                .accept("application/json")
                .queryParam("pageId", "homepage")
                .queryParam("cl", "dl")
                .queryParam("ut", "PO")
                .queryParam("lg", "hi")
                .queryParam("op", "AIRTEL")
                .queryParam("rg", "true")
                .queryParam("cp", "airtel_tv%2Ccuriositystream%2Cerosnow%2Cfastfilmz%2Choichoi%2Chooq%2Chotstar%2Chungama%2Clionsgateplay%2Cmwtv%2Cndtv%2Cshemaroome%2Cultra%2Cvoot%2Czee5")
                .queryParam("os", "ANDROID")
                .queryParam("dt", "phone")
                .queryParam("dt", "phone")
                .queryParam("bn", "12603")
                .queryParam("pacp", "")
                .queryParam("pncp", "")
                .queryParam("recInProg", "false")
                .queryParam("currSeg", "ATVPLUS")
                .queryParam("appId", "MOBILITY")
                .queryParam("refresh", "true")
                .when()
                .get("");

        return response;
    }


    public Response  getContentAPIRespone(String key)
    {

        String URL = "https://contentapi-dev2.wynk.in/app/v1/package";
        RestAssured.baseURI = URL;
        RequestSpecification httpRequest = RestAssured.given();


        Map<String , String >  header = new HashMap<String, String>();
        header.put("x-atv-did","f61c007377159398|Phone|Android|28|12603|1.21.0");
        header.put("data_source","BOTH");
        header.put(":scheme","https");
        header.put("force_refresh","false");
        header.put("content-type","application/json");
        header.put("x-atv-utkn","hAT6KpR_D1PfgB3AM0:mzLZB97lcRrtYaUX8oPYMBgdOV0=");
        header.put("accept-encoding","gzip");
        header.put("user-agent","okhttp/3.13.1");
        Response response = httpRequest.headers(header).queryParam("id",key)
                .accept("application/json")
                .when().get(URL);
        System.out.println(response.statusCode());
        System.out.println("This is Response for key ==="+key +"    "+response.asString());
        return response;
    }

}
