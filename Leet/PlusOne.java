import java.util.Scanner;


//leetcode question PlusOne
public class PlusOne{
public static void main(String args[]){
  

    
Scanner s=new Scanner(System.in);
System.out.println("Enter the size ");
int size=s.nextInt();
System.out.println("Enter the elements ");
int[] input=new int[size];
for(int i=0;i<size;i++){
input[i]=s.nextInt();
}
//System.out.println("Enter to add number in the array ");
//int addednumber=s.nextInt();
//usingStringmethods(input,addednumber);
//plusOne(input);
int[] result=correctOne(input);
 for (int v : result) {
            System.out.print(v+",");
        }

}

public static int[] Newone(int[] digits){
int first=0;
int last=0;
int[] temp=new int[digits.length+1];

for(int i=digits.length-1;i>=0;i--){
try{
if(digits[digits.length-1]==9 && digits[digits.length-2]<9){
digits[digits.length-1]=0;
digits[digits.length-2]=digits[digits.length-2]+1;
return digits;
}
}catch(Exception e){

}

if(digits[i]<9){
if(first==1){
int[] temps=new int[digits.length];

if(digits[0]<9){
temps[0]=digits[0]+first;
//System.out.println("temps "+temps[0]);


//return temps;
}else{

}
}else{
digits[i]++;
return digits;
}
}else if(digits[i]>=9) {
int add=digits[i]+1;

last=add%10;
first=add/10;
temp[i]=last;
//return temp;
}

}
temp[0]=temp[1]+first;
return temp;

}














public static int[] correctOne(int[] digits){
for(int i=digits.length-1;i>=0;i--){
if(digits[i]<9){
digits[i]++;
System.out.println("Inside if "+digits[i]);
return digits;

}
digits[i]=0;

System.out.println("Outside if "+digits[i]);
//return digits;
}

int[] v=new int[digits.length+1];
v[0]=1;
System.out.println("v array "+v[0]);
 
return v;
}














public static int[] plusOne(int[] digits) {
            

       String st="";
String[] newstring=new String[digits.length];


if(digits.length==1){

int n=digits[0]+1;

String fin=String.valueOf(n);
int[] newint=new int[fin.length()];
for(int i=0;i<fin.length();i++){
            newint[i]=Integer.parseInt(String.valueOf(fin.charAt(i)));
 }


for(int i=0;i<newint.length;i++){
System.out.print(newint[i]);

}

        return newint;

}else if(digits.length>8){
for(int i=0;i<digits.length;i++){
st+=String.valueOf(digits[i]);

}
long n=Long.parseLong(st);
long z=n+1;
String fin=String.valueOf(z);
int[] newint=new int[fin.length()];



for(int i=0;i<fin.length();i++){
newint[i]=Integer.parseInt(String.valueOf(fin.charAt(i)));

}




for(int i=0;i<newint.length;i++){
System.out.print(newint[i]);

}

return newint;


}

else{

for(int i=0;i<digits.length;i++){
st+=String.valueOf(digits[i]);

}
int n=Integer.parseInt(st);
int z=n+1;
String fin=String.valueOf(z);
int[] newint=new int[fin.length()];



for(int i=0;i<fin.length();i++){
newint[i]=Integer.parseInt(String.valueOf(fin.charAt(i)));

}




for(int i=0;i<newint.length;i++){
System.out.print(newint[i]);

}

return newint;
}
    
    }


















public static String[] usingStringmethods(int[] s,int add){
String st="";
String[] newstring=new String[s.length];

if(s.length==1){
st+=String.valueOf(s[0]);
int n=Integer.parseInt(st);
int z=n+add;
String fin=String.valueOf(z);
newstring[0]=fin;
System.out.println(newstring[0]);
}else{

for(int i=0;i<s.length;i++){
st+=String.valueOf(s[i]);

}
int n=Integer.parseInt(st);
int z=n+add;
String fin=String.valueOf(z);



for(int i=0;i<fin.length();i++){
newstring[i]=String.valueOf(fin.charAt(i));

}
for(int i=0;i<newstring.length;i++){
System.out.print(newstring[i]+" ");

}
}
System.out.println();

return newstring;

}


}