package baseUrl;


import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;
public class JsonPlaceHolderBaseURL {
    protected RequestSpecification specJsonPlace;//Her class'tan erisilebilsin fakat degistirilmesin diye "protect" yaptık
    @Before
    public void setUp(){

        specJsonPlace = new RequestSpecBuilder().
                                setBaseUri("https://jsonplaceholder.typicode.com").
                                 build();
    }
}


