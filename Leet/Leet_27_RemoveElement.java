//Leet 27 Remove Element

import java.util.Arrays;

public class Leet_27_RemoveElement{

public static void main(String[] args){
int[] ar={3,2,2,3};
int val=3;

System.out.println("Array -->> "+Arrays.toString(ar));

System.out.println("Val -->> "+val);

System.out.println("Value --> "+Remove(ar,val));
}

//function that returns
static int Remove(int[] nums,int val){
int count=0;
for(int i=0;i<nums.length;i++){
if(nums[i]!=val){
nums[count]=nums[i];
System.out.println("Array In Loop-->> "+Arrays.toString(nums));
count++;
}
}
System.out.println("Final Array -->> "+Arrays.toString(nums));        
return count;
}

}