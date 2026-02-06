package io.jsonwebtoken.impl;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.RequiredTypeException;
import java.util.Date;
import java.util.Map;

public class DefaultClaims extends JwtMap implements Claims {
    public DefaultClaims() {
    }

    private <T> T castClaimValue(Object obj, Class<T> cls) {
        if (cls == Date.class && (obj instanceof Long)) {
            obj = new Date(((Long) obj).longValue());
        }
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            if (cls == Long.class) {
                obj = Long.valueOf((long) intValue);
            } else if (cls == Short.class && -32768 <= intValue && intValue <= 32767) {
                obj = Short.valueOf((short) intValue);
            } else if (cls == Byte.class && -128 <= intValue && intValue <= 127) {
                obj = Byte.valueOf((byte) intValue);
            }
        }
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        throw new RequiredTypeException("Expected value to be of type: " + cls + ", but was " + obj.getClass());
    }

    public <T> T get(String str, Class<T> cls) {
        Object obj = get(str);
        if (obj == null) {
            return null;
        }
        if (Claims.EXPIRATION.equals(str) || Claims.ISSUED_AT.equals(str) || Claims.NOT_BEFORE.equals(str)) {
            obj = getDate(str);
        }
        return castClaimValue(obj, cls);
    }

    public String getAudience() {
        return getString(Claims.AUDIENCE);
    }

    public Date getExpiration() {
        return (Date) get(Claims.EXPIRATION, Date.class);
    }

    public String getId() {
        return getString(Claims.ID);
    }

    public Date getIssuedAt() {
        return (Date) get(Claims.ISSUED_AT, Date.class);
    }

    public String getIssuer() {
        return getString(Claims.ISSUER);
    }

    public Date getNotBefore() {
        return (Date) get(Claims.NOT_BEFORE, Date.class);
    }

    public String getSubject() {
        return getString(Claims.SUBJECT);
    }

    public DefaultClaims(Map<String, Object> map) {
        super(map);
    }

    public Claims setAudience(String str) {
        setValue(Claims.AUDIENCE, str);
        return this;
    }

    public Claims setExpiration(Date date) {
        setDate(Claims.EXPIRATION, date);
        return this;
    }

    public Claims setId(String str) {
        setValue(Claims.ID, str);
        return this;
    }

    public Claims setIssuedAt(Date date) {
        setDate(Claims.ISSUED_AT, date);
        return this;
    }

    public Claims setIssuer(String str) {
        setValue(Claims.ISSUER, str);
        return this;
    }

    public Claims setNotBefore(Date date) {
        setDate(Claims.NOT_BEFORE, date);
        return this;
    }

    public Claims setSubject(String str) {
        setValue(Claims.SUBJECT, str);
        return this;
    }
}
