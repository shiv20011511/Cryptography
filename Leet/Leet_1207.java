//Leetcode 1207 question to find the same occurrence if same then return false

import java.util.Arrays;

public class Leet_1207{
public static void main(String args[]){
//int[] ar={1,9,2,3,5};

int[] ar={1,2,2,1,1,3};

System.out.println(SameOccurence(ar));
}
//function that returns bool
static Boolean SameOccurence(int[] ar){
int[] newar=new int[2001];

//using for each to increment ith value in newar array

for(int i : ar){
newar[i+1000]++;
System.out.println(newar[i]);
}

//sorting the newar to get the value in ascending order

Arrays.sort(newar);

//checking the occurences

for(int i=0;i<2000;i++){

if(newar[i]!=0 && newar[i]==newar[i+1]){
System.out.println(newar[i]);
return false;
}

}

//else base condition that array is not having same occurences

return true;


}



}