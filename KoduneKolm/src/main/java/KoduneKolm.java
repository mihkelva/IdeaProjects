import java.util.Scanner;

public class KoduneKolm {
    public static void main(String[] args) {
        String eesnimi = "Mihkel";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mis on su nimi?");
        String nimi = scanner.nextLine();

        if(nimi.equals(eesnimi)){
            System.out.println("Mis on su vanus?");
            int age = Integer.parseInt(scanner.nextLine());
            if(age>18){
                System.out.println("Said klubisse sisse");
            }
        }
    }
}
