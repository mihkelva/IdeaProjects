

public class Inimene {

    private String nimi;
    private String perekonnanimi;
    private int vanus;
    private String aadress;
    private String telefoninumber;
    private String isikukood;

    // konstruktor - seda saab "code" => "generate" => "constructor"
    public Inimene(String nimi, String perekonnanimi, int vanus, String aadress, String telefoninumber, String isikukood) {
        this.nimi = nimi;
        this.perekonnanimi = perekonnanimi;
        this.vanus = vanus;
        this.aadress = aadress;
        this.telefoninumber = telefoninumber;
        this.isikukood = isikukood;
    }

    public Inimene(String nimi) {
        this.nimi = nimi;
    }

    //getter and setter - seda saab "code" => "generate" => "getter and setter"
    //kui tagastab (gettib), siis on tüübiks String, int või boolean (tagastab mingisuguse muutuja)
    public String getNimi() {
        return nimi;
    }

    // kui paneme väärtuse (settime), siis ei tagasta midagi, on tüübiks "void"
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getPerekonnanimi() {
        return perekonnanimi;
    }

    public void setPerekonnanimi(String perekonnanimi) {
        this.perekonnanimi = perekonnanimi;
    }

    public int getVanus() {
        return vanus;
    }

    public void setVanus(int vanus) {
        this.vanus = vanus;
    }

    public String getAadress() {
        return aadress;
    }

    public void setAadress(String aadress) {
        this.aadress = aadress;
    }

    public String getTelefoninumber() {
        return telefoninumber;
    }

    public void setTelefoninumber(String telefoninumber) {
        this.telefoninumber = telefoninumber;
    }

    public String getIsikukood() {
        return isikukood;
    }

    public void setIsikukood(String isikukood) {
        this.isikukood = isikukood;
    }
}
