import java.util.Scanner;

public class exercicio04 {
  public static void main(String[] args) {
    Scanner teclado =new Scanner(System.in);
    String x,e;
    int id,idm=0,idf=0,m=0,f=0,count1=0,count2=0,tm=0,tf=0;
    do{
      System.out.println("digite o sexo M/F: ");
      x=teclado.next();
      if(x.equalsIgnoreCase("M")){
        m++;
        System.out.println("Qual a sua idade: ");
        id=teclado.nextInt();
        idm=idm+id;
        count1++;
      }
      if(x.equalsIgnoreCase("F")){
        f++;
        System.out.println("Qual a sua idade: ");
        id=teclado.nextInt();
        idf=idf+id;
        count2++;
      }else{
        System.out.println("caracter invalido");
      }
      System.out.println("deseja informar mais dados: S/N");
      e=teclado.next();


    }while(e.equalsIgnoreCase("S"));
    if(count1!=0 && count2!=0){
      tm=idm/count1;
      tf=idf/count2;
    }
    System.out.println("Media da idade dos homens: "+idm+
    "\n a media de idade das mulheres: "+idf+
    " com um numero total de "+f+"mulheres");
  }

}