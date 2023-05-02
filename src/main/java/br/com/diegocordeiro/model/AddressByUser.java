package br.com.diegocordeiro.model;

public class AddressByUser {

    private Integer idUser;

    private Integer idAddress;

    private String street;

    private Integer residenceNumber;

    public AddressByUser(Integer idUser, Integer idAddress, String street, Integer residenceNumber) {
        this.idUser = idUser;
        this.idAddress = idAddress;
        this.street = street;
        this.residenceNumber = residenceNumber;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public void setIdAddress(Integer idAddress) {
        this.idAddress = idAddress;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setResidenceNumber(Integer residenceNumber) {
        this.residenceNumber = residenceNumber;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public Integer getIdAddress() {
        return idAddress;
    }

    public String getStreet() {
        return street;
    }

    public Integer getResidenceNumber() {
        return residenceNumber;
    }

    @Override
    public String toString() {
        return "AddressByUser{" +
                "idUser=" + idUser +
                ", idAddress=" + idAddress +
                ", street='" + street + '\'' +
                ", residenceNumber=" + residenceNumber +
                '}';
    }
}
