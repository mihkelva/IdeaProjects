import java.util.Scanner;

public class WhileCycles {
    public static void main(String[] args) {
        int i = 5;


        String s6na = "Sõna";
        if(s6na.equals("Sõna")){
            System.out.println("Jah!");
        } else {
            System.out.println("Ei..");
        }




        Scanner scanner = new Scanner(System.in);
//        i = Integer.parseInt(scanner.nextLine());
      /*  for (; i <= 10;) {
            System.out.println("Tsükkel toimib");
            i = Integer.parseInt(scanner.nextLine());
        }           */

//        while(i<10){
//            System.out.println("Tsükkel toimib");
//            i = Integer.parseInt(scanner.nextLine());
//            if(i == 5){
//                break;
//            }
//        }

        String muutuja = "yes";
        // ! märk tähendab vastupidist !muutuja.equals("tere") tähendab EI võrdu terega
        // praegu kestab While tsükkel kuni me kirjutame "muutuja" väärtuseks tere --> kui ta saab väärtuseks "tere", siis lõppeb, kui kirjutame midagi muud, siis kestab
        // kui meil oleks While tsükli sees -> while(muutuja.equals("tere")), see tähendab, et ta kestab kuni muutuja väärtus on "tere". Kui kirjutame midagi muud, siis lõppeb.
        while(!muutuja.equals("tere")){
            System.out.println("Ütle üks number!");
            for (int j = 6; j < 11; j++) {
                int number = Integer.parseInt(scanner.nextLine());
                if(number == 3){
                    // %d tähendab et me ootame lause sisse arvulist muutujat
                    // %s tähendab, et me ootame lause sisse sõnalist muutujat
                    // %n on reavahetus
                    // NB! pärast koma muutujaid peab olema SAMA PALJU kui on %s ja %d "kutseid" lauses
                    // piltlikult öeldes asendame kõik %d'd lauses paremal pool olevate arvuliste muutujatega ja %s'id lauses paremal pool olevate sõnaliste muutujatega
                    System.out.printf("Vastasid: %d. Oled vastanud %d korda %n", number, j-5);
                    System.out.println("Vastasid õigesti!");
                    break;
                }  else if (number == 4){
                    System.out.printf("Vastasid: %d. Oled vastanud %d korda %n", number, j-5);
                    System.out.println("Number on ühe võrra väiksem");
                } else if (number == 2){
                    System.out.printf("Vastasid: %d. Oled vastanud %d korda %n", number, j-5);
                    System.out.println("Number on ühe võrra suurem");
                } else if (number < 3){
                    System.out.printf("Vastasid: %d. Oled vastanud %d korda %n", number, j-5);
                    System.out.println("Number on suurem kui sinu pakutud");
                } else {
                    System.out.printf("Vastasid: %d. Oled vastanud %d korda %n", number, j-5);
                    System.out.println("Number on väiksem kui sinu pakutud");
                }
            }
            System.out.println("Kas soovid mängu jätkata?");
            muutuja = scanner.nextLine();

        }



    }
}
