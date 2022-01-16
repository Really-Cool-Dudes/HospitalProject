package com.company;

public class Directeur extends Personnel_administratif{


    public Directeur(Integer cin) {
        super(cin);
    }

    public void activeAuth(Employee employee){
        employee.setAuth(true);
    }
    public void disableAuth(Employee employee){
        employee.setAuth(false);
    }

    @Override
    public String toString() {
        return "Directeur{" +
                "auth=" + auth +
                ", tachesJournalieresEffectuees=" + tachesJournalieresEffectuees +
                ", cin=" + cin +
                '}';
    }
}
