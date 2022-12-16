package test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers.*;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class C07_Get_BodyTekrarlardanKurtulma {

    @Test
    public void get01(){
        String url = "https://restful-booker.herokuapp.com/booking/14018";

        Response response = given().when().get(url);
        response.prettyPrint();

        response.
                then().
                assertThat().
                statusCode(200).
                contentType("application/json; charset=utf-8").
                body("fistname", equalTo("James"),
                "lastname", equalTo("Brown"),
                "totalprice", greaterThan(110),
                "depositpaid", equalTo(true),
                "additionalneeds", containsString("Breakfast"));

    }

}
