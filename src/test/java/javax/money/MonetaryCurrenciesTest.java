/*
 * Copyright (c) 2012, 2013, Credit Suisse (Anatole Tresch), Werner Keil.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 * 
 * Contributors: Anatole Tresch - initial implementation Wernner Keil -
 * extensions and adaptions.
 */
package javax.money;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Locale;

import org.junit.Test;

/**
 * Tests for the {@link CurrencyUnitImpl} class.
 * 
 * @author Anatole Tresch
 */
public class MonetaryCurrenciesTest {

	@Test
	public void testgetCurrencyString() {
		CurrencyUnit cur = MonetaryCurrencies.getCurrency("test1");
		assertNotNull(cur);
		assertEquals(cur.getCurrencyCode(), "test1");
		assertEquals(cur.getNumericCode(), 1);
		assertEquals(cur.getDefaultFractionDigits(),
				2);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testgetCurrencyString_NA() {
		MonetaryCurrencies.getCurrency("testGetInstanceCurrency_NA");
	}

	@Test
	public void testgetCurrencyLocale() {
		CurrencyUnit cur = MonetaryCurrencies.getCurrency(new Locale("",
				"TEST1L"));
		assertNotNull(cur);
		assertEquals(cur.getCurrencyCode(), "TEST1L");
		assertEquals(cur.getNumericCode(), 1);
		assertEquals(cur.getDefaultFractionDigits(),
				2);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testgetCurrencyLocale_NA() {
		MonetaryCurrencies.getCurrency(new Locale("", "sdsdsd"));
	}

}
