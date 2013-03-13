/*
 *  Copyright (c) 2012, 2013, Werner Keil, Credit Suisse (Anatole Tresch).
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 * 
 * Contributors:
 *    Anatole Tresch - initial version.
 */
package javax.money.provider.impl;

import java.util.Enumeration;

import javax.money.convert.ConversionProvider;
import javax.money.convert.CurrencyConverter;
import javax.money.convert.ExchangeRateProvider;
import javax.money.convert.ExchangeRateType;

/**
 * Empty pseudo implementation for testing only.
 * 
 * @author Anatole Tresch
 */
public class TestConversionProvider implements ConversionProvider {

	@Override
	public CurrencyConverter getCurrencyConverter(ExchangeRateType type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ExchangeRateProvider getExchangeRateProvider(ExchangeRateType type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Enumeration<ExchangeRateType> getSupportedExchangeRateTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isSupportedExchangeRateType(ExchangeRateType type) {
		// TODO Auto-generated method stub
		return false;
	}

}