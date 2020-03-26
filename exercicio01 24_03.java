import java.util.Scanner;

public class exercicio01{
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int ano;
    System.out.println("qual e o ano: ");
    ano=teclado.nextInt();

    if(ano%4==0){
      System.out.println("é ano bissexto");
    }else{
      System.out.println("nao e ano bissexto");
    }
  }
}