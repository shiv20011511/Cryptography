//first and last occurrence
import java.util.Arrays;
public class First_LastBS{
public static void main(String args[]){
int[] arr={5,7,7,7,7,8,8,8,9};
int target=108;
System.out.println("Arrays is ->->-> "+Arrays.toString(arr));
System.out.println("Target is->->-> "+target);
System.out.println(Arrays.toString(IndexOFFirst_Last(arr,target)));
}

//supproting function

static int[] IndexOFFirst_Last(int[] arr,int target){
int[] ans={-1,-1};

int start=Find_First_last(arr,target,true);
int end=Find_First_last(arr,target,false);
ans[0]=start;
ans[1]=end;

return ans;

}

//main function to find the index
static int Find_First_last(int[] arr,int target,boolean findfirst){
int ans=-1;
int start=0;
int end=arr.length-1;

while(start<=end){
int mid=start+(end-start)/2;

if(target>arr[mid]){
start=mid+1;
}else if(target<arr[mid]){
end=mid-1;
}else{
//==
ans=mid;
if(findfirst){
end=mid-1;
}else{
start=mid+1;
}
}
}

return ans;
}



}