package br.com.diegocordeiro.business.implementation;

import br.com.diegocordeiro.business.Business;
import br.com.diegocordeiro.dao.DAO;
import br.com.diegocordeiro.dao.implementation.AddressByUserDAO;
import br.com.diegocordeiro.model.AddressByUser;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAddressByUser implements Business<List<AddressByUser>> {

    private String QUERY_NAME = "address.findByUser";

    private final DAO<AddressByUser> dao;

    private final Long userId;

    public FindAddressByUser(Long userId){

        this.dao = new AddressByUserDAO();
        this.userId = userId;
    }

    @Override
    public List<AddressByUser> execute() {

        Map<String, Object> parameters = new HashMap<>();
        parameters.put("userId", this.userId);

        return this.dao.find(QUERY_NAME, parameters);
    }
}
