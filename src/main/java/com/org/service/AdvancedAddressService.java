package com.org.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.InterfService.InterfaceAddressService;
import com.org.interfRepository.AddressRepository;
import com.org.modal.Address;
import com.org.modal.CoachingInstitute;

@Service
public class AdvancedAddressService implements InterfaceAddressService {

	 @Autowired
	 AddressRepository addressRepository;
	
	@Override
	public List<Address> getAllDetails() {
		return addressRepository.findAll();
	}

}
