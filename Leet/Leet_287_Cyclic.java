//leetcode 287 Find the Duplicate Number
//cyclic sort

import java.util.Arrays;

public class Leet_287_Cyclic{
public static void main(String args[]){
int[] ar={1,3,4,2,2};
//int[] ar={3,1,3,4,2};
//int[] ar={3,3,3,3};
//int[] ar={4,3,3,1,0};
System.out.println(Arrays.toString(ar));

System.out.println("Repeated Element  ---->> "+CyclicSorts(ar));
System.out.println(Arrays.toString(ar));
}
//cyclic
//below is advance one
static int CyclicSorts(int[] ar){
int i=0;

while(i<ar.length){
if(ar[i]!=i){
int index=ar[i];
if(ar[i]!=ar[index]){
swap(ar,i,index);
}else{
return ar[i];
}
}else{
i++;
}

}



return -1;

}





static int CyclicSort(int[] ar){
int i=0;

while(i<ar.length){
int index=ar[i];
if(ar[i]!=ar[index]){
swap(ar,i,index);
}else{
i++;
}
}

//searching of repeated number

for(int j=0;j<ar.length;j++){
if(ar[j]!=j){
return ar[j];
}
}


return -1;

}

//swap
static void swap(int[] ar,int first,int last){
int temp=ar[first];
ar[first]=ar[last];
ar[last]=temp;


}


}
