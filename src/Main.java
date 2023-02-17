import java.util.Scanner;

public class Main {
        public static void main(String[] arg) {

            Scanner sc =new Scanner(System.in);

            System.out.println("Enter first number: ");
            long firstNumber = sc.nextLong();

            System.out.println("Enter second number: ");
            long secondNumber = sc.nextLong();

            long lcm = calculateLCM(firstNumber, secondNumber);

            System.out.println("LCM of " + firstNumber + " and " + secondNumber + " is = " + lcm);
        }
        static long calculateLCM(long n1,long n2){

            long i=2;
            long res = Math.max(n1, n2);
            long temp = res;

            while(res%n1 != 0 || res%n2 != 0) {
                res = temp*i;
                i++;
            }
            return res;

        }
}