//leetcode Question 724. Find Pivot Index

public class Pivot_index_Leet724{
public static void main(String args[]){
int[] ar={1,7,3,6,5,6};
//int[] ar={1,2,3};
//int[] ar={2,1,-1};
System.out.println("Pivot Index -> "+PivotIndex(ar));

}
//function that returns pivot index

static int PivotIndex(int[] ar){
int index=-1;
int totalsum=0;
int len=ar.length;

//to find the total sum
for(int i=0;i<len;i++){
totalsum+=ar[i];
}
int cs=0;
System.out.println("CS "+cs);
//to find pivot index
for(int i=0;i<len;i++){
int left=cs;
System.out.println("left "+cs);
int right=totalsum-left-ar[i];

if(left==right){
return i;


}

cs+=ar[i];


}
return -1;
}


}