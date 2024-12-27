import java.util.*;
public class Potential{
    public static void main(String args[]){
        float m,g,h,PE;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Mass :");
        m = scanner.nextFloat();
        System.out.println("Enter gravitational constant :");
        g = scanner.nextFloat();
        System.out.println("Enter height :");
        h = scanner.nextFloat();
        PE=m*g*h;
        System.out.println("Potential Energy : "+PE);

    }
}