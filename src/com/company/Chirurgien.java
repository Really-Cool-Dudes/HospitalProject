package com.company;

public class Chirurgien extends Medecin{


    public Chirurgien(Integer cin, Boolean auth, String nom, String diplome) {
        super(cin, auth, nom, diplome);
    }

    public void operer(Patient patient){
        if(patient.isMalade()){
            patient.setEtat("opéré");
        }
    }

    @Override
    public String toString() {
        return "Chirurgien{" +
                "auth=" + auth +
                ", tachesJournalieresEffectuees=" + tachesJournalieresEffectuees +
                ", cin=" + cin +
                ", nom='" + nom + '\'' +
                ", diplome='" + diplome + '\'' +
                '}';
    }
}
