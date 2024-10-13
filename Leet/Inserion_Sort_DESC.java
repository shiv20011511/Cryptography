//Insertion sorted In (Descending order)
import java.util.Arrays;
public class Inserion_Sort_DESC{
public static void main(String args[]){
int[] ar={1,2,3,4,5,6};
System.out.println("Before Sorting ->>->> "+Arrays.toString(ar));
insertion_sort(ar);
System.out.println("After Sorting ->>->> "+Arrays.toString(ar));
}

static void insertion_sort(int[] ar){

for(int i=1;i<ar.length;i++){
int key=ar[i];

int j=i-1;
while(j>=0 && ar[j]<key){
//int temp=ar[j];
ar[j+1]=ar[j];
j=j-1;
ar[j+1]=key;


}



}


}



}