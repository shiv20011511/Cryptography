//leet 645 Set Mismatch Cyclic sort

import java.util.Arrays;

public class Leet_645_Cyclic{
public static void main(String args[]){
int[] ar={3,2,2};
System.out.println(Arrays.toString(CyclicSort(ar)));

}
//cyclic
static int[] CyclicSort(int[] ar){
int i=0;
while(i<ar.length){
int index=ar[i]-1;
if(ar[i]!=ar[index]){
swap(ar,i,index);
}else{
i++;
}

}

for(int j=0;j<ar.length;j++){
if(ar[j]!=j+1){
return new int[]{ar[j],j+1};
}
}


return new int[]{-1,-1};

}
static void swap(int[] ar,int first,int last){
int temp=ar[first];
ar[first]=ar[last];
ar[last]=temp;
}


}