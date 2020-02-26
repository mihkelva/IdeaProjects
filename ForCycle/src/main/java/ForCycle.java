import java.util.Scanner;

public class ForCycle {
    public static void main(String[] args) {
        for (int i = 2; i < 15; i++) {
            System.out.println(i);
            if(i == 7){
                i = 9;
            }
            if(i==12){
                break;
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Mitu korda soovid öelda ˇHurraaˇ?");
        int muutuja = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < muutuja; i++) {
            System.out.println((i+1) + ". korda ˇhurraaˇ");
        }

        System.out.println("Iga mitmendat arvu soovid?");
        int muutujaKaks = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < 10; i = i + muutujaKaks) {
            System.out.println(i);
        }

        System.out.println("Mis sõna soovid 10 korda korrata?");
        String suvalineMuutuja = scanner.nextLine();
        for (int i = 0; i < 10; i = i + 1) {
            System.out.println((i+1) + ". " + suvalineMuutuja);
        }
    }
}
