import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(sum(5,10));
        System.out.println(sumString(3,5));

        System.out.println(customerInShop(1,"rot"));

        System.out.println("Bitte zu überprüfenden String eingeben:");
        Scanner scanner = new Scanner(System.in);
        String testString = scanner.nextLine();
        System.out.println(checkString(testString));
        System.out.println("Überprüfung von eingegebenem String \"" + testString +"\": \n Länge > 20: " + checkLength(testString) + "\n" + " enthält \"fancy\": " + containsFancy(testString));
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

        System.out.println("Summe = " + sum(value1, value2));
    }
    public static boolean checkLength(String input) {
        return input.length() > 20;
    }
    public static boolean containsFancy(String input) {
        return input.contains("fancy");
    }
    //Beide Überprüfungen eines Strings in einer Methode
    public static boolean checkString(String input){
        return input.length() > 20 || input.contains("fancy");
    }
    public static String checkPeopleInShop(int numberOfPeople) {
        if (numberOfPeople >= 30) {
            return "Too many people";
        } else
            return "limit not exceeded";
    }
    public static String customerInShop (int customers, String alertLevel) {
        int limit;
        switch (alertLevel) {
            case "rot":
                limit = 0;
                break;
            case "gelb":
                limit = 30;
                break;
            case "grün":
                limit = 60;
                break;
            default:
                return "Shop closed.";
        }
        if (customers >= limit) {
            return "Too many customers";
        } else
            return "limit not exceeded";
    }
}