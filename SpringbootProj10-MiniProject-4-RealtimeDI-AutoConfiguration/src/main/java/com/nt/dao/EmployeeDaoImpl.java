package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;

@Repository("empDao")
public class EmployeeDaoImpl implements IEmployeeDAO {

	// Select Query
	private static final String GET_EMPS_QUERY = "SELECT EMPNO, ENAME, JOB, SAL, DEPTNO FROM EMP WHERE JOB IN(?, ?, ?) ORDER BY JOB";

	@Autowired
	private DataSource ds;

	@Override
	public List<Employee> getEmployeeByDegs(String desg1, String desg2, String desg3) throws Exception {

		List<Employee> list = null;

		// gives pooled jdbc connection object
		try (Connection con = ds.getConnection(); PreparedStatement ps = con.prepareStatement(GET_EMPS_QUERY);) {

			// set values to query parameter
			ps.setString(1, desg1);
			ps.setString(2, desg2);
			ps.setString(3, desg3);

			// Execute the SQL query
			try (ResultSet rs = ps.executeQuery()) {

				// copy each record of the ResultSet to model class object
				while (rs.next()) {
					Employee emp = new Employee();
					emp.setEno(rs.getInt(1));
					emp.setEname(rs.getString(2));
					emp.setJob(rs.getString(3));
					emp.setSal(rs.getDouble(4));
					emp.setDeptno(rs.getInt(5));

					// add each Model to class object to rs
					list.add(emp);
				}
			}
		} catch (SQLException se) {
			se.printStackTrace();
			throw se;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return list;
	}

}
