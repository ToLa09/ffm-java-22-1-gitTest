import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(sum(5,10));
        System.out.println(sumString(3,5));
        System.out.println(getSum());
    }
    public static int sum(int value1, int value2) {
        return value1 + value2;
    }
    public static String sumString(int value1, int value2) {
        int result = value1 + value2;
        return "Summe: " + result;
    }
    public static int getSum() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte erste Zahl eingeben!");
        int value1 = scanner.nextInt();
        System.out.println("Bitte zweite Zahl eingeben!");
        int value2 = scanner.nextInt();

        return sum(value1, value2);
    }
}