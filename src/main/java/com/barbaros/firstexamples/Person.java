package com.barbaros.firstexamples;

/**
 * Created by Bar-Mel on 6.09.2016.
 */
public class Person {
    String fName;
    String lName;

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    Person(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }
}
