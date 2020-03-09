public class Loomad {
    public static void main(String[] args) {
        //staatiline meetod, saame välja kutsuda
        Kass.kassid();

        // ei ole staatiline meetod, ei saa klassi kaudu välja kutsuda
        // Kass.hyppa();
        Kass garfield = new Kass("Garfield", 3, "Tim");
        garfield.hyppa();

        // uue objekti loomisel "Kass" klassist, peame alati andma kaasa 3 argumenti, kuna sätestasime niimoodi konstruktoris
        Kass miisu = new Kass("Miisu", 2,  "Mari");

        Hiir miki = new Hiir("Miki", 10);
        Hiir minni = new Hiir("Minni");

        System.out.println(miki);
        System.out.println(minni);
    }
}
