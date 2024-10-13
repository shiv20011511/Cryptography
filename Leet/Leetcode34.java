//leetcode question 34 first and last element of an array
import java.util.Arrays;

public class Leetcode34{
public static void main(String args[]){
int[] nums={5,7,7,7,7,8,8,10};
int target=7;

System.out.println(Arrays.toString(searchRange(nums,target)));

}

//main function that return first and last occurence
public static int[] searchRange(int[] nums, int target) {

int[] ans={-1,-1};
int start=search(nums,target,true);
int last=search(nums,target,false);
ans[0]=start;
ans[1]=last;
        
return ans;

}

//suporting function

static int search(int[] nums,int target,boolean findstartindex){
int start=0;
int ans=-1;
int end=nums.length-1;

while(start<=end){
int mid=start+(end-start)/2;



if(target>nums[mid]){
start=mid+1;
}else if(target<nums[mid]){
end=mid-1;
}else{
//potential ans found
ans=mid;
//if true
//System.out.println(ans);
if(findstartindex){
System.out.println("This is start"+ans);
end=mid-1;
}else{
System.out.println("This is end"+ans);
start=mid+1;
}
}
}

return ans;
}


 
}