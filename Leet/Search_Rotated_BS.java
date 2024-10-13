//leetcode 81 Search in Rotated
import java.util.Arrays;
public class Search_Rotated_BS{
public static void main(String args[]){
//int[] ar={1,2,3,4,0,1,2};
int[] ar={2,5,6,0,0,1,2};
//int[] ar={1,2,3};
//int[] ar={1,1,1,1,1,1,1,1,1,1,2,1,1,1,1};
int target=0;
//int[] ar={};
System.out.println("Array -->> "+Arrays.toString(ar));
System.out.println("target at Index -->> "+Search(ar,target));
}
//main callbale function auxiliary function

static int Search(int[] ar,int target){
int pivot=Pivot(ar);
System.out.println("This is Pivot ->>->> "+pivot);
int ans=BinarySearch(ar,target,0,pivot);
if(ans==-1){
ans=BinarySearch(ar,target,pivot+1,ar.length);
}

return ans;



}



//to find the pivot index (largest in array)

static int Pivot(int[] ar){
int count=0;
int start=0;
int end=ar.length-1;
while(start<=end){
int mid=start+(end-start)/2;


if(mid > start && ar[mid]<ar[mid-1]){
end=mid-1;

return end;
}else if(mid < end && ar[mid]>ar[mid+1]){

start=mid+1;
return mid;

}

if (ar[mid] <= ar[start]) {
end = mid - 1;
} else {
start = mid + 1;
}







}



return -1;
}

static int BinarySearch(int[] ar,int target,int start,int end){

while(start<end){
int mid=start+(end-start)/2;

if(ar[mid]==target){
//start=mid;
return mid;
}

if(ar[mid]>target){
end=mid-1;
}else{
start=mid+1;
}



}

return -1;
}




}