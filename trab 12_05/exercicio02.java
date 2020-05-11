import java.util.Scanner;

public class exercicio02 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int x,c1=0,c2=0,c3=0,cont=0;
    float c4=0,c5=0,porc1,porc2;

    do{
      System.out.println("1:candidato 1\n2:candidato 2\n3:candidato 3\n4:voto nulo\n5:voto em branco");
      x=teclado.nextInt();
      while(x<0 || x>5){
        System.out.println("voce digitou um numero incorreto, os numero corretos sao:\n1:candidato 1\n2:candidato 2\n3:candidato 3\n4:voto nulo\n5:voto em branco");
        x=teclado.nextInt();
      }
      switch (x){
        case 1:
          c1=c1+1;
          cont++;
          break;
        case 2:
          c2=c2+1;
          cont++;
          break;
        case 3:
          c3=c3+1;
          cont++;
          break;
        case 4:
          c4=c4+1;
          cont++;
          break;
        case 5:
          c5=c5+1;
          cont++;
          break;
      }
    }while(x!=0);
    porc1=(c4/cont)*100;
    porc2=(c5/cont)*100;
    System.out.println("total de votos para o candidato 1: "+c1+"\ntotal de votos para o candidato 2: "+c2+"\ntotal de votos para o candidato 3: "+c3);
    System.out.println("procentagem de votos nulos: "+porc1+" porcentagem de votos brancos: "+porc2);
  }
}