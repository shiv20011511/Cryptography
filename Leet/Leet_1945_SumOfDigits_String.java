//leet 1945. Sum of Digits of String After Convert

public class Leet_1945_SumOfDigits_String{

public static void main(String args[]){

String s="leetcode";

int k=2;

SumOfDigit(s,k);

}


//Function that Returns


static void SumOfDigit(String s,int k){
int sum=0;
String value="";
String value2="";
for(int i=0;i<s.length();i++){
value +=(s.charAt(i)-'a')+1;

}
System.out.println("Value is -->> "+value);

for(int i=0;i<k;i++){
int sums=0;
for(int j=0;j<value.length();j++){
sums+=Integer.parseInt(String.valueOf(value.charAt(j)));

}

sum=sums;

sums=0;


System.out.println("Sum -->> "+sum);
value2=String.valueOf(sum);

System.out.println("Value 2 -->> "+value2);
value="";
value=value2;


}


System.out.println("Sum is -->> "+sum);

}


}