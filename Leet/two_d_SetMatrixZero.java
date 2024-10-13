//Leet 73. Set Matrix Zeroes

public class two_d_SetMatrixZero{

public static void main(String args[]){
int[][] matrixs={
{0,1,0},
{1,1,1},
{1,1,1}
};

int[][] matrixsc={
{1,1,1},
{1,0,1},
{1,1,1}
};

int[][] matrix={
{0,1,2,0},
{3,4,5,2},
{1,3,1,5}
};



System.out.println("Old Matrix");
Display(matrix);

FindZero(matrix);

System.out.println("New Matrix");

Display(matrix);

}

//to find row and col for zero

static void FindZero(int[][] arr){

for(int i=0;i<arr.length;i++){
for(int j=0;j<arr[i].length;j++){
if(arr[i][j]==0){
arr[i][j]=-1;

}

}

}


}

//to set zero

static void SetZero(int row,int col,int[][] arr){

//for rows setting
for(int i=0;i<arr.length;i++){
System.out.println("******** "+arr[i][col]);
arr[i][col]=0;

}

//for column
for(int j=0;j<arr[row].length;j++){

arr[row][j]=0;

}





}




//to display

static void Display(int[][] arr){
for(int i=0;i<arr.length;i++){
for(int j=0;j<arr[i].length;j++){
System.out.print(arr[i][j]+" ");
}
System.out.println();
}

}


}