package com.company;

public class Kinesitherapeute extends PersonnelMedical{


    public Kinesitherapeute(Integer cin, Boolean auth, String nom, String diplome) {
        super(cin, auth, nom, diplome);
    }

    public void masser(Patient patient){
        if(patient.getBless() == 0){
            patient.addEtatPhysique(7);
        }
    }

    @Override
    public String toString() {
        return "Kinesitherapeute{" +
                "auth=" + auth +
                ", tachesJournalieresEffectuees=" + tachesJournalieresEffectuees +
                ", cin=" + cin +
                ", nom='" + nom + '\'' +
                ", diplome='" + diplome + '\'' +
                '}';
    }
}
