import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the staircase function below.
    static void staircase(int n) {
        for (int i = 1; i  <= n; i++){
            Character line[] = new Character[n];
            int j = 0;
            while (j < n - i){
                line[j] = ' ';
                j++;
            }
            while (j < n){
                line[j] = '#';
                j++;
            }
            for (char chars : line){
                System.out.print(chars);
            }
            System.out.println();
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = 6;
        staircase(n);
    }
}
