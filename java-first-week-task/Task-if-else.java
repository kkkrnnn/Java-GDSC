import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a = scanner.nextInt();
        if (a%2==1){
            System.out.println("Weird");
            
        }
        else if (a%2==0){
            if (a>2 && a<5){
                System.out.println("Not Weird");
            }
            else if (a>6 && a<=20){
                System.out.println("Weird");
            }else{System.out.println("Not Weird");}
            
        }
        
    }
}
