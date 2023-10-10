import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        // Declare variables
        Scanner sc = new Scanner(System.in);
        int num;

        // Obtain number from user
        System.out.print("Please enter a number to be evaluated: ");
        num = sc.nextInt();

        System.out.println(isPrime(num));

        // Close Scanner
        sc.close();


    }

    static boolean isPrime (int num){
            if (num<=1){
                return false;
            }
            for (int i = 2; i<= Math.sqrt(num)/2;i++){
                if (num%i == 0) return false;
            }
            return true;

        }
}
