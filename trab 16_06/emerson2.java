import java.util.Scanner;
public class emerson2 {
  public static void main(String[] args) {
    int x[][]= new int [2][3];
    int mn=0;

    Scanner teclado = new Scanner(System.in);
    for(int i=0;i<2;i++){
      for(int y=0;y<3;y++){
        System.out.println("digite o valor: ");
        x[i][y]=teclado.nextInt();
      }
    }
    for(int i=0;i<2;i++){
      for(int y=0;y<3;y++){
        if(i==0 && y==0){
          mn=x[i][y];
        }
        if(mn<x[i][y]){
          mn=x[i][y];
        }
      }
    }
    for(int i=0;i<2;i++){
      for(int y=0;y<3;y++){
        if(x[i][y]==mn){
          System.out.println("o maior numero "+mn+" esta na linha "+i+" na coluna "+y);
        }
      }
    }
  }
}