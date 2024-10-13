//leetcode question 268 find missing number (Cyclic Sort )
import java.util.Arrays;
public class Leet_268_Missing_CyclicS{
public static void main(String args[]){
int[] ar={0,4,3,2,1};
//int[] ar={0,1};
//[9,6,4,2,3,5,7,0,1]
//int[] ar={9,6,4,2,3,5,7,0,1};
System.out.println(CyclicSort(ar));
System.out.println(Arrays.toString(ar));
}
//function

static int CyclicSort(int[] ar){
int i=0;
while(i<ar.length){
int correct=ar[i];
if(ar[i]<ar.length && ar[i]!=ar[correct]){
swap(ar,i,correct);

}else{
i++;
}

}

for(int index=0;index<ar.length;index++){
if(ar[index]!=index){
return index;
}
}



return ar.length;
}

static void swap(int[] ar,int first,int last){
int temp=ar[first];
ar[first]=ar[last];
ar[last]=temp;

}



}