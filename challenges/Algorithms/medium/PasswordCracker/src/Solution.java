import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String passwordCracker(String[] pass, String attempt) {
        // Complete this function
        String result = crack(pass, attempt, "");
        return result.trim();
    }

    static String crack(String pass[], String attempt, String concat){
        for (String password: pass){
            if (attempt.length() == 0) return concat;
            if (attempt.startsWith(password)){
                return (crack(pass, attempt.substring(password.length()),
                        concat + " " + password));
            }
        }
        return "WRONG PASSWORD";
    }

    public static void main(String[] args) {
        String pass[] = {"because", "can", "do", "must", "we", "what"};
        String attempt = "wedowhatwemustbecausewecan";
        String result = passwordCracker(pass, attempt);
        System.out.println(result);

        String pass2[] = {"hello", "planet"};
        attempt = "helloworld";
        result = passwordCracker(pass2, attempt);
        System.out.println(result);

        String pass3[] = {"ab", "abcd", "cd"};
        attempt = "abcd";
        result = passwordCracker(pass3, attempt);
        System.out.println(result);
    }
}