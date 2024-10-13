//Leet 125 Valid Pallindrome;

public class Leet_125_ValidPallindrome{

public static void main(String args[]){

String s="A man, a plan, a canal: Panama";

//System.out.println(StringPalin(s));

System.out.println(OptimizedPallinOnlyaz(s));

}


static boolean OptimizedPallinOnlyaz(String s){

  String lc = lowecaase(s);
        boolean b = palidromecheck(lc);
        return b;
    }

        static String lowecaase(String str){
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if(ch>='A' && ch<='Z' || ch>='a' && ch<='z'|| ch>='0' && ch<='9'){
			if(ch >='A'&& ch<='Z'){
				char lc = (char)('a'+ ch -'A');
				sb.append(lc); 
			}
			else {
				sb.append(ch);
			}
		  }
		}
		return sb.toString();
	}
    
    static boolean palidromecheck(String str ){
		int l =0;
		int r = str.length()-1;
	    while(l<r){
	     char lc = str.charAt(l);
	     char rc = str.charAt(r);
	     if(lc == rc){
	     	l++;
	     	r--;
	     }
	     else{
	     	return false;
	     }
	    }
	    return true;
	}


//function

static boolean StringPalin(String s){

String res="";

for(int i=0;i<s.length();i++){

if(s.charAt(i)>=3 && s.charAt(i)<=64){

}else{
res+=s.charAt(i);
}


}

String newres="";

newres+=res.toLowerCase();

//checking if pallin or not

int start=0;
int end=newres.length()-1;


while(start<end){

if(newres.charAt(start)!=newres.charAt(end)){

return false;
}

start++;
end--;

}


System.out.println(res);
return true;

}




}