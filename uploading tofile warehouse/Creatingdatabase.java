import java.sql.*;
public class Creatingdatabase{
public static void main(String args[]){
try{
Class.forName("com.mysql.cj.jdbc.Driver");

}catch(Exception e ){
	System.out.println(e.getMessage());

}
try{
Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","Shiv@#1511");
Statement st=conn.createStatement();
st.executeUpdate("create database SHIVJDBC");
System.out.println("database created ");
}
catch(Exception e){
System.out.println(e.getMessage());

}




}

//further crud operations performed in this database only*********
}