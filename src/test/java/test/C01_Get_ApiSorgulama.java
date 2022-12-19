package test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class C01_Get_ApiSorgulama {

    /*
        https://restful-booker.herokuapp.com/booking/247336 url’ine
        bir GET request gonderdigimizde donen Response’un,

        status code’unun 200,
        ve content type’inin application/json; charset=utf-8,
        ve Server isimli Header’in degerinin Cowboy,
        ve status Line’in HTTP/1.1 200 OK
        ve response suresinin 5 sn’den kisa oldugunu manuel olarak test ediniz.
         */

    @Test
    public void get01(){

        // 1 - Request icin Url ve Body hazirla
        String url = "https://restful-booker.herokuapp.com/booking/256884 ";


        // 2 - Expected Data hazirla   // bu soru icin expected body yok

        // 3 - Response'u kaydet   // responsu kaydetmek icin response interfaceden obje olusturuyoruz
        Response response = given().when().get(url); // when'den sonra hangi islemi yapacagımızı yazıyoruz put,get gibi

        response.prettyPrint(); // donen respons'u yazdırır

        System.out.println("Status Code : " + response.getStatusCode());//StatusCodun 200 oldugunu test ettik
        System.out.println("content type : " + response.getContentType());
        System.out.println("SServer Header'inin degeri : " + response.getHeader("Server"));
        System.out.println("status Line : " + response.getStatusLine());
        System.out.println("Response suresi : " + response.getTime());

        // Assertion


    }

}
