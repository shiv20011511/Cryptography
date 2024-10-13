import java.util.Scanner;


//hackerrank question to check the give two strings are anagrams or not

public class Anagrams{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

String s=sc.next();
String s2=sc.next();

System.out.println(Checker(s,s2));
}


static String Checker(String s,String s2){
s=s.toLowerCase();
s2=s2.toLowerCase();

//System.out.println(index);

String result="";

if(s.length()!=s2.length()){
result="Not Anagrams";
return result;
}


//below the array to increment and decrement index if the final value of whole array is zero then it will anagram



int[] checkerarr=new int[26];

for(int i=0;i<s.length();i++){
int index=s.charAt(i)-'a';

checkerarr[index]++;
}


for(int j=0;j<s2.length();j++){
int index=s2.charAt(j)-'a';
checkerarr[index]--;

}

//to display the ar and returning the solution

for(int i=0;i<26;i++){
//System.out.println(checkerarr[i]);
if(checkerarr[i]!=0){
result="Not Anagrams";
return result;
}




}


result="Anagrams";
return result;

//return result;

}





}