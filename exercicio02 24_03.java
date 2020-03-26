import java.util.Scanner;

public class exercicio02{
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double n1,n2,t;
    int e;
    e=0;
    t=0;

    System.out.println("qual e o primeiro numero: ");
    n1=teclado.nextDouble();

    System.out.println("qual e o segundo numero: ");
    n2=teclado.nextDouble();

    System.out.println("1:somar os valores\n2:media aritmetica\n3:raiz quadrade de "+n1+"\n4:o quadrado de "+n2+"\n");
    e=teclado.nextInt();

    switch(e){
      case 1:
        t=n1+n2;
        Math.floor(t);
        System.out.println("\na soma dos numeros "+n1+ " e "+n2+" é: " +t);
        break;
      case 2:
        t=(n1+n2)/2;
        System.out.println("\na media aritmetica de "+n1+" "+n2+" e: "+t);
        break;
      case 3:
        t=Math.sqrt(n1);
        System.out.println("\na raiz quadrada de "+n1+" é: "+t);
        break;
      case 4:
        t=n2*n2;
        System.out.println("\no quadrado de "+n2+"e: "+n2);
        break;

    }

  }
}
