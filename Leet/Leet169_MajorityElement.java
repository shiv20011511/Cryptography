//leet 169 Majority Element 

import java.util.Arrays;

public class Leet169_MajorityElement{

public static void main(String args[]){
int[] ar={2,2,3,4,5,2,2,2,3,3,3,3};

System.out.println(Arrays.toString(ar));

Majority(ar);

}

static void Majority(int[] nums){
 
int[] res=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    res[i]++;
                }
            }

        }

System.out.println(Arrays.toString(res));


int max=res[0];

int index=0;

for(int i=0;i<res.length;i++){

if(max<res[i]){
max=res[i];
index=i;

}


}

System.out.println(max);
System.out.println(nums[index]);

}


}