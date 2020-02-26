import java.util.*;

public class Listid {
    public static void main(String[] args) {

        List järjestList = new ArrayList(); // massiivid:  = { 1,2,3,4}
        //lisame listi "add" abil
        järjestList.add(2);
        järjestList.add(5);
        järjestList.add(7);
        järjestList.add("koer");
        järjestList.add("kass");
        järjestList.add("hobune");
        järjestList.add(false);
        järjestList.add(1.2412412);

        // for tsükkel kestab nii kaua kui on järjestList suurus
        // for each kasutatakse vaid massiivide jaoks
        // Loome uue objekti (o), millega käime listi läbi ning prindime selle objekti
        for (Object o : järjestList) {
            System.out.println(o);   // massiivid: järjestList[i]
        }
        System.out.println();

        // alustab lugemist nullist, seega prindib välja järjekorras kolmanda elemendi:
        järjestList.remove(1);
        System.out.println("Kolmas element :" + järjestList.get(2));

//        int[] massiiv = {1,2,3,4,5,"hobune"};
//        System.out.println(massiiv[5]);

        System.out.println();

        Set hashSet = new HashSet();
        hashSet.add(85);
        hashSet.add(10);
        hashSet.add(2);
        hashSet.add(44);
        hashSet.add(44);
        hashSet.add(44);
        hashSet.add(2);

        //
        for (Object o : hashSet) {
            System.out.println(o);
        }
        System.out.println();

        //Mappi tuleb sisestada 2 väärtust: key ja value
        Map paaridegaList = new HashMap();
        paaridegaList.put("Apelsinid", 2);
        paaridegaList.put("Apelsinid", 2);
        paaridegaList.put("Õunad", 5);
        paaridegaList.put("Mandariinid", 4);
        paaridegaList.put("Pirnid", 5);
        paaridegaList.put("Mangod", 3);
        paaridegaList.put("Sidrunid", 2);

        System.out.println(järjestList);
        System.out.println(hashSet);
        System.out.println(paaridegaList);
        System.out.println();



        paaridegaList.forEach((key, value) -> {
            System.out.println("Listi key: " + key + ", listi value: " + value);
        });

        //leiame Mapist väärtuse Key järgi järgnevalt:
        System.out.println(paaridegaList.get("Sidrunid")+ " on sidrunite arv");



        TreeMap järjekorrasMap = new TreeMap();

        // väärtused on järjekorras tähestikuliselt
        järjekorrasMap.put("Malle", 170);
        järjekorrasMap.put("Kalle", 160);
        järjekorrasMap.put("Mati", 175);
        järjekorrasMap.put("Kati", 172);
        järjekorrasMap.put("Tõnu", 185);
        järjekorrasMap.put("Jüri", 187);
        järjekorrasMap.put("Pille", 167);
        järjekorrasMap.put("Sille", 172);

        järjekorrasMap.forEach((key, value) -> {
            System.out.println("Listi key: " + key + ", listi value: " + value);
        });

        System.out.println(järjekorrasMap.values());

        //treemapis on väärtused järjekorras key järgi
        TreeMap järjekorrasMapNumbritega = new TreeMap();

        järjekorrasMapNumbritega.put(170, "Malle");
        järjekorrasMapNumbritega.put(160, "Kalle");
        järjekorrasMapNumbritega.put(175, "Mati");
        järjekorrasMapNumbritega.put(172, "Kati");
        järjekorrasMapNumbritega.put(185, "Tõnu");
        järjekorrasMapNumbritega.put(187, "Jüri");
        järjekorrasMapNumbritega.put(167, "Pille");
        järjekorrasMapNumbritega.put(172, "Sille");

//        TreeMap järjekorrasMapNumbritega2 = (TreeMap) järjekorrasMapNumbritega.descendingKeySet();

        järjekorrasMapNumbritega.descendingMap().forEach((väärtus, võti) -> {
            System.out.println(" listi value: " + väärtus + " võtme väärtus: " + võti);
        });

//        System.out.println(järjekorrasMapNumbritega.values());



    }
}
