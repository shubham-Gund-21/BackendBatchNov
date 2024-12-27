import java.util.*;
public class Division{
 public static void main(String[] args){
    float x, y,result;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the first number: ");
    x = input.nextFloat();
    System.out.println("Enter the second number: ");
    y=input.nextFloat();
    result = x / y;
    System.out.println("Result: "+result);
 }
}