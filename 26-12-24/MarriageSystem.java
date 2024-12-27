import java.util.*;
public class MarriageSystem{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;char ch;
        System.out.println("Enter You are male or female :M/F");
        ch = input.next().charAt(0);
        if(ch=='m' || ch=='M'){
            System.out.println("Enter Your age :");
            age = input.nextInt();
            if(age<=0) System.out.println("Invalid age : " + age);
            else if(age>=21 && age<=40){
                System.out.println("Valid age for marriage : " + age);
            }
            else{
                System.out.println("Invalid age for marriage : " + age);
            }
        }
        else if(ch=='f' || ch=='F'){
            System.out.println("Enter Your age :");
            age = input.nextInt();
            if(age<=0){
                System.out.println("Invalid age : " + age);
            }else if(age>=18 && age<=35){
                System.out.println("Valid age for marriage : " + age);
            }else{
                System.out.println("Invalid age for marriage : " + age);
            }
        }
        else{
            System.out.println("Invalid input. Please enter M or F.");
            return;
        }
    }
}