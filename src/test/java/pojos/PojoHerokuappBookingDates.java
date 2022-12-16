package pojos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  // getter ve setter ı otomatık yapar
@NoArgsConstructor // parametresiz yapar
@AllArgsConstructor // butun hepsini yapar


public class PojoHerokuappBookingDates {

    /*
    {
    "checkin" : "2021-06-01",
     "checkout" : "2021-06-10"
      }
     */

    private  String checkin;
    private  String checkout;

}
