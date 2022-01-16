package com.company;

public class PersonnelMedical extends Employee{
    protected String nom;
    protected String diplome;


    public PersonnelMedical(Integer cin, Boolean auth, String nom, String diplome) {
        super(cin, auth);
        this.nom = nom;
        this.diplome = diplome;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDiplome() {
        return diplome;
    }

    public void setDiplome(String diplome) {
        this.diplome = diplome;
    }

    public Boolean getAuth() {
        return auth;
    }

    public void setAuth(Boolean auth) {
        this.auth = auth;
    }
}
