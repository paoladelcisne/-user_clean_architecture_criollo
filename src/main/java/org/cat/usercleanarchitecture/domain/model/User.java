package org.cat.usercleanarchitecture.domain.model;

public class User {
    private String firstName;
    private String lastname;
    private String email;
    private String phone;

    //primero el constructor
    public User(String firstName, String lastname, String email, String phone) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.email = email;
        this.phone = phone;
    }
    //despues los metodos sobre escritos
    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
    // al ultimo las implementaciones
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}