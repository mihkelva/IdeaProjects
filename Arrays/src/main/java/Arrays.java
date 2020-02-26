public class Arrays {
    public static void main(String[] args) {
        // 0,1,2,3,4,5 <--- indeksid
        int[] massiiv = {1,2,3,4,5,"hobune"};
        System.out.println(massiiv[5]);

        // massiiv.length annab meile massiivi pikkuse (mitte indeksid)
        // et saada viimase elemendi indeks, peame küsima massiivi pikkust ja lahutama sellest ühe
        System.out.println(massiiv.length);
        System.out.println(massiiv[massiiv.length-1]);

        System.out.println();
        // massiiv algab alati 0-st. See tähendab, et kui tahame saada teist elementi, peame küsima indeksiga 1  (indeksid: 0,1....
        int[] numbriteMassiiv = {12, 23, 28, 52, 11, 245};
        System.out.println(numbriteMassiiv[1]);

        System.out.println();

        String[] s6nadeMassiiv = {"koer", "hobune", "kits", "kass"};
        System.out.println(s6nadeMassiiv[0]);

        System.out.println();
        //muudame sõnade massiivi esimest elementi. Kuna me muudame seda pärast ülemist väljatrükki, siis ülemises väljatrükis on see endiselt "koer"
        s6nadeMassiiv[0] = "liblikas";

        System.out.println();
        // i muutub iga tsükliga (algab 0-st): seega ideaalne viis massiivi "läbikäimiseks"
        for (int i = 0; i < s6nadeMassiiv.length; i++) {
            Sstem.out.println(s6nadeMassiiv[i]);
        }
    }
}
