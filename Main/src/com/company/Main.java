package com.company; // <-- package nimi

// main klass, kus sees on main meetod. N-ö põhiklass
public class Main {
    // main meetod, kus kogu programm käivitud
    public static void main(String[] args) {

        // klass "Inimene" väljakutse
        Inimene inimene = new Inimene();
        // peame andma sellise väärtuse, mille tüübi oleme klassi "Inimene" deklareerinud
        // inimene.sugu tahab saada väärtust, mille tüüp on "Sugu", nimi tahab saada "String" väärtust
        inimene.sugu = Sugu.MEES;
        inimene.nimi = "Toomas";
        inimene.setIsikukood("3894124921");
        inimene.setAadress("Eesti");

        // klass "Õppeaine" väljakutse
        Õppeaine õppeaine = new Õppeaine(Semester.SÜGIS, Tüüp.ARVESTUS, "Madis Müür", 2021);

        // nagu näha, siis mõlemad ülevalpoolsed klassi väljakutsed on samasugused.
        // üleval kasutasime tühja konstruktorit ja siis andsime väärtused
        // all õppaine väljakutsel kasutasime objekti loomisel konstruktorit ja andsime kohe väärtused
        System.out.println(inimene);
        System.out.println(õppeaine);

        inimene.ütle("Tere tere");
        inimene.kuula();
        System.out.println(inimene.tereta());

        // staatilist meetodit ei pea kutsuma objekti kaudu, saame otse kutsuda klassi kaudu
        inimene.loe();   // <- IntelliJ teeb selle kollaseks, ütleb, et saame klassi kaudu välja kutsuda
        Inimene.loe();

        System.out.println();

        Õppeaine matemaatika = new Õppeaine(Semester.KEVAD, Tüüp.ARVESTUS, "Madis Kask", 2021);
        Õppeaine eestiKeel = new Õppeaine(Semester.SÜGIS, Tüüp.HINDELINE, "Pille Kadakas", 2021);
        Õppeaine ingliseKeel = new Õppeaine(Semester.KEVAD, Tüüp.HINDELINE, "Joosep Juurikas", 2020);
        Õppeaine loogika = new Õppeaine(Semester.KEVAD, Tüüp.ARVESTUS, "Lilian Lill", 2022);

        System.out.println(loogika);

        //kui on staatiline, saame välja kutsuda otse klassi kaudu meetodi välja
        Õppeaine.õppeaineNimistu();

        matemaatika.õppeaineNimistu2();
        eestiKeel.õppeaineNimistu2();
    }
}
