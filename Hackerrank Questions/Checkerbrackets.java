import java.util.Scanner;

public class Checkerbrackets
{
    
	public static void main(String[] args){
        // Solution s=new Solution();
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		for(int j=0;j<testCases;j++){
			String pattern = in.nextLine();
          	//Write your code
        // s.checker(pattern);     
        int o1=0;
        int c1=0;
        int o2=0;
        int c2=0;
        int l=pattern.length();
        for(int i=0;i<pattern.length();i++){
            
            if(pattern.charAt(i)=='('){
                o1++;
            }else if(pattern.charAt(i)=='['){
                o2++;
            }else if(pattern.charAt(i)==')'){
                c1++;
            }
            else if(pattern.charAt(i)==']'){
            c2++;
            }
        }
	int ocl=o1+o2+c1+c2;
        if (o1!=c1 || o2!=c2){
            System.out.println("Invalid");
            
        }else if(ocl==l){
            System.out.println("Invalid");
        }
        else if(o1==c1 && o2==c2){
            System.out.println("Valid");
        }
        else if(o1==0 && c1==0 || o2==0 && c2==0){
            System.out.println("Valid");
        }    
              
        }
        
    } 
              
		}
        
	
    