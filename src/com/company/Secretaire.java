package com.company;

public class Secretaire extends Personnel_administratif{


    public Secretaire(Integer cin) {
        super(cin);
    }

    public void tachesAdminitratives(){

    }

    @Override
    public String toString() {
        return "Secretaire{" +
                "auth=" + auth +
                ", tachesJournalieresEffectuees=" + tachesJournalieresEffectuees +
                ", cin=" + cin +
                '}';
    }
}
