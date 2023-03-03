import java
public class Pangram {
    public static void main(String[] args) {
        
        System.out.println("Please enter any sentence you would like to check for a pangram.");
        Scanner scnr = new scnr
        
        
        //String s = "The quick brown fox jumps over the lazy dog";

        boolean[] mark = new boolean[26];
        int index = 0;
        boolean pangram = true;

        for (int i = 0; i < s.length(); i++) {

            char cur = s.charAt(i);

            if (cur >= 'A' && cur <= 'Z') {
                index = cur - 'A';
            } else if (cur >= 'a' && cur <= 'z') {
                index = cur - 'a';
            }
            mark[index] = true;
        }
        for (int i = 0; i < mark.length; i++) {
            if (mark[i] == false) {
                pangram = false;
            }

        }
        if (pangram) {
            System.out.println("You have a pangram!");
        } else {
            System.out.println("Sorry, this is not a pangram.");
        }
    }
}
