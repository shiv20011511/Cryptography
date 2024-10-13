//leetcode question to find greatest char in the char array
public class leetcode744{
public static void main(String args[]){

char[] arr={'a','d','b','c','f','j','z'};
char target='z';

System.out.println("Return ->-> "+nextGreatestLetter(arr,target));


}

  public static char nextGreatestLetter(char[] letters, char target) {
        

int start=0;
int end=letters.length-1;

while(start<=end){

int mid=start+(end-start)/2;


if(target<letters[mid]){
end=mid-1;

}else {
start=mid+1;

}

}



return letters[start % letters.length];

 }

}