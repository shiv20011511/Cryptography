//LEET 4. Median of Two Sorted Arrays

import java.util.Arrays;

public class  Leet4_Median_twoSorted_Array{
public static void main(String args[]){
int[] ar1={1,2};
int[] ar2={3,4};
//int[] ar1={1,2,6,5};
//int[] ar2={4,3};
findMedianSortedArrays(ar1,ar2);
}    
static double findMedianSortedArrays(int[] ar1, int[] ar2) {
int len=(ar1.length)+(ar2.length);
int[] ar3=new int[len];

CyclicSort(ar3,ar1);
CyclicSort(ar3,ar2);

//cyclic sort for arranging array

double ans=0;

if(len%2==0){
int mid=len/2;

ans=(double)(ar3[mid]+ar3[mid-1])/2;


}else{
int mid=len/2;

ans=ar3[mid];

}
     

System.out.println(Arrays.toString(ar3));

System.out.printf("%.5f",ans);



return ans;

    }

static void CyclicSort(int[] ar3,int[] ar){
int i=0;
while(i<ar.length){
int index=ar[i];
if(ar[i]<ar.length && ar[i]!=ar[index-1]){
swap(ar3,ar,i,index-1);
}else{
ar3[index-1]=index;
i++;
}

}


}

static void swap(int[] ar3,int[] ar,int first,int last){
ar3[first]=ar[last];
ar3[last]=ar[first];

}


}