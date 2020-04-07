import java.util.Scanner;

public class exercicio03 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int i=1,x=0,y=0;
  
    do{
      System.out.println("digite um numero: ");
      x=teclado.nextInt();
      y=y+x;
      System.out.println("a soma dos numero no momento e: "+y);
  
    }while(x!=0);
  }

}