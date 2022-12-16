package practiceApiLesson1;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Authentication {

    // Web sitelerinin guvenliig acisindan developer lar otonatik olarak
    // belli bir periyotta degisen sifreleme create eder buna token diyoruz
    // Asagidaki metyhodu token i otomatik olarak almak ve koda implement etmek icin olusturuyoruz
    public static String generateToken(){
        String username = "Batch44Api" ;
        String password = "Batch44+" ;
        Map<String,Object> map = new HashMap<>() ;
        map.put("username",username);
        map.put("password",password);

        String enPoint = "https://www.gmibank.com/api/authenticate" ;
        Response response = given()
                .contentType(ContentType.JSON)
                .body(map)
                .when()
                .post(enPoint);

        JsonPath token = response.jsonPath();
        return token.getString("id_token") ;
        //"id_token" endPointden geliyor token in path texti
    }

    public static void main(String[] args) {
        System.out.println(generateToken());
    }
}

