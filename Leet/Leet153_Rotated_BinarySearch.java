//leet code 153 Find Minimum in Rotated Sorted Array



import java.util.Arrays;
public class Leet153_Rotated_BinarySearch{
public static void main(String args[]){
//int[] ar={3,4,5,1,2};
//int[] ar={1,2,3,4,5,3,2,1,0};
//int[] ar={4,5,6,7,0,1,2};
//int[] ar={11,13,15,17};
//int[] ar={3,3,3,1};
//int[] ar={1,1,3};
//int[] ar={1,1};
System.out.println(Arrays.toString(ar));
System.out.println("Minimum == >> "+Search(ar));
}
//main function
//minimum
static int Search(int[] ar){

if(ar.length==2){
if(ar[0]<=ar[1]){
return ar[0];
}else{
return ar[1];
}

}


int pivot=Pivot(ar);
System.out.println("Mid "+pivot);
if(pivot!=-1){
int min1=BinarySearch(ar,0,pivot);
int min2=BinarySearch(ar,pivot+1,ar.length-1);
System.out.println("Min1 -->> "+min1+"  Min2 -->> "+min2);
if(min1<min2){
return min1;
}else{
return min2;
}

}else{

return BinarySearch(ar,0,ar.length-1);

}
}


//TO FIND PIVOT IN ARR

static int Pivot(int[] ar){
int start=0;
int end=ar.length-1;
while(start<=end){
int mid=start+(end-start)/2;
//System.out.println("Mid "+ar[mid]);
//cases 
if(mid<end && ar[mid]>=ar[mid+1]){
return mid;


}

if(mid>start && ar[mid]<ar[mid-1]){
return ar[mid-1];
}

if(ar[mid]<=ar[start]){
end=mid-1;
}else{
start=mid+1;
}


}

return -1;
}

//binary Search
static int BinarySearch(int[] ar,int s,int e){
int start=s;
int end=e;
//System.out.println("start "+s+" end  "+e);

while(start<=end){
int mid=start+(end-start)/2;

if(ar[mid]>ar[start]){
end=mid-1;
}else{
start=mid+1;
}



}

return ar[s];
}




}