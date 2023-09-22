package com.example.projetalloserviceweb.Entity.Models;
import jakarta.persistence.*;
@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "usersid")
    protected Long usersid;
}