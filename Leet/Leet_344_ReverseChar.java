//Leet 344. Reverse String
 
import java.util.Arrays;
class Leet_344_ReverseChar{
public static void main(String args[]){

//char[] s={'h','e','l','l','o'};
char[] s={'H','a','n','n','a','h'};
System.out.println(s.length);
System.out.println(s[5]);
reverseString(s);
}


    static void reverseString(char[] s) {
        int len=s.length-1;
        for(int i=0;i<s.length;i++){
            
if(i<len){
swap(s,i,len);

}else{            
break;
      }     
len--;
 
        }
        System.out.println(Arrays.toString(s));
    }

static void swap(char[] s,int first,int last){
    char temp=s[first];
System.out.println(s[last]);
s[first]=s[last];
    s[last]=temp;

}

}