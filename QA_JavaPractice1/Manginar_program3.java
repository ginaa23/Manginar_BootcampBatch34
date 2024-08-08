import java.util.Scanner;

public class Manginar_program3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        String input = scanner.nextLine();
        scanner.close();

        String output = processString(input);
        System.out.println("Output: "+ output);
    }

    public static String processString(String input){
        input = input.toUpperCase();
        input = replacenumber(input);
        input = removevowel(input);
        return input;
    }

    public static String replacenumber(String input){
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()){
            switch (c){
                case '0': result.append("nol"); break;
                case '1': result.append("satu"); break;
                case '2': result.append("dua"); break;
                case '3': result.append("tiga"); break;
                case '4': result.append("empat"); break;
                case '5': result.append("lima"); break;
                case '6': result.append("enam"); break;
                case '7': result.append("tujuh"); break;
                case '8': result.append("delapan");break;
                case '9': result.append("sembilan"); break;
                default:result.append(c);;
            }
        }
        return result.toString();
    }
    public static String removevowel(String input){
        return input.replaceAll("[AIUEO]", "");
    }
}