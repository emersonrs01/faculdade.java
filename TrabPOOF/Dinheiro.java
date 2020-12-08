public class Dinheiro {
    private int valor, nt2, nt5, nt10, nt20, nt50, nt100, nt200;
    
    public Dinheiro(int vlr){
        this.valor = vlr;
    }
    public int normacao(){
      while(valor%5!=0){
            valor-=2;
            nt2++;
      }
        return nt2;
    }
    public int getNotas2(){
        while(valor>=2)
            {
            valor-=2;
            nt2++;
            }
        return nt2;
    }
    public int getNotas5(){
        while(valor>=5)
            {
            valor-=5;
            nt5++;
            }
        return nt5;
    }
    public int getNotas10(){
        while(valor>=10)
            {
            valor-=10;
            nt10++;
            }
        return nt10;
    }
    public int getNotas20(){
        while(valor>=20)
            {
            valor-=20;
            nt20++;
            }
        return nt20;
    }
    public int getNotas50(){
        while(valor>=50)
            {
            valor-=50;
            nt50++;
            }
        return nt50;
    }
    public int getNotas100(){
        while(valor>=100)
            {
            valor-=100;
            nt100++;
            }
        return nt100;
    }
    public int getNotas200(){
        while(valor>=200)
            {
            valor-=200;
            nt200++;
            }
        return nt200;
    }
}