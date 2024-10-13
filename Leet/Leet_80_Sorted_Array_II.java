//Leet 80 
/*

ar=[0,0,1,1,1,1,2,3,3]

=[0,0,1,1,2,3,3,_,_]

*/
import java.util.Arrays;

public class Leet_80_Sorted_Array_II{

public static void main(String[] args){
int[] ar={0,0,1,1,1,1,2,3,3};

//int[] ar={1,1,1,2,2,3};
System.out.println("Original -->> "+Arrays.toString(ar));

System.out.println(RemoveDuplicateMoreThanTwiceSorted(ar));

}

//function that returns kth unique element

static int RemoveDuplicateMoreThanTwiceSorted(int[] ar){

int count=0;

for(int i=0;i<ar.length;i++){

System.out.println("Count --->> "+count);
if(count < 2 || ar[i]!=ar[count-2]){
System.out.println("ar[i] -->> "+ar[i]);
ar[count]=ar[i];
count++;


} 

System.out.println(Arrays.toString(ar));

}


return count;
}



}