//Leet 1 Two Sum 

import java.util.Arrays;
public class Leet1_TwoSum{
public static void main(String args[]){
//int[] ar={3,2,4};
int[] ar={-1,-2,-3,-4,-5};
System.out.println(Arrays.toString(ar));
int target=-8;
System.out.println(Arrays.toString(twoSum(ar,target)));

}


 static int[] twoSum(int[] ar, int target) {
int start=0;
int end=ar.length-1;

while(start<=end){
int left=ar[start];
int diff=target-ar[start];
System.out.println("Ar start -- "+ar[start]);
System.out.println("Ar Diff ->-> "+diff);

for(int i=start+1;i<ar.length;i++){
System.out.println("Ar I ->-> "+ar[i]);
if(diff==ar[i]){
return new int[]{start,i};

}
}



start++;

}

return new int[]{-1,-1};

    }
}