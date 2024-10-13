//Leet 73. Set Matrix Zeroes 
//desc Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.


public class Leet_73_Set_Matrix_Zero{

public static void main(String args[]){
/*
int[][] ar={
{1,1,1},
{1,0,1},
{1,1,1}
};
*/

int[][] ar={
{0,1,2,0},
{3,4,5,2},
{1,3,1,5}
};
display(ar);


SetZeros(ar);

}

static void SetZeros(int[][] ar){

int[] row=new int[ar.length];
int[] col=new int[ar[0].length];
//for checking postion of 0 element
for(int i=0;i<ar.length;i++){
for(int j=0;j<ar[i].length;j++){

if(ar[i][j]==0){
row[i]=1;
col[j]=1;
}

}

}

//for updating row and columns in source matrix
for(int i=0;i<ar.length;i++){
for(int j=0;j<ar[i].length;j++){
if(row[i]==1 || col[j]==1){
ar[i][j]=0;

}


}

}
display(ar);
}

//for display
static void display(int[][] ar){
for(int i=0;i<ar.length;i++){
for(int j=0;j<ar[i].length;j++){
System.out.print(ar[i][j]+" ");


}
System.out.println();
}


}


}
