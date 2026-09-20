import java.util.*;
import java.util.Arrays;
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(isRotated(sc.next(), sc.next()));
    }
    public static String compressString(String str) {
        int count = 1;//declares count.
        str = wipe(str);//cleans the string
        String compressed = "";//declares the compressed variable for construction
        int ext = 0;//declares the extra
        char[] arr = str.toCharArray();//makes the clean string into a array
        Arrays.sort(arr);//sorts array.
        for(int fullCount = 0; fullCount < arr.length-1; fullCount++) {//simple for loop for entirety of arr
            ext = fullCount;
            if(arr[fullCount] == arr[fullCount + 1]) {
                count++;
            }
            else{
                compressed+= arr[fullCount]+""+count;//if the next character is not equal, add the count of the
                count = 1;
                
            }
        }
        compressed+= arr[ext]+""+count;
        System.out.println(compressed);
        return compressed;
    }
    public static boolean isPalindrome(String str) {
        str = wipe(str); //clears any spaces or gaps.
        char[] arr = str.toCharArray(); //makes a array of characters out of the cleared input
        int o = str.length()-1; //sets up the o variable to check through both ends.
        for(int i = 0;i<=o;i++){//makes a for loop to check both sides
            if(arr[i] != arr[o]){//if one of the sides of the word isnt the same, then it returns false
                return false;
            }
            o--;//-1 from o sense we cant do that in the for loop.
        }
        return true;
    }
   public static boolean isEven(String str){//aabbcc - true , aabbccc - false
        str = wipe(str);
        boolean bol = true;
        char[] chars = str.toCharArray();
        Arrays.sort(chars);//changes str to a char array (aababb->aaabbb) true
        int curVal = 0;//sets current value
        int tarVal = 0;//sets up length tracking
        for(int i=0;i<chars.length;i++){
            curVal+=1;//increments by 1 every loop.
            if(i!=(chars.length-1)){//checks if it's not at the last, (-1 to account for point 0)

                if(chars[i]!=chars[i+1]){//checks if not equal to next
                    System.out.println(chars[i]+", "+chars[i+1]+", "+(chars[i]==chars[i+1]));//debug check.
                    if(tarVal==0){//if tar val not set, set it as cur, then reset cur.
                        tarVal=curVal;
                        curVal=0;
                        System.out.println("0");//debug check.
                    }
                    else if(tarVal==curVal){//if tar value set, and cur=tar, then reset cur.
                        curVal=0;
                        System.out.println("1");//debug check.
                    }
                    else{//if tar value set and not equal to cur, set boolean tracker to false.
                        System.out.println("2");//debug check
                        return false;

                    }
                }
            }
        }
        bol = (curVal==tarVal);//final check to see if current=target
        return bol;//return result.
   }
   public static boolean isRotated(String str1, String str2){//"gone" -> "oneg" true, ong -> onge false
        str1 = wipe(str1);
        str2 = wipe(str2);
        String combine = str1+str1;//makes a doubled version of original, gone->gonegone. Contains any variation of rotation.
        if((str2.length())!=(str1.length())){return false;}//checks if they are the same length
        else if(str2.equals(str1)){return true;}//checks if they are the same
        else if(combine.contains(str2)){//concatinates to find if they are rotated.
            return true;
        }
        else{//if concatination doesnt contain the string, then it isnt true.
            return false;
        }
   }
    public static int findPeakIndex(int[] arr){

    }














    //givin space
    public static String wipe(String str){//cleans strings.
        str = str.toLowerCase();
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        return str;
    }
}
