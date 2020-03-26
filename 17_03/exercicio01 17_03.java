
import java.util.Scanner;

public class exercicio01{
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    String t;
    double gas,dsel;
    gas=0;
    dsel=0;

    System.out.println("gasolina ou diesel:");
    t=teclado.next();
    
    if(t.contains("g") || t.contains("d")){
      if(t.contains("g")){
        System.out.println("quantidade de gasolina: ");
        gas=teclado.nextDouble();
        if(gas>20){
          gas=gas*4.599;
          gas=gas*0.94;
          System.out.println(+gas);
        }else{
          gas=gas*4.599;
          gas=gas*0.96;
          System.out.println(+gas);
        }
      }
      if(t.contains("d")){
        System.out.println("quantidade de diesel: ");
        dsel=teclado.nextDouble();
        if(dsel>20){
          dsel=dsel*3.499;
          dsel=dsel*0.93;
          System.out.println(+dsel);
        }else{
          dsel=dsel*3.499;
          dsel=dsel*0.97;
          System.out.println(+dsel);
        }
      }
    }else{
    System.out.println("caracter invalido");
    }
  }
}