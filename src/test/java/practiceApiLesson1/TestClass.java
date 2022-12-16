package practiceApiLesson1;

import io.restassured.path.json.JsonPath;
import org.junit.Assert;
import org.junit.Test;

/*
public class TestClass {


    RestApiUtils restApiUtils = new RestApiUtils();
    @Test
    public void verifyUserWithID() {
        //JSONPATH ile dogruilama yapalim
        JsonPath json = restApiUtils.checkUserWithIDGet(114351).jsonPath();
        Assert.assertEquals("Della", json.get("firstName"));
        Assert.assertEquals("Heaney", json.get("lastName"));
        Assert.assertEquals("ricardo.larkin@yahoo.com", json.get("email"));
    }
    @Test
    public void createUserTestPost() {
        restApiUtils.postUserApiCall("Erva","3500","37").prettyPrint() ;
    }
}
*/

public class TestClass {

    RestApiUtils restApiUtils = new RestApiUtils();

    @Test
    public void verifyUserWithID() {
        //JSONPATH ile dogruilama yapalim
        JsonPath json = restApiUtils.checkUserWithIDGet(114351).jsonPath();
        Assert.assertEquals("Della", json.get("firstName"));
        Assert.assertEquals("Heaney", json.get("lastName"));
        Assert.assertEquals("ricardo.larkin@yahoo.com", json.get("email"));
    }

    @Test
    public void createUserTestPost() {
        restApiUtils.postUserApiCall("Erva","3500","37").prettyPrint() ;
    }

}
