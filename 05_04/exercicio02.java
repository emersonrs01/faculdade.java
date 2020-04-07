import java.util.Scanner;
public class exercicio02 {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double x=0,y=0,z=0;
    int i=0;

    do{
      System.out.println("digite um numero: ");
      x=teclado.nextDouble();
      z=z+x;
      i++;
    }while(i<5);

    y=z/5;

    System.out.println("a media dos numeros sao: "+y+"\n e a soma e: "+z);
  }
}