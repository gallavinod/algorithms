package algorithms.runner;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);    
        double d = in.nextDouble();
        
        System.out.println(NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(d));
        
    }

}
