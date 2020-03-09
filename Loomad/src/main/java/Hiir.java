public class Hiir {
    public String nimi;
    public int vanus;

    public Hiir(String nimi, int vanus) {
        this.nimi = nimi;
        this.vanus = vanus;
    }

    public Hiir(String nimi) {
        this.nimi = nimi;
    }

    static void hiired() {
        System.out.println("Hiired närivad");
    }
}
