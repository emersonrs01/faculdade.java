import java.util.Scanner;
public class exercicio01 {
  public static void main(String[] args) {
    Scanner teclado =new Scanner(System.in);
    int a=0,b=0,cont=0,t,total=0;
    System.out.println("Qual e o numero de turmas: ");
    t=teclado.nextInt();

    for(int i=1;i<=t;i++){
      System.out.println("Qual e o numero de alunos da turma "+i+": ");
      a=teclado.nextInt();
      b=b+a;
      cont++;
      while(a>50){
        System.out.println("Qual e o numero de alunos da turma "+i+": ");
        a=teclado.nextInt();
      }
    }
    total=b/cont;
    System.out.println("A media dos aluno foi: "+total);
  }

}