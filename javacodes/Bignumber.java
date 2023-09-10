import java.math.BigInteger;
import java.util.Scanner;

public class Bignumber {


  public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);

    String one=sc.nextLine();
    String two=sc.nextLine();

    BigInteger bigone=new BigInteger(one);
    BigInteger bigtwo=new BigInteger(two);

    System.out.println(bigone.add(bigtwo));
    System.out.println(bigtwo.multiply(bigtwo));

  }
  
}
