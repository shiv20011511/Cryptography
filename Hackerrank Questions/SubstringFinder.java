import java.util.Scanner;


//hackerrank question yo find substring smallest and largest

public class SubstringFinder{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s=sc.next();
int k=sc.nextInt();


System.out.println(smallestandlargest(s,k));

}




static String smallestandlargest(String s,int length){

String smallest="";
String largest="";
int a=length-1;
String[] subarr=new String[s.length()-a];
for(int i=0;i<s.length()-a;i++){
//System.out.println(i);
//storing the sub string in array
subarr[i]=s.substring(i,i+length);
}

//sorting the above sub string in Lexicographical Order


for(int i=0;i<subarr.length-1;i++){
for(int j=i+1;j<subarr.length;j++){


if(subarr[i].compareTo(subarr[j])>0){
String temp=subarr[i];
subarr[i]=subarr[j];
subarr[j]=temp;
}

}

}


smallest=subarr[0];
largest=subarr[subarr.length-1];
return smallest +"\n"+largest;
}



}