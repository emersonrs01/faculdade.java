import java.util.Scanner;

public class emerson1{
  public static void main(String[] args) {
    int v[] = new int[5];
    boolean status=true,test=false;
    Scanner teclado = new Scanner(System.in); 
    for(int i=0;i<5;i++){
      System.out.println("digite o valor: ");
      v[i]=teclado.nextInt();
    }
    while(status){
      int x;
      status=false;
      for(int i=0;i<4;i++){
        if(v[i]<v[i+1]){
          x=v[i];
          v[i]=v[i+1];
          v[i+1]=x;
          status=true;
        }
      }
    }
    for(int i=0;i<5;i++){
      System.out.println("valor em ordem decrescente: "+v[i]);
    }
    status=true;
    while(status){
      status=false;
      test=false;
      int n,vet=0,num;
      System.out.println("Digite o numero desejado: ");
      num=teclado.nextInt();
      for(int i=0;i<5;i++){
        if(v[i]==num){
          vet=i;
          test=true;
        }
      }
      if(test){
        System.out.println("o numero "+num+" esta na posicao "+vet);
        System.out.println("deseja realizar uma nova perquisa? Digite 1");
        n=teclado.nextInt();
        if(n==1){
          status=true;
        }
      }else{
        System.out.println("o numero "+num+"nao esta no vetor");
        System.out.println("deseja realizar uma nova perquisa? Digite 1");
        n=teclado.nextInt();
        if(n==1){
          status=true;
        }
      }
      

    }
  }
}