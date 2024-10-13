//Leet 2413. Smallest Even Multiple (That can be divisible by 2 and n)


public class Leet_2413_Smallest_Even_Multiple{

public static void main(String[] args){

int n=75;

System.out.println(GetSmallestEven(n));
}

static int GetSmallestEven(int n){

if(n%2==0){
return n;
}else{
return n*2;
}


/*
if(n==1){
return 2;
}


for(int i=n;i<n*n;i++){
if(i%2==0 && i%n==0){
return i;
}

}

return -1;
*/


}



}