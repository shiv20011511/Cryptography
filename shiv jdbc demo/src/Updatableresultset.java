import java.sql.*;
import java.io.*;
import java.util.*;
public class Updatableresultset{
public static void main(String args[]){
try{
Class.forName("com.mysql.cj.jdbc.Driver");
}catch(Exception e){
System.out.println(e.getMessage());}
String url="jdbc:mysql://localhost:3306/shivjdbc";
String user="root";
String pass="Shiv@#1511";
try(Connection c=DriverManager.getConnection(url,user,pass)){
Console console = System.console(); 
DatabaseMetaData md=c.getMetaData();
boolean isUpdatable=md.supportsResultSetConcurrency(
ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
if(!isUpdatable){
System.out.println("The database not supports updatable");
}
String sql="select * from students";
Statement s=c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
ResultSet rs=s.executeQuery(sql);
int row=-1;
while(row!=0){
row=Integer.parseInt(console.readLine("Enter row number : "));
if (rs.absolute(row)){
readsinfo("student at row "+row+":",rs);
String ans=console.readLine("Do you want to update this row(Y/N):");
if(ans.toUpperCase().equals("Y")){
String name=console.readLine("\tUpdate name:");
int age=Integer.parseInt(console.readLine("\tUpdate age:"));
double marks=Double.parseDouble(console.readLine("\tUpdate marks:"));
rs.updateRow();
System.out.println("The student record has been updated"+row);
}
ans = console.readLine("Do you want to delete this row(Y/N)?: ");
if (ans.equalsIgnoreCase("Y")) {                         
rs.deleteRow();                         
System.out.println("The student at row " + row + " has been deleted.");                    
} 

ans =console.readLine("Do you want to insert new row (Y/N):");
if(ans.toUpperCase().equals("Y")){
rs.moveToInsertRow();
String name=console.readLine("\tUpdate name:");
int age=Integer.parseInt(console.readLine("\tUpdate age:"));
double marks=Double.parseDouble(console.readLine("\tUpdate marks:"));
rs.updateString("name",name);
rs.updateInt("age",age);
rs.updateDouble("marks",marks);
rs.insertRow();

rs.moveToCurrentRow();
System.out.println("The student record has been inserted");
}
}
else {  
System.out.println("There is no student at row " + row);                 
}             
}         
} catch (SQLException ex) {             
ex.printStackTrace();         
}     
} 
private static void readsinfo(String position, ResultSet rs){
try{
String name=rs.getString("name");
int age=rs.getInt("age");
double marks=rs.getDouble("marks");
String studentinfo="%s:%s-%d-%f\n";
System.out.format(studentinfo,position,name,age,marks);
}catch(SQLException e){
System.out.println(e.getMessage());
}
}
}





