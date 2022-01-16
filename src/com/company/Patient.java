package com.company;


public class Patient extends Person {
    private String name;
    private Integer bless;
    private Boolean malade;
    private Integer etatPhysique;
    private String etat;

    public Patient(Integer cin,String name, Integer bless, Boolean malade, Integer etatPhysique, String etat){
        super(cin);
        this.malade=true;
        this.name=name;
        this.malade=malade;
        this.bless=bless;
        this.etatPhysique=etatPhysique;
        this.etat = etat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBless() {
        return bless;
    }

    public void setBless(int bless) {
        this.bless = bless;
    }

    public boolean isMalade() {
        return malade;
    }

    public void setMalade(boolean malade) {
        this.malade = malade;
    }

    public void seFaireSoigner(Medecin medecin){
        Patient patient = new Patient(this.cin, this.name, this.bless, this.malade, this.etatPhysique, this.etat);
        medecin.soigner(patient);
    }

    public void addEtatPhysique(int i) {
        etatPhysique += i;
    }

    public void heal() {
        bless = 0;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", bless=" + bless +
                ", malade=" + malade +
                ", etatPhysique=" + etatPhysique +
                ", etat='" + etat + '\'' +
                ", cin=" + cin +
                '}';
    }
}