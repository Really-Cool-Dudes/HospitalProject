package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Hospital {
    protected String nom;
    protected Directeur directeur;
    protected ArrayList<Person> people = new ArrayList<Person>();



    public Hospital(String nom, Directeur directeur) {
        this.nom = nom;
        this.directeur = directeur;
    }

    public boolean add(Person person){
        for (Person temp : people) {
            if(temp.getCin() == person.getCin()) {
                return false ;
            }
        }
        people.add(person);
        return true ;

    }


    public boolean delete(String cin){

        Iterator itr = people.iterator();


        while (itr.hasNext()) {
            Person x =(Person) itr.next() ;
            if(x.getCin().equals((cin))){
                itr.remove();
                return true;
            }

        }
        return false ;

    }
    public Directeur getDirecteur() {
        return this.directeur;
    }

    public void setDirecteur(Directeur directeur) {
        this.directeur = directeur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Person> getPeople() {
        return people;
    }

    @Override
    public String toString() {
        String result = "Hospital " + this.nom + "\r\n”";

        result+= this.directeur.toString() + '/' ;
        for (Person temp : people) {
            result+=temp.toString();
        }


        return result ;
    }
}
