import java.util.Scanner;
public class exercicio02 {
  public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    int x,t;
    System.out.println("Digite o numero: ");
    x=teclado.nextInt();

    for(int i=1;i<=10;i++){
      t=x*i;
      System.out.println("tabuada do:"+x+"\n"+x+"*"+i+": "+t);
    }
  }

}