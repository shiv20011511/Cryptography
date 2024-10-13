//Leet 387. First Unique Character in a String
import java.util.Arrays;
public class Leet_387Unique_String{
public static void main(String args[]){
String s="aab";
//String s="leetcode";
//String s="loveleetcode";
//String s="aabb";
System.out.println(UniqueIndex(s));
//System.out.println(Unique(s));
}

//self
//very time consuming
static int Unique(String s){

int len=s.length();
int[] index=new int[len];

for(int i=0;i<len-1;i++){
for(int j=i+1;j<len;j++){
if(s.charAt(i)==s.charAt(j)){
index[i]+=1;
index[j]+=1;
}

}

}

for(int i=0;i<len;i++){
if(index[i]==0){
return i;
}

}

return -1;
//System.out.println(Arrays.toString(index));

}








// function that check the unique and return index

static int UniqueIndex(String s){
// Array to store the frequency of each character
        int[] charCount = new int[26];
        
        // First pass: count the frequency of each character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
System.out.println("Char c -->>  "+c);
            charCount[c - 'a']++;
//System.out.println("c-'a' ********* "+[c-'a']);
System.out.println("Char [c-'a'] ********* -->>  "+charCount[c - 'a']);
System.out.println(Arrays.toString(charCount));        
}
System.out.println(Arrays.toString(charCount));

        
        // Second pass: find the first character with a frequency of 1
        for (int i = 0; i < s.length(); i++) {
            if (charCount[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

System.out.println(Arrays.toString(charCount));
        
        // If no unique character is found, return -1
        return -1;



}




}