//Leet 977 Squares of a Sorted Array

import java.util.Arrays;

public class Leet_977_SquaresSortedArray{
public static void main(String[] args){

//int[] ar={-4,-1,0,3,10};
//int[] ar={-7,-3,2,3,11};
int[] ar={-5,-4,-3,-2,-1};
System.out.println(Arrays.toString(ar));



//passed the test cases in 0(n)
SquareOfSortedArray_better(ar);


}

//another method

static void SquareOfSortedArray_better(int[] ar){

int start=0;
int end=ar.length-1;

int[] result=new int[ar.length];
int index=ar.length-1;

while(start<=end){


int starts=ar[start]*ar[start];
int ends=ar[end]*ar[end];

if(starts>ends){
result[index]=starts;
index--;
start++;

}else{
result[index]=ends;
index--;
end--;


}

System.out.println("Result in New Array -->**> "+Arrays.toString(result));

}

System.out.println(Arrays.toString(result));
}



}

