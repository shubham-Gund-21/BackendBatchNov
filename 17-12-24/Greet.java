import java.util.Scanner;
class Greet{
    public static void main(String[] args){
        String name;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        name = input.nextLine();
        System.out.println("Hello! "+name);
    }
}