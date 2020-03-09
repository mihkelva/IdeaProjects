public class Kass {
    public String nimi;
    public int vanus;
    public String omanik;

    public Kass(String nimi, int vanus, String omanik) {
        this.nimi = nimi;
        this.vanus = vanus;
        this.omanik = omanik;
    }

    public void nurru() {
        System.out.println("Nurrun");
    }

    public void hyppa() {
        System.out.println("Hyppan");
    }

    static void kassid() {
        System.out.println("Kõik kassid magavad");
    }
}
