import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        isPalindrome(sc.nextLine());
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
    public static boolean isPalindrome(String str) {
        str = wipe(str);
        for(int i = 0, int o = str.length; 
    }
    public static String wipe(String str){
        str = str.trim();
        str = str.toLowerCase();
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        return str;
    }
}
