import java.util.Scanner;
public class exercicio03 {
  public static void main(String[] args) {
    Scanner teclado= new Scanner(System.in);
    String m,mm="0",mnm="0";
    int t,mt=0,mt2=0,d,media=0,total,dn=0,dm=0;
    for(int i=0;i<=4;i++){
      System.out.println("Qual e o mes de medicao: ");
      m=teclado.next();
      System.out.println("Qual e o dia de medicao: ");
      d=teclado.nextInt();
      System.out.println("qual e a temperatura: ");
      t=teclado.nextInt();
      if(t>mt){
        mt=t;
        mm=m;
        dm=d;
      }
      if(t<mt2){
        mt2=t;
        mnm=m;
        dn=d;
      }
      media=media+t;

    }
    total=media/4;
    System.out.println("A media das temperaturas foi: "+total+
    " com a menor temperatura sendo de: "+mt2+"no dia: "+dn+
    " no mes de: "+mnm+
    "\n e a maior temperatura foi: "+mt+" no dia: "+dm+
    " no mes de: "+mm);

  }

}