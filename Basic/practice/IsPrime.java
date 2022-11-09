package practice;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args){
      System.out.println("enter the number");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0 ;i<n ;i++){
          if(n%i == 0  ){
             System.out.println("false");
          }
          System.out.println("true");
        }
    }
}
