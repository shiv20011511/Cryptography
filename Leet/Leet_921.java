//Leet 921. Minimum Add to Make Parentheses Valid
import java.util.*;
public class Leet_921{

public static void main(String args[]){
//String s="(()))))";
String s="(((";
System.out.println(s);



System.out.println(minAddToMakeValid(s));

}

//function that validates
static int minAddToMakeValid(String s) {
        
Stack<Character> st=new Stack<>();

for(int i=0;i<s.length();i++){
     char c=s.charAt(i);
            
      if(c=='('){
                st.push(c);
      }else{
          if(st.size()>0 && st.peek()=='('){
                st.pop();
          }else{
              st.push(c);
          }
      }


   }
    return st.size();
    
}



}