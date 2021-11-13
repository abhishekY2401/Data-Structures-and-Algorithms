/*
   Reverse String
   Write a function that reverses a string. The input string is given as an array of characters s.

   string = "abhishek" = ["a", "b", "h", "i", "s", "h", "e", "k"]
   string = "kehsihba" = ["k", "e", "h", "s", "i", "h", "b", "a"]

   Example 1:

    Input: s = ["h","e","l","l","o"]
    Output: ["o","l","l","e","h"]
    Example 2:

    Input: s = ["H","a","n","n","a","h"]
    Output: ["h","a","n","n","a","H"]
*/


import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }

    public static void reverseString(char[] s) {
        char ch, temp;
        // calculate the length of char array
        int n = s.length - 1;

        // identifying how many iterations do we need to reverse the whole
        // character array.
        int stop = (n/2)+1;

        // iterative way
        for (int i=0; i<stop; i++) {
            ch = s[i];
            temp = s[n-i];

            // insert the first char at temp location and last char at
            // ch position
            s[i] = temp;
            s[n-i] = ch;
        }
    }

}
