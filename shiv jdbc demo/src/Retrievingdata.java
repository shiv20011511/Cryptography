import java.sql.*;
public class Retrievingdata{
public static void main(String args[]){
try{
Class.forName("com.mysql.cj.jdbc.Driver");
}catch(Exception e){
System.out.println(e.getMessage());
}
String url="jdbc:mysql://localhost:3306/shivjdbc";
String username="root";
String password="Shiv@#1511";
try{
Connection con=DriverManager.getConnection(url,username,password);
Statement s=con.createStatement();
ResultSet rs=s.executeQuery("Select * from students");
while(rs.next()){
int id=rs.getInt("id");
String name=rs.getString("name");
int age=rs.getInt("age");
double marks=rs.getDouble("marks");
System.out.println("ID : "+id);
System.out.println("NAME : "+name);
System.out.println("AGE : "+age);
System.out.println("MARKS : "+marks);
}
}
catch(Exception e){
System.out.println(e.getMessage());
}
}
} 