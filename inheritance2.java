package hackerranks;


class Arithmetic{

  public int add(int a,int b){
    return a+b;
  }

}

class Adder extends Arithmetic{

  public int callAdd(int a,int b){
    return(add(a,b));
  }

}


public class inheritance2 {
  
  public static void main(String[] args) {
    
    Adder a=new Adder();

    System.out.println(a.getClass().getSuperclass().getName());

    System.out.println(a.add(2, 5));

  }
  
}
