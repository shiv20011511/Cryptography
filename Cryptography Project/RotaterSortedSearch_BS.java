//33. Search in Rotated Sorted Array leetcode
//self
//first find the peak element then to search for an element on right if not found left

public class RotaterSortedSearch_BS{
public static void main(String args[]){
int[] arr={4,5,6,7,0,1,2};


int target=0;

System.out.println("Peak element ->-> "+Peak(arr,target));

}
//peak element

static int Peak(int[] ar,int target){
int start=0;
int end=ar.length-1;
int peak=0;
while(start<=end){
int mid=start+(end-start)/2;

if(ar[mid]>ar[mid+1]){
start=mid;
}else{
end=mid-1;
}

peak=mid;

}

int index=RotatedArraySearchBS(ar,target,peak);

if(index==-1){
int index2=descBS(ar,target,peak);
return index2;
}else{

return index;
}




}

//function that finds the target in rotated sorted array

static int RotatedArraySearchBS(int[] ar,int target,int peakindex){
//for ascending



int start=0;
int end=peakindex;
while(start<end){
int mid=start+(end-start)/2;

if(target>ar[mid]){
start=mid+1;
}else if(target<ar[mid]){
end=mid-1;
}else{

return mid;
}

}

return -1;
}

//for desc
static int descBS(int[] ar,int target,int peakindex){

int start=peakindex;
int end=ar.length-1;
while(start<end){
int mid=start+(end-start)/2;

if(target>ar[mid]){
end=mid;
}else if(target<ar[mid]){
start=mid;
}else{
//==

return mid;
}
}
return -1;
}


}