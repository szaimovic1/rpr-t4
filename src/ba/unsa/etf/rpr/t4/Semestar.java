package ba.unsa.etf.rpr.t4;

public class Semestar {
    private int broj_studenata;
    private int semestar;
    private int broj_obaveznih_predmeta, broj_izbornih_predmeta;
    private int zbir_ECTS;
    private Predmet[] niz_predmeta;

    Semestar(int broj_studenata, int semestar, int broj_obaveznih_predmeta,
             int broj_izbornih_predmeta, int zbir_ECTS) {}

    public void dodajObavezniPredmet(String naziv_predmeta) {}

    public void dodajIzborniPredmet(String naziv_predmeta) {}

    public void ukloniObavezniPredmet(String naziv_predmeta) {}

    public void ukloniIzborniPredmet(String naziv_predmeta) {}

    public int dajBrojObaveznihPredmeta() {return broj_obaveznih_predmeta;}

    public int dajBrojIzbornihPredmeta() {return broj_izbornih_predmeta;}

    public int dajBrojSemestra() {return semestar;}

    public int dajZbirECTS() {return zbir_ECTS;}
}
