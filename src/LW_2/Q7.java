package LW_2;

import java.util.Date;
import java.text.SimpleDateFormat;
public class Q7 {

    public class DisplayDateWithDay {
        public static void main(String[] args) {
            Date today = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("EEEE, MMMM d, yyyy");
            String formattedDate = formatter.format(today);
            System.out.println("Today's date is: " + formattedDate);
        }
    }

}
