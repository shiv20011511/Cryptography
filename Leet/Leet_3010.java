//Leet 3010 3010. Divide an Array Into Subarrays With Minimum Cost I


import java.util.Arrays;
public class Leet_3010{
public static void main(String args[]){
int[] ar={10,3,1,1};
//int[] ar={1,2,3,12};
//int[] ar={5,4,3};

//int[] ar={5,4,3};
System.out.println("Array -->> "+Arrays.toString(ar));
System.out.println("Minimum -->> "+MinimumSumArray(ar));
}

//function that returns 

static int MinimumSumArray(int[] ar){
int first=ar[0];
int second=10000;
int third=10000;

for(int i=1;i<ar.length;i++){

if(ar[i]<=second){
System.out.println("If" +ar[i]);
third=second;
second=ar[i];

}else if(ar[i]<third){

System.out.println("ELSE IF"+ar[i]);

third=ar[i];
}



}


return first+second+third;
}



}