import java.sql.*;
import java.util.*;
public class Preparedinsertloop{
public static void main(String args[]){
try{
Class.forName("com.mysql.cj.jdbc.Driver");
}catch(Exception e){
System.out.println(e.getMessage());}
String url="jdbc:mysql://localhost:3306/shivjdbc";
String user="root";
String pass="Shiv@#1511";
try{
Connection c=DriverManager.getConnection(url,user,pass);
String query="insert into students(name,age,marks) values(?,?,?)";
PreparedStatement ps=c.prepareStatement(query);
do{
Scanner sc=new Scanner(System.in);
System.out.println("Enter name");
ps.setString(1,sc.nextLine());
System.out.println("Enter age");
ps.setInt(2,sc.nextInt());
System.out.println("Enter marks");
ps.setDouble(3,sc.nextDouble());
int rowsaffect=ps.executeUpdate();
if (rowsaffect>0){
System.out.println("Inserted data using prepared");
}
else{System.out.println("failed");}
Scanner sx=new Scanner(System.in);
System.out.println("Do you want to insert more   rows :(y/n)");
String yn=sx.nextLine();
if (yn.startsWith("n")){
break;
}
}
while(true);
c.close();}catch(Exception e){
System.out.println(e.getMessage());
}
}
}