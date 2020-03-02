package ee.omis;

public class Meetod2 {
    public static void main(String[] args) {
        // kood lühike ja arusaadav, peale vaadates saab aru mitu korda välja kutsutakse ja mida välja kutsutakse
        // lihtne loetavus!!
        print(10, "Tere");
        print(15, "Tervist");
        print(6, "Tervitus");
    }

    //meetod väljaspool main-meetodit
    // kasutame muutujaid (mituKorda ja sõna)
    static void print(int mituKorda, String sõna){
        for (int i = 0; i < mituKorda; i++) {
            System.out.println(sõna);
        }
    }

}
