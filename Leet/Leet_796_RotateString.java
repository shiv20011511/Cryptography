//Leet 796 Rotate String 

public class Leet_796_RotateString{
public static void main(String[] args){

String s="abcde";

String goal="cdeab";

//String goal="cedab";

//RotateString(s,goal);
Rotate_Better(s,goal);
}

//Better Approach

static void Rotate_Better(String s,String goal){

String str=s+s;

if (str.contains(goal)){

System.out.println(true);
}else{
System.out.println(false);
}



}



static void RotateString(String s,String goal){

char[] ch = s.toCharArray();

for(int i=0;i<ch.length;i++){

char c=ch[0];

int start=0;

while(start<ch.length-1){



ch[start]=ch[start+1];

start++;


}
ch[ch.length-1]=c;

String st=new String(ch);

if(st.equals(goal)){
System.out.println("true");

}else{
System.out.println("false");

}


System.out.println(ch);

}

System.out.println(ch);
}






}

