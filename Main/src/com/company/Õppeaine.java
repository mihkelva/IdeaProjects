package com.company;

public class Õppeaine {
    public Semester semester;
    public Tüüp tüüp;
    public String õppejõud;
    private int aasta;

    // konstruktori saamiseks "Code" -> "Generate" -> "Constructor"
    // konstuktor on klassi välja kutsumiseks (nagu meetodi väljakutsumine)


    public Õppeaine(Semester semester, Tüüp tüüp, String õppejõud, int aasta) {
        this.semester = semester;
        this.tüüp = tüüp;
        this.õppejõud = õppejõud;
        this.aasta = aasta;
    }

    public int getAasta() {
        return aasta;
    }

    public void setAasta(int aasta) {
        this.aasta = aasta;
    }

    @Override
    public String toString() {
        return "Õppeaine " +
                "semester on " + semester.toString().toLowerCase() +
                ", tüüp on " + tüüp.toString().toLowerCase() +
                ", õppejõud on " + õppejõud +
                ", aasta on " + aasta;
    }

    static void õppeaineNimistu(){
        System.out.println("Küsisid õppeaineid....");
    }

    public void õppeaineNimistu2(){
        System.out.println("Küsisid õppeaineid....");
    }
}
