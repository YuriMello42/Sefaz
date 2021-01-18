package conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//public class conexao_JDBC {
	/*   //private static Connection con = null;	
	   //private static String pathbase = "C:\\Users\\YuriMello\\eclipse-workspace\\CadastroUsers\\util";
	
 	
	public static Connection conexao() throws SQLException{
			
			try {
				Class.forName("org.hsqldb.jdbcdriver");
				
				con = DriverManager.getConnection("jdbc:hsqldb:hsql:\\localhost\\Cadastro", "sa", "");
				
				if (con!= null){
		            System.out.println("Connection created successfully");
		            
		         }else{
		            System.out.println("Problem with creating connection");
		         }
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return con;
		
			
		}



}
*/

public class conexao_JDBC {
	public static Connection conexao() {
		
		Connection con = null;
      
		
    try {
       //Registering the HSQLDB JDBC driver
       Class.forName("org.hsqldb.jdbc.JDBCDriver");
       //Creating the connection with HSQLDB
       con = DriverManager.getConnection("jdbc:hsqldb:hsql://Cadastro", "SA", "");
       if (con!= null){
          System.out.println("Banco de Dados conectado!");
          
       }else{
          System.out.println("Houve um erro ao conectar Banco de dados:Cadastro");
       }
    
    }  catch (Exception e) {
       e.printStackTrace(System.out);
    }
	return con;
 }
}
