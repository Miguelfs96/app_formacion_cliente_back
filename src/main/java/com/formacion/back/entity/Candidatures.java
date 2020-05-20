package com.formacion.back.entity;

import javax.persistence.*;

@Entity
@Table(name = "candidatures")
public class Candidatures {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int idcandidature;

    private int idcandidate;

    private String name;

    private String surname;

    private String surname2;

    private String dni;

    private String birthdate;

    private String telf;

    private String email;

    @OneToOne                       //ONE TO ONE POR AHORA
    @JoinColumn(name = "id")
    private Addreses addresses;

    @OneToOne
    @JoinColumn(name = "id")
    private Titulacion titulacion;

    public Candidatures() {
    }

    public Titulacion getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(Titulacion titulacion) {
        this.titulacion = titulacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdcandidature() {
        return idcandidature;
    }

    public void setIdcandidature(int idcandidature) {
        this.idcandidature = idcandidature;
    }

    public int getIdcandidate() {
        return idcandidate;
    }

    public void setIdcandidate(int idcandidate) {
        this.idcandidate = idcandidate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname2() {
        return surname2;
    }

    public void setSurname2(String surname2) {
        this.surname2 = surname2;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getTelf() {
        return telf;
    }

    public void setTelf(String telf) {
        this.telf = telf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Addreses getAddresses() {
        return addresses;
    }

    public void setAddresses(Addreses addresses) {
        this.addresses = addresses;
    }
}