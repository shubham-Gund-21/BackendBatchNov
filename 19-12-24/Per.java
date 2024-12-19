import java.util.Scanner;
public class Per{
    public static void main(String[] args) {
        float m1, m2, m3, m4, m5,total,per;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st subject marks : ");
        m1 = input.nextFloat();
        System.out.println("Enter 2nd subject marks : ");
        m2 = input.nextFloat();
        System.out.println("Enter 3rd subject marks : ");
        m3=input.nextFloat();
        System.out.println("Enter 4th subject marks : ");
        m4=input.nextFloat();
        System.out.println("Enter 5th subject marks : ");
        m5 = input.nextFloat();
        total = m1 + m2 + m3 + m4 + m5;
        System.out.println("Total marks is " + total);
        per = (total / 500) * 100;
        System.out.println("Percentage is " + per + "%");
    }
}
