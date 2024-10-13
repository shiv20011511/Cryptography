//Median of Two Sorted Arrays
//1 we have to merge the both arrays 
//and then find the median
import java.util.Arrays;
public class Median_OF_two_Sorted{
public static void main(String args[]){
int[] num1={1,3};

int[] num2={2};

//int[] num1={1,2};

//int[] num2={3,4};


System.out.println("Array 1 ->> "+Arrays.toString(num1));
System.out.println("Array 1 ->> "+Arrays.toString(num2));




System.out.println("Merging Array ->> "+Arrays.toString(Merging(num1,num2)));





}

static int[] Merging(int[] ar1,int[] ar2){

int[] mergedarray=new int[ar1.length+ar2.length];

int start=0;
System.out.println(start);
int end=mergedarray.length;



while(start<end){
int mid=0;
int i=0;
if(start<=ar1.length-1){
System.out.println("ar1 ------ "+ar1[start]);
mid=start+((ar1.length-1)-start)/2;
}else{
System.out.println("ar2 ------ "+ar2[i]);
mid=start+((ar2.length-1)-start)/2;
}


//main case for array 1
if(start<ar1.length){



if(ar1[mid]<=ar2[i]){
mergedarray[start]=ar1[start];
i++;
start++;
}else if(ar1[mid]>=ar2[i]){
mergedarray[start]=ar2[i];
start=mid+1;
i++;
}

}else{


if(mergedarray[start]<ar2[i]){
//System.out.println("Mg array ------ "+mergedarray[start-1]);
mergedarray[start]=ar2[i];
i++;
start++;
}else if(mergedarray[start-1]>ar2[i]){
mergedarray[start]=mergedarray[start-1];
mergedarray[start]=ar2[i];
i++;
start++;
}



}


}



return mergedarray;
}



}