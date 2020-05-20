package com.formacion.back.entity;

import javax.persistence.*;

@Entity
@Table(name = "titulacionpracticas")
public class Titulacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String organization;
    private String telf;
    private String name;
    @OneToOne
    @JoinColumn(name = "id")
    private Addreses address;

    public Titulacion() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getTelf() {
        return telf;
    }

    public void setTelf(String telf) {
        this.telf = telf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Addreses getAddress() {
        return address;
    }

    public void setAddress(Addreses address) {
        this.address = address;
    }
}
