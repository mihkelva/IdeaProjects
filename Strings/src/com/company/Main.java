package com.company;

public class Main {

    public static void main(String[] args) {

        String[] kuud = new String[] {"Jaanuar", "Veebruar", "Märts", "Aprill", "Mai", "Juuni", "Juuli", "August", "September", "Oktoober", "November", "Detsember"};

// E = 0, l = 1, a = 2, s = 3, " " = 4
        String lause= "Elas metsas mutionu, keset kuuski noori vanu";

// otsime indeksit sellele sümbolile mis on indexOf sees (praegu tühikut)
        int indeksiNumber = lause.indexOf("u");


// siin otsime lausest sümbolit Y. Näeme, et prinditakse väärtuseks -1
        int indeksiNumberY = lause.indexOf("y");
        System.out.println(indeksiNumberY);
        System.out.println();

// esialgu saab indeksinumber väärtuseks 4 (realt 10).
// ta on while tsüklis senikaua kuni väärtus ei ole -1 (ei leia enam tühikut)
// indeksinumbrile lisame iga kord 1 juurde (fromIndex), et ta hakkaks lugema pärast tühikut
        while(indeksiNumber != -1){
            System.out.println(indeksiNumber);
            indeksiNumber = lause.indexOf("u", indeksiNumber+1);
        }

        System.out.println();
        System.out.println();

        String isikukood = "19103315212";
        String sugu = "";
        // meetod substring tükeldab stringi. esimene parameeter on algus, teine lõpp
        String esimeneNumber = isikukood.substring(0,1);
        System.out.println(esimeneNumber);
        // võrdleme numbreid == märgiga. Sõnu võrdleme .equals()
        // || tähendab, et if() on tõene kui üks neist võrdustest on tõene
        if(esimeneNumber.equals("1") || esimeneNumber.equals("3") || esimeneNumber.equals("5")){
            sugu = "mees";
            System.out.println("Oled " + sugu +"!");
        } else if (esimeneNumber.equals("2") || esimeneNumber.equals("4") || esimeneNumber.equals("6")){
            sugu = "naine";
            System.out.println("Oled " + sugu +"!");
        } else {
            System.out.println("Vigane isikukood!");
        }

        String synniAasta = isikukood.substring(1,3);
        System.out.println(synniAasta);
        int pikkSynniAasta = 0;
        switch (esimeneNumber) {
            case "1":
            case "2": {
                pikkSynniAasta = (Integer.parseInt(synniAasta) + 1800);
                break;
            }
            case "3":
            case "4": {
                 pikkSynniAasta = (Integer.parseInt(synniAasta) + 1900);
                break;
            }
            case "5":
            case "6": {
                pikkSynniAasta = (Integer.parseInt(synniAasta) + 2000);
                break;
            }
        }
        System.out.println(pikkSynniAasta);

        String synniKuu = isikukood.substring(3,5);
        int synniKuuNumber = Integer.parseInt(synniKuu);
        System.out.println(synniKuu);

        System.out.println(kuud[synniKuuNumber-1]);

        // %s ja muutujate arv peab võrduma (4tk kummatki)
        // printf vajab muutujaid , println mitte.
        // printf ei tee ise automaatselt reavahetust
        System.out.printf("Su isikukood on %s %n", isikukood);
        System.out.printf("Oled %s ja oled sündinud kuupäeval %s %s ning %s aastal %n", sugu, isikukood.substring(5,7), kuud[synniKuuNumber-1], pikkSynniAasta);
    }
}
