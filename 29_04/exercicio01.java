import java.util.Scanner;
public class exercicio01{
  public static void main(String[] args) {
    boolean x;
    x=parimpar();
    if(x){
      System.out.println("o valor e par");
    }else{
      System.out.println("o valor e impar");
    }

  }
  public static boolean parimpar(){
    int n;
    boolean r=false;
    Scanner teclado = new Scanner(System.in);
    System.out.println("digite o numero: ");
    n=teclado.nextInt();
    if(n%2==0){
      r = true;
    }
    return r;

  }
}