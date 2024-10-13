//1095. Find in Mountain Array



import java.util.Arrays;

public class Leetcode1095{
public static void main(String args[]){

//question to find the target where target is repeated and to find the lowest index or first index but here array is biotonic means we have to find peak
//int[] arr={1,3,4,5,4,2};

//int[] arr={1,3,4,5,3,1};
int[] arr={0,1,2,4,2,1};
//int[] arr={5,1,2};
System.out.println(Arrays.toString(arr));
int target=2;




System.out.println("Lowest Index ->->-> "+Peak(arr,target));

}

static int Peak(int[] ar,int target){

int start=0;
int end=ar.length-1;

while(start<end){
int mid=start+(end-start)/2;

if(ar[mid]>ar[mid+1]){
end=mid-1;
}else{

start=mid+1;
}

}
//returning the peak index
//return start;
//calling other function
//using order agnostic method

int Lowestindex=BinarySearchASC(ar,start,target);
if(Lowestindex==-1){
//in the above target might not be repeating and we have to check on right side of peak
int Lowestindexdsc=BinarySearchDESC(ar,start,target);
return Lowestindexdsc;
}else{

return Lowestindex;
}



}


//we know that or peak element so the lowest index of target (Repeated ) must be in the left sub array (Ascending)

static int BinarySearchASC(int[] ar,int peakindex,int target){
int start=0;
int end=peakindex;
int index=-1;

while(start<end){
int mid=start+(end-start)/2;


if(target>ar[mid]){
start=mid+1;
}else if(target<ar[mid]){
end=mid;




}else{
//==
//index=mid;
return mid;
}


}

return index;
}

//we know that or peak element so the lowest index of target (Non Repeated ) must be in the Right sub array (Descending)
static int BinarySearchDESC(int[] ar,int peakindex,int target){
int start=peakindex;
int end=ar.length-1;

//int end=ar.length-1;
int index=-1;

while(start<=end){
int mid=start+(end-start)/2;






if(target>ar[mid]){
end=mid-1;
}else if(target<ar[mid]){
start=mid+1;

}else{
//==

return mid;
}


}

return index;
}








}