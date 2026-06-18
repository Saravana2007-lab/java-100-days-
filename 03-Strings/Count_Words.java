//counts the words
//author Saravana
import java.util.Scanner;


public class Count_Words {
   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a sentence");
        String line = sc.nextLine();
        int wordCount = 0;

        for (int i = 0; i < line.length(); i++) {
            if (i == 0 || line.charAt(i - 1) == ' ') {
                wordCount++;
            }
        }
        System.out.println("Number of words: " + wordCount);
        sc.close();
    }
}
