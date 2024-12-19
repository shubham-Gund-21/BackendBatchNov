import java.util.*;
public class Calculation{
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
        // assignment operators
        int x=20, y=5;
        System.out.println("addition: " + (x += y));
        System.out.println("subtraction: " + (x -= y));
        System.out.println("multiplication: " + (x *= y));
        System.out.println("division: " + (x /= y));
        System.out.println("modulus: " + (x %= y));
        // comparison operators
        int p,q;
        p = 10; q = 20;
        System.out.println("p is greater than q: " + (p > q));
        System.out.println("p is less than q: " + (p < q));
        System.out.println("p is equal to q: " + (p == q));
        System.out.println("p is not equal to q: " + (p!= q));
        System.out.println("P is greater than or equal to q: " + (p >= q));
        System.out.println("p is less than or equal to q: " + (p <= q));
    }
}