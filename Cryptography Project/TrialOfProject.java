import java.util.Scanner;

public class TrialOfProject{
public static void main(String args[]){
System.out.println("\u001b[37m");
TrialOfProject t=new TrialOfProject();
Scanner sc=new Scanner(System.in);
System.out.print("1)Encrypt 2)Decrypt \n Enter your choice -> ");
int c=sc.nextInt();

Scanner s=new Scanner(System.in);
System.out.println();
if(c==1){

System.out.println("Enter your Text : ");
String plaintext=s.nextLine();
//System.out.println("original text : "+plaintext);
String encrypted= t.Encrypt(plaintext);
System.out.println("\u001b[31m"+encrypted);

/*

String decrypted=t.Decrypt(encrypted);
System.out.println("Decrypted mssg : "+decrypted);
*/

}
else if(c==2){
System.out.print("Enter your Encrypted text : ");
String coded=s.nextLine();
String decrypted=t.Decrypt(coded);
System.out.println("Decrypted mssg : "+"\u001b[32m"+decrypted);
}

}


String Encrypt(String p){

int length=p.length(); 
String[] plaintextarray =new String[length];
for(int i=0;i<length;i++){
plaintextarray[i]=Character.toString(p.charAt(i));
}


String coded="";
int c=10;
int count=0;  
String[] alpha={"("," ",".","%","[","!",";","S","]","T","a","E","U","b",")","V","c","W","d","Y","@","e","f","X","g","-","h","A","i",",","#","K","B","Z","j","C","k","l","!","D","J","m","$","F","n","^","I","o","H","p","G","q","*","r","s","t","0",">","<","?","1","2","3","u","-","|","&","v","+","w","{","x","/","}","y","z","N","4","M","5","L","6","7","P","8","\\","O","=","9","Q","R","//","_","\"",":"};



for(int i=0;i<length;i++){

for(int j=0;j<alpha.length;j++){

if(plaintextarray[i].equals(alpha[j])){
String d=Integer.toString(j);

String fg="200";
coded+=fg+d;
break;

}

}
count++;
}
//System.out.println(coded+"  ");
return coded;
}

String Decrypt(String encrypted){
String decoded="";



String[] alpha={"("," ",".","%","[","!",";","S","]","T","a","E","U","b",")","V","c","W","d","Y","@","e","f","X","g","-","h","A","i",",","#","K","B","Z","j","C","k","l","!","D","J","m","$","F","n","^","I","o","H","p","G","q","*","r","s","t","0",">","<","?","1","2","3","u","-","|","&","v","+","w","{","x","/","}","y","z","N","4","M","5","L","6","7","P","8","\\","O","=","9","Q","R","//","_","\"",":"};
String s=encrypted.replace("200"," ");


String[] numbers = s.trim().split("\\s+");

long[] d=new long[numbers.length];
for(int i=0;i<numbers.length;i++){


d[i]=Integer.parseInt(numbers[i]);

}
for(int i=0;i<numbers.length;i++){
for(int j=0;j<alpha.length;j++){
if (d[i]==j){
decoded+=alpha[j];
}
}
}
return decoded;
}


}