package br.com.diegocordeiro.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.List;

@Table(name = "TB_PERSONAL_USERS", schema = "public")
@Entity
public class PersonalUser extends User {

    @Column(name = "CPF")
    private String cpf;

    public PersonalUser() {}

    public PersonalUser(String cpf) {
        this.cpf = cpf;
    }

    public PersonalUser(String username, String fullName, String email, Integer age, List<Address> address, Role role, String password, String cpf) {
        super(username, fullName, email, age, address, role, password);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
