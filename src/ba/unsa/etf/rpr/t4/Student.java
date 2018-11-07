package ba.unsa.etf.rpr.t4;

public class Student {
    private String ime;
    private String prezime;
    private int broj_indeksa;

    Student(String ime, String prezime, int index) {
        this.ime = ime;
        this.prezime=prezime;
        this.broj_indeksa=index;
    }

    public int getBroj_indeksa() {
        return broj_indeksa;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setBroj_indeksa(int broj_indeksa) {
        this.broj_indeksa=broj_indeksa;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    @Override
    public String toString() {
        String s = this.prezime + " " + this.ime + " " + "(" + this.broj_indeksa + ")";
        return s;
    }

    public void ispisi(){
        System.out.println(this);
    }
}
