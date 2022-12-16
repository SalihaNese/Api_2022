package practiceApiLesson1;

public class ApiCalls {

    //Bu class BaseUrl 'deki classlar gibi ve spec methodu gibi kullanacagız
    public static String GET_USER_WITH_ID = "https://www.gmibank.com/api/tp-customers/";
    public static String POST_USER = "http://dummy.restapiexample.com/api/v1/create";

    // Endpoint in sonuns id eklemek istiyorız cunku user i id ile getirmeliyiz,
    // bu sebepten dolayi dinamik bir method create ettik
    public static String createGetUserApiCall(int id){
        return GET_USER_WITH_ID + id;
    }

    public static String createPostUserApiCall(){
        return POST_USER;
    }
}
