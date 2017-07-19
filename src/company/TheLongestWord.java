package company;

import java.util.Scanner;

public class TheLongestWord {
    public TheLongestWord() {
    }

    public static void main(String[] args) {
        int maxLength = 0;
        String theLongestWord = "";
        System.out.println("Input 5 words: ");
        Scanner sc = new Scanner(System.in);
        String[] words = new String[5];

        int j;
        for(j = 0; j < words.length; ++j) {
            words[j] = sc.next();
        }

        for(j = 0; j < words.length; ++j) {
            if(maxLength < words[j].length()) {
                maxLength = words[j].length();
                theLongestWord = words[j];
            }
        }

        System.out.print("The longest word is: " + theLongestWord + " and it's length = " + maxLength);
    }
}
