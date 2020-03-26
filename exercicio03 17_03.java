import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class exercicio03{
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    String nome;
    int cod;
    double custo,t1,t2;
    t1=0;
    t2=0;
    System.out.println("qual o codigo do produto: ");
    cod=teclado.nextInt();
    System.out.println("qual e o nome do produto: ");
    nome=teclado.next();
    System.out.println("qual e o custo do produto: ");
    custo=teclado.nextDouble();

    if(custo>=17){
      t1=custo*0.2581;
      t2=t1+custo;
    }else{
      t1=custo*0.11;
      t2=t1+custo;
    }

  System.out.println("o produto com o nome: "+nome+" com o codigo: "+cod+" tem o valor total: "+t2);
  }
}