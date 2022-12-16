package test;

import io.restassured.common.mapper.TypeRef;
import io.restassured.http.ContentType;
import io.restassured.http.Cookie;
import io.restassured.http.Cookies;
import io.restassured.http.Headers;
import io.restassured.mapper.ObjectMapper;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.path.json.JsonPath;
import io.restassured.path.json.config.JsonPathConfig;
import io.restassured.path.xml.XmlPath;
import io.restassured.path.xml.config.XmlPathConfig;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.json.JSONObject;
import org.junit.Test;

import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.given;

public class C05_Get_ResponseBodyTest {

    @Test
    public void get01() {
        String url = "https://jsonplaceholder.typicode.com/posts/44";

        Response response = given().when().get(url);
        response.prettyPrint();

        response.then().assertThat().statusCode(200).contentType(ContentType.JSON).body("userId", Matchers.equalTo(5)).
                body("title", Matchers.equalTo("optio dolor molestias sit"));
    }


}
