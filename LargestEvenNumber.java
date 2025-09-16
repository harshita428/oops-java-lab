package Com.Sample;
import java.util.*;

public class LargestEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String unique = ""; // Step 1: collect unique digits
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch) && unique.indexOf(ch) == -1) {
                unique += ch; // add only if not already in string
            }
        }

        if (unique.equals("")) {
            System.out.println("-1");
            return;
        }

        // Step 2: sort digits manually in ascending order
        for (int i = 0; i < unique.length(); i++) {
            for (int j = i + 1; j < unique.length(); j++) {
                if (unique.charAt(i) > unique.charAt(j)) {
                    // swap characters using string
                    char a = unique.charAt(i);
                    char b = unique.charAt(j);
                    unique = unique.substring(0, i) + b + unique.substring(i + 1, j) + a + unique.substring(j + 1);
                }
            }
        }

        // Step 3: find smallest even digit
        int pos = -1;
        for (int i = 0; i < unique.length(); i++) {
            int d = unique.charAt(i) - '0';
            if (d % 2 == 0) {
                pos = i;
                break;
            }
        }

        if (pos == -1) { // no even digit
            System.out.println("-1");
            return;
        }

        // Step 4: build largest even number using only String
        String result = "";
        for (int i = unique.length() - 1; i >= 0; i--) {
            if (i != pos) {
                result += unique.charAt(i);
            }
        }
        result += unique.charAt(pos); // add smallest even digit at end

        System.out.println(result);

        sc.close();
    }
}
