import java.util.Scanner;

public class Fac {
    public static int factorial(int num) {
        int fac = 1;
        for (int i = 1; i != num+1; i++) {
            fac *= i;
        }
        return fac;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        sc.close();
        
        int fac = factorial(num);
        System.out.println("The Factorial of the number is " + fac);
    }
}
