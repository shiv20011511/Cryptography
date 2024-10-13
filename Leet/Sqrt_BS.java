//find sqrt for number (leet 69. Sqrt(x))

public class Sqrt_BS{
public static void main(String args[]){
//int n=0;
//int n=214739;
//int n=256;
int n=14;	
System.out.println("Square root of -- > "+n +"-->> "+BinarySearch(n));

}
//through binary search

static int BinarySearch(int n){

int start=2;
int end=n/2;

if(n==0){
return 0;
}

if(n==1){
return 1;
}


while(start<=end){
long mid=start+(end-start)/2;

long sum=mid*mid;
System.out.println("sum ->--------> "+sum);
System.out.println("Mid ---------- "+mid);
System.out.println("Start >>>>>>>>> "+start);
System.out.println("End ********* "+mid);
if(sum==n){
return (int)mid;
}else if(sum<n){
start=(int)mid+1;
}else{
end=(int)mid-1;
//return end;
}
}
return end;
}


}