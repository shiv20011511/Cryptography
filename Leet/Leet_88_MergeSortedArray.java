//leet 88 Merge Sorted Array 

import java.util.Arrays;
public class Leet_88_MergeSortedArray{
public static void main(String[] args){

int[] nums1={1,2,3,0,0,0};
int[] nums2={2,5,6};
int m=3;
int n=3;
/*
int[] nums1={0};
int[] nums2={1};
int m=0;
int n=1;
*/



Merging(nums1,nums2,m,n);

}

//function to see

static void Merging(int[] n1,int[] n2,int m,int n){
int end1=m-1;
int end2=n-1;

int totallength=(m+n)-1;

while(end2>=0){

if(end1>=0 && n1[end1]>n2[end2]){
n1[totallength]=n1[end1];
totallength--;
end1--;
}

else{

n1[totallength]=n2[end2];
totallength--;
end2--;

}

System.out.println(Arrays.toString(n1));

}




/*
for(int i=n1.length-1;i>=0;i--){

if(end2>=0 && n1[end1]<n2[end2]){
n1[i]=n2[end2];

end2--;
}else if(end1>=0 && n1[end1]>n2[end2]){
int temp=n1[end1];
n1[end1]=n2[end2];
n1[i]=temp;
end1--;

}

System.out.println(Arrays.toString(n1));



}

*/

//System.out.println(Arrays.toString(n1));

}







}