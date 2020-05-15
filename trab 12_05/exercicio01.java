import java.util.Scanner;

public class exercicio01{
  public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    float n=0,m=0,mn=11,med=0,notas=0;
    for(int i=1;i<=5;i++){
      System.out.println("Nota do Aluno "+i+" = ");
      n=teclado.nextFloat();
      while(n<0 || n>10){
        System.out.println("digite novamente a nota do aluno sendo de 0 a 10 ");
        n=teclado.nextFloat();
      }
      if(n<mn){
        mn=n;
      }
      notas+=n;    
    }
    med=somatorio(notas,mn);
    out(med);
  }
  public static float somatorio(Float notas, Float mn){
    float m=0;
    m=(notas-mn)/4;   
    return m;
  }
  public static void out(float md){
    System.out.println("a media dos aluno foi: "+md);
  }
}