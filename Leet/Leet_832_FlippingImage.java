//Leet 832 Flipping an Image 

public class Leet_832_FlippingImage{

public static void main(String args[]){

/*
int a=0;
int x=a^1;
System.out.println("Complement of a "+x);
*/

int[][] ar={
{1,1,0},
{1,0,1},
{0,0,0}
};

Display(ar);

Reverse(ar);

Display(ar);

}

//function that change value 0 to 1 (vice versa ) and reverse the row 

static void Reverse(int[][] ar){

for(int i=0;i<ar.length;i++){


Swap(ar,i,ar[i].length-1);

}


}

//swap

static void Swap(int[][] ar,int row,int col){

int start=0;

while(start<=col){

int temp=ar[row][start]^1;
ar[row][start]=ar[row][col]^1;
ar[row][col]=temp;

start++;
col--;

}

}

//display

static void Display(int[][] ar){

for(int i=0;i<ar.length;i++){
for(int j=0;j<ar[i].length;j++){
System.out.print(ar[i][j]+" ");

}
System.out.println();
}

}


}