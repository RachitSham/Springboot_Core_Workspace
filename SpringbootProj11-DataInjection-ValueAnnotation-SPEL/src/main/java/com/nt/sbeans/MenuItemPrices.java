package com.nt.sbeans;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component("menup")
@Data
public class MenuItemPrices {

	private float dosaPrice;
	private float idlyPrice;
	private float pohaPrice;
	private float vadaPavPrice;
}
