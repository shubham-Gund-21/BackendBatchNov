import java.util.*;
class positive{
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        num = input.nextInt();
        if(num<0){
            System.out.println("Number is negative");
        }
        else if(num==0){
            System.out.println("Number is zero");
        }
        else{
            System.out.println("Number is positive");
        }
    }
}