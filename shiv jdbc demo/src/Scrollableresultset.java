import java .sql.*;
public class Scrollableresultset{
public static void main(String args[]){
try{
Class.forName("com.mysql.cj.jdbc.Driver");
}catch(ClassNotFoundException e){
System.out.println(e.getMessage());
}
String url="jdbc:mysql://localhost:3306/shivjdbc";
String user="root";
String pass="Shiv@#1511";
try(Connection c=DriverManager.getConnection(url,user,pass)){
String sql="Select * from students";
Statement s=c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
ResultSet rs=s.executeQuery(sql);
rs.first();
readsinfo("first",rs);
rs.relative(3);
readsinfo("relative(3)",rs);
rs.previous();
readsinfo("previous",rs);
rs.absolute(4);
readsinfo("absolute(4)",rs);
rs.last();
readsinfo("last",rs);
rs.relative(-2);
readsinfo("relative(-2)",rs);
}catch(SQLException e){
e.printStackTrace();
}
}
private static void readsinfo(String position,ResultSet rs){
try{
int id=rs.getInt("id");
String name=rs.getString("name");
int age=rs.getInt("age");
double marks=rs.getInt("marks");
String sinfo="%s: %d-%s-%d-%f\n";
System.out.format(sinfo,position,id,name,age,marks);
}catch(SQLException f){
System.out.println(f.getMessage());
}
}
}



