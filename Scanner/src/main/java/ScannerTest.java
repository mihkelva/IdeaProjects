import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        System.out.println("Mihkel");

        Scanner scanner = new Scanner(System.in);
        String muutuja = scanner.nextLine();
        String koer = scanner.nextLine();
        String kass = scanner.nextLine();
        String neljasMuutuja = scanner.nextLine();
        int muutujaNumbrina = Integer.parseInt(muutuja);
        int teineMuutujaNumbrina = Integer.parseInt(koer);
        int kolmasMuutujaNumbrina = Integer.parseInt(kass);
        int neljasMuutujaNumbrina = Integer.parseInt(neljasMuutuja);

        if(muutujaNumbrina == teineMuutujaNumbrina && muutujaNumbrina == kolmasMuutujaNumbrina && muutujaNumbrina == neljasMuutujaNumbrina){
            System.out.println("Kõik arvud on võrdsed");
        } else if(muutujaNumbrina == teineMuutujaNumbrina || muutujaNumbrina == kolmasMuutujaNumbrina || muutujaNumbrina == neljasMuutujaNumbrina) {
            System.out.println("Vähemalt kaks arvu on võrdsed");
        } else {
            System.out.println("Kõik arvud on erinevad");
        }
    }
}
