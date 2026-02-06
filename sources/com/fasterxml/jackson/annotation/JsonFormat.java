package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Locale;
import java.util.TimeZone;

@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE})
@JacksonAnnotation
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonFormat {
    public static final String DEFAULT_LOCALE = "##default";
    public static final String DEFAULT_TIMEZONE = "##default";

    public enum Feature {
        ACCEPT_SINGLE_VALUE_AS_ARRAY,
        ACCEPT_CASE_INSENSITIVE_PROPERTIES,
        WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS,
        WRITE_DATES_WITH_ZONE_ID,
        WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED,
        WRITE_SORTED_MAP_ENTRIES,
        ADJUST_DATES_TO_CONTEXT_TIME_ZONE
    }

    public static class Features {
        private static final Features EMPTY = new Features(0, 0);
        private final int _disabled;
        private final int _enabled;

        private Features(int i10, int i11) {
            this._enabled = i10;
            this._disabled = i11;
        }

        public static Features construct(JsonFormat jsonFormat) {
            return construct(jsonFormat.with(), jsonFormat.without());
        }

        public static Features empty() {
            return EMPTY;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            Features features = (Features) obj;
            if (features._enabled == this._enabled && features._disabled == this._disabled) {
                return true;
            }
            return false;
        }

        public Boolean get(Feature feature) {
            int ordinal = 1 << feature.ordinal();
            if ((this._disabled & ordinal) != 0) {
                return Boolean.FALSE;
            }
            if ((ordinal & this._enabled) != 0) {
                return Boolean.TRUE;
            }
            return null;
        }

        public int hashCode() {
            return this._disabled + this._enabled;
        }

        public Features with(Feature... featureArr) {
            int i10 = this._enabled;
            for (Feature ordinal : featureArr) {
                i10 |= 1 << ordinal.ordinal();
            }
            if (i10 == this._enabled) {
                return this;
            }
            return new Features(i10, this._disabled);
        }

        public Features withOverrides(Features features) {
            if (features == null) {
                return this;
            }
            int i10 = features._disabled;
            int i11 = features._enabled;
            if (i10 == 0 && i11 == 0) {
                return this;
            }
            int i12 = this._enabled;
            if (i12 == 0 && this._disabled == 0) {
                return features;
            }
            int i13 = ((~i10) & i12) | i11;
            int i14 = this._disabled;
            int i15 = i10 | ((~i11) & i14);
            if (i13 == i12 && i15 == i14) {
                return this;
            }
            return new Features(i13, i15);
        }

        public Features without(Feature... featureArr) {
            int i10 = this._disabled;
            for (Feature ordinal : featureArr) {
                i10 |= 1 << ordinal.ordinal();
            }
            if (i10 == this._disabled) {
                return this;
            }
            return new Features(this._enabled, i10);
        }

        public static Features construct(Feature[] featureArr, Feature[] featureArr2) {
            int i10 = 0;
            for (Feature ordinal : featureArr) {
                i10 |= 1 << ordinal.ordinal();
            }
            int i11 = 0;
            for (Feature ordinal2 : featureArr2) {
                i11 |= 1 << ordinal2.ordinal();
            }
            return new Features(i10, i11);
        }
    }

    public enum Shape {
        ANY,
        NATURAL,
        SCALAR,
        ARRAY,
        OBJECT,
        NUMBER,
        NUMBER_FLOAT,
        NUMBER_INT,
        STRING,
        BOOLEAN;

        public boolean isNumeric() {
            if (this == NUMBER || this == NUMBER_INT || this == NUMBER_FLOAT) {
                return true;
            }
            return false;
        }

        public boolean isStructured() {
            if (this == OBJECT || this == ARRAY) {
                return true;
            }
            return false;
        }
    }

    public static class Value implements JacksonAnnotationValue<JsonFormat>, Serializable {
        private static final Value EMPTY = new Value();
        private static final long serialVersionUID = 1;
        private final Features _features;
        private final Locale _locale;
        private final String _pattern;
        private final Shape _shape;
        private transient TimeZone _timezone;
        private final String _timezoneStr;

        public Value() {
            this("", Shape.ANY, "", "", Features.empty());
        }

        private static <T> boolean _equal(T t10, T t11) {
            if (t10 == null) {
                if (t11 == null) {
                    return true;
                }
                return false;
            } else if (t11 == null) {
                return false;
            } else {
                return t10.equals(t11);
            }
        }

        public static final Value empty() {
            return EMPTY;
        }

        public static Value forPattern(String str) {
            return new Value(str, (Shape) null, (Locale) null, (String) null, (TimeZone) null, Features.empty());
        }

        public static Value forShape(Shape shape) {
            return new Value((String) null, shape, (Locale) null, (String) null, (TimeZone) null, Features.empty());
        }

        public static final Value from(JsonFormat jsonFormat) {
            if (jsonFormat == null) {
                return null;
            }
            return new Value(jsonFormat);
        }

        public static Value merge(Value value, Value value2) {
            if (value == null) {
                return value2;
            }
            return value.withOverrides(value2);
        }

        public static Value mergeAll(Value... valueArr) {
            Value value = null;
            for (Value value2 : valueArr) {
                if (value2 != null) {
                    if (value != null) {
                        value2 = value.withOverrides(value2);
                    }
                    value = value2;
                }
            }
            return value;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            Value value = (Value) obj;
            if (this._shape != value._shape || !this._features.equals(value._features)) {
                return false;
            }
            if (!_equal(this._timezoneStr, value._timezoneStr) || !_equal(this._pattern, value._pattern) || !_equal(this._timezone, value._timezone) || !_equal(this._locale, value._locale)) {
                return false;
            }
            return true;
        }

        public Boolean getFeature(Feature feature) {
            return this._features.get(feature);
        }

        public Features getFeatures() {
            return this._features;
        }

        public Locale getLocale() {
            return this._locale;
        }

        public String getPattern() {
            return this._pattern;
        }

        public Shape getShape() {
            return this._shape;
        }

        public TimeZone getTimeZone() {
            TimeZone timeZone = this._timezone;
            if (timeZone != null) {
                return timeZone;
            }
            String str = this._timezoneStr;
            if (str == null) {
                return null;
            }
            TimeZone timeZone2 = TimeZone.getTimeZone(str);
            this._timezone = timeZone2;
            return timeZone2;
        }

        public boolean hasLocale() {
            if (this._locale != null) {
                return true;
            }
            return false;
        }

        public boolean hasPattern() {
            String str = this._pattern;
            if (str == null || str.length() <= 0) {
                return false;
            }
            return true;
        }

        public boolean hasShape() {
            if (this._shape != Shape.ANY) {
                return true;
            }
            return false;
        }

        public boolean hasTimeZone() {
            String str;
            if (this._timezone != null || ((str = this._timezoneStr) != null && !str.isEmpty())) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i10;
            String str = this._timezoneStr;
            if (str == null) {
                i10 = 1;
            } else {
                i10 = str.hashCode();
            }
            String str2 = this._pattern;
            if (str2 != null) {
                i10 ^= str2.hashCode();
            }
            int hashCode = i10 + this._shape.hashCode();
            Locale locale = this._locale;
            if (locale != null) {
                hashCode ^= locale.hashCode();
            }
            return hashCode + this._features.hashCode();
        }

        public String timeZoneAsString() {
            TimeZone timeZone = this._timezone;
            if (timeZone != null) {
                return timeZone.getID();
            }
            return this._timezoneStr;
        }

        public String toString() {
            return String.format("[pattern=%s,shape=%s,locale=%s,timezone=%s]", new Object[]{this._pattern, this._shape, this._locale, this._timezoneStr});
        }

        public Class<JsonFormat> valueFor() {
            return JsonFormat.class;
        }

        public Value withFeature(Feature feature) {
            Features with = this._features.with(feature);
            if (with == this._features) {
                return this;
            }
            return new Value(this._pattern, this._shape, this._locale, this._timezoneStr, this._timezone, with);
        }

        public Value withLocale(Locale locale) {
            return new Value(this._pattern, this._shape, locale, this._timezoneStr, this._timezone, this._features);
        }

        public final Value withOverrides(Value value) {
            Value value2;
            Features withOverrides;
            TimeZone timeZone;
            String str;
            if (value == null || value == (value2 = EMPTY)) {
                return this;
            }
            if (this == value2) {
                return value;
            }
            String str2 = value._pattern;
            if (str2 == null || str2.isEmpty()) {
                str2 = this._pattern;
            }
            String str3 = str2;
            Shape shape = value._shape;
            if (shape == Shape.ANY) {
                shape = this._shape;
            }
            Shape shape2 = shape;
            Locale locale = value._locale;
            if (locale == null) {
                locale = this._locale;
            }
            Locale locale2 = locale;
            Features features = this._features;
            if (features == null) {
                withOverrides = value._features;
            } else {
                withOverrides = features.withOverrides(value._features);
            }
            Features features2 = withOverrides;
            String str4 = value._timezoneStr;
            if (str4 == null || str4.isEmpty()) {
                str = this._timezoneStr;
                timeZone = this._timezone;
            } else {
                timeZone = value._timezone;
                str = str4;
            }
            return new Value(str3, shape2, locale2, str, timeZone, features2);
        }

        public Value withPattern(String str) {
            return new Value(str, this._shape, this._locale, this._timezoneStr, this._timezone, this._features);
        }

        public Value withShape(Shape shape) {
            return new Value(this._pattern, shape, this._locale, this._timezoneStr, this._timezone, this._features);
        }

        public Value withTimeZone(TimeZone timeZone) {
            return new Value(this._pattern, this._shape, this._locale, (String) null, timeZone, this._features);
        }

        public Value withoutFeature(Feature feature) {
            Features without = this._features.without(feature);
            if (without == this._features) {
                return this;
            }
            return new Value(this._pattern, this._shape, this._locale, this._timezoneStr, this._timezone, without);
        }

        public Value(JsonFormat jsonFormat) {
            this(jsonFormat.pattern(), jsonFormat.shape(), jsonFormat.locale(), jsonFormat.timezone(), Features.construct(jsonFormat));
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public Value(String str, Shape shape, String str2, String str3, Features features) {
            this(str, shape, (str2 == null || str2.length() == 0 || "##default".equals(str2)) ? null : new Locale(str2), (str3 == null || str3.length() == 0 || "##default".equals(str3)) ? null : str3, (TimeZone) null, features);
        }

        public Value(String str, Shape shape, Locale locale, TimeZone timeZone, Features features) {
            this._pattern = str;
            this._shape = shape == null ? Shape.ANY : shape;
            this._locale = locale;
            this._timezone = timeZone;
            this._timezoneStr = null;
            this._features = features == null ? Features.empty() : features;
        }

        public Value(String str, Shape shape, Locale locale, String str2, TimeZone timeZone, Features features) {
            this._pattern = str;
            this._shape = shape == null ? Shape.ANY : shape;
            this._locale = locale;
            this._timezone = timeZone;
            this._timezoneStr = str2;
            this._features = features == null ? Features.empty() : features;
        }

        @Deprecated
        public Value(String str, Shape shape, Locale locale, TimeZone timeZone) {
            this(str, shape, locale, timeZone, Features.empty());
        }

        @Deprecated
        public Value(String str, Shape shape, String str2, String str3) {
            this(str, shape, str2, str3, Features.empty());
        }

        @Deprecated
        public Value(String str, Shape shape, Locale locale, String str2, TimeZone timeZone) {
            this(str, shape, locale, str2, timeZone, Features.empty());
        }
    }

    String locale() default "##default";

    String pattern() default "";

    Shape shape() default Shape.ANY;

    String timezone() default "##default";

    Feature[] with() default {};

    Feature[] without() default {};
}
