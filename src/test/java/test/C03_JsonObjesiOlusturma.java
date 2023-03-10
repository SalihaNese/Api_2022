package test;

import netscape.javascript.JSObject;
import org.json.JSONObject;
import org.junit.Test;

public class C03_JsonObjesiOlusturma {



    @Test
    public void jsonObje(){

         /*
    Asagidaki JSON Objesini olusturup konsolda yazdirin.
    {
    "title":"Ahmet",
    "body":"Merhaba",
    "userId":1
    }
     */

        JSONObject ilkJSONObje = new JSONObject(); // icine koyacagımız degerleri tek tek put ile koyacagız

        ilkJSONObje.put("title", "ahmet");
        ilkJSONObje.put("body" , "Merhaba");
        ilkJSONObje.put("userId ", 1);

        System.out.println(ilkJSONObje);

    }

    @Test
    public void jsonObje2(){

        /*
                {
                 "firstname":"Jim",
                 "additionalneeds":"Breakfast",
                 "bookingdates":{
                         "checkin":"2018-01-01",
                         "checkout":"2019-01-01"
                    },
                  "totalprice":111,
                  "depositpaid":true,
                  "lastname":"Brown"
                  }
         */

        JSONObject innerJson = new JSONObject();// burda ictekini olusturduk
        innerJson.put("checkin" ,"2018-01-01");//once icteki json'ı olusturduk ,buyuk json olustururken direkt objenin ismini yazdık
        innerJson.put("checkout" ,"2019-01-01");


        JSONObject body = new JSONObject();
        body.put("firstname","Jim");
        body.put("additionalneeds","Breakfast");
        body.put("totalprice",111);
        body.put("depositpaid",true);
        body.put("firstname","Jim");
        body.put("lastname","Brown");
        body.put("bookingdates",innerJson);

        System.out.println(body);



    }
}
