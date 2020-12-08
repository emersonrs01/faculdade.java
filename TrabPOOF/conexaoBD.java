package aula0910;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sun.applet.Main;

/** Essa classe tem a finalidade de realizar uma conexao com uma base de dados PostegreSQL.
 * Nela existe dois metodos, o primeiro Conectar(), realiza a conexao com o banco de dados e o segundo, Desconectar(),
 * realiza a desconexao (Desconecta) o banco de dados.*/

public class conexaoBD{

    /** Usada para a conexao com o banco de dados */
    private Connection con = null;
    
    /** Usada para realizar as instrucoes SQL */
    public Statement stmt; 
    
    /** Retorna os dados das tabelas do banco */
    public ResultSet rs; 
    
    public String cpf0,saldo0,tpconta;
    
    

    /** Esse metodo realiza a conexao com o banco, ele precisa de tres argumentos, o primeiro, recebe
     * o endereço do banco, o segundo recebe o nome do usuario e o terceiro recebe a senha do 
     * banco de dados. 
     * 
     * EXP: "jdbc:postgresql://localhost:5432/projeto_01", "sa", "sa"
     * 
     * **************************************************************************************************/
    
    public void Conectar() {

        String username = "postgres";
        String password = "admin";
        String url = ("jdbc:postgresql://localhost/POO");

        try {
        	/** Pasando o nome do Driver do PostgreSQL */
            Class.forName("org.postgresql.Driver");
            
            /** Obtendo a conexao com o banco de dados*/
            con = DriverManager.getConnection(url, username, password);
            
            /** Criando o Statement */
            stmt = con.createStatement();
            
        /** Retorna um erro caso nao encontre o driver, ou alguma informacao sobre o mesmo
         * esteja errada */
        } catch (ClassNotFoundException cnfe) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar o driver");
            cnfe.printStackTrace();

         /** Retorna um erro caso exista erro de query SQL */   
        } catch (SQLException sqlex) {
            JOptionPane.showMessageDialog(null, "erro na query");
            sqlex.printStackTrace();

        }
    }
    public boolean getDados(String cpf3) throws SQLException{
        String cpf1 = "null",saldo1,tpconta1;
        boolean res=false;
        rs = stmt.executeQuery("select * from conta where cpf= '"+cpf3+"'");
        while(rs.next()){
            cpf1 = rs.getString("cpf");
            saldo1 = rs.getString("saldo");
            tpconta1 = rs.getString("tipo_conta");
            this.cpf0=cpf1;
            this.saldo0=saldo1;
            this.tpconta=tpconta1;
        }

        if(cpf1.equalsIgnoreCase(cpf3)){
            return true;
        }else{
            return res;
        }

    }
    public String getCpf(){
        return cpf0;
    }
    public String getSaldo(){
        return saldo0;
    }
    public String getConta(){
        return tpconta;
    }
    public boolean setSaldopos(String cpf,String saldo) throws SQLException{
        double saldo1 = Double.valueOf(saldo);
        double saldo2 = Double.valueOf(saldo0);
        double x;
        String x1;
        
        if(saldo1<=0){
            return false;
        }else{
            x = saldo1+saldo2;
            x1 = String.valueOf(x);
            
            stmt.executeUpdate("update conta set saldo = '"+x1+"'where cpf = '"+cpf+"'");
            return true;
        }
    }
    public boolean setSaldoneg(String cpf,String saldo) throws SQLException{
        double saldo1 = Double.valueOf(saldo);
        double saldo2 = Double.valueOf(saldo0);
        double x;
        String x1;
        
        if(saldo1<=0){
            return false;
        }else{
            if(saldo1<saldo2){
                x = saldo2-saldo1;
                x1 = String.valueOf(x);
                stmt.executeUpdate("update conta set saldo = '"+x1+"'where cpf = '"+cpf+"'");
                return true;
            }else{
                return false;
            }
        }
    }
    
    public boolean setConta(String cpf,String saldo,String tipconta) throws SQLException{
        String cpftest="null";
        rs = stmt.executeQuery("select * from conta where cpf= '"+cpf+"'");
        while(rs.next()){
            cpftest = rs.getString("cpf");
        }
        if(cpftest.equalsIgnoreCase(cpf)){
            return true;
        }else{
            stmt.execute("insert into conta (cpf,saldo,tipo_conta) values('"+cpf+"','"+saldo+"','"+tipconta+"')");
            return false;
        }
    }

    /** Esse metodo quando invocado, realiza a desconexao com o banco */
    public void Desconectar() {

        try {
            con.close();
            
        /** Retorna um erro caso nao consiga desconectar */    
        } catch (SQLException onConClose) {
            JOptionPane.showMessageDialog(null, "Erro ao desconectar o banco");
            onConClose.printStackTrace();
        }
    }
    public static void main(String[] args) throws SQLException{
    
    conexaoBD c1 = new conexaoBD();
    c1.Conectar();
    boolean teste = c1.getDados("04032499020");
    System.out.println(c1.getSaldo()+" "+c1.getCpf()+" "+c1.getConta()+teste);
    boolean setsaldopos = c1.setSaldopos("04032499020", "1500");
    boolean teste2 = c1.getDados("04032499020");
    System.out.println(c1.getSaldo()+" "+c1.getCpf()+" "+c1.getConta()+teste);
    boolean setsaldoneg = c1.setSaldoneg("04032499020", "1500");
    boolean teste1 = c1.getDados("04032499020");
    boolean teste3 = c1.setConta("04032499022", "3000", "poupanca");
    System.out.println(c1.getSaldo()+" "+c1.getCpf()+" "+c1.getConta()+teste);
    c1.Desconectar();
    }
            
}
