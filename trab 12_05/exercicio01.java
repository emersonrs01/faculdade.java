import java.util.Scanner;

public class exercicio01{
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    float n=0,r=0,mn=10,aux=0,r1=0;
    System.out.println("digite a nota do aluno 1: ");
    n=teclado.nextFloat();
    mn=n;

    for(int i=2;i<=5;i++){
      if(n<mn){
        aux=mn;
        mn=n;
        n=aux;
      }
      if(n<0 || n>10){
        do{
          System.out.println("digite novamente a nota do aluno sendo de 0 a 10");
          n=teclado.nextFloat();
          if(n<mn){
            aux=mn;
            mn=n;
            n=aux;
          }
        }while(n<0 || n>10);
      }
      r1=r1+r;
      r=somatorio(n);
      System.out.println("digite a nota do aluno "+i+": ");
      n=teclado.nextFloat();
    }
    res(r1);
  }

  public static float somatorio(Float n){
    float r2=0;
    r2=n/3;
    return r2;

  }

  public static void res(float r1){
    System.out.println("a media dos aluno foi: "+r1);
  }

}