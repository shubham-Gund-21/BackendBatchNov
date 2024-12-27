import java.util.*;
public class Newvowel{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch;
        System.out.print("Enter a letter: ");
        ch = sc.next().charAt(0);
        ch = Character.toLowerCase(ch);
        if(ch == 'a' || ch == 'e' || ch == 'i' ||
        ch == 'o' || ch == 'u' ){
            System.out.println(ch + " is a vowel");
        }else{
            System.out.println(ch + " is consonant");
        }
    }
}