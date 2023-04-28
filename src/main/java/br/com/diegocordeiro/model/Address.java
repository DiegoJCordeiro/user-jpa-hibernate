package br.com.diegocordeiro.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Table(name = "TB_ADDRESS", schema = "PUBLIC")
@Entity
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String street;

    private String neighborhood;

    @Column(name = "RESIDENCE_NUMBER")
    private Integer number;

    @Column(name = "CITY")
    private String city;


    @Column(name = "STATE")
    private String state;

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "PRINCIPAL")
    private Boolean principal;

    public Address() {
    }

    public Address(String street, String neighborhood, Integer number, String city, String state, String country, Boolean principal) {
        this.street = street;
        this.neighborhood = neighborhood;
        this.number = number;
        this.city = city;
        this.state = state;
        this.country = country;
        this.principal = principal;

    }

    public Address(Long id, String street, String neighborhood, Integer number, String city, String state, String country, Boolean principal) {
        this.id = id;
        this.street = street;
        this.neighborhood = neighborhood;
        this.number = number;
        this.city = city;
        this.state = state;
        this.country = country;
        this.principal = principal;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Boolean getPrincipal() {
        return principal;
    }

    public void setPrincipal(Boolean principal) {
        this.principal = principal;
    }
}
