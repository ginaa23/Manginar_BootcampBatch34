import java.util.Scanner;

public class Manginar_program2 {
    public static boolean isPrime(int number){
        if (number <= 1) return false;
        if (number <= 3) return true;
        if (number %2 == 0 || number %3 == 0) return false;
        for (int i = 5; i*i <= number; i +=6){
            if (number % i == 0 || number % (i + 2) == 0) return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input A: ");
        int A = scanner.nextInt();
        System.out.print("Input B: ");
        int B = scanner.nextInt();

        for (int x = A + 1; x <= B; x++){
            String output;

            if (x % 2 == 0){
                output = x + " is even";
            }else {
                output = x + " is odd";
            }

            if (isPrime(x)){
                output += " prime";
            }

            System.out.println(output);
        }

        scanner.close();
    }
}