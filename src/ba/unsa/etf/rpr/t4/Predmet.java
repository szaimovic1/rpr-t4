package ba.unsa.etf.rpr.t4;

public class Predmet {
    private String naziv_predmeta;
    private String klasa_predmeta;
    private int ECTS;
    private final int max_broj_studenata;         //dodati i broj studenata??
    private Student[] niz_studenata;

    Predmet (String naziv_predmeta, String klasa_predmeta, int max_broj_studenata, int ECTS) {
        this.naziv_predmeta = naziv_predmeta;
        this.niz_studenata = new Student[max_broj_studenata];
        this.max_broj_studenata = max_broj_studenata;
        this.klasa_predmeta=klasa_predmeta;
        this.ECTS=ECTS;
    }

    public int getMax_broj_studenata() {
        return max_broj_studenata;
    }

    public int dajECTS() {return ECTS;}

    public String getNaziv_predmeta() {
        return naziv_predmeta;
    }

    public Student[] getNiz_studenata() {
        return niz_studenata;
    }

    public String getKlasa_predmeta() {
        return klasa_predmeta;
    }

    public void setECTS(int ECTS) {
        this.ECTS=ECTS;
    }

    public void setNaziv_predmeta(String naziv_predmeta) {
        this.naziv_predmeta = naziv_predmeta;
    }

    public void setNiz_studenta(Student[] niz_studenata) {
        this.niz_studenata = niz_studenata;
    }

    public void setKlasa_predmeta(String klasa_predmeta) {
        this.klasa_predmeta = klasa_predmeta;
    }

    public void upisi (Student s) {
        int i=0;
        while(niz_studenata[i]!=null)
            i++;
        niz_studenata[i]=s;
    }

    public void ispisi (Student s) {
        for(int i = 0; i < getMax_broj_studenata(); i++)
            if(niz_studenata[i] != null && s.equals(niz_studenata[i]))  {
                for(int j = i; j < getMax_broj_studenata() - 1; j++)
                    if(niz_studenata[j] != null)
                        niz_studenata[j] = niz_studenata[j + 1];
                i=max_broj_studenata;
            }
    }

    public void ispisi(){
        int i=0;
        while(niz_studenata[i]!=null){
            System.out.println(i+1 + "." + " " + niz_studenata[i]);
            i++;
        }
    }

    public Student dajStudenta(int i){
        if(niz_studenata[i]==null)
            return new Student("NU", "LL", 0);
        return niz_studenata[i];
    }
}
