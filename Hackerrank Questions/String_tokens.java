import java.util.Scanner;

//java String tokens

public class String_tokens{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);


String s=sc.nextLine();
s=s.trim();
String token[]=s.split("[^a-zA-Z]+");

if(s.length() == 0){
System.out.println("0");

}else{
System.out.println(token.length);
for(int i=0;i<token.length;i++){
System.out.println(token[i]);
}
}


}



}



