import java.sql.*;
public class Insertingdata{
public static void main(String args[]){
try{
Class.forName("com.mysql.cj.jdbc.Driver");
}catch(Exception e){
System.out.println(e.getMessage());
}
String url="jdbc:mysql://localhost:3306/shivjdbc";
String user="root";
String password="Shiv@#1511";
try{
Connection con=DriverManager.getConnection(url,user,password);
Statement s=con.createStatement();
String query=String.format("insert into students(name,age,marks) values('%s',%o,%f)","aqib",23,98.99);
int queryaffected=s.executeUpdate(query);
if (queryaffected>0){
System.out.println("data inserted succesfully ");
}
else{
System.out.println("Data insertion failed");
}
}
catch(Exception e){
System.out.println(e.getMessage());
}
}
}