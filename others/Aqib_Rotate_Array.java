//Rotate an Array Kth Times

import java.util.Arrays;

public class Aqib_Rotate_Array{
public static void main(String[] args){
//int[] ar={5,4,3,2,1};
int[] ar={1,2,3,4,5};
Rotate(ar,2);

}

//rotate an array kth times

static void Rotate(int[] ar,int k){

int start=0;
int end=ar.length-1;

while(k!=0){
k--;

System.out.println(ar[end-k]);


int temp=ar[end-k];
ar[end-k]=ar[start+k];

ar[start+k]=temp;
//System.out.println(ar[start]);

System.out.println(Arrays.toString(ar));
}
System.out.println(Arrays.toString(ar));



}


}