import java.util.Scanner;

public class Manginar_program1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.print("b: ");
        int b = scanner.nextInt();
        scanner.close();

        //menukar nilai a dan b
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("swap numbers: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
