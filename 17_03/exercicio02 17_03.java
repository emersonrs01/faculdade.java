import java.util.Scanner;

public class exercicio02{
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double idade;

    System.out.println("qual a sua idade: ");
    idade=teclado.nextDouble();

    if(idade<14){
      System.out.println("Juvenil A");
    }else{
      if(idade>=14 && idade<=17){
        System.out.println("Juvenil B");
      }else{
        if(idade>=18){
          System.out.println("Adulto");
        }
      }
    }

  }
}