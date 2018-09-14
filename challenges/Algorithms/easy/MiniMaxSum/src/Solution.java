import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        java.util.Arrays.sort(arr);
        long min = 0;
        long max = 0;
        for (int i = 0; i < arr.length; i++){
            if (i != arr.length - 1)
                min += arr[i];
            if (i != 0)
                max += arr[i];
        }
        System.out.println(min + " " + max);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        miniMaxSum(arr);
    }
}
