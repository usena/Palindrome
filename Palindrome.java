import java.util.Scanner;
import java.util.*;
public class Palindrome {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String: ");
        char[] word = input.nextLine().toCharArray();
        Stack<Character> flipWord = new Stack<>();
        for (int j=0;j<word.length;j++){
            flipWord.push(word[j]);
        }
        boolean verified = true;
        for (int i=0;i<word.length;i++){
            if (flipWord.pop().equals(word[i])){
                continue;
            }else{
                verified = false;
                break;
            }
        }
        if (verified==false){
            System.out.println("THAT IS A NOT PALINDROME!");
        }else{
            System.out.println("THAT IS A PALINDROME!");
        }
    }
}
