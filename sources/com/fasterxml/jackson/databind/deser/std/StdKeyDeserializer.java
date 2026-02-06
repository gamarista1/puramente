package com.fasterxml.jackson.databind.deser.std;

import com.amazon.a.a.o.b;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.EnumResolver;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

@JacksonStdImpl
public class StdKeyDeserializer extends KeyDeserializer implements Serializable {
    public static final int TYPE_BOOLEAN = 1;
    public static final int TYPE_BYTE = 2;
    public static final int TYPE_CALENDAR = 11;
    public static final int TYPE_CHAR = 4;
    public static final int TYPE_CLASS = 15;
    public static final int TYPE_CURRENCY = 16;
    public static final int TYPE_DATE = 10;
    public static final int TYPE_DOUBLE = 8;
    public static final int TYPE_FLOAT = 7;
    public static final int TYPE_INT = 5;
    public static final int TYPE_LOCALE = 9;
    public static final int TYPE_LONG = 6;
    public static final int TYPE_SHORT = 3;
    public static final int TYPE_URI = 13;
    public static final int TYPE_URL = 14;
    public static final int TYPE_UUID = 12;
    private static final long serialVersionUID = 1;
    protected final FromStringDeserializer<?> _deser;
    protected final Class<?> _keyClass;
    protected final int _kind;

    static final class DelegatingKD extends KeyDeserializer implements Serializable {
        private static final long serialVersionUID = 1;
        protected final JsonDeserializer<?> _delegate;
        protected final Class<?> _keyClass;

        protected DelegatingKD(Class<?> cls, JsonDeserializer<?> jsonDeserializer) {
            this._keyClass = cls;
            this._delegate = jsonDeserializer;
        }

        public final Object deserializeKey(String str, DeserializationContext deserializationContext) {
            if (str == null) {
                return null;
            }
            TokenBuffer tokenBuffer = new TokenBuffer(deserializationContext.getParser(), deserializationContext);
            tokenBuffer.writeString(str);
            try {
                JsonParser asParser = tokenBuffer.asParser();
                asParser.nextToken();
                Object deserialize = this._delegate.deserialize(asParser, deserializationContext);
                if (deserialize != null) {
                    return deserialize;
                }
                return deserializationContext.handleWeirdKey(this._keyClass, str, "not a valid representation", new Object[0]);
            } catch (Exception e10) {
                return deserializationContext.handleWeirdKey(this._keyClass, str, "not a valid representation: %s", e10.getMessage());
            }
        }

        public Class<?> getKeyClass() {
            return this._keyClass;
        }
    }

    @JacksonStdImpl
    static final class EnumKD extends StdKeyDeserializer {
        private static final long serialVersionUID = 1;
        protected final EnumResolver _byNameResolver;
        protected EnumResolver _byToStringResolver;
        protected final AnnotatedMethod _factory;

        protected EnumKD(EnumResolver enumResolver, AnnotatedMethod annotatedMethod) {
            super(-1, enumResolver.getEnumClass());
            this._byNameResolver = enumResolver;
            this._factory = annotatedMethod;
        }

        private EnumResolver _getToStringResolver(DeserializationContext deserializationContext) {
            EnumResolver enumResolver = this._byToStringResolver;
            if (enumResolver == null) {
                synchronized (this) {
                    enumResolver = EnumResolver.constructUnsafeUsingToString(this._byNameResolver.getEnumClass(), deserializationContext.getAnnotationIntrospector());
                }
            }
            return enumResolver;
        }

        public Object _parse(String str, DeserializationContext deserializationContext) {
            EnumResolver enumResolver;
            AnnotatedMethod annotatedMethod = this._factory;
            if (annotatedMethod != null) {
                try {
                    return annotatedMethod.call1(str);
                } catch (Exception e10) {
                    ClassUtil.unwrapAndThrowAsIAE(e10);
                }
            }
            if (deserializationContext.isEnabled(DeserializationFeature.READ_ENUMS_USING_TO_STRING)) {
                enumResolver = _getToStringResolver(deserializationContext);
            } else {
                enumResolver = this._byNameResolver;
            }
            Enum<?> findEnum = enumResolver.findEnum(str);
            if (findEnum != null || deserializationContext.getConfig().isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                return findEnum;
            }
            return deserializationContext.handleWeirdKey(this._keyClass, str, "not one of values excepted for Enum class: %s", enumResolver.getEnumIds());
        }
    }

    static final class StringCtorKeyDeserializer extends StdKeyDeserializer {
        private static final long serialVersionUID = 1;
        protected final Constructor<?> _ctor;

        public StringCtorKeyDeserializer(Constructor<?> constructor) {
            super(-1, constructor.getDeclaringClass());
            this._ctor = constructor;
        }

        public Object _parse(String str, DeserializationContext deserializationContext) {
            return this._ctor.newInstance(new Object[]{str});
        }
    }

    static final class StringFactoryKeyDeserializer extends StdKeyDeserializer {
        private static final long serialVersionUID = 1;
        final Method _factoryMethod;

        public StringFactoryKeyDeserializer(Method method) {
            super(-1, method.getDeclaringClass());
            this._factoryMethod = method;
        }

        public Object _parse(String str, DeserializationContext deserializationContext) {
            return this._factoryMethod.invoke((Object) null, new Object[]{str});
        }
    }

    @JacksonStdImpl
    static final class StringKD extends StdKeyDeserializer {
        private static final StringKD sObject = new StringKD(Object.class);
        private static final StringKD sString = new StringKD(String.class);
        private static final long serialVersionUID = 1;

        private StringKD(Class<?> cls) {
            super(-1, cls);
        }

        public static StringKD forType(Class<?> cls) {
            if (cls == String.class) {
                return sString;
            }
            if (cls == Object.class) {
                return sObject;
            }
            return new StringKD(cls);
        }

        public Object deserializeKey(String str, DeserializationContext deserializationContext) {
            return str;
        }
    }

    protected StdKeyDeserializer(int i10, Class<?> cls) {
        this(i10, cls, (FromStringDeserializer<?>) null);
    }

    public static StdKeyDeserializer forType(Class<?> cls) {
        int i10;
        if (cls == String.class || cls == Object.class || cls == CharSequence.class) {
            return StringKD.forType(cls);
        }
        if (cls == UUID.class) {
            i10 = 12;
        } else if (cls == Integer.class) {
            i10 = 5;
        } else if (cls == Long.class) {
            i10 = 6;
        } else if (cls == Date.class) {
            i10 = 10;
        } else if (cls == Calendar.class) {
            i10 = 11;
        } else if (cls == Boolean.class) {
            i10 = 1;
        } else if (cls == Byte.class) {
            i10 = 2;
        } else if (cls == Character.class) {
            i10 = 4;
        } else if (cls == Short.class) {
            i10 = 3;
        } else if (cls == Float.class) {
            i10 = 7;
        } else if (cls == Double.class) {
            i10 = 8;
        } else if (cls == URI.class) {
            i10 = 13;
        } else if (cls == URL.class) {
            i10 = 14;
        } else if (cls == Class.class) {
            i10 = 15;
        } else {
            Class<Locale> cls2 = Locale.class;
            if (cls == cls2) {
                return new StdKeyDeserializer(9, cls, FromStringDeserializer.findDeserializer(cls2));
            }
            Class<Currency> cls3 = Currency.class;
            if (cls == cls3) {
                return new StdKeyDeserializer(16, cls, FromStringDeserializer.findDeserializer(cls3));
            }
            return null;
        }
        return new StdKeyDeserializer(i10, cls);
    }

    /* access modifiers changed from: protected */
    public Object _parse(String str, DeserializationContext deserializationContext) {
        switch (this._kind) {
            case 1:
                if (b.f37475af.equals(str)) {
                    return Boolean.TRUE;
                }
                if (b.f37476ag.equals(str)) {
                    return Boolean.FALSE;
                }
                return deserializationContext.handleWeirdKey(this._keyClass, str, "value not 'true' or 'false'", new Object[0]);
            case 2:
                int _parseInt = _parseInt(str);
                if (_parseInt < -128 || _parseInt > 255) {
                    return deserializationContext.handleWeirdKey(this._keyClass, str, "overflow, value can not be represented as 8-bit value", new Object[0]);
                }
                return Byte.valueOf((byte) _parseInt);
            case 3:
                int _parseInt2 = _parseInt(str);
                if (_parseInt2 < -32768 || _parseInt2 > 32767) {
                    return deserializationContext.handleWeirdKey(this._keyClass, str, "overflow, value can not be represented as 16-bit value", new Object[0]);
                }
                return Short.valueOf((short) _parseInt2);
            case 4:
                if (str.length() == 1) {
                    return Character.valueOf(str.charAt(0));
                }
                return deserializationContext.handleWeirdKey(this._keyClass, str, "can only convert 1-character Strings", new Object[0]);
            case 5:
                return Integer.valueOf(_parseInt(str));
            case 6:
                return Long.valueOf(_parseLong(str));
            case 7:
                return Float.valueOf((float) _parseDouble(str));
            case 8:
                return Double.valueOf(_parseDouble(str));
            case 9:
                try {
                    return this._deser._deserialize(str, deserializationContext);
                } catch (IOException unused) {
                    return deserializationContext.handleWeirdKey(this._keyClass, str, "unable to parse key as locale", new Object[0]);
                }
            case 10:
                return deserializationContext.parseDate(str);
            case 11:
                Date parseDate = deserializationContext.parseDate(str);
                if (parseDate == null) {
                    return null;
                }
                return deserializationContext.constructCalendar(parseDate);
            case 12:
                try {
                    return UUID.fromString(str);
                } catch (Exception e10) {
                    return deserializationContext.handleWeirdKey(this._keyClass, str, "problem: %s", e10.getMessage());
                }
            case 13:
                try {
                    return URI.create(str);
                } catch (Exception e11) {
                    return deserializationContext.handleWeirdKey(this._keyClass, str, "problem: %s", e11.getMessage());
                }
            case TYPE_URL /*14*/:
                try {
                    return new URL(str);
                } catch (MalformedURLException e12) {
                    return deserializationContext.handleWeirdKey(this._keyClass, str, "problem: %s", e12.getMessage());
                }
            case TYPE_CLASS /*15*/:
                try {
                    return deserializationContext.findClass(str);
                } catch (Exception unused2) {
                    return deserializationContext.handleWeirdKey(this._keyClass, str, "unable to parse key as Class", new Object[0]);
                }
            case 16:
                try {
                    return this._deser._deserialize(str, deserializationContext);
                } catch (IOException unused3) {
                    return deserializationContext.handleWeirdKey(this._keyClass, str, "unable to parse key as currency", new Object[0]);
                }
            default:
                throw new IllegalStateException("Internal error: unknown key type " + this._keyClass);
        }
    }

    /* access modifiers changed from: protected */
    public double _parseDouble(String str) {
        return NumberInput.parseDouble(str);
    }

    /* access modifiers changed from: protected */
    public int _parseInt(String str) {
        return Integer.parseInt(str);
    }

    /* access modifiers changed from: protected */
    public long _parseLong(String str) {
        return Long.parseLong(str);
    }

    public Object deserializeKey(String str, DeserializationContext deserializationContext) {
        if (str == null) {
            return null;
        }
        try {
            Object _parse = _parse(str, deserializationContext);
            if (_parse != null) {
                return _parse;
            }
            if (!this._keyClass.isEnum() || !deserializationContext.getConfig().isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                return deserializationContext.handleWeirdKey(this._keyClass, str, "not a valid representation", new Object[0]);
            }
            return null;
        } catch (Exception e10) {
            return deserializationContext.handleWeirdKey(this._keyClass, str, "not a valid representation, problem: (%s) %s", e10.getClass().getName(), e10.getMessage());
        }
    }

    public Class<?> getKeyClass() {
        return this._keyClass;
    }

    protected StdKeyDeserializer(int i10, Class<?> cls, FromStringDeserializer<?> fromStringDeserializer) {
        this._kind = i10;
        this._keyClass = cls;
        this._deser = fromStringDeserializer;
    }
}
