package hackerranks;

import java.util.Arrays;
import java.util.Scanner;

public class subarray {

  public static void main(String[] args) {

    int n,sum=0,c=0;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    int[] a = new int[n];
    for(int i=0;i<n;i++){
      a[i] = sc.nextInt();
    }

    for(int i=0;i<n;i++){
      for(int j=i;j<n;j++){

        sum=0;
        for(int k=i;k<j;k++){
          sum=sum+a[k];
        }

        if(sum<0){
          c=c+1;
        };

      }
    }

    System.out.println(c);
    
  }
  
}
