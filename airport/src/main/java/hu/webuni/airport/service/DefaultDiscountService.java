package hu.webuni.airport.service;

import org.springframework.stereotype.Service;

import hu.webuni.airport.config.AirportConfigProperties;

@Service
public class DefaultDiscountService implements DiscountService{

	AirportConfigProperties config;
	
	@Override
	public int getDiscountPercent(int totalPrice) {
		return config.getDiscount().getDef().getPercent();
	}

}
