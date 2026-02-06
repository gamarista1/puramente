package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.TimeZone;

public class DateDeserializers {
    private static final HashSet<String> _classNames = new HashSet<>();

    @JacksonStdImpl
    public static class CalendarDeserializer extends DateBasedDeserializer<Calendar> {
        protected final Class<? extends Calendar> _calendarClass;

        public CalendarDeserializer() {
            super(Calendar.class);
            this._calendarClass = null;
        }

        public /* bridge */ /* synthetic */ JsonDeserializer createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
            return super.createContextual(deserializationContext, beanProperty);
        }

        public Calendar deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            Date _parseDate = _parseDate(jsonParser, deserializationContext);
            if (_parseDate == null) {
                return null;
            }
            Class<? extends Calendar> cls = this._calendarClass;
            if (cls == null) {
                return deserializationContext.constructCalendar(_parseDate);
            }
            try {
                Calendar calendar = (Calendar) cls.newInstance();
                calendar.setTimeInMillis(_parseDate.getTime());
                TimeZone timeZone = deserializationContext.getTimeZone();
                if (timeZone != null) {
                    calendar.setTimeZone(timeZone);
                }
                return calendar;
            } catch (Exception e10) {
                return (Calendar) deserializationContext.handleInstantiationProblem(this._calendarClass, _parseDate, e10);
            }
        }

        /* access modifiers changed from: protected */
        public CalendarDeserializer withDateFormat(DateFormat dateFormat, String str) {
            return new CalendarDeserializer(this, dateFormat, str);
        }

        public CalendarDeserializer(Class<? extends Calendar> cls) {
            super(cls);
            this._calendarClass = cls;
        }

        public CalendarDeserializer(CalendarDeserializer calendarDeserializer, DateFormat dateFormat, String str) {
            super(calendarDeserializer, dateFormat, str);
            this._calendarClass = calendarDeserializer._calendarClass;
        }
    }

    @JacksonStdImpl
    public static class DateDeserializer extends DateBasedDeserializer<Date> {
        public static final DateDeserializer instance = new DateDeserializer();

        public DateDeserializer() {
            super(Date.class);
        }

        public /* bridge */ /* synthetic */ JsonDeserializer createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
            return super.createContextual(deserializationContext, beanProperty);
        }

        public DateDeserializer(DateDeserializer dateDeserializer, DateFormat dateFormat, String str) {
            super(dateDeserializer, dateFormat, str);
        }

        public Date deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return _parseDate(jsonParser, deserializationContext);
        }

        /* access modifiers changed from: protected */
        public DateDeserializer withDateFormat(DateFormat dateFormat, String str) {
            return new DateDeserializer(this, dateFormat, str);
        }
    }

    public static class SqlDateDeserializer extends DateBasedDeserializer<java.sql.Date> {
        public SqlDateDeserializer() {
            super(java.sql.Date.class);
        }

        public /* bridge */ /* synthetic */ JsonDeserializer createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
            return super.createContextual(deserializationContext, beanProperty);
        }

        public SqlDateDeserializer(SqlDateDeserializer sqlDateDeserializer, DateFormat dateFormat, String str) {
            super(sqlDateDeserializer, dateFormat, str);
        }

        public java.sql.Date deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            Date _parseDate = _parseDate(jsonParser, deserializationContext);
            if (_parseDate == null) {
                return null;
            }
            return new java.sql.Date(_parseDate.getTime());
        }

        /* access modifiers changed from: protected */
        public SqlDateDeserializer withDateFormat(DateFormat dateFormat, String str) {
            return new SqlDateDeserializer(this, dateFormat, str);
        }
    }

    public static class TimestampDeserializer extends DateBasedDeserializer<Timestamp> {
        public TimestampDeserializer() {
            super(Timestamp.class);
        }

        public /* bridge */ /* synthetic */ JsonDeserializer createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
            return super.createContextual(deserializationContext, beanProperty);
        }

        public TimestampDeserializer(TimestampDeserializer timestampDeserializer, DateFormat dateFormat, String str) {
            super(timestampDeserializer, dateFormat, str);
        }

        public Timestamp deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            Date _parseDate = _parseDate(jsonParser, deserializationContext);
            if (_parseDate == null) {
                return null;
            }
            return new Timestamp(_parseDate.getTime());
        }

        /* access modifiers changed from: protected */
        public TimestampDeserializer withDateFormat(DateFormat dateFormat, String str) {
            return new TimestampDeserializer(this, dateFormat, str);
        }
    }

    static {
        Class[] clsArr = {Calendar.class, GregorianCalendar.class, java.sql.Date.class, Date.class, Timestamp.class};
        for (int i10 = 0; i10 < 5; i10++) {
            _classNames.add(clsArr[i10].getName());
        }
    }

    public static JsonDeserializer<?> find(Class<?> cls, String str) {
        if (!_classNames.contains(str)) {
            return null;
        }
        if (cls == Calendar.class) {
            return new CalendarDeserializer();
        }
        if (cls == Date.class) {
            return DateDeserializer.instance;
        }
        if (cls == java.sql.Date.class) {
            return new SqlDateDeserializer();
        }
        if (cls == Timestamp.class) {
            return new TimestampDeserializer();
        }
        Class<GregorianCalendar> cls2 = GregorianCalendar.class;
        if (cls == cls2) {
            return new CalendarDeserializer(cls2);
        }
        return null;
    }

    protected static abstract class DateBasedDeserializer<T> extends StdScalarDeserializer<T> implements ContextualDeserializer {
        protected final DateFormat _customFormat;
        protected final String _formatString;

        protected DateBasedDeserializer(Class<?> cls) {
            super(cls);
            this._customFormat = null;
            this._formatString = null;
        }

        /* access modifiers changed from: protected */
        public Date _parseDate(JsonParser jsonParser, DeserializationContext deserializationContext) {
            Date parse;
            if (this._customFormat != null) {
                JsonToken currentToken = jsonParser.getCurrentToken();
                if (currentToken == JsonToken.VALUE_STRING) {
                    String trim = jsonParser.getText().trim();
                    if (trim.length() == 0) {
                        return (Date) getEmptyValue(deserializationContext);
                    }
                    synchronized (this._customFormat) {
                        try {
                            parse = this._customFormat.parse(trim);
                        } catch (ParseException unused) {
                            return (Date) deserializationContext.handleWeirdStringValue(handledType(), trim, "expected format \"%s\"", this._formatString);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return parse;
                } else if (currentToken == JsonToken.START_ARRAY && deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                    jsonParser.nextToken();
                    Date _parseDate = _parseDate(jsonParser, deserializationContext);
                    if (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                        handleMissingEndArrayForSingle(jsonParser, deserializationContext);
                    }
                    return _parseDate;
                }
            }
            return super._parseDate(jsonParser, deserializationContext);
        }

        public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
            JsonFormat.Value findFormatOverrides;
            DateFormat dateFormat;
            Locale locale;
            Locale locale2;
            if (!(beanProperty == null || (findFormatOverrides = findFormatOverrides(deserializationContext, beanProperty, handledType())) == null)) {
                TimeZone timeZone = findFormatOverrides.getTimeZone();
                if (findFormatOverrides.hasPattern()) {
                    String pattern = findFormatOverrides.getPattern();
                    if (findFormatOverrides.hasLocale()) {
                        locale2 = findFormatOverrides.getLocale();
                    } else {
                        locale2 = deserializationContext.getLocale();
                    }
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, locale2);
                    if (timeZone == null) {
                        timeZone = deserializationContext.getTimeZone();
                    }
                    simpleDateFormat.setTimeZone(timeZone);
                    return withDateFormat(simpleDateFormat, pattern);
                } else if (timeZone != null) {
                    DateFormat dateFormat2 = deserializationContext.getConfig().getDateFormat();
                    if (dateFormat2.getClass() == StdDateFormat.class) {
                        if (findFormatOverrides.hasLocale()) {
                            locale = findFormatOverrides.getLocale();
                        } else {
                            locale = deserializationContext.getLocale();
                        }
                        dateFormat = ((StdDateFormat) dateFormat2).withTimeZone(timeZone).withLocale(locale);
                    } else {
                        dateFormat = (DateFormat) dateFormat2.clone();
                        dateFormat.setTimeZone(timeZone);
                    }
                    return withDateFormat(dateFormat, this._formatString);
                }
            }
            return this;
        }

        /* access modifiers changed from: protected */
        public abstract DateBasedDeserializer<T> withDateFormat(DateFormat dateFormat, String str);

        protected DateBasedDeserializer(DateBasedDeserializer<T> dateBasedDeserializer, DateFormat dateFormat, String str) {
            super(dateBasedDeserializer._valueClass);
            this._customFormat = dateFormat;
            this._formatString = str;
        }
    }
}
