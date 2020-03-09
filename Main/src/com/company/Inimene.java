package com.company;

// primitiivväärtused: Integer, string, boolean ..........
// enam ei pruugi olla vaid String, boolean või integer tüüpi vaid võivad olla ka klassi või ENUM tüüpi muutujad

public class Inimene {
    // kui tahame ENUMit kasutada, siis kutsume välja inimese klassis
    // muutuja, mis on tüüpi sugu
    public Sugu sugu;
    public String nimi;
    private String isikukood;
    private String aadress;



    // public ja private'i erinevus: public muutujat saame muuta otse, private muutujat saame muuta "Get" ja "Set" meetoditega

    // Getteri ja setteri saamiseks läheme => "Code" -> "Generate" -> "Getter and setter"
    public String getIsikukood() {
        return isikukood;
    }

    public void setIsikukood(String isikukood) {
        this.isikukood = isikukood;
    }

    public String getAadress() {
        return aadress;
    }

    public void setAadress(String aadress) {
        this.aadress = aadress;
    }


// toString() saamiseks lähme "Code" -> "Generate" -> "toString()

// klassi objekti väljakutsumine sõnalisele kujule
// toString tähendab stringi kujule (to String)
    @Override
    public String toString() {
        return "Inimese "+
                // tüüpi Sugu (ENUM klass) teeme stringi kujule, et saaksime väikesteks tähtedeks teha
                "sugu on " + sugu.toString().toLowerCase() +
                ", nimi on " + nimi +
                ", isikukood on " + isikukood +
                ", aadress on " + aadress;
    }



    // public tähendab, et saame välja kutsuda main meetodis
    // void tähendab, et see ei tagasta midagi (meie puhul on siin väljaprint)
    public void ütle(String lause){
        System.out.println(lause);
    }

    public void kuula(){
        System.out.println("Kuulan");
    }

    public String tereta(){
        return "Teretan";
    }

    // ülemisi meetodeid kutsume välja objekti kaudu
    // static meetodit saame välja kutsuda otse klassi kaudu
    static void loe(){
        System.out.println("Loen");
    }

}

