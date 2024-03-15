

import java.util.Arrays;

public class Corso {
    private String nomeCorso;
    private int creditiFormativi;

    private Studente[] studentiIscritti = new Studente[0];

    public Corso(String nomeCorso, int creditiFormativi) {
        this.nomeCorso = nomeCorso;
        this.creditiFormativi = creditiFormativi;
    }

    public String getNomeCorso() {
        return nomeCorso;
    }

    public void setNomeCorso(String nomeCorso) {
        this.nomeCorso = nomeCorso;
    }

    public int getCreditiFormativi() {
        return creditiFormativi;
    }

    public void setCreditiFormativi(int creditiFormativi) {
        this.creditiFormativi = creditiFormativi;
    }

    public Studente[] getStudentiIscritti() {
        return studentiIscritti;
    }

    public void setStudentiIscritti(Studente[] studentiIscritti) {
        this.studentiIscritti = studentiIscritti;
    }

    public void listaStudenti() {
        System.out.println(Arrays.toString(studentiIscritti));
    }

    public void aggiungiStudente(Studente studente) {
        Studente[] tempArray = new Studente[studentiIscritti.length + 1];
        for (int i = 0; i < studentiIscritti.length; i++) {
            studentiIscritti[i] = tempArray[i];

        }
        tempArray[tempArray.length - 1] = studente;
        studentiIscritti = tempArray;
    }

    public static void listaCorsi(Corso[] corsi) {
        int risultato = 0;
        for (Corso corso : corsi) { //(int i = 0; i < corsi.length; i++)
            risultato += corso.getCreditiFormativi(); // risultato += corsi[i].getCreditiFormativi

        }
        System.out.println("il totale dei crediti formativi e: " + risultato);
    }

    public void controllaStudente(Studente studente) {
        for (int i = 0; i < studentiIscritti.length; i++) {
            if (studentiIscritti[i].equals(studente)) {
                System.out.println("lo studente " + studente.getNome() + " " + studente.getCognome() +
                        " sta frequentando il corso: " + getNomeCorso());
            }
        }
    }

    public String cercaStudente(String keySerch) {
        Studente[] studentiTrovati = new Studente[studentiIscritti.length];
        for (int i = 0; i < studentiIscritti.length; i++) {
            if (studentiIscritti[i].getNome().toLowerCase().contains(keySerch.toLowerCase()) ||
                    studentiIscritti[i].getCognome().toLowerCase().contains(keySerch.toLowerCase())) {
                studentiTrovati[i] = studentiIscritti[i];
            }
        }
        return Arrays.toString(studentiTrovati);
    }

       public void eliminaStudente(Studente studente) {
        int j = 0;
        Studente[] tempArray = new Studente[studentiIscritti.length - 1];
        for (int i = 0; i < studentiIscritti.length; i++) {
            if (!studente.equals(studentiIscritti[i])) {
                tempArray[j]=studentiIscritti[i];
                j++;
            }
        }
        studentiIscritti =tempArray;
    }


}

