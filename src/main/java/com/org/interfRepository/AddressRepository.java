package com.org.interfRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.modal.Address;

public interface AddressRepository extends JpaRepository<Address,Long> {

}
