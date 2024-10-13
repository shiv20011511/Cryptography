//leet 43 Multiply Strings 

//consist of two integers in string format not using inbuilt library for multiplying



public class Leet_43{
public static void main(String args[]){
String s1="2";
String s2="3";
System.out.println(MultiplyStrings(s1,s2));
}

static String MultiplyStrings(String 
num1,String num2){
  if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int len1 = num1.length();
        int len2 = num2.length();
        // Initialize result array
        int[] result = new int[len1 + len2];

        // Reverse iterate over digits of num1 and num2
        for (int i = len1 - 1; i >= 0; i--) {
            for (int j = len2 - 1; j >= 0; j--) {
                // Calculate the product of digits
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                // Determine the position in the result array
                int p1 = i + j;
                int p2 = i + j + 1;
                // Sum up with previous value at position p2
                int sum = mul + result[p2];
                // Update the result array with carry and the current digit
                result[p2] = sum % 10;
                result[p1] += sum / 10;
            }
        }

        // Convert result array to string, skipping leading zeros
        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            if (!(sb.length() == 0 && num == 0)) { // Skip leading zeros
                sb.append(num);
            }
        }

        return sb.length() == 0 ? "0" : sb.toString();


}


}