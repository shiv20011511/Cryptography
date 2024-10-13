//Leet 205 Isomorphic strings

public class Leet_205_Isomorphic{

public static void main(String args[]){

//String s="egg";
//String s2="add";

//String s="foo";
//String s2="bar";

String s="paper";
String s2="title";


Replace_Isomorphic(s,s2);

}

//function that replace characters

static void Replace_Isomorphic(String s,String s2){
int sums1=0;
int sums2=0;
for(int i=0;i<s.length();i++){
char c=s.charAt(i);
char ch=s2.charAt(i);
sums2+=ch;
sums1+=c;
}



int result=sums1-sums2;

if(result%2==0){
System.out.println("True");
}else{
System.out.println("False");
}

}


}