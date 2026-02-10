import java.util.*;

// Class name must match the filename "reverse.java"
public class reverse { 
    
    // Logic to reverse digits
    public int reverseNumber(int n) {
        long revNum = 0; 
        
        while (n != 0) { 
            int lastDigit = n % 10;
            revNum = revNum * 10 + lastDigit;
            n = n / 10;
        }

        // Check for 32-bit integer overflow
        if (revNum > Integer.MAX_VALUE || revNum < Integer.MIN_VALUE) {
            return 0; 
        }

        return (int) revNum;
    }

    public static void main(String[] args) {
        reverse obj = new reverse();
        int num = 12345;
        System.out.println("Reversed: " + obj.reverseNumber(num));
    }
}