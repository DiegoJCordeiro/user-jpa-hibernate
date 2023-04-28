package br.com.diegocordeiro.model;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

@Table(name = "TB_USERS", schema = "PUBLIC")
@Entity
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "USERNAME")
    private String username;


    @Column(name = "FULL_NAME")
    private String fullName;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "AGE")
    private Integer age;


    @OneToMany
    @JoinTable(name = "TB_USERS_ADDRESS" , schema = "PUBLIC",
            joinColumns = @JoinColumn(name = "USER_ID", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "ADDRESS_ID", referencedColumnName = "id")
    )
    private List<Address> address;

    @ManyToOne
    @JoinColumn(name = "ROLE_ID")
    private Role role;

    @Column(name = "PASSWORD")
    private String password;

    public User() {
    }

    public User(String username, String fullName, String email, Integer age, List<Address> address, Role role, String password) {
        this.username = username;
        this.fullName = fullName;
        this.email = email;
        this.age = age;
        this.address = address;
        this.role = role;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
