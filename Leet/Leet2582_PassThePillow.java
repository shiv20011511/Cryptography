//Leet 2582 Pass The Pillow 

public class Leet2582_PassThePillow{
public static void main(String args[]){

int n=8;
int time=9;

//System.out.println(Passpillow(n,time));
System.out.println(pillowmaths(n,time));
}

//solving By Maths approach
static int pillowmaths(int n,int time){
int rounds=time/(n-1);
System.out.println("Rounds -->> "+rounds);
int ans=0;

if(rounds%2==0){
ans=(1+time%(n-1));
System.out.println("round is even -->> "+ans);
}else{
ans=(n-time%(n-1));
System.out.println("Round is odd -->> "+ans);
}


return ans;
}




//solving by without Maths
static int Passpillow(int n,int t){
int holder=1;

while(t>0){
while(holder<n && t>0){
System.out.println("Holder ++ -->> "+holder);
holder++;
t--;
}

while(holder>1 && t>0){
System.out.println("Holder -- -->> "+holder);
holder--;
t--;
}
System.out.println("Holder -->> "+holder);


}

return holder;

}


}