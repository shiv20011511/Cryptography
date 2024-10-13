import java.sql.*; 
public class StoredProcedure{     
public static void main(String[]args){         
String url = "jdbc:mysql://localhost:3306/shivjdbc";         
String user = "root";         
String password = "Shiv@#1511";         
try(Connection conn = DriverManager.getConnection(url,user,password)){             
Statement statement = conn.createStatement(); 
 String queryCreate = "Create procedure AddTwoNumbers(IN num1 INT,IN num2 INT, OUT result INT)";                           
queryCreate+= "Begin ";             
queryCreate+=" SET result = num1 + num2; ";             
queryCreate+="End";                        
statement.execute(queryCreate);             
System.out.println("created");         
}catch(Exception e){             
System.out.println(e);         
}     
}
} 
 
 