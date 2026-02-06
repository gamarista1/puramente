package com.zaguiini.RNPureJwt;

import android.util.Base64;
import com.adjust.sdk.Constants;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Header;
import io.jsonwebtoken.JwsHeader;
import io.jsonwebtoken.Jwt;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.impl.DefaultClaims;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.Map;
import java.util.regex.Pattern;

public class RNPureJwtModule extends ReactContextBaseJavaModule {
    public RNPureJwtModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private String base64toString(String str) {
        return new String(Base64.decode(str, 0));
    }

    private void getResponse(String str, Promise promise) {
        ObjectMapper objectMapper = new ObjectMapper();
        WritableMap createMap = Arguments.createMap();
        String[] split = str.split(Pattern.quote("."));
        try {
            createMap.putMap("headers", Arguments.makeNativeMap((Map<String, Object>) (Map) objectMapper.readValue(base64toString(split[0]), (TypeReference) new TypeReference<Map<String, Object>>() {
            })));
        } catch (IOException unused) {
            promise.reject("7", "Invalid header");
        }
        try {
            createMap.putMap("payload", Arguments.makeNativeMap((Map<String, Object>) (Map) objectMapper.readValue(base64toString(split[1]), (TypeReference) new TypeReference<Map<String, Object>>() {
            })));
        } catch (IOException unused2) {
            promise.reject("8", "Invalid payload");
        }
        promise.resolve(createMap);
    }

    private String toBase64(String str) {
        return Base64.encodeToString(str.getBytes(Charset.forName(Constants.ENCODING)), 0);
    }

    @ReactMethod
    public void decode(String str, String str2, ReadableMap readableMap, Promise promise) {
        JwtParser signingKey = Jwts.parser().setSigningKey(toBase64(str2));
        Boolean bool = Boolean.FALSE;
        for (Map.Entry next : readableMap.toHashMap().entrySet()) {
            String str3 = (String) next.getKey();
            Object value = next.getValue();
            str3.hashCode();
            if (str3.equals("skipValidation")) {
                Boolean bool2 = (Boolean) value;
                bool2.booleanValue();
                bool = bool2;
            }
        }
        try {
            getResponse(signingKey.parse(str), promise);
        } catch (MalformedJwtException unused) {
            if (bool.booleanValue()) {
                getResponse(str, promise);
            } else {
                promise.reject("2", "The JWT is invalid.");
            }
        } catch (ExpiredJwtException unused2) {
            if (bool.booleanValue()) {
                getResponse(str, promise);
            } else {
                promise.reject("3", "The JWT is expired.");
            }
        } catch (SignatureException unused3) {
            if (bool.booleanValue()) {
                getResponse(str, promise);
            } else {
                promise.reject("6", "Invalid signature.");
            }
        } catch (Exception e10) {
            promise.reject("0", (Throwable) e10);
        }
    }

    public String getName() {
        return "RNPureJwt";
    }

    @ReactMethod
    public void sign(ReadableMap readableMap, String str, ReadableMap readableMap2, Promise promise) {
        String str2;
        if (readableMap2.hasKey(JwsHeader.ALGORITHM)) {
            str2 = readableMap2.getString(JwsHeader.ALGORITHM);
        } else {
            str2 = "HS256";
        }
        JwtBuilder headerParam = Jwts.builder().signWith(SignatureAlgorithm.forName(str2), toBase64(str)).setHeaderParam(JwsHeader.ALGORITHM, str2).setHeaderParam(Header.TYPE, Header.JWT_TYPE);
        for (Map.Entry next : readableMap.toHashMap().entrySet()) {
            String str3 = (String) next.getKey();
            Object value = next.getValue();
            str3.hashCode();
            char c10 = 65535;
            switch (str3.hashCode()) {
                case 96668:
                    if (str3.equals(JwsHeader.ALGORITHM)) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 96944:
                    if (str3.equals(Claims.AUDIENCE)) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 100893:
                    if (str3.equals(Claims.EXPIRATION)) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 104028:
                    if (str3.equals(Claims.ISSUED_AT)) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 104585:
                    if (str3.equals(Claims.ISSUER)) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 105567:
                    if (str3.equals(Claims.ID)) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 108850:
                    if (str3.equals(Claims.NOT_BEFORE)) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 114240:
                    if (str3.equals(Claims.SUBJECT)) {
                        c10 = 7;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    break;
                case 1:
                    headerParam.setAudience(value.toString());
                    break;
                case 2:
                    Double d10 = (Double) value;
                    d10.doubleValue();
                    headerParam.setExpiration(new Date(d10.longValue()));
                    break;
                case 3:
                    Double d11 = (Double) value;
                    d11.doubleValue();
                    headerParam.setIssuedAt(new Date(d11.longValue()));
                    break;
                case 4:
                    headerParam.setIssuer(value.toString());
                    break;
                case 5:
                    headerParam.setId(value.toString());
                    break;
                case 6:
                    Double d12 = (Double) value;
                    d12.doubleValue();
                    headerParam.setNotBefore(new Date(d12.longValue()));
                    break;
                case 7:
                    headerParam.setSubject(value.toString());
                    break;
                default:
                    headerParam.claim(str3, value);
                    break;
            }
        }
        promise.resolve(headerParam.compact());
    }

    private void getResponse(Jwt jwt, Promise promise) {
        ObjectMapper objectMapper = new ObjectMapper();
        Class cls = DefaultClaims.class;
        WritableMap createMap = Arguments.createMap();
        createMap.putMap("headers", Arguments.makeNativeMap((Map<String, Object>) (Map) objectMapper.convertValue((Object) jwt.getHeader(), cls)));
        createMap.putMap("payload", Arguments.makeNativeMap((Map<String, Object>) (Map) objectMapper.convertValue(jwt.getBody(), cls)));
        promise.resolve(createMap);
    }
}
