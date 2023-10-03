
package tool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FactoryPostgres {
    private static Connection conexaoPG;
    
    
    public static Connection getConexaoPostgres(){
        //nao existe conexao ainda...
        if(conexaoPG == null){
            try{
                conexaoPG = DriverManager.getConnection("jdbc:postgresql://200.18.128.54:5432/aula", 
                        "valter", 
                        "senha123");
            }catch(SQLException ex){
                System.err.println("Houve um problema na conexao");
                return null;
            }
        }
        
        return conexaoPG;
    }
    
}
