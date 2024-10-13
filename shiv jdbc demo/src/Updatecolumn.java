import java.sql.*;
public class Updatecolumn{
public static void main(String args[]){
try{
Class.forName("com.mysql.cj.jdbc.Driver");
}catch(Exception e){
System.out.println(e.getMessage());}
String url="jdbc:mysql://localhost:3306/shivjdbc";
String user="root";
String pass="Shiv@#1511";
try{
Connection connection=DriverManager.getConnection(url,user,pass);
Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);             
String sql = "Select * from students";             
ResultSet results = statement.executeQuery(sql);             
System.out.println("Details of the students: ");           
  results.beforeFirst();             
while(results.next()){                 
System.out.println("id"+results.getInt("id"));                 
System.out.println(",name: "+results.getString("name"));                 
System.out.println(",age: "+results.getInt("age"));                 
System.out.println(",marks: "+results.getDouble("marks"));            
}             
System.out.println();             
results.beforeFirst();             
while(results.next()){                 
int newage = results.getInt("age")+ 5;                 
results.updateInt("age",newage);                 
results.updateRow();             
} 
 System.out.println("Details of the students after increasing age");             
results.beforeFirst();             
while(results.next()){                 
System.out.println("id"+results.getInt("id"));                 
System.out.println(",name: "+results.getString("name"));                 
System.out.println(",age: "+results.getInt("age"));                 
System.out.println(",marks: "+results.getDouble("marks"));            
 }             
System.out.println(); 
 }
catch (SQLException e){System.out.println(e);
}     
} 
} 