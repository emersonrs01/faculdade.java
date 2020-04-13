import java.util.Scanner;
public class exercicio01 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int x,y,t=0;
    System.out.println("qual e o valor de X: ");
    x=teclado.nextInt();
    System.out.println("qual e o valor de y:");
    y=teclado.nextInt();
    for(int i=x;i<y;i++){
      t=t+i;
    }
    System.out.println("o valor total foi: "+t);
  }

}