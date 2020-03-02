public class Kalkulaator {
    public static void main(String[] args) {
        int summa = sum(4,5);
        System.out.println(summa);

        double jagatis = jagatis(4,5);
        System.out.println(jagatis);

        int kolmega = sum(4,5, true);
        System.out.println(kolmega);

        int ei = sum(4,5, false);
        System.out.println(ei);
    }

    static int sum(int esimeneArv, int teineArv){
        return esimeneArv+teineArv;
    }

    static double jagatis(int esimeneArv, int teineArv){
        return esimeneArv/(double)teineArv;
    }

    static int sum(int esimeneArv, int teineArv, boolean korrutaKolmega){
        if(korrutaKolmega){
            return (esimeneArv+teineArv)*3;
        } else {
            return esimeneArv+teineArv;
        }
    }
}
