package br.com.diegocordeiro.dao.implementation;

import br.com.diegocordeiro.configuration.PersistenceUnit;
import br.com.diegocordeiro.dao.DAO;
import br.com.diegocordeiro.model.User;

public class UserDAO extends DAO<User> {

    public UserDAO(){
        super(PersistenceUnit.POSTGRESQL, User.class);
    }
}
