//leet 442 Find All Duplicates in an Array (Cyclic based)

import java.util.List;
import java.util.Arrays;
import java.util.*;
public class Leet_442_Cyclic{
public static void main(String args[]){
int[] ar={4,3,2,7,8,2,3,1};
System.out.println(Arrays.toString(ar));
System.out.println(CyclicSort(ar));
System.out.println(Arrays.toString(ar));
}
//cyclic
static List<Integer> CyclicSort(int[] ar){
int i=0;
while(i<ar.length){
int index=ar[i]-1;
if(ar[i]!=ar[index]){
swap(ar,i,index);
}else{
i++;
}
}

List<Integer> ls=new ArrayList<>();
for(int j=0;j<ar.length;j++){
if(ar[j]!=j+1){
ls.add(ar[j]);
}
}

return ls;
}

//swap
static void swap(int[] ar,int first,int last){
int temp=ar[first];
ar[first]=ar[last];
ar[last]=temp;

}


}