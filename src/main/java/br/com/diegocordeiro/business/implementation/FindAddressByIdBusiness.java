package br.com.diegocordeiro.business.implementation;

import br.com.diegocordeiro.business.Business;
import br.com.diegocordeiro.dao.implementation.AddressDAO;
import br.com.diegocordeiro.model.Address;

import java.util.List;

public class FindAddressByIdBusiness implements Business<Address> {

    private final Long id;

    private AddressDAO dao;

    public FindAddressByIdBusiness(Long id){
        this.id = id;
    }

    @Override
    public Address execute() {
        this.dao = new AddressDAO();

        return this.dao.findById(id);
    }
}
