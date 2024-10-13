//Leet 26. Remove Duplicates from Sorted Array

import java.util.Arrays;

public class Leet_26_RemoveDuplicate_SortedArray{

public static void main(String[] args){
int[] ar={1,1,2};
System.out.println("Array -->> "+Arrays.toString(ar));

System.out.println("Value --> "+Remove(ar));


}

static int Remove(int[] nums){
 int count=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[count]=nums[i+1];
System.out.println("Array In Loop-->> "+Arrays.toString(nums));
                count++;
                //i++;
            }
        }

System.out.println("Final Array -->> "+Arrays.toString(nums)); 
        return count;

}


}