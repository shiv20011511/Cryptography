import java.io.IOException; 
import java.io.InputStream; 
import java.nio.file.Files; 
import java.nio.file.Paths; 
import java.sql.Blob; 
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.PreparedStatement; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
public class DownloadMultiMediaFiles{     
public static void main(String[] args)  {      
try{
downloadBinaryFilesFromDatabase();    
}catch(SQLException e){
System.out.println(e.getMessage());
}
 } 
 private static void downloadBinaryFilesFromDatabase() throws SQLException {         
String SQL = "SELECT * FROM filewarehouse";
String url="jdbc:mysql://localhost:3306/shivjdbc";
String user="root";
String pass="Shiv@#1511";         
try(Connection connection = DriverManager.getConnection(url,user,pass);            
PreparedStatement ps = connection.prepareStatement(SQL);            
ResultSet rs = ps.executeQuery()){            
System.out.println("Following files are downloaded from databse. ");             
while(rs.next()){                 
int fileId = rs.getInt("fileid");                 
String fileName = rs.getString("fname");                 
long filesizeinKb = rs.getLong("fsizeKB");                 
String fileExtension = rs.getString("fext");                 
System.out.println("File Extension: " + fileExtension);                 
Blob blob = rs.getBlob("fcontent"); 
InputStream inputStream = blob.getBinaryStream(); 
 System.out.println("-----------------------------------");                 
Files.copy(inputStream, Paths.get("F://download folder"  + fileName));            
 }             
}             
catch(IOException e){                
 e.printStackTrace();            
 }              
} 
} 