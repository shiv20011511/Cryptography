import java.sql.*;
public class Creatingtable{
public static void main(String args[]){
String url="jdbc:mysql://localhost:3306/shivjdbc";
String username="root";
String password="Shiv@#1511";
try{
Class.forName("com.mysql.cj.jdbc.Driver");
}catch(Exception e){
System.out.println(e.getMessage());
}
try{
Connection c=DriverManager.getConnection(url,username,password);
Statement s=c.createStatement();
s.executeUpdate("create table students1(id int auto_increment primary key,name varchar(255) not null,age int not null,marks double not null)");
System.out.println("table created");
}
catch(Exception e){
System.out.println(e.getMessage());
}
}
}