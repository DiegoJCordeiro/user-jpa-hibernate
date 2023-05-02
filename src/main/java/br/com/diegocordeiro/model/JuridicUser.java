package br.com.diegocordeiro.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.List;

@Table(name = "TB_JURIDIC_USERS", schema = "public")
@Entity
public class JuridicUser extends User {

    @Column(name = "CNPJ")
    private String cnpj;

    public JuridicUser() {
    }

    public JuridicUser(String cnpj) {
        this.cnpj = cnpj;
    }

    public JuridicUser(String username, String fullName, String email, Integer age, List<Address> address, Role role, String password, String cnpj) {
        super(username, fullName, email, age, address, role, password);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
