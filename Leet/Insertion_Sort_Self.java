// Insertion sort Self
import java.util.Arrays;
public class Insertion_Sort_Self{
public static void main(String args[]){
//int[] arr={10,9,8,7,5,6,1};
//int[] arr={1,2,3,4,5,6};
int[]arr={5,2,4,6,1,3};
//int[] arr={5,4,3,2,1};
//int[] arr={1,1,1,2,1};
System.out.println("original Array ->->-> "+Arrays.toString(arr));
InsertionSort(arr);
System.out.println("After Insertion sor Array ->->-> "+Arrays.toString(arr));

}

//function that perform insertion sort

static void InsertionSort(int[] ar){
int count=0;
//looping but not with 0 index first 

for(int i=1;i<ar.length;i++){
//storing the key 

System.out.println("\u001b[31m"+"Outside while (i)"+i+"\u001b[37m");

int key=ar[i];
//previous element of ar[i]=ar[i-1];
int j=i-1;
count++;
System.out.println("\u001b[31m"+"Outside while (j)"+j+"\u001b[37m");

//passing the key and previous element of ar[i-1] in while loop

//entering while loop if below condition satisfied

while(j>=0 && ar[j]>key){
/*
System.out.println("---------------------------------------------");
System.out.println("\u001b[33m"+" ***********WHILE STARTED ***********" +"\u001b[37m");
System.out.println("---------------------------------------------");
*/

//comparing previous elements before i in the below  condition if j become-1 then it will break

System.out.println("\u001b[32m"+"Inside while j value -> "+j+"\u001b[37m");


ar[j+1]=ar[j];

System.out.println("\u001b[36m"+"value of (j+1) in while loop "+ar[j+1]+"\u001b[37m");

System.out.println("\u001b[33m"+"Inside while i value ->"+ar[i]+"\u001b[37m");


j=j-1;




ar[j+1]=key;

System.out.println("\u001b[36m"+"value of (j+1) after (j-1) Replaced with key in while loop "+ar[j+1]+"\u001b[37m");

System.out.println("\u001b[37m"+"Updated Array ->-> ->-> "+Arrays.toString(ar)+"\u001b[37m");


if(j==-1){
break;
/*
System.out.println("---------------------------------------------");
System.out.println("\u001b[33m"+" ***********WHILE BREAKED *********** "+j+"\u001b[37m");
System.out.println("---------------------------------------------");
System.out.println();
*/
}

}


}



}

}