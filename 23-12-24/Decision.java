import java.util.*;
public class Decision{
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = input.nextInt();
        if (num > 0) {
            System.out.println("Number is positive");
        }
        else if (num < 0) {
            System.out.println("Number is negative");
        } 
        else{
            System.out.println("Number is zero");
        }
        
    }
}