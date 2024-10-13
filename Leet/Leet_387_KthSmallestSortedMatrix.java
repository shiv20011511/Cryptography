//Leet 378. Kth Smallest Element in a Sorted Matrix
import java.util.Arrays;
public class Leet_387_KthSmallestSortedMatrix{

public static void main(String args[]){
/*
int[][] ar={
{1,5,9},
{10,11,13},
{12,13,15}

};
*/

int[][] ar={
{1,4,7,11,15},
{2,5,8,12,19},
{3,6,9,16,22},
{10,13,14,17,24},
{18,21,23,26,30}

};


display(ar);


int k=8;
SetRowCol(ar,k);

}


//method to sort the matrix
static void SetRowCol(int[][] ar,int k){
int row=ar.length;
int col=ar[0].length;

for(int i=0;i<row-1;i++){

for(int j=col-1;j>=0;j--){

int start=i+1;

if(ar[i][j]>ar[start][0]){

swap(ar,i,j);

}
}
}
int idx=0;
int[] res=new int[row*col];

for(int i=0;i<ar.length;i++){

for(int j=0;j<ar[i].length;j++){

res[idx++]=ar[i][j];

}

}

System.out.println("-->> "+Arrays.toString(res));

//display(ar);

}

//method to swap
static void swap(int[][] ar,int row,int col){

int temp=ar[row][col];

ar[row][col]=ar[row+1][0];

ar[row+1][0]=temp;


}

//display

static void display(int[][] ar){

for(int i=0;i<ar.length;i++){

for(int j=0;j<ar[i].length;j++){
System.out.print(ar[i][j]+" ");
}

System.out.println();
}


}




}