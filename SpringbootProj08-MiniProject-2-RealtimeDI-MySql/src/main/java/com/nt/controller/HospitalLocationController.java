package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Hospital;
import com.nt.service.IHospitalService;

@Controller("hcontroller")
public class HospitalLocationController {

	@Autowired
	private IHospitalService hospService;

	// controller class object
	public List<Hospital> showAllHospitalByLocation(String location1, String location2, String location3)
			throws Exception {

		// Calling the service method
		List<Hospital> list = hospService.fetchAllHospitalByLocation(location1, location2, location3);

		return list;
	}

}
