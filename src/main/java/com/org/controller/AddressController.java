package com.org.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.org.modal.Address;
import com.org.service.AdvancedAddressService;

@Controller
@RequestMapping("/")
public class AddressController {
	
	@Autowired
	AdvancedAddressService addressService;
	
	@GetMapping("/getAddressTotalDetails")
	public String getAllDetails(Model model) {
		model.addAttribute("address", addressService.getAllDetails());
/*		
		for(Address data :  addressService.getAllDetails()) {
			System.out.println(data.getLocation());
			System.out.println(data.g);
			System.out.println(data.getLocation());
			System.out.println(data.getLocation());
		} */
		
		
		return "address";
	}

}
