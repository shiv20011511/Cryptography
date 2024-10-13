//leetcode 852 852. Peak Index in a Mountain Array following biotonic array(First increasing then decresing)
import java.util.Arrays;

public class Leetcode_852{
public static void main(String args[]){
//int[] arr={3,4,5,1};
//int[] arr={0,2,1};
//int[] arr={0,1,0};
//int[] arr={24,69,100,99,79,78,67,36,26,19};
//int[] arr={10,20,30,50,25,19};
//int[] arr={10,20,30,25};
//int[] arr={1,2,1,3,5,6,4};
//int[] arr={1,2};

//int[] arr={4,5,6,7,0,1,2};
//int[] arr={1};
//int[] arr={3,5,1};
int[] arr={1,3};




System.out.println("Array ->-> "+Arrays.toString(arr));


//System.out.println("Index Of Maximum Peak Element ->-> "+BruteForce(arr));

System.out.println("Index Of Maximum Peak Element ->-> "+ThroughBS(arr));



}

//way 1 to solve

static int BruteForce(int[] ar){
int max=ar[0];
int index=0;
for(int i=1;i<ar.length;i++){
if(max<ar[i]){
max=ar[i];
index=i;
}

}


return index;
}

//way 2  to solve through Binary Search

static int ThroughBS(int[] ar){
int start=0;
int end=ar.length-1;




while(start<end){

int mid=start+(end-start)/2;

if(ar[mid]>ar[mid+1]){

end=mid;
}else{
    
start=mid+1;
}




}




return start;
}





}