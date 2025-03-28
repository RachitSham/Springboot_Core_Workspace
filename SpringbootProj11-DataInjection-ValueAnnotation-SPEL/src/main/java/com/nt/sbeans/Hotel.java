package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hotel")
public class Hotel {

	// Values Collected from Properties File 
	
	@Value("12345") // Direct Value Injection
	private Integer hotelId;
	
	@Value("${hotel.name}")            
	private String hotelName;
	
	@Value("${hotel.addrs}")
	private String hotelAddrs;
	
	@Value("${hotel.contactno}")
	private String mobileNo;
	
	@Value("${customer.name}")
	private String custName;
	
	@Value("#{menup.idlyPrice + menup.dosaPrice}") // Spell for Arithmetic Operation
	private float billAmount;
	
	
	// Injecting System property
	@Value("${os.name}") // os.name is fixed system property key
	private String osName;
	
	@Value("${user.name}") // user.name is fixed system property key
	private String windowUser;
	
	// Injecting Environment variable value 
	@Value("${path}") // path is fixed env variable name
	private String pathData;
	
	// toString
	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", hotelAddrs=" + hotelAddrs + ", mobileNo="
				+ mobileNo + ", custName=" + custName + ", billAmountt=" + billAmount + ", osName=" + osName
				+ ", windowUser=" + windowUser + ", pathData=" + pathData + "]";
	}
	
	
	
	
}
