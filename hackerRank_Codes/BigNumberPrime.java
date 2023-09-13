import java.math.BigInteger;
import java.util.*;

public class BigNumberPrime {

  public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);

    String n=sc.nextLine();

    BigInteger bi = new BigInteger(n);

    System.out.println(bi.isProbablePrime(10)? "it is prime": "not prime");

  }
  
}
