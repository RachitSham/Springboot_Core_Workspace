package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("pInfo")
@Data
public class PatientInfo {

	@Value("1001") // Direct Value Injection
	private Integer pId;

	@Value("${pi.name}")
	private String pname;

	@Value("${pi.mobileNo}")
	private Long mobileNo;
	
	@Value("${pi.addrs}")
	private String paddrs;
	
	@Value("#{dcc.xrayPrice + dcc.ctscanPrice + dcc.ecgPrice}") // SPELL based Injection (dcc-bean id, xrayPrice-															// Property name)
	private Double billAmount;

	@Value("#{dcc.ecgPrice<=0}") // SPELL
	private boolean ecgfree;

	// fixed system property name
	@Value("${os.name}") // to hold system property value
	private String osName;

	// to hold env. variable value
	@Value("${path}")
	private String pathData;

}
