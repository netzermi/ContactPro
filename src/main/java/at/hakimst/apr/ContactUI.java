package at.hakimst.apr;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContactUI extends JFrame{
    private JPanel jPanel;
    private JTextField textFieldVorname;
    private JTextField textFieldNachname;
    private JTextField textFieldEmail;
    private JTextField textFieldTelefon;
    private JButton buttonAdd;
    private JList<String> listKontakte;
    private KontakteVerwaltung kontakteVerwaltung;

    public ContactUI(){
        setVisible(true);
        setContentPane(jPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 600);
        kontakteVerwaltung = new KontakteVerwaltung();
        buttonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kontaktHinzufügen();
            }
        });
    }

    public void kontaktHinzufügen(){
        String vorname = textFieldVorname.getText();
        String nachname = textFieldNachname.getText();
        String email = textFieldEmail.getText();
        String telefon = textFieldTelefon.getText();
        Kontakt kontakt = new Kontakt(vorname,nachname, email, telefon);
        kontakteVerwaltung.kontaktHinzufügen(kontakt);
        aktualisiereKontakte();
    }

    public void aktualisiereKontakte(){
        DefaultListModel<String> listModel = new DefaultListModel<>();
        for (Kontakt kontakt : kontakteVerwaltung.getKontakte()) {
            listModel.addElement(kontakt.toString());
        }
        listKontakte.setModel(listModel);
    }
}
