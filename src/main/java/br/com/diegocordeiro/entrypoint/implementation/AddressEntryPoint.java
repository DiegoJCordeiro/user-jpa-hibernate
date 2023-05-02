package br.com.diegocordeiro.entrypoint.implementation;

import br.com.diegocordeiro.business.Business;
import br.com.diegocordeiro.business.implementation.FindAddressByIdBusiness;
import br.com.diegocordeiro.business.implementation.FindAddressByUser;
import br.com.diegocordeiro.business.implementation.FindUserByIdBusiness;
import br.com.diegocordeiro.business.implementation.PutAddressBusiness;
import br.com.diegocordeiro.entrypoint.EntryPoint;
import br.com.diegocordeiro.model.Address;
import br.com.diegocordeiro.model.AddressByUser;

import java.util.List;

public class AddressEntryPoint implements EntryPoint<Address> {

    @Override
    public Address put(Address address){

        Business<Address> business = new PutAddressBusiness(address);

        return business.execute();
    }

    @Override
    public Address findById(Long id) {
        Business<Address> business = new FindAddressByIdBusiness(id);

        return business.execute();
    }

    public List<AddressByUser> findBy(Long userId) {

        Business<List<AddressByUser>> business = new FindAddressByUser(userId);

        return business.execute();
    }
}
