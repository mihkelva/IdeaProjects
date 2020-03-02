package com.company;

public class StringSplitJoin {
    public static void main(String[] args) {

        String lause = "Olen Mari ja olen 35 aastane";
        String lause2 = "Olen-Karl-ja-olen-21-aastane";
        String lause3 = "Olen Sebastian ja olen 28 aastane";
        String lause4 = "Olen,Pille,ja,olen,27,aastane";
        String lause5 = "Olen Joosep ja olen 25 aastane";
        String lause6 = "Olen Gustav ja olen 48 aastane";
        String lause7 = "Olen Toomas Tõnis ja olen 35 aastane";

        // lahutatakse laused tühiku kohapealt split (tühik)
        String[] sonad = lause.split(" ");
        String[] sonad2 = lause2.split("-");
        String[] sonad3 = lause3.split(" ");
        String[] sonad4 = lause4.split(",");
        String[] sonad5 = lause5.split(" ");
        String[] sonad6 = lause6.split(" ");
        String[] sonad7 = lause7.split(" ");

        System.out.println(sonad[4]);
        System.out.println(sonad2[4]);
        System.out.println(sonad3[4]);
        System.out.println(sonad4[4]);
        System.out.println(sonad5[4]);
        System.out.println(sonad6[4]);
        System.out.println(sonad7[5]);

        int vanus = Integer.parseInt(sonad[4]);
        int vanus2 = Integer.parseInt(sonad2[4]);
        int vanus3 = Integer.parseInt(sonad3[4]);
        int vanus4 = Integer.parseInt(sonad4[4]);
        int vanus5 = Integer.parseInt(sonad5[4]);
        int vanus6 = Integer.parseInt(sonad6[4]);
        int vanus7 = Integer.parseInt(sonad7[5]);

        int sum = vanus+vanus2+vanus3+vanus4+vanus5+vanus6+vanus7;
        System.out.println(sum);

        String eesnimi = (sonad[1]);
        String eesnimi2 =(sonad2[1]);
        String eesnimi3 =(sonad3[1]);
        String eesnimi4 =(sonad4[1]);
        String eesnimi5 =(sonad5[1]);
        String eesnimi6 =(sonad6[1]);
        String eesnimi7 =(sonad7[1]);

        String k6ikNimed = String.join(", ", eesnimi, eesnimi2, eesnimi3, eesnimi4, eesnimi5, eesnimi6, eesnimi7);
        System.out.printf("Külas on %s ja nende vanus on kokku %d %n", k6ikNimed, sum);


    }
}
