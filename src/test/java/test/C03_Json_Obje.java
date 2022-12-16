package test;

import org.json.JSONObject;
import org.junit.Test;

public class C03_Json_Obje {
    /*

     */

    @Test
    public void jsonObje(){

        JSONObject firstJSONObje = new JSONObject();

        firstJSONObje.put("title", "Ahmet");
        firstJSONObje.put("body", "Hallo");
        firstJSONObje.put("userId", 1);

        System.out.println(firstJSONObje);
    }

    @Test
    public void jsonObje2(){
        //icice json obje olusturulurken en icten baslanir

        JSONObject innerJson = new JSONObject();

        innerJson.put("checkin", "2018-01-01");
        innerJson.put("checkout", "2019-01-01");

        JSONObject body = new JSONObject();

        body.put("firstname", "Jim");
        body.put("additionalneeds", "Breakfast");
        body.put("totalprice", 111);
        body.put("depositpaid", true);
        body.put("lastname", "Brown");
        body.put("bookingdates", innerJson);

        System.out.println(body);
    }
}
