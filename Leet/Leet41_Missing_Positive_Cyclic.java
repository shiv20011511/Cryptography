//leet 41  First Missing Positive
import java.util.Arrays;
public class Leet41_Missing_Positive_Cyclic{
public static void main(String args[]){
int[] ar={1};
//int[] ar={1,2,0};
//int[] ar={3,2,1};
//int[] ar={0,7,8,9,11,12};
//int[] ar={3,4,-1,1};
System.out.println(Arrays.toString(ar));
System.out.println("Missing Number -->> "+CyclicSort(ar));
System.out.println(Arrays.toString(ar));
}
//cyclic sort
static int CyclicSort(int[] ar){
int i=0;
while(i<ar.length){

int index=ar[i];
if(ar[i]<ar.length && ar[i]>0 && ar[i]!=ar[index-1]){

swap(ar,i,index-1);
}else{
i++;
}
}

//returning positive first integer number 
for(int j=0;j<ar.length;j++){
if(ar[j]!=j+1){
return j+1;
}
}

//return ar.length+1 because the array contains all element with indexes 
return ar.length+1;




}

//swap
static void swap(int[] ar,int first,int last){
int temp=ar[first];
ar[first]=ar[last];
ar[last]=temp;


}




}