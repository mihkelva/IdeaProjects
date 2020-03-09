public class Koer {
    private String tõug;
    private int vanus;
    private String omanik;
    private boolean kuri;

    public Koer(String tõug, int vanus, String omanik, boolean kuri) {
        this.tõug = tõug;
        this.vanus = vanus;
        this.omanik = omanik;
        this.kuri = kuri;
    }

    public void haugu() {
        System.out.println("Haugun");
    }

    public void hüppa() {
        System.out.println("Hüppan");
    }

    static void koerad() {
        System.out.println("Kõik koerad mängivad");
    }

}
