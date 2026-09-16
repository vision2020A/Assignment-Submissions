import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        compressString(sc.nextLine());
    }
    public static void compressString(String str) {
        int count = 1;
        str = str.trim();
        str = str.toLowerCase();
        String compressed = "";
        int ext = 0;
        char[] arr = str.toCharArray();
        for(int fullCount = 0; fullCount < arr.length-1; fullCount++) {
            ext = fullCount;
            if(arr[fullCount] == arr[fullCount + 1]) {
                count++;
            }
            else{
                compressed+= arr[fullCount]+""+count;
                count = 1;
                
            }
        }
        compressed+= arr[ext]+""+count;
        System.out.println(compressed);
    }
    public static void isPalindrome(String str) {
        str = str.trim();
        str = str.toLowerCase();

    }
}
