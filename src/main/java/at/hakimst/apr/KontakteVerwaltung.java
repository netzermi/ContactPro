package at.hakimst.apr;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
        StringBuilder builder = new StringBuilder();
        builder.append("vorname;nachname;telefon;email\n");
        for(Kontakt k : kontakte){
           String zeile = k.getVorname()+";"+k.getNachname()+";"+k.getTelefonnummer()+";"+k.getEmail()+"\n";
            builder.append(zeile);
        }
        return builder.toString();
    }

    public void saveToFile(File file){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(exportToCSV());
            writer.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Fehler beim Speichern");
        }
    }
}
