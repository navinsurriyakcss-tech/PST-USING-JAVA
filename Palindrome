import java.io.*;
import java.util.*;

class Palindrome {

    public int isPalindrome(String input1) {

        // convert to same case so that case does not matter
        String s = input1.toLowerCase();

        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String rev = sb.toString();

        if (s.equals(rev)) {
            return 2;   // input string is a palindrome
        } else {
            return 1;   // input string is NOT a palindrome
        }
    }
}
