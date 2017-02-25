package random.javacode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author amitoshseu
 */

public class RandomJavaCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter no");
        int no = Integer.parseInt(reader.readLine());
        
        StringBuffer b = new StringBuffer(no+"");
        b.reverse();
        String x = b.toString();
        int rev = Integer.parseInt(x);
        if(no ==rev)
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Nope");
        }
    }
    
}
