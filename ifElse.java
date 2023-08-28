package hackerranks;

import java.util.Scanner;

public class ifElse {

  public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);

    int N = sc.nextInt();
    sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    sc.close();
    
    if(N%2!=0){
        System.out.println("Weird");   
    }
    if(N%2==0){
        if(N>=2 && N<=5 || N>20){
            System.out.println("Not Weird");
        }
        else if(N>=6 && N<=20){
            System.out.println("Weird");
        }

    }

  }
  
}
