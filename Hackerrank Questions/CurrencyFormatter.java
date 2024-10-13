import java.util.*;
import java.text.*;

public class CurrencyFormatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        NumberFormat usa=NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat cn=NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat fr=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat indian=NumberFormat.getCurrencyInstance(new Locale("en","in"));
        String us=usa.format(payment);
        String india=indian.format(payment);
        String france=fr.format(payment);
        String china=cn.format(payment);
        
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}