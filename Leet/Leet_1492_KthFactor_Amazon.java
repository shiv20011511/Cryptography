//Leet 1492. The kth Factor of n

import java.util.Arrays;

public class Leet_1492_KthFactor_Amazon{

public static void main(String args[]){
int n=1;
int k=1;

System.out.println("Kth Factor -->> "+KthFactor(n,k));

System.out.println("-->> "+1%1);

}

//using Brute Force to first solve the problem
//kth factor
static int KthFactor(int n,int k){
int ks=0;
for(int i=1;i<=n;i++){
if(n%i==0){

ks++;
System.out.println("Ks -->> "+ks+"** I's -->>"+i);
}

if(n%i==0 && ks==k){
return i;
}

}

return -1;
}

}