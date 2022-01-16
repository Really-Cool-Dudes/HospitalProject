package com.company;

public class Personnel_administratif extends Employee{



    public Personnel_administratif(Integer cin) {
        super(cin, true);
    }

    public Boolean getAuth() {
        return auth;
    }


}
