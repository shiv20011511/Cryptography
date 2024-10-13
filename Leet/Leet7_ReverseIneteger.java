//Leet 7. Reverse Integer

public class Leet7_ReverseIneteger{
public static void main(String args[]){
//int x=451;
//int x=-321;
//int x=120;
//int x = 1534236469;
int x=-121;
//System.out.println(ReverseInt(x));

System.out.println(ispallindrome(x));

}

static int ReverseInt(int x){

int num=0;
int org=x;

while(org!=0){
int reminder=org%10;


org=org/10;

System.out.println("Int Max Value -- >> "+Integer.MAX_VALUE/10);

System.out.println("Num -->> "+num);


// Check for overflow
if (num > Integer.MAX_VALUE/10 || (num == Integer.MAX_VALUE / 10 && reminder > 7)) return 0;
            
if (num < Integer.MIN_VALUE/10 || (num == Integer.MIN_VALUE / 10 && reminder < -8)) return 0;
            
            
num=num*10+reminder;


}


System.out.println(num);


return num;
}


//Leet 9. Palindrome Number
//to check if a Number is pallindrome or not
static boolean ispallindrome(int x){
int num=0;
int org=x;


//according to Question no Negative number is considered
if(x<0){
    return false;
}



while(org!=0){
int rem=org%10;

org=org/10;
num=num*10+rem;


}

if(num==x){
return true;
}else{
return false;
}


}





}
