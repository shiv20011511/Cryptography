// Hackerrank question Mini-Max Sum

import java.util.*;
public class Min_max_SubArray{
public static void main(String args[]){
//int[] ar={1,2,3,4,5};
//int[] ar={1,3,5,7,9};
int[] ar={256741038,623958417,467905213 ,714532089,938071625};

Min_Max(ar);
}

static void Min_Max(int[] ar){

int len=ar.length;
int[] ar2=new int[len];
for(int i=0;i<len;i++){

for(int j=0;j<len;j++){
if(i!=j){
ar2[i]+=ar[j];
}


}


}
//System.out.println(Math.min(ar2,len));
System.out.println(Arrays.toString(ar2));
int min=ar2[0];
int max=ar2[0];

for(int i=0;i<len;i++){
if(min>ar2[i]){
min=ar2[i];
}

if(max<ar2[i]){
max=ar2[i];
}

}

System.out.print(min+" "+max);


}


}