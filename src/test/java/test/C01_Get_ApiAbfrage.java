package test;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C01_Get_ApiAbfrage {

    /*
       "https://restful-booker.herokuapp.com/booking/247336" url ine bir GET request gonderdigimizde donen Response ' un,
       status codenun 200, ve content type application/json;
       charset=utf-8,
       Server isimli Header'in degerinin Cowboy,
       ve status Line'in HTTP/1.1 200 OK
       ve Response suresinin 5 sn den kisa oldugunu manuel olarak test ediniz.
     */


    @Test
    public void get01() {

        //1- Request icin Url ve Body Hazirla
        String url = "https://restful-booker.herokuapp.com/booking/1415";

        //2 -Expected data hazirla

        //3-Response kaydet

        Response response = given().when().get(url);
        response.prettyPrint();

        //4- status cod icin

        System.out.println("Status code:" + response.getStatusCode());
        System.out.println("Content Type:" + response.getContentType());
        System.out.println("Server Header deger:" + response.getHeader("server"));
        System.out.println("Status Line:" + response.getStatusLine());
        System.out.println("Response suresi:" + response.getTime());


    }


}
