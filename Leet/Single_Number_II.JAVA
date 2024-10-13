//Leet code question Single Number 11

public class Single_Number_2{
public static void main(String[] args){

int[] ar={2,2,3,2};
Singleoccurence(ar);

}

static void Singleoccurence(int[] ar){
int result=0;

for(int i=0;i<ar.length;i++){

result^=ar[i];
}

System.out.println(result);

}




}