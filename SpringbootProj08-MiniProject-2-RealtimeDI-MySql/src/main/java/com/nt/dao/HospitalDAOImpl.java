package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.Hospital;

@Repository("hospitalDAO")
public class HospitalDAOImpl implements IHospitalDao {

	// SELECT QUERY
	public static final String GET_HOSPITAL_QUERY = "SELECT HNO, HNAME, LOCATION, HPHONENO FROM HOSPITAL WHERE LOCATION IN(?, ?, ?) ORDER BY LOCATION";

	@Autowired
	private DataSource ds;

	@Override
	public List<Hospital> getHospitalByLocation(String location1, String location2, String location3) throws Exception {

		List<Hospital> list = new ArrayList<Hospital>();

		try ( // get the JDBC pooled connection
				Connection con = ds.getConnection();

				PreparedStatement ps = con.prepareStatement(GET_HOSPITAL_QUERY);) {

			// set values to query parameter
			ps.setString(1, location1);
			ps.setString(2, location2);
			ps.setString(3, location3);

			// Execute the SQL Query
			try (ResultSet rs = ps.executeQuery();) {

				// copy each record of the ResultSet to model class object
				while (rs.next()) {
					Hospital hosp = new Hospital();
					hosp.setHno(rs.getInt(1));
					hosp.setHname(rs.getString(2));
					hosp.setLocation(rs.getString(3));
					hosp.setHphoneno(rs.getLong(4));

					list.add(hosp);
				}

			} catch (SQLException se) {
				se.printStackTrace();
				throw se;
			} catch (Exception e) {
				e.printStackTrace();
				throw e;
			}

		}
		return list;
	}

	// INSERT METHOD DEFINITION

}
