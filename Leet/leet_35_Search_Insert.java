// Leet 35. Search Insert Position
import java.util.Arrays;
public class leet_35_Search_Insert{
public static void main(String args[]){
//int[] ar={1,2,3,4,5,6};
int[] ar={1,3,5,6};
int target=2;
System.out.println("Array -> "+Arrays.toString(ar));
System.out.println("Target -> "+target);
System.out.println("Index found -> "+Search_BS(ar,target));


}
//function that search the preffered index of setting the target

static int Search_BS(int[] ar,int target){
int start=0;
int end=ar.length-1;

while(start<=end){
int mid=start+(end-start)/2;
//int[] ar={1,2,3,4,5,6};
if(ar[mid]>target){
end=mid-1;
}else if(ar[mid]<target){
start=mid+1;
}else{
return mid;
}


}

return start;
}




}