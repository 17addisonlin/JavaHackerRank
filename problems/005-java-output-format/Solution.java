import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");

        for (int i = 0; i < 3; i++) {
            String inputText = sc.next();
            int inputNum = sc.nextInt();

            // %-15s -> left-justified string, 15 characters wide
            // %03d  -> integer padded with leading zeroes, 3 digits wide
            // %n    -> platform-independent newline
            System.out.printf("%-15s%03d%n", inputText, inputNum);
        }

        System.out.println("================================");

        sc.close();
    }
}
