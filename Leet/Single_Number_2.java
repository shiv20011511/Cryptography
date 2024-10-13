//Leet code question Single Number 11
import java.util.Arrays;
public class Single_Number_2{
public static void main(String[] args){

//int[] ar={0,1,0,1,0,1,99};
int[] ar={3000,500,100,3000,100,3000,100};
//int[] ar={2,2,3,2};
//Singleoccurence(ar);

System.out.println("Single Element -->> "+FindSingle(ar));

}

static void Singleoccurence(int[] ar){
int result=0;

for(int i=0;i<ar.length-1;i++){

//System.out.println(result);

}


}


//approach to sort elemts after that search
static int FindSingle(int[] ar){
Arrays.sort(ar);

System.out.println(Arrays.toString(ar));

//boundary condition 1
if(ar[0]!=ar[1]){
return ar[0];
}

//boundary condition 2
if(ar[ar.length-1]!=ar[ar.length-2]){
return ar[ar.length-1];
}


for(int i=1;i<ar.length;i++){

System.out.println(ar[i]+i);

if(ar[i]==ar[i-1]){
i+=2;
}else if(ar[i]!=ar[i-1]){
return ar[i-1];
}


}


return -1;
}




}