package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IHospitalDao;
import com.nt.model.Hospital;

@Service("hospservice")
public class HospitalServiceImpl implements IHospitalService {

	@Autowired
	private IHospitalDao hopitalDAO;

	@Override
	public List<Hospital> fetchAllHospitalByLocation(String location1, String location2, String location3)
			throws Exception {

		// use DAO Methods
		List<Hospital> list = hopitalDAO.getHospitalByLocation(location1, location2, location3);

		// sort the object in the List Collection
		list.sort((t1, t2) -> t1.getHno().compareTo(t2.getHno()));

		// returning the DAO data in the list
		return list;
	}

}
