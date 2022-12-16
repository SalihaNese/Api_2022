package test;

import baseUrl.JsonPlaceHolderBaseURL;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import testData.TestDataJsonPlaceHolder;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class C22_Put_DeSerialization extends JsonPlaceHolderBaseURL {

    /*
    https://jsonplaceholder.typicode.com/posts/70 url'ine asagidaki
    body’e sahip bir PUT request yolladigimizda donen response’in
    response body’sinin asagida verilen ile ayni oldugunu test ediniz

    Request Body

        {
        "title":"Ahmet",
        "body":"Merhaba",
        "userId":10,
        "id":70
        }

    Expected Data :

        {
        "title":"Ahmet",
        "body":"Merhaba",
        "userId":10,
        "id":70
        }

     */

    @Test
    public void put01(){
        // 1- Request icin URL ve Body hazirlamak

        specJsonPlace.pathParams("pp1","posts","pp2",70);

        TestDataJsonPlaceHolder testDataJsonPlaceHolder = new TestDataJsonPlaceHolder();

        HashMap<String,Object> requestBodyMap = testDataJsonPlaceHolder.requestBodyOlusturMap();

        System.out.println("requestBodyMap" + requestBodyMap);

        // 2- Expected data olustur
        HashMap<String,Object> expectedBodyMap = testDataJsonPlaceHolder.requestBodyOlusturMap();

        // 3- Respons'u kaydet
        // NOT : Request Body'i Map olarak hazirladigimiz icin ve Map de Javanin
        // kendisine ait format oldugu icin Response yollanırken toString
        // methoduna ihtiyac kalmaz
        Response response = given().
                                 spec(specJsonPlace).
                                contentType(ContentType.JSON).
                        when().
                            body(requestBodyMap).put("/{pp1}/{pp2}");


        response.prettyPrint();

        // 4- Assertioın

        HashMap<String,Object> responseMap = response.as(HashMap.class);

    assertEquals(testDataJsonPlaceHolder.basariliStatusCode,response.statusCode());
    assertEquals(expectedBodyMap.get("title"),responseMap.get("title"));
    assertEquals(expectedBodyMap.get("body"),responseMap.get("body"));
    assertEquals(expectedBodyMap.get("userId"),responseMap.get("userId"));
    assertEquals(expectedBodyMap.get("id"),responseMap.get("id"));

    }
}
