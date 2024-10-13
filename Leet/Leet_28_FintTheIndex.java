//Leet 28 Find the Index of the First Occurrence in a String

public class Leet_28_FintTheIndex{

public static void main(String[] args){

//String s="leetcode";
//String needle="ee";

String s="mississippi";
String needle="issip";



System.out.println(FirstOccurence(s,needle));

}

//function that return First Occurence

static int FirstOccurence(String s,String target){
int count=0;
for(int i=0;i<(s.length()-target.length())+1;i++){

if(s.charAt(i)==target.charAt(0)){

boolean res=Compare(s,target,i);

if(res){
return i;

}


}


}

return -1;
}

//function that compare rest

static Boolean Compare(String s,String target,int idx){



for(int j=0;j<target.length();j++){

if(s.charAt(idx++)!=target.charAt(j)){
return false;

}


}

return true;

}



}