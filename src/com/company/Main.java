package com.company;

import java.time.LocalDateTime;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee(21455, true);
        Date now = new Date();
        Date date = new Date();
        if(date.after(date)){
            employee.setTachesJournalieresEffectuees(0);
        }
        Medecin medecin = new Medecin(12224,true,"Aziz","Tbib");
        Patient patient = new Patient(12545,"Ghassen", 23,true,0,"mridh");
        medecin.soigner(patient);

    }
}
