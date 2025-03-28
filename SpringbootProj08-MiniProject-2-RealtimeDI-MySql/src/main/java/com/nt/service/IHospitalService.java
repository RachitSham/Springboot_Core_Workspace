package com.nt.service;

import java.util.List;

import com.nt.model.Hospital;

public interface IHospitalService {

	public List<Hospital> fetchAllHospitalByLocation(String location1, String location2, String location3)throws Exception;
}
