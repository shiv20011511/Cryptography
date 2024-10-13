//to find min max elements in an array

class MinMAxelements{
public static void main(String args[]){
int[]	arr={1,2,3,4,5,6,7,8,9};
int el=minmax(arr);
System.out.println(el);
}

static int minmax(int[] a){
int len=a.length;
int smallest=0;
int largest=0;

for(int i=0;i<len;i++){

for(int j=i+1;j<len-1;j++){
if(a[i]<a[j]){
smallest=a[i];
}else{
smallest=a[j];
}

}

}

//return largest;
return smallest;

}




}