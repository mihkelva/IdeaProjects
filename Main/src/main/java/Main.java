import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Inimene inimene = new Inimene("Kalle");
        System.out.println(inimene.getNimi());

        Inimene mängija = new Inimene("Tõnis", "Tõniste", 35, "Eesti", "5512345", "38101011234");
        mängija.setIsikukood("38123412321");
        System.out.println(mängija.getIsikukood());



        //scanneril tegime .nextLine, Scanneril oli konstruktoris System.in
        Scanner scanner = new Scanner(System.in);
        // arrayListil tegime .add ja .remove
        ArrayList arrayList = new ArrayList();
    }
}
