import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("================================");
            
            for(int i=0;i<3;i++){
                String s1 = sc.next();
                int x = sc.nextInt();
                System.out.printf("%-15s%03d%n", s1, x);
            }
            System.out.println("================================");

    }
}

// The String Component: %-15s
// %: The "lead-in" character that tells Java a format specifier is starting.

// -: This is a flag that means left-justified. By default, Java pads with spaces on the left; the minus sign forces the text to the left and puts the spaces on the right.

// 15: This is the width. it ensures the column is exactly 15 characters wide. If your string (like "java") is shorter, Java adds trailing spaces to fill the gap.

// s: The conversion character for a String.

// The Integer Component: %03d
// %: Starts the second specifier.

// 0: This flag tells Java to use zero-padding instead of space-padding.

// 3: The width for this column. It ensures the number takes up at least 3 characters.

// d: The conversion character for a decimal integer (base 10).

// Example: If x is 65, this becomes 065. If x is 7, it becomes 007.

// The Newline: %n
// %n: This is a platform-independent newline character. While \n works on most systems, %n is preferred in printf because it automatically uses the correct newline separator for whatever operating system (Windows, Mac, or Linux) the code is running on.

// The Arguments: s1, x
// These are the variables that fill the "slots" you created.

// s1 matches the first specifier (%-15s).

// x matches the second specifier (%03d).