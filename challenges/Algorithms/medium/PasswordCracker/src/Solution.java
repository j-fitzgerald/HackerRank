import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String passwordCracker(String[] pass, String attempt) {
        // Complete this function
        for(String passwords : pass){
            attempt = attempt.replaceAll(passwords, passwords + " ");
        }
        //System.out.println(attempt);
        String splitVersion[] = attempt.split(" ");

        /*for (String words: splitVersion){
            System.out.print(words);
        }
        */
        System.out.println();
        for (String words : splitVersion){
            //System.out.print(words);
            boolean found = false;
            for(String passwords : pass){
                if (words.equals(passwords)) {
                    found = true;
                    break;
                }
            }
            if (!found) return "WRONG PASSWORD";
        }
        return attempt;
    }

    public static void main(String[] args) {
        String pass[] = {"because", "can", "do", "must", "we", "what"};
        String attempt = "wedowhatwemustbecausewecan";
        String result = passwordCracker(pass, attempt);
        System.out.println(result);

        String pass2[] = {"hello", "planet"};
        attempt = "helloworld";
        result = passwordCracker(pass, attempt);
        System.out.println(result);

        String pass3[] = {"ab", "abcd", "cd"};
        attempt = "abcd";
        result = passwordCracker(pass, attempt);
        System.out.println(result);
    }
}