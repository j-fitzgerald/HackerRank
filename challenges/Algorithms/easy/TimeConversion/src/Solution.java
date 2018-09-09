import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String splitTime[] = s.split(":");
        int time[] = new int[3];
        if (splitTime[2].endsWith("PM")){
            if (Integer.parseInt(splitTime[0]) != 12) {
                time[0] = Integer.parseInt(splitTime[0]) + 12;
            }
            else
                time[0] = 12;
        }
        else{
            if (Integer.parseInt(splitTime[0]) == 12)
                time[0] = 00;
            else
                time[0] = Integer.parseInt(splitTime[0]);
        }
        time[1] = Integer.parseInt(splitTime[1]);
        time[2] = Integer.parseInt(splitTime[2].substring(0,2));
        return String.format("%02d:%02d:%02d", time[0], time[1], time[2]);
            }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String s = "07:05:45AM";
        String result = timeConversion(s);
        System.out.println(result);

        s = "07:05:45PM";
        result = timeConversion(s);
        System.out.println(result);

        s = "12:00:00AM";
        result = timeConversion(s);
        System.out.println(result);

        s = "12:00:00PM";
        result = timeConversion(s);
        System.out.println(result);

        s = "01:00:00AM";
        result = timeConversion(s);
        System.out.println(result);

        s = "01:00:00PM";
        result = timeConversion(s);
        System.out.println(result);
    }
}
