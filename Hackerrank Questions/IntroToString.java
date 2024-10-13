//introduction to String
import java.io.*;
import java.util.*;

class IntroToString{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int a=A.length();
        int b=B.length();
        System.out.println(a+b);
int len=A.compareTo(B);
System.out.println("length of a compare to b"+len);
if (len<0){
System.out.println("No");

}else{
System.out.println("Yes");
}

System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1));
}

}