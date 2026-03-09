package at.hakimst.apr;

import java.util.ArrayList;
import java.util.List;

public class KontakteVerwaltung {
    private List<Kontakt> kontakte;

    public KontakteVerwaltung(){
        kontakte = new ArrayList<>();
    }

    public void kontaktHinzufügen(Kontakt kontakt){
        kontakte.add(kontakt);
    }

    public void kontaktEntfernen(int index){
        if(index >= 0 && index < kontakte.size()){
            kontakte.remove(index);
        }
    }

    public List<Kontakt> getKontakte(){
        return kontakte;
    }

    public String exportToCSV(){
        return null;
    }
}
