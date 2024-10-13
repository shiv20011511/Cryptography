//Leet 189 Rotate Array Kth Times
import java.util.Arrays;
public class Leet_189_Rotate_Array_Kth_Times{

public static void main(String[] args){

int[] ar={1,2,3,4,5,6,7};
int k=3;
System.out.println("Original Array -->>  "+Arrays.toString(ar));

//Rotate(ar,k);

Rotate_By_ReverseMethod(ar,k);

}
//Reverse Logic  optimized 

static void Rotate_By_ReverseMethod(int[] ar,int k){
k=k%ar.length;
Reverse(ar,0,ar.length-1);
System.out.println("Array ar after 1 reverse ----  "+Arrays.toString(ar));
Reverse(ar,0,k-1);
System.out.println("Array ar after 2 reverse end = k-1 ----  "+Arrays.toString(ar));
Reverse(ar,k,ar.length-1);
System.out.println("Array ar after 3 (final) reverse ----  "+Arrays.toString(ar));

}

static void Reverse(int[] ar,int start,int end){

while(start<=end){
int temp=ar[start];

ar[start]=ar[end];

ar[end]=temp;
start++;
end--;

}


}



//Abhay's Logic

static void Rotate(int[] ar,int k){
int[] result=new int[ar.length];

for(int i=0;i<ar.length;i++){
int index=(i+k)%ar.length;
result[index]=ar[i];

}

ar=result;

System.out.println("Array ar after function rotate ----  "+Arrays.toString(ar));
System.out.println("Result Array ******* "+Arrays.toString(result));


}



}