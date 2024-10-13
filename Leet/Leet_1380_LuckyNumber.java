//Leet 1380. Lucky Numbers in a Matrix (done with 1 ms)
import java.util.Arrays;
public class Leet_1380_LuckyNumber{

public static void main(String args[]){
/*
int[][] ar={
{3,7,8},
{9,11,13},
{15,16,17}
};
*/

int[][] ar={
{1,10,4,2},
{9,3,8,7},
{15,16,17,12}

};

GetMinMax(ar);

}

static void GetMinMax(int[][] ar){


int minr=0;

for(int i=0;i<ar.length;i++){
int[] minrc=new int[2];
minrc=getmin(ar,i,ar[i].length);
int min=minrc[0];
int max=getmax(ar,0,minrc[1]);

if(min==max){
System.out.println(min);
}

//System.out.println(Arrays.toString(minrc));
	

}

//return -1;

}

//for coll maximum
static int getmax(int[][] ar,int row,int col){

int max=0;

for(int i=0;i<ar.length;i++){

if(max<ar[i][col]){

max=ar[i][col];

}


}

//System.out.println("Max-->> "+max);
return max;

}


//for row minimum
static int[] getmin(int[][] ar,int row,int col){
int min=ar[row][0];
int mincol=0;
for(int i=0;i<col;i++){

if(min>ar[row][i]){

min=ar[row][i];
mincol=i;
}



}


return new int[] {min,mincol};
}



}