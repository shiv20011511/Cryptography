//33. Search in Rotated Sorted Array leetcode
//self
//first find the peak element then to search for an element on right if not found left
import java.util.Arrays;
import java.util.Scanner;

public class RotaterSortedSearch_BS{
public static void main(String args[]){

int[] arr={3,5,1};
//int[] arr={3,1};
//int[] arr={1,3,3,3,5,5,5};
//int[] arr={2,9,2,2,2};
int target=3;
//System.out.println("Array is -> "+Arrays.toString(arr));
//System.out.println("Target is ->  "+target);

///testing for placement
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    System.out.println(s);



//System.out.println("Found at index ->->-> "+Search(arr,target));
}

static int Pivot(int[] arr) {
int start = 0;
int end = arr.length - 1;
while (start <= end) {
int mid = start + (end - start) / 2;
            //case 1 
if (mid < end && arr[mid] > arr[mid + 1]) {
System.out.println("mid ->"+mid);
                return mid;
}
//case 2
if (mid > start && arr[mid] < arr[mid - 1]) {
return mid-1;
}
//case 3 and 4
if (arr[mid] <= arr[start]) {
end = mid - 1;
} else {
start = mid + 1;
}
}
return -1;
}

//search

static int Search(int[] ar,int target){
int pivot=Pivot(ar);



if(pivot==-1){
return BinarySearch(ar,target,0,ar.length-1);
}
if(ar[pivot]==target){
    return pivot;
}

if(target>=ar[0]){
    return  BinarySearch(ar,target,0,pivot-1);
}

return  BinarySearch(ar,target,pivot+1,ar.length-1);

}

//binary search 
static int BinarySearch(int[] ar,int target,int start,int end){
String name="";


while(start<=end){
int mid=start+(end-start)/2;
if(ar[mid]>target){
end=mid-1;
}else if(ar[mid]<target){
start=mid+1;
}else{
return mid;
}
}

return -1;

}



}