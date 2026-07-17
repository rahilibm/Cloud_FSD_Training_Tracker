import java.util.Scanner;

public class challenge {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String user_string_1 = sc.nextLine();
        System.out.println("Enter another string: ");
        String user_string_2 = sc.nextLine();
        // System.out.println("You entered: " + user_string_1 + " and " + user_string_2);

        if(isAnagram(user_string_1, user_string_2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }

    public static boolean isAnagram(String str1, String str2) {
        if(str1.length() != str2.length()) {
            return false;
        }

        int[] charCount = new int[256];

        for(int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i)]++;
            charCount[str2.charAt(i)]--;
        }

        for(int count : charCount) {
            if(count != 0) {
                return false;
            }
        }

        return true;
    }
}
