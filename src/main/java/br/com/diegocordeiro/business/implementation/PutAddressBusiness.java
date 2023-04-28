package br.com.diegocordeiro.business.implementation;

import br.com.diegocordeiro.business.Business;
import br.com.diegocordeiro.dao.DAO;
import br.com.diegocordeiro.dao.implementation.AddressDAO;
import br.com.diegocordeiro.model.Address;

public class PutAddressBusiness implements Business<Address> {

    private final Address address;

    private final DAO<Address> dao;

    public PutAddressBusiness(Address address){
        this.address = address;
        this.dao = new AddressDAO();
    }

    @Override
    public Address execute() {

        this.dao.save(address);

        return this.address;
    }
}
