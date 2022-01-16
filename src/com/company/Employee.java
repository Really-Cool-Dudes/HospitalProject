package com.company;

public class Employee extends Person{
    protected Boolean auth ;
    protected int tachesJournalieresEffectuees;

    public Employee(Integer cin, Boolean auth) {
        super(cin);
        this.auth = auth;
    }

    public Integer getCin() {
        return cin;
    }

    public void setCin(Integer cin) {
        this.cin = cin;
    }

    public Boolean getAuth() {
        return auth;
    }

    public void setAuth(Boolean auth) {
        this.auth = auth;
    }

    public int getTachesJournalieresEffectuees() {
        return tachesJournalieresEffectuees;
    }

    public void setTachesJournalieresEffectuees(int tachesJournalieresEffectuees) {
        this.tachesJournalieresEffectuees = tachesJournalieresEffectuees;
    }
    public void incrementTaches(){
        this.tachesJournalieresEffectuees++;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "auth=" + auth +
                ", tachesJournalieresEffectuees=" + tachesJournalieresEffectuees +
                ", cin=" + cin +
                '}';
    }
}
