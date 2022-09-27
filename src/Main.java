import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(sum(5,10));
        System.out.println(sumString(3,5));
        String testString = "this is fancy shit";
        System.out.println(checkString(testString));
        System.out.println("Länge > 20: " + checkLength(testString) + "\n" + " und enthält \"fancy\": " + containsFancy(testString));
        printSum();
    }
    public static int sum(int value1, int value2) {
        return value1 + value2;
    }
    public static String sumString(int value1, int value2) {
        int result = value1 + value2;
        return "Summe: " + result;
    }
    public static void printSum() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte erste Zahl eingeben!");
        int value1 = scanner.nextInt();
        System.out.println("Bitte zweite Zahl eingeben!");
        int value2 = scanner.nextInt();

        System.out.println(sum(value1, value2));
    }

    public static boolean checkString(String input){
        return input.length() > 20 || input.contains("fancy");
    }
    public static boolean checkLength(String input) {
        return input.length() > 20;
    }
    public static boolean containsFancy(String input) {
        return input.contains("fancy");
    }
}