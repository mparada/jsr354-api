/*
 * CREDIT SUISSE IS WILLING TO LICENSE THIS SPECIFICATION TO YOU ONLY UPON THE CONDITION THAT YOU
 * ACCEPT ALL OF THE TERMS CONTAINED IN THIS AGREEMENT. PLEASE READ THE TERMS AND CONDITIONS OF THIS
 * AGREEMENT CAREFULLY. BY DOWNLOADING THIS SPECIFICATION, YOU ACCEPT THE TERMS AND CONDITIONS OF
 * THE AGREEMENT. IF YOU ARE NOT WILLING TO BE BOUND BY IT, SELECT THE "DECLINE" BUTTON AT THE
 * BOTTOM OF THIS PAGE. Specification: JSR-354 Money and Currency API ("Specification") Copyright
 * (c) 2012-2014, Credit Suisse All rights reserved.
 */
package javax.money.format;

import javax.money.AbstractQueryBuilder;
import javax.money.MonetaryAmountFactoryQuery;
import javax.money.MonetaryContext;
import java.util.Locale;
import java.util.Objects;

/**
 * Builder for queries for accessing/configuring {@link javax.money.format.MonetaryAmountFormat} instances.
 * <p>
 * Note this class is NOT thread-safe.
 */
public final class AmountFormatQueryBuilder extends AbstractQueryBuilder<AmountFormatQueryBuilder,AmountFormatQuery>{

    private static final String DEFAULT_FORMAT_NAME = "default";

    /**
     * Creates a new {@link AmountFormatQueryBuilder}.
     *
     * @param style the base {@link AmountFormatContext}, not {@code null}.
     */
    private AmountFormatQueryBuilder(AmountFormatQuery style){
        importContext(style);
    }

    /**
     * Creates a new {@link AmountFormatQueryBuilder}.
     *
     * @param formatName the target format's name {@link String}, not {@code null}.
     */
    private AmountFormatQueryBuilder(String formatName){
        Objects.requireNonNull(formatName, "formatName required.");
        set(AmountFormatQuery.FORMAT_NAME, formatName);
    }

    /**
     * Creates a new default {@link AmountFormatQueryBuilder} for a formatter based on the
     * locale specific
     * defaults.
     *
     * @param locale the target {@link java.util.Locale}, not {@code null}.
     */
    private AmountFormatQueryBuilder(Locale locale){
        Objects.requireNonNull(locale, "locale required.");
        setLocale(locale);
        set(AmountFormatQuery.FORMAT_NAME, DEFAULT_FORMAT_NAME);
        set(locale);
    }

    /**
     * Sets a style's id.
     *
     * @param formatName the format's name, not null.
     * @return the Builder, for chaining.
     */
    public AmountFormatQueryBuilder setFormatName(String formatName){
        return set(AmountFormatQuery.FORMAT_NAME, formatName);
    }

    /**
     * Sets a Locale to be applied.
     *
     * @param locale the locale, not null.
     * @return the Builder, for chaining.
     */
    public AmountFormatQueryBuilder setLocale(Locale locale){
        return set(locale);
    }

    /**
     * Sets the {@link javax.money.MonetaryContext} to be used, when amount's are parsed.
     *
     * @param monetaryQuery the monetary query, not {@code null}.
     * @return this builder for chaining.
     */
    public AmountFormatQueryBuilder setMonetaryQuery(MonetaryAmountFactoryQuery monetaryQuery){
        Objects.requireNonNull(monetaryQuery);
        return set(monetaryQuery);
    }

    /**
     * Creates a new {@link javax.money.format.AmountFormatQuery} instance.
     *
     * @return a new {@link javax.money.format.AmountFormatQuery} instance, never null.
     */
    public AmountFormatQuery build(){
        return new AmountFormatQuery(this);
    }

    /**
     * Creates a new {@link AmountFormatQueryBuilder} and initializes it with the values from {@code formatQuery.
     *
     * @param formatQuery the base {@link AmountFormatContext}, not {@code null}.
     * @return a new {@link javax.money.format.AmountFormatQueryBuilder} instance, never null.
     */
    public static AmountFormatQueryBuilder create(AmountFormatQuery formatQuery){
        return new AmountFormatQueryBuilder(formatQuery);
    }

    /**
     * Creates a new {@link AmountFormatQueryBuilder}.
     *
     * @param formatName the target format's name {@link String}, not {@code null}.
     * @return a new {@link javax.money.format.AmountFormatQueryBuilder} instance, never null.
     */
    public static AmountFormatQueryBuilder create(String formatName){
        return new AmountFormatQueryBuilder(formatName);
    }

    /**
     * Creates a new default {@link AmountFormatQueryBuilder} for a formatter based on the
     * locale specific
     * defaults.
     *
     * @param locale the target {@link java.util.Locale}, not {@code null}.
     * @return a new {@link javax.money.format.AmountFormatQueryBuilder} instance, never null.
     */
    public static AmountFormatQueryBuilder create(Locale locale){
        return new AmountFormatQueryBuilder(locale);
    }
}