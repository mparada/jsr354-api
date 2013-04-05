/**
 * CREDIT SUISSE IS WILLING TO LICENSE THIS SPECIFICATION TO YOU ONLY UPON THE CONDITION THAT YOU ACCEPT ALL OF THE TERMS CONTAINED IN THIS AGREEMENT. PLEASE READ THE TERMS AND CONDITIONS OF THIS AGREEMENT CAREFULLY. BY DOWNLOADING THIS SPECIFICATION, YOU ACCEPT THE TERMS AND CONDITIONS OF THE AGREEMENT. IF YOU ARE NOT WILLING TO BE BOUND BY IT, SELECT THE "DECLINE" BUTTON AT THE BOTTOM OF THIS PAGE.
 *
 * Specification:  JSR-354  Money and Currency API ("Specification")
 *
 * Copyright (c) 2012-2013, Credit Suisse
 * All rights reserved.
 */
package javax.money.provider.impl;

import java.util.Enumeration;
import java.util.Locale;

import javax.money.CurrencyUnit;
import javax.money.provider.HistoricCurrencyUnitProvider;

/**
 * Empty pseudo implementation for testing only.
 * 
 * @author Anatole Tresch
 * 
 */
public class TestHistoricCurrencyUnitProvider implements
		HistoricCurrencyUnitProvider {

	@Override
	public String getDefaultNamespace() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CurrencyUnit get(String namespace, String code, Long timestamp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CurrencyUnit get(String code, Long timestamp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAvailable(String namespace, String code, Long timestamp) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAvailable(String namespace, String code, Long start,
			Long end) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAvailable(String code, Long timestamp) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Enumeration<CurrencyUnit> getAll(String namespace, Long timestamp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Enumeration<CurrencyUnit> getAll(Locale locale, Long timestamp) {
		// TODO Auto-generated method stub
		return null;
	}

}
