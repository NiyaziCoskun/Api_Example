package test;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C02_Get_Response {
    /*
      https://restful-booker.herokuapp.com/booking/10 url'ine bir Get request gonderdigimizde donen Response'un,
       status codenun 200
       content typ application/json; charset=utf-8,
       ve server isimli Headerin degerinin Cowboy,
       status Line HTTP/1.1 200 OK
     */



    @Test
    public void get02() {

        //1- Request icin Url ve Body Hazirla
        String url = "https://restful-booker.herokuapp.com/booking/1415";

        //2 -Expected data hazirla

        //3-Response kaydet

        Response response = given().when().get(url);
        response.prettyPrint();

        response
                .then()
                .assertThat()
                .statusCode(200)
                .contentType("application/json; charset=utf-8")
                .header("Server","Cowboy")
                .statusLine("HTTP/1.1 200 OK");


    }
}
