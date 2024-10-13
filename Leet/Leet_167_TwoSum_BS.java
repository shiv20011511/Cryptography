//Leet 167. Two Sum II - Input Array Is Sorted Binary Search Question
import java.util.Arrays;
public class Leet_167_TwoSum_BS{
public static void main(String args[]){
//int[] ar={-1,0};
//int target=-1;

//int[] ar={2,3,4};
//int target=7;

int[] ar={3,24,50,79,88,150,345};
int target=200;


//int[] ar={2,7,11,15};
//int target=26;
System.out.println(" array -->> "+Arrays.toString(ar));
System.out.println(Arrays.toString(Indexes_BS(ar,target)));

}

//function that find the indexes that matches with target using Binary Search

static int[] Indexes_BS(int[] ar,int target){
int start=0;
int end=ar.length-1;
int count=0;
while(start<end){
//int mid=start+(end-start)/2;

if(ar[start]+ar[end]==target){
return new int[] {start+1,end+1};
}

if(ar[start]+ar[end]>target){
end--;
}else{
start++;
}



}

return new int[]{-1,-1};
}



}