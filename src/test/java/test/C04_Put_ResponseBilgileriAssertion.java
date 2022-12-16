package test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C04_Put_ResponseBilgileriAssertion {

    @Test
    public void put01(){
        String url = "https://jsonplaceholder.typicode.com/posts/70";

        JSONObject reqBody = new JSONObject();

        reqBody.put("title", "abc");
        reqBody.put("body", "gfh");
        reqBody.put("userId", 3);
        reqBody.put("id", 1);

        Response response = given().
                contentType(ContentType.JSON).
                when().
                body(reqBody.toString()).
                put(url);
        response.prettyPrint();

        response.
                then().
                assertThat().
                statusCode(200).
                contentType("application/json; charset=utf-8").
                header("Server", "cloudflare").
                statusLine("HTTP/1.1 200 OK");


    }

}
