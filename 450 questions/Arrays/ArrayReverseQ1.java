import java.util.Arrays;
//to reverse the array

class ArrayReverseQ1{
public static void main(String args[]){
//int[] n={1,2,3,4,5,55,66,6,7,8,9,10,101,201};
int[] n={0,1};
//arrreverse(n);
int[] z=originalarrayreverse(n);
System.out.print(Arrays.toString(z));

}

//below function only display the reverse elements of an array
static void arrreverse(int[] n){
int len=n.length-1;
for(int i=len-1;i>=0;i--){
System.out.print(n[i]+" ");
}
}


//original array reverse
static int[] originalarrayreverse(int[] n){
int len=n.length;
int count=0;

for(int i=len-1;i>=0;i--){
int start=n[count];
int last=n[i];
if(count > i || count==i){
break;
}else{
System.out.println("start temp"+start);
System.out.println("last"+last);
n[count++]=last;
n[i]=start;
}
}

return n;

}




}