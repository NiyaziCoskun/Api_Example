package test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.json.JSONObject;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C06_Post_ResponseBodyTest {
    @Test
    public void post01() {
        String url = "https://jsonplaceholder.typicode.com/posts";

        JSONObject reqBody = new JSONObject();

        reqBody.put("title","API");
        reqBody.put("body","API lernen so cool");
        reqBody.put("userId",10);

        Response response = given().contentType(ContentType.JSON).when().body(reqBody.toString()).post(url);
        response.prettyPrint();

        response.then().statusCode(200).contentType(ContentType.JSON).body("title", Matchers.equalTo("API")).
                body("userId", Matchers.lessThan(100)).body("body", Matchers.containsString("API"));


    }
}
