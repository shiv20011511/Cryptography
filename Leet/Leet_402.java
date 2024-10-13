//Leet 402
import java.util.Arrays;

public class Leet_402{

public static void main(String args[]){

//String s="1432219";

//String s="10001";
//int k=4;

String s="5337";
int k=2;

//String s="121";
//int k=3;

System.out.println(getMinK(s,k));

}

//Method 

static String getMinK(String s,int k){

int n=s.length();

if(n==k){
return "0";
}


int[] ar=new int[n-k+1];


int min=999999;

for(int i=0;i<=n-k;i++){

String t=CalculateMinArray(i,i+k,s);
int temp=Integer.parseInt(t);
ar[i]=temp;

if(min>temp){
min=temp;
}

//System.out.println(temp);
}

String res=String.valueOf(min);
System.out.println(Arrays.toString(ar));

return res;

}

static String CalculateMinArray(int start,int end,String s){
//int index=0;

String num="";

for(int i=0;i<s.length();i++){


if(i>=start && i<end ){

}else{

num+=s.charAt(i);
}



}
//System.out.println("This -->. "+num);
return num;


}


}