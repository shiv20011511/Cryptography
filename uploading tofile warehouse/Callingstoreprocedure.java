import java.sql.*;
public class Callingstoreprocedure{
public static void main(String args[]){
try{
Class.forName("com.mysql.cj.jdbc.Driver");
}catch(Exception f){System.out.println(f.getMessage());}
String url="jdbc:mysql://localhost:3306/shivjdbc";
String user="root";
String pass="Shiv@#1511";
try{
Connection c=DriverManager.getConnection(url,user,pass);
CallableStatement cb=c.prepareCall("{call sp()}");
cb.execute();
ResultSet rs=cb.getResultSet();
System.out.println("Student with lowest marks 60 ");
while(rs.next()){
int id=rs.getInt("id");
String name=rs.getString("name");
int age=rs.getInt("age");
double marks=rs.getDouble("marks");
System.out.println("ID : "+id);
System.out.println("NAME : "+name);
System.out.println("AGE : "+age);
System.out.println("MARKS : "+marks);}
cb.close();
}catch(Exception e){System.out.println(e.getMessage());}
}
}