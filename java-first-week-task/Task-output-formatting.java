import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                int count = 0;
                int prob = 0;
                for (int j = 0; j<s1.length();j++){
                    count++;
                    prob = 14 - count;
                }System.out.print(s1);
                for (int l = 0; l<=prob; l++){
                       System.out.print(" "); 
                    }
                
                if(x<10){
                    System.out.println("00"+x);
                }else if(x<100){System.out.println("0"+x);
                }else{System.out.println(x);}
            }
            System.out.println("================================");

            }
            
    }




