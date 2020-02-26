import com.sun.org.apache.bcel.internal.classfile.SourceFile;

public class HelloWorld {

    public static void main(String[] args){

        // Esmalt tüüp, seejärel muutuja, viimaks anname muutjale väärtuse
        String name = "Mihkel";
        String lastName = "Vaher";

        //lisame arvulise muutja
        int age = 28;

        //Koos välja printimiseks, lisame pluss märgi kahe muutja vahele
        // Lisame tühja "stringi" kahe muutuja vahele
        System.out.println(name + " " + lastName);

        // SOUF + tab ning
        // %s tähendab STRING-muutujat
        // %d tähendab arvulist muutujat
        // %n lisab uue rea
        // , koma taha sisestame soovitud muutujad -
        // alati peab olema %s või %d arv lauses sama, mis muutujate arv pärast koma
        System.out.printf("Hello %s %s, with age of %d %n", name, lastName, age);

        //deklareerime muutuja text
        String text = "Tere päevast %s %s, vanusega %d %n";
        System.out.printf(text, name, lastName, age);
        //eelnevaga täpselt sama lause


        //println --- ei sobi süntaks, kus on % ja selle järgi muutujad
        // kommenteerin välja    System.out.println("Hello %s ", name);

        // printf pole mõtet kasutada kui meil ei ole muutujaid
       // -- kommenteerime välja System.out.printf("Hello mihkel");


        int maxV22rtus = Integer.MAX_VALUE;
        System.out.println(maxV22rtus+1);

        // Deklareerime suvalised muutujad, mis on arvulised ehk Integer tüüpi
        int five = 5;
        int six = 6;
        int seven = 7;

        // Deklareerime nende korrutise uude muutuja
        int sum = five * six;
        System.out.println(sum);


        float floatV22rtus = 8.12312f;
        long longV22rtus = 23124124521L;

        long long2 = (long) floatV22rtus;
        System.out.println(long2);

        float float2 = (float) longV22rtus;
        System.out.println(float2);

        double double2 = (double)longV22rtus;
        System.out.println(double2);


        String suvalineArvulineString = "7";
        int tahameStringiIntiks = Integer.parseInt(suvalineArvulineString);
        System.out.println(tahameStringiIntiks+1);

        System.out.println(seven/floatV22rtus);
    }

}


