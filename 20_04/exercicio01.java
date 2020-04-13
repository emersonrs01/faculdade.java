import java.util.Scanner;
public class exercicio01 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int a,b=-1,r=0;

    System.out.println("Digite o valor de A: ");
    a=teclado.nextInt();

    while(a>b){
      System.out.println("Digite o valor de B: ");
      b=teclado.nextInt();
    };
    for(int i=a;i<b;i++){
      r=r+i;
    }
    System.out.println("O valor total foi: "+r);
    
  }
}