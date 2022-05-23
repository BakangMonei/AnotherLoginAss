package com.mad.logginass;

public class User {

    // Attributes
    public String name, lastname, email;

    // Empty Constructors
    public User(){

    }

    // Constructors
    public User(String name, String lastname, String email){
        this.name = name;
        this.lastname = lastname;
        this.email  = email;
    }

    // Getters
    public String getName() {
        return name;
    }
    public String getLastname() {
        return lastname;
    }
    public String getEmail() {
        return email;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
