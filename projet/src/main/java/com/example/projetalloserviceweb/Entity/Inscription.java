package com.example.projetalloserviceweb.Entity;
import com.example.projetalloserviceweb.Entity.Models.Users;
import jakarta.persistence.*;
import java.util.List;
@Entity
@Table(name = "inscription")
public class Inscription {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "inscriptionid")
    private Long inscriptionid;
    @Column(name = "firstname")
    private String firstname;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "confirmedpassword")
    private String confirmespassword;
    @OneToMany(mappedBy = "userid")
    private List<Users> users;

    public Long getInscriptionid() {
        return inscriptionid;
    }

    public void setInscriptionid(Long inscriptionid) {
        this.inscriptionid = inscriptionid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmespassword() {
        return confirmespassword;
    }

    public void setConfirmespassword(String confirmespassword) {
        this.confirmespassword = confirmespassword;
    }

    public List<Users> getUsers() {
        return users;
    }

    public void setUsers(List<Users> users) {
        this.users = users;
    }
}