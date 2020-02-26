import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("Sisesta soovitud kuu: ");
        Scanner scanner = new Scanner(System.in);
        int sisend = Integer.parseInt(scanner.nextLine());

        switch (sisend) {
            case 77:
                System.out.println("See keel on Java");
                break;
            case 1234:
                System.out.println("PHP");
                break;
            case 4444:
                System.out.println("JavaScript");
                break;
            case 2121:
                System.out.println("Python");
                break;
            case 7890:
                System.out.println("Kotlin");
                break;
            case 6:
                System.out.println("Kuu on juuni");
                break;
            case 7:
                System.out.println("Kuu on juuli");
                break;
            default:
                System.out.println("Sisestasid vale koodi");
        }
    }
}
