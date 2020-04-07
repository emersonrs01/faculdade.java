import java.util.Scanner;

public class exercicio01 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    String x;

    System.out.println("digite uma palavra:");
    x=teclado.next();

    System.out.println( x.charAt(1) );
    System.out.println( x.length() );
    System.out.println( x.substring(0,2));
    System.out.println( x.toUpperCase());

  }
}