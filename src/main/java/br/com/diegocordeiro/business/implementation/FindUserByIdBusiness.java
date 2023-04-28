package br.com.diegocordeiro.business.implementation;

import br.com.diegocordeiro.business.Business;
import br.com.diegocordeiro.dao.DAO;
import br.com.diegocordeiro.dao.implementation.UserDAO;
import br.com.diegocordeiro.model.User;

public class FindUserByIdBusiness implements Business<User> {

    private final Long id;

    private final DAO<User> dao;

    public FindUserByIdBusiness(Long id){
        this.id = id;
        this.dao = new UserDAO();
    }

    @Override
    public User execute() {

        return this.dao.findById(this.id);
    }
}
