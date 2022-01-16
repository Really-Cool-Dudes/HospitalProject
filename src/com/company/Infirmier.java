package com.company;

public class Infirmier extends PersonnelMedical{


    public Infirmier(Integer cin, Boolean auth, String nom, String diplome) {
        super(cin, auth, nom, diplome);
    }

    public void soigner(Patient patient){
        patient.heal();
    }

    @Override
    public String toString() {
        return "Infirmier{" +
                "auth=" + auth +
                ", tachesJournalieresEffectuees=" + tachesJournalieresEffectuees +
                ", cin=" + cin +
                ", nom='" + nom + '\'' +
                ", diplome='" + diplome + '\'' +
                '}';
    }
}
