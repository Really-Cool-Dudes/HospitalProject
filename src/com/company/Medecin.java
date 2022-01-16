package com.company;



public class Medecin extends PersonnelMedical{


    public Medecin(Integer cin, Boolean auth, String nom, String diplome) {
        super(cin, auth, nom, diplome);
    }

    public void masser(Patient patient){
        if(patient.getBless() == 0){
            patient.addEtatPhysique(5);
            incrementTaches();
        }
    }
    public void soigner(Patient patient){
        if(patient.getBless()>0){
            patient.heal();
            incrementTaches();
        }
    }
    public void demandeSoigner(Infirmier infirmier, Patient patient){
        infirmier.soigner(patient);
    }

    @Override
    public String toString() {
        return "Medecin{" +
                "auth=" + auth +
                ", tachesJournalieresEffectuees=" + tachesJournalieresEffectuees +
                ", cin=" + cin +
                ", nom='" + nom + '\'' +
                ", diplome='" + diplome + '\'' +
                '}';
    }
}
