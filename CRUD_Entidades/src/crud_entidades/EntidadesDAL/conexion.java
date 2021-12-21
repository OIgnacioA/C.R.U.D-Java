
package crud_entidades.EntidadesDAL;




import java.sql.Connection;
import java.sql.DriverManager; 
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;




public class conexion {
    

   // String datta = "jdbc:sqlite:C:/Users/lacab/Desktop/CRUD_JavaSQLite/Base de datos/Entidades.db"; 
    
   /*-C:\Users\  User   \Desktop\CRUD_JavaSQLite\Base de Datos
      C:\Users\  lacab  \Desktop\CRUD_JavaSQLite\Base de Datos */
    
    
    
    Connection conn = null;
    PreparedStatement pstm = null;
    public ResultSet Respuesta = null;
  
    
    public conexion(String datta){
 
        
        System.out.println("datta desde form principal" + datta);
        
        String strConexionBD = datta;
        
        
       try {
          
          Class.forName("org.sqlite.JDBC");
          
          
        conn = DriverManager.getConnection(strConexionBD);          
       
        System.out.println("Coneccion establecida esitosamente");
    
           } catch (Exception e) {
    
        System.out.println("Coneccion NO establecida " + e);
           }
    
    }
    
    
    
    public int ejecutarSentenciaSQL(String StrSentenciaSQL){

        try {
                    pstm =  conn.prepareStatement(StrSentenciaSQL);
                    pstm.execute();
                    return 1;
            } catch(SQLException e){
        
                    System.out.println("Coneccion NO establecida lpm " + e);
                    return 0;       
            }finally{
            
                   try{
            
                   pstm.close();
        
                  }catch (Exception e){

                    }
                 }
     
   }
  
    
    public ResultSet consultarRegistros(String StrSentenciaSQL){
    
        try {
             pstm =  conn.prepareStatement(StrSentenciaSQL);
             Respuesta = pstm.executeQuery();
            return Respuesta;
            
        } catch (Exception e) {
            
            System.out.println("Coneccion NO establecida dios me libre " + e);
            return null;  
            
        }
        

    }
    

    
}