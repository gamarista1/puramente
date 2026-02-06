package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.VersionUtil;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.File;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

public abstract class FromStringDeserializer<T> extends StdScalarDeserializer<T> {

    public static class Std extends FromStringDeserializer<Object> {
        public static final int STD_CHARSET = 9;
        public static final int STD_CLASS = 4;
        public static final int STD_CURRENCY = 6;
        public static final int STD_FILE = 1;
        public static final int STD_INET_ADDRESS = 11;
        public static final int STD_INET_SOCKET_ADDRESS = 12;
        public static final int STD_JAVA_TYPE = 5;
        public static final int STD_LOCALE = 8;
        public static final int STD_PATTERN = 7;
        public static final int STD_STRING_BUILDER = 13;
        public static final int STD_TIME_ZONE = 10;
        public static final int STD_URI = 3;
        public static final int STD_URL = 2;
        private static final long serialVersionUID = 1;
        protected final int _kind;

        protected Std(Class<?> cls, int i10) {
            super(cls);
            this._kind = i10;
        }

        /* access modifiers changed from: protected */
        public Object _deserialize(String str, DeserializationContext deserializationContext) {
            int i10;
            switch (this._kind) {
                case 1:
                    return new File(str);
                case 2:
                    return new URL(str);
                case 3:
                    return URI.create(str);
                case 4:
                    try {
                        return deserializationContext.findClass(str);
                    } catch (Exception e10) {
                        return deserializationContext.handleInstantiationProblem(this._valueClass, str, ClassUtil.getRootCause(e10));
                    }
                case 5:
                    return deserializationContext.getTypeFactory().constructFromCanonical(str);
                case 6:
                    return Currency.getInstance(str);
                case 7:
                    return Pattern.compile(str);
                case 8:
                    int _firstHyphenOrUnderscore = _firstHyphenOrUnderscore(str);
                    if (_firstHyphenOrUnderscore < 0) {
                        return new Locale(str);
                    }
                    String substring = str.substring(0, _firstHyphenOrUnderscore);
                    String substring2 = str.substring(_firstHyphenOrUnderscore + 1);
                    int _firstHyphenOrUnderscore2 = _firstHyphenOrUnderscore(substring2);
                    if (_firstHyphenOrUnderscore2 < 0) {
                        return new Locale(substring, substring2);
                    }
                    return new Locale(substring, substring2.substring(0, _firstHyphenOrUnderscore2), substring2.substring(_firstHyphenOrUnderscore2 + 1));
                case 9:
                    return Charset.forName(str);
                case 10:
                    return TimeZone.getTimeZone(str);
                case 11:
                    return InetAddress.getByName(str);
                case 12:
                    if (str.startsWith("[")) {
                        int lastIndexOf = str.lastIndexOf(93);
                        if (lastIndexOf != -1) {
                            int indexOf = str.indexOf(58, lastIndexOf);
                            if (indexOf > -1) {
                                i10 = Integer.parseInt(str.substring(indexOf + 1));
                            } else {
                                i10 = 0;
                            }
                            return new InetSocketAddress(str.substring(0, lastIndexOf + 1), i10);
                        }
                        throw new InvalidFormatException(deserializationContext.getParser(), "Bracketed IPv6 address must contain closing bracket", (Object) str, (Class<?>) InetSocketAddress.class);
                    }
                    int indexOf2 = str.indexOf(58);
                    if (indexOf2 >= 0) {
                        int i11 = indexOf2 + 1;
                        if (str.indexOf(58, i11) < 0) {
                            return new InetSocketAddress(str.substring(0, indexOf2), Integer.parseInt(str.substring(i11)));
                        }
                    }
                    return new InetSocketAddress(str, 0);
                case 13:
                    return new StringBuilder(str);
                default:
                    VersionUtil.throwInternal();
                    return null;
            }
        }

        /* access modifiers changed from: protected */
        public Object _deserializeFromEmptyString() {
            int i10 = this._kind;
            if (i10 == 3) {
                return URI.create("");
            }
            if (i10 == 8) {
                return Locale.ROOT;
            }
            if (i10 == 13) {
                return new StringBuilder();
            }
            return FromStringDeserializer.super._deserializeFromEmptyString();
        }

        /* access modifiers changed from: protected */
        public int _firstHyphenOrUnderscore(String str) {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = str.charAt(i10);
                if (charAt == '_' || charAt == '-') {
                    return i10;
                }
            }
            return -1;
        }
    }

    protected FromStringDeserializer(Class<?> cls) {
        super(cls);
    }

    public static Std findDeserializer(Class<?> cls) {
        int i10;
        if (cls == File.class) {
            i10 = 1;
        } else if (cls == URL.class) {
            i10 = 2;
        } else if (cls == URI.class) {
            i10 = 3;
        } else if (cls == Class.class) {
            i10 = 4;
        } else if (cls == JavaType.class) {
            i10 = 5;
        } else if (cls == Currency.class) {
            i10 = 6;
        } else if (cls == Pattern.class) {
            i10 = 7;
        } else if (cls == Locale.class) {
            i10 = 8;
        } else if (cls == Charset.class) {
            i10 = 9;
        } else if (cls == TimeZone.class) {
            i10 = 10;
        } else if (cls == InetAddress.class) {
            i10 = 11;
        } else if (cls == InetSocketAddress.class) {
            i10 = 12;
        } else if (cls != StringBuilder.class) {
            return null;
        } else {
            i10 = 13;
        }
        return new Std(cls, i10);
    }

    public static Class<?>[] types() {
        return new Class[]{File.class, URL.class, URI.class, Class.class, JavaType.class, Currency.class, Pattern.class, Locale.class, Charset.class, TimeZone.class, InetAddress.class, InetSocketAddress.class, StringBuilder.class};
    }

    /* access modifiers changed from: protected */
    public abstract T _deserialize(String str, DeserializationContext deserializationContext);

    /* access modifiers changed from: protected */
    public T _deserializeEmbedded(Object obj, DeserializationContext deserializationContext) {
        deserializationContext.reportMappingException("Don't know how to convert embedded Object of type %s into %s", obj.getClass().getName(), this._valueClass.getName());
        return null;
    }

    /* access modifiers changed from: protected */
    public T _deserializeFromEmptyString() {
        return null;
    }

    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        String valueAsString = jsonParser.getValueAsString();
        if (valueAsString != null) {
            if (valueAsString.length() != 0) {
                String trim = valueAsString.trim();
                if (trim.length() != 0) {
                    try {
                        return _deserialize(trim, deserializationContext);
                    } catch (IllegalArgumentException | MalformedURLException e10) {
                        String message = e10.getMessage();
                        String str = "not a valid textual representation";
                        if (message != null) {
                            str = str + ", problem: " + message;
                        }
                        JsonMappingException weirdStringException = deserializationContext.weirdStringException(trim, this._valueClass, str);
                        weirdStringException.initCause(e10);
                        throw weirdStringException;
                    }
                }
            }
            return _deserializeFromEmptyString();
        }
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.START_ARRAY) {
            return _deserializeFromArray(jsonParser, deserializationContext);
        }
        if (currentToken != JsonToken.VALUE_EMBEDDED_OBJECT) {
            return deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
        }
        T embeddedObject = jsonParser.getEmbeddedObject();
        if (embeddedObject == null) {
            return null;
        }
        if (this._valueClass.isAssignableFrom(embeddedObject.getClass())) {
            return embeddedObject;
        }
        return _deserializeEmbedded(embeddedObject, deserializationContext);
    }
}
