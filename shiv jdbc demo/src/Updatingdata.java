import java.sql.*;
import java.util.Scanner;
public class Updatingdata{
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
Scanner sc =new Scanner(System.in);
Connection con=DriverManager.getConnection(url,user,password);
Statement s=con.createStatement();
Double marks=sc.nextDouble();
int ids=sc.nextInt();
String query=String.format("update students set marks=%f where id=%d",marks,ids);
int queryaffected=s.executeUpdate(query);
if (queryaffected>0){
System.out.println("data Updated succesfully ");
}
else{
System.out.println("Data Updation failed");
}
}
catch(Exception e){
System.out.println(e.getMessage());
}


}
}