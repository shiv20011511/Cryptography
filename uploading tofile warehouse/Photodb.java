import java.io.File; 
import java.io.FileInputStream; 
import java.io.InputStream; 
import java.sql.*; 
public class Photodb{     
public static  void main(String[]args){         
String url = "jdbc:mysql://localhost:3306/shivjdbc";         
String user = "root";         
String password = "Shiv@#1511";         
String filepath ="C://Users//shiv//Downloads//12.jpg";         
try(Connection conn =DriverManager.getConnection(url,user,password)){             
String sql = "Insert into photos(photoname,photo) values(?,?)";             
PreparedStatement pstmt = conn.prepareStatement(sql);             
pstmt.setString(1,"Shiv");                         
InputStream inputStream = new FileInputStream(new File(filepath));             
pstmt.setBlob(2,inputStream);             
int row = pstmt.executeUpdate();             
if (row>0){                 
System.out.println("done");             
}         
}catch(Exception e){             
System.out.println(e);         
}     
} 
}