
package ed_exercicio_classificacao;

import java.util.Random;
import java.util.Scanner;

public class Ed_exercicio_classificacao
{

    private static void mostra_vetor( int[ ] v )
    {
        System.out.println("\n\n");
                
        for( int i = 0 ; i < v.length ; i++ )
        {
            System.out.print(v[ i ] + "  ");
        }
        System.out.println("\n\n");
    }
        
    private static void gera_valores( int[ ] v )
    {
        int cont = 0, valor, i;
        
        while( cont < v.length )
        {
            valor = new Random().nextInt(99);
            for( i = 0 ; i < cont ; i++ )
                if( valor == v[i] )
                    break;
            if( i == cont )
            {
                v[ cont ] = valor;
                cont++;
            }                
        }            
    } 

    private static void insertion( int[ ] v )
    {
        int passo, valor, i;
        
        for( passo = 1 ; passo <= v.length-1 ; passo++ )
        {
            valor = v[ passo ];
            for( i = passo-1 ; i >= 0 ; i-- )
                if( valor < v[ i ] ) 
                    v[ i+1 ] = v[ i ]; 
                else
                    break;
            
            v[ i+1 ] = valor;
            
            System.out.print("\nPasso " + passo + "\t[");
            
            for( int j = 0 ; j < v.length ; j++ )
                if ( j == passo )
                   System.out.print(" " + v[ j ] + " \t");
                else
                   System.out.print(" " + v[ j ] + " \t");
        }
    }
    private static void Selection( int[ ] v )
    {   
        int valor,mv,passo2,posicao;
        for(passo2=9;passo2>=0;passo2--){
            valor=v[passo2];
            posicao=passo2;
            mv=v[passo2];
            for(int i=passo2-1;i>=0;i--){
                if(mv<v[i]){
                    mv=v[i];
                    posicao=i;
                }
            }
            v[passo2]=v[posicao];
            v[posicao]=valor;
            System.out.print("\nPasso " + passo2 + "\t[");
            for(int i=0;i<=9;i++){
                System.out.print(" " + v[ i ] + " \t]");
            }
        }
    }
    
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner( System.in );
        int v[] = new int[ 10 ];
        int opcao, valor, i, passo, qtde_passos, aux , maior, indice_maior;  
        
        do{
            System.out.println("\n\n\nMENU\n");
            System.out.println("1 - Insertion Sort");
            System.out.println("2 - Selection Sort");
            System.out.println("3 - Gera valores");
            System.out.println("3 - Mostra vetor");
            System.out.println("0 - Fim do programa\n");
            System.out.print("Digite sua opcao: ");
            opcao = entrada.nextInt();
            switch( opcao )
            {
                case 1 :
                    insertion( v );
                    break;
                case 2: 
                    Selection( v );
                    break;
                case 3 :
                    gera_valores( v );
                    break;
                case 4 :
                    mostra_vetor( v );
                    break;
                case 0 :
                    System.exit(0);
            }
        } while( true );
    }
}
