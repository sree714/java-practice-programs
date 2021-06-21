package Hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();

        try{
            Integer i = Integer.parseInt(S);
            System.out.println(i);

        }catch(NumberFormatException nfe){
            System.out.println("Bad String");
        }
    }
}
