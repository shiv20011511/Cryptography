//leetcode 410. Split Array Largest Sum (Not Accomplished self just coding Analyze later*** ) 
//divide the array into k time subarray and find the largest sum
import java.util.Arrays;
//import java.util.Math;
public class Split_Array_Largest_Sum_410{
public static void main(String args[]){
int[] arr={7,2,5,10,8};
//int[] arr={1,4,4};
int k=2;
System.out.println(splitarray(arr,k));

}

static int splitarray(int[] ar,int k){
int start=0;
int end=0;


for(int i=0;i<ar.length;i++){
start=Math.max(start,ar[i]);
end+=ar[i];

}

//applying binary search 
while(start<end){
//try for the potential ans as middle
int mid=start+(end-start)/2;

int sum=0;
int pieces=1;

for(int num:ar){
if(sum+num > mid){
sum=num;
pieces++;
}else{
sum+=num;
}

}

if(pieces>k){
start=mid+1;
}else{
end=mid;
}

}

return end;


}







}