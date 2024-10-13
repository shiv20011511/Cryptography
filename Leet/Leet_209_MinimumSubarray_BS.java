	//Leet 209. Minimum Size Subarray Sum

import java.util.Arrays;

public class Leet_209_MinimumSubarray_BS{
public static void main(String args[]){
//int[] ar={-1,0};
//int target=-1;

//int[] ar={2,3,4};
//int target=7;

//int[] ar={1,4,3};
//int target=4;

//int[] ar={1,2,3,4,5};
//int target=9;	


//int[] ar={3,24,50,79,88,150,345};
//int target=200;

//int[] ar={2,3,1,2,4,3};
//int target=8;

int[] ar={1,2,3,4,5};
int target=7;

//int[] ar={2,7,11,15};
//int target=26;
System.out.println(" array -->> "+Arrays.toString(ar));
System.out.println(Search(ar,target));

}

static int Search(int[] ar,int target){
int len=ar.length;
int sum=0;
int sublen=len+1;
int left=0;

for(int right=0;right<len;right++){
sum+=ar[right];
System.out.println(right);
System.out.println("sum --***** "+sum);
while(sum>=target){
sublen=Math.min(sublen,right-left+1);
System.out.println("Sublen ***** "+sublen);
System.out.println("left - in while >>> ***** "+ar[left]);
sum-=ar[left++];

System.out.println("Sum in while >>> ***** "+sum);

}
}




return sublen==len+1?0:sublen;

}


}