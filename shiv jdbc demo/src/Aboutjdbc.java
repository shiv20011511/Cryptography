import java.sql.*;
import java.util.Scanner;
//in this code i will try to make a user 
//friendly console that helps user to operate basic 
//mysql database queries like (CRUD operations)
//without knowing the queries
public class Aboutjdbc{
public static void main(String args[]){
try{
Class.forName("com.mysql.cj.jdbc.Driver");

}catch(Exception e ){
	System.out.println("This is an exception "+e.getMessage());

}
Scanner sc=new Scanner(System.in);
System.out.println("Welcome to friendly sql : ");

System.out.print("Enter your Mysql Password : ");
String pass=sc.next();
while (true){
try{

Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root",pass);
}catch(Exception e){
System.out.println("you entered wrong password");
System.exit(0);
}

System.out.println("What you want to \n 1)make a database \n 2)use existing database \n 3)Display all databases \n 4)Exit ");

int c=sc.nextInt();
if (c==1){
String cd=sc.next();
try{
Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root",pass);
Statement st=conn.createStatement();
st.executeUpdate("create database "+cd);
System.out.println(cd+ "database created succesfully ");
System.out.println("Do you want to make a table in this database "+cd);
//Statement s=conn.createStatement();
//s.executeUpdate();
System.out.println("table created ");

}catch(Exception e){
System.out.println(e.getMessage());
}
}else if (c==2){
try{
String s=sc.next();
Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+s,"root",pass);
Statement st=conn.createStatement();
st.executeUpdate("use "+s);
System.out.println(s+" database selected succesfully ");
while (true){
System.out.println("What you want to 1)display all tables in this database \n 2)display the sructure of an existing table \n 3)Display records in table \n 4)Back To Main Menu  "+s);
System.out.print("Enter choice : ");
int c1=sc.nextInt();
if (c1==1){
ResultSet rs=st.executeQuery("show tables");
while(rs.next()){
String tb=rs.getString(1);
System.out.println("table : "+tb);
}
}
else if(c1==2){
String tbname=sc.next();
ResultSet rs=st.executeQuery("desc "+tbname);
while(rs.next()){
//1 for field
String tb=rs.getString(1);
System.out.println("attributes : "+tb);
}
}else if(c1==3){
String tbname=sc.next();
ResultSet rs=st.executeQuery("select * from "+tbname);
ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            // Print column names
            System.out.print("Column Names:");
	System.out.println();

            for (int i = 1; i <= columnCount; i++) {
                String columnName = metaData.getColumnName(i);
                System.out.print(columnName+"        ");
            }
System.out.println();
            // Process the result set
//            System.out.println("Result Set:");

            while (rs.next()) {
                // Retrieve and print values for each column
                for (int i = 1; i <= columnCount; i++) {
                    String columnValue = rs.getString(i);
                    System.out.print(columnValue + "        ");
                }
                System.out.println(); // Move to the next row
            }

}else if(c1==4){
System.out.println("bye");
break;
}
else{
System.out.println("Wrong choice ");
}
}
}
catch(Exception e){
System.out.println(e.getMessage());
}
}else if(c==3){
try{
Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root",pass);
Statement st=conn.createStatement();
ResultSet rs=st.executeQuery("show databases");
while(rs.next()){
String db=rs.getString(1);
System.out.println("Database : "+db);
}
}catch(Exception e){
System.out.println(e);
}
}
else if(c==4){
System.out.println("Good Bye :) ");
System.exit(0);
}else{
System.out.println("Wrong Input :( ");
System.exit(0);
}
}
}
}