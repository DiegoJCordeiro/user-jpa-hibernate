package br.com.diegocordeiro.business.implementation;

import br.com.diegocordeiro.business.Business;
import br.com.diegocordeiro.dao.DAO;
import br.com.diegocordeiro.dao.implementation.UserDAO;
import br.com.diegocordeiro.model.User;

public class PutUserBusiness implements Business<User> {

    private final User user;

    private final DAO<User> dao;

    public PutUserBusiness(User user) {
        this.user = user;
        this.dao = new UserDAO();
    }

    @Override
    public User execute() {
        this.dao.save(user);
        return user;
    }
}
