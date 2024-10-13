import java.sql.*;

public class Establishingconnection{
    
private static final String url="jdbc:mysql://localhost:3306/";
    
private static final String username="root";
    
private static final String password="Shiv@#1511";
    
public static void main(String args[]) {
    
try{
        
Class.forName("com.mysql.cj.jdbc.Driver");
    
}catch(ClassNotFoundException e){
        
System.out.println(e.getMessage());
        
}
    
try{
        
Connection conn=DriverManager.getConnection(url,username,password);
        
System.out.println("connection established ");
    System.out.println("Shivkant pandey ");
}catch(SQLException f){
        
System.out.println(f.getMessage());
    
}

    
}


}