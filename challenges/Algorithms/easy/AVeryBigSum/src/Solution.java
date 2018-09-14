import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar) {
        long sum = 0;
        for(long items : ar){
            sum+=items;
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {

        long[] ar = {1000000001, 1000000002, 1000000003, 1000000004, 1000000005};

        long result = aVeryBigSum(ar);
        System.out.println(result);

    }
}
