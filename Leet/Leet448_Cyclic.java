//leet code 448 Find All Numbers Disappeared in an Array

import java.util.Arrays;
import java.util.List;
import java.util.*;
public class Leet448_Cyclic{
public static void main(String args[]){
//int[] ar={5,4,3,2,1};
//int[] ar={1,4,3,2};
int[] ar={4,3,2,7,8,2,3,1};
//int[] ar={1,1};
System.out.println("Before Sort -->> "+Arrays.toString(ar));
System.out.println(CyclicSort(ar));
System.out.println("after Sort -->> "+Arrays.toString(ar));


}

//cyclic sort
static List<Integer> CyclicSort(int[] ar){
int i=0;
while(i<ar.length){
//{5,4,3,2,1}
int index=ar[i]-1;
if(ar[i]!=ar[index]){
swap(ar,i,index);

}else{
i++;
}

System.out.println("inside Sort *******>> "+Arrays.toString(ar));
}

List<Integer> ans=new ArrayList<>();

//returning missing 

for(int j=0;j<ar.length;j++){
if(ar[j]!=j+1){
ans.add(j+1);
}

}


return ans;
}

//swap function

static void swap(int[] ar,int first,int last){
int temp=ar[first];
ar[first]=ar[last];
ar[last]=temp;
}
}
