 import java.sql.*; 
 
public class DBUtil{    
private static final String url ="jdbc:mysql://localhost:3306/shivjdbc";    
private static final String user = "root";    
private static final String password = "Shiv@1511";   
 private static Connection connection = null;    
static {        
try {            
connection = DriverManager.getConnection(url, user, password);       
 } catch (Exception e) {            
e.printStackTrace();        
}    
}    
public static Connection getConnection(){        
return connection;    
} 
} 
 
 