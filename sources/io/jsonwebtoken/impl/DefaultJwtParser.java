package io.jsonwebtoken.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.jsonwebtoken.ClaimJwtException;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Clock;
import io.jsonwebtoken.CompressionCodec;
import io.jsonwebtoken.CompressionCodecResolver;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Header;
import io.jsonwebtoken.IncorrectClaimException;
import io.jsonwebtoken.InvalidClaimException;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwsHeader;
import io.jsonwebtoken.Jwt;
import io.jsonwebtoken.JwtHandler;
import io.jsonwebtoken.JwtHandlerAdapter;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.MissingClaimException;
import io.jsonwebtoken.PrematureJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.SigningKeyResolver;
import io.jsonwebtoken.UnsupportedJwtException;
import io.jsonwebtoken.impl.compression.DefaultCompressionCodecResolver;
import io.jsonwebtoken.impl.crypto.DefaultJwtSignatureValidator;
import io.jsonwebtoken.impl.crypto.JwtSignatureValidator;
import io.jsonwebtoken.lang.Assert;
import io.jsonwebtoken.lang.Objects;
import io.jsonwebtoken.lang.Strings;
import java.io.IOException;
import java.security.Key;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;

public class DefaultJwtParser implements JwtParser {
    private static final String ISO_8601_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'";
    private static final int MILLISECONDS_PER_SECOND = 1000;
    private long allowedClockSkewMillis = 0;
    private Clock clock = DefaultClock.INSTANCE;
    private CompressionCodecResolver compressionCodecResolver = new DefaultCompressionCodecResolver();
    Claims expectedClaims = new DefaultClaims();
    private Key key;
    private byte[] keyBytes;
    private ObjectMapper objectMapper = new ObjectMapper();
    private SigningKeyResolver signingKeyResolver;

    private void validateExpectedClaims(Header header, Claims claims) {
        InvalidClaimException invalidClaimException;
        for (String str : this.expectedClaims.keySet()) {
            Object obj = this.expectedClaims.get(str);
            Object obj2 = claims.get(str);
            if (Claims.ISSUED_AT.equals(str) || Claims.EXPIRATION.equals(str) || Claims.NOT_BEFORE.equals(str)) {
                Class cls = Date.class;
                obj = this.expectedClaims.get(str, cls);
                obj2 = claims.get(str, cls);
            } else if ((obj instanceof Date) && obj2 != null && (obj2 instanceof Long)) {
                obj2 = new Date(((Long) obj2).longValue());
            }
            if (obj2 == null) {
                invalidClaimException = new MissingClaimException(header, claims, String.format(ClaimJwtException.MISSING_EXPECTED_CLAIM_MESSAGE_TEMPLATE, new Object[]{str, obj}));
                continue;
            } else if (!obj.equals(obj2)) {
                invalidClaimException = new IncorrectClaimException(header, claims, String.format(ClaimJwtException.INCORRECT_EXPECTED_CLAIM_MESSAGE_TEMPLATE, new Object[]{str, obj, obj2}));
                continue;
            } else {
                invalidClaimException = null;
                continue;
            }
            if (invalidClaimException != null) {
                invalidClaimException.setClaimName(str);
                invalidClaimException.setClaimValue(obj);
                throw invalidClaimException;
            }
        }
    }

    /* access modifiers changed from: protected */
    public JwtSignatureValidator createSignatureValidator(SignatureAlgorithm signatureAlgorithm, Key key2) {
        return new DefaultJwtSignatureValidator(signatureAlgorithm, key2);
    }

    public boolean isSigned(String str) {
        if (str == null) {
            return false;
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < str.length()) {
            char charAt = str.charAt(i10);
            if (i11 != 2) {
                if (charAt == '.') {
                    i11++;
                }
                i10++;
            } else if (Character.isWhitespace(charAt) || charAt == '.') {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    public Jwt parse(String str) {
        JwsHeader jwsHeader;
        CompressionCodec compressionCodec;
        String str2;
        String str3;
        String str4;
        SigningKeyResolver signingKeyResolver2;
        String str5 = str;
        Assert.hasText(str5, "JWT String argument cannot be null or empty.");
        StringBuilder sb2 = new StringBuilder(128);
        SignatureAlgorithm signatureAlgorithm = null;
        boolean z10 = false;
        String str6 = null;
        String str7 = null;
        int i10 = 0;
        for (char c10 : str.toCharArray()) {
            if (c10 == '.') {
                CharSequence clean = Strings.clean((CharSequence) sb2);
                String charSequence = clean != null ? clean.toString() : null;
                if (i10 == 0) {
                    str7 = charSequence;
                } else if (i10 == 1) {
                    str6 = charSequence;
                }
                i10++;
                sb2.setLength(0);
            } else {
                sb2.append(c10);
            }
        }
        if (i10 == 2) {
            String sb3 = sb2.length() > 0 ? sb2.toString() : null;
            if (str6 != null) {
                if (str7 != null) {
                    Map<String, Object> readValue = readValue(TextCodec.BASE64URL.decodeToString(str7));
                    if (sb3 != null) {
                        jwsHeader = new DefaultJwsHeader(readValue);
                    } else {
                        jwsHeader = new DefaultHeader(readValue);
                    }
                    compressionCodec = this.compressionCodecResolver.resolveCompressionCodec(jwsHeader);
                } else {
                    compressionCodec = null;
                    jwsHeader = null;
                }
                if (compressionCodec != null) {
                    str2 = new String(compressionCodec.decompress(TextCodec.BASE64URL.decode(str6)), Strings.UTF_8);
                } else {
                    str2 = TextCodec.BASE64URL.decodeToString(str6);
                }
                DefaultClaims defaultClaims = (str2.charAt(0) == '{' && str2.charAt(str2.length() - 1) == '}') ? new DefaultClaims(readValue(str2)) : null;
                if (sb3 != null) {
                    JwsHeader jwsHeader2 = jwsHeader;
                    if (jwsHeader != null) {
                        String algorithm = jwsHeader2.getAlgorithm();
                        if (Strings.hasText(algorithm)) {
                            signatureAlgorithm = SignatureAlgorithm.forName(algorithm);
                        }
                    }
                    if (signatureAlgorithm == null || signatureAlgorithm == SignatureAlgorithm.NONE) {
                        throw new MalformedJwtException("JWT string has a digest/signature, but the header does not reference a valid signature algorithm.");
                    }
                    Key key2 = this.key;
                    if (key2 != null && this.keyBytes != null) {
                        throw new IllegalStateException("A key object and key bytes cannot both be specified. Choose either.");
                    } else if ((key2 == null && this.keyBytes == null) || this.signingKeyResolver == null) {
                        if (key2 == null) {
                            byte[] bArr = this.keyBytes;
                            if (Objects.isEmpty(bArr) && (signingKeyResolver2 = this.signingKeyResolver) != null) {
                                key2 = defaultClaims != null ? signingKeyResolver2.resolveSigningKey(jwsHeader2, (Claims) defaultClaims) : signingKeyResolver2.resolveSigningKey(jwsHeader2, str2);
                            }
                            if (!Objects.isEmpty(bArr)) {
                                Assert.isTrue(signatureAlgorithm.isHmac(), "Key bytes can only be specified for HMAC signatures. Please specify a PublicKey or PrivateKey instance.");
                                key2 = new SecretKeySpec(bArr, signatureAlgorithm.getJcaName());
                            }
                        }
                        Assert.notNull(key2, "A signing key must be specified if the specified JWT is digitally signed.");
                        try {
                            if (!createSignatureValidator(signatureAlgorithm, key2).isValid(str7 + '.' + str6, sb3)) {
                                throw new SignatureException("JWT signature does not match locally computed signature. JWT validity cannot be asserted and should not be trusted.");
                            }
                        } catch (IllegalArgumentException e10) {
                            IllegalArgumentException illegalArgumentException = e10;
                            String value = signatureAlgorithm.getValue();
                            throw new UnsupportedJwtException("The parsed JWT indicates it was signed with the " + value + " signature algorithm, but the specified signing key of type " + key2.getClass().getName() + " may not be used to validate " + value + " signatures.  Because the specified signing key reflects a specific and expected algorithm, and the JWT does not reflect this algorithm, it is likely that the JWT was not expected and therefore should not be trusted.  Another possibility is that the parser was configured with the incorrect signing key, but this cannot be assumed for security reasons.", illegalArgumentException);
                        }
                    } else {
                        throw new IllegalStateException("A signing key resolver and " + (key2 != null ? "a key object" : "key bytes") + " cannot both be specified. Choose either.");
                    }
                }
                if (this.allowedClockSkewMillis > 0) {
                    z10 = true;
                }
                if (defaultClaims != null) {
                    Date now = this.clock.now();
                    long time = now.getTime();
                    Date expiration = defaultClaims.getExpiration();
                    str4 = sb3;
                    if (expiration != null) {
                        JwsHeader jwsHeader3 = jwsHeader;
                        long j10 = time - this.allowedClockSkewMillis;
                        str3 = str2;
                        if (!(z10 ? new Date(j10) : now).after(expiration)) {
                            jwsHeader = jwsHeader3;
                        } else {
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ISO_8601_FORMAT);
                            throw new ExpiredJwtException(jwsHeader3, defaultClaims, "JWT expired at " + simpleDateFormat.format(expiration) + ". Current time: " + simpleDateFormat.format(now) + ", a difference of " + (j10 - expiration.getTime()) + " milliseconds.  Allowed clock skew: " + this.allowedClockSkewMillis + " milliseconds.");
                        }
                    } else {
                        str3 = str2;
                    }
                    Date notBefore = defaultClaims.getNotBefore();
                    if (notBefore != null) {
                        long j11 = time + this.allowedClockSkewMillis;
                        if ((z10 ? new Date(j11) : now).before(notBefore)) {
                            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(ISO_8601_FORMAT);
                            throw new PrematureJwtException(jwsHeader, defaultClaims, "JWT must not be accepted before " + simpleDateFormat2.format(notBefore) + ". Current time: " + simpleDateFormat2.format(now) + ", a difference of " + (notBefore.getTime() - j11) + " milliseconds.  Allowed clock skew: " + this.allowedClockSkewMillis + " milliseconds.");
                        }
                    }
                    validateExpectedClaims(jwsHeader, defaultClaims);
                } else {
                    str4 = sb3;
                    str3 = str2;
                }
                DefaultClaims defaultClaims2 = defaultClaims != null ? defaultClaims : str3;
                if (str4 != null) {
                    return new DefaultJws(jwsHeader, defaultClaims2, str4);
                }
                return new DefaultJwt(jwsHeader, defaultClaims2);
            }
            throw new MalformedJwtException("JWT string '" + str5 + "' is missing a body/payload.");
        }
        throw new MalformedJwtException("JWT strings must contain exactly 2 period characters. Found: " + i10);
    }

    public Jws<Claims> parseClaimsJws(String str) {
        return (Jws) parse(str, new JwtHandlerAdapter<Jws<Claims>>() {
            public Jws<Claims> onClaimsJws(Jws<Claims> jws) {
                return jws;
            }
        });
    }

    public Jwt<Header, Claims> parseClaimsJwt(String str) {
        try {
            return (Jwt) parse(str, new JwtHandlerAdapter<Jwt<Header, Claims>>() {
                public Jwt<Header, Claims> onClaimsJwt(Jwt<Header, Claims> jwt) {
                    return jwt;
                }
            });
        } catch (IllegalArgumentException e10) {
            throw new UnsupportedJwtException("Signed JWSs are not supported.", e10);
        }
    }

    public Jws<String> parsePlaintextJws(String str) {
        try {
            return (Jws) parse(str, new JwtHandlerAdapter<Jws<String>>() {
                public Jws<String> onPlaintextJws(Jws<String> jws) {
                    return jws;
                }
            });
        } catch (IllegalArgumentException e10) {
            throw new UnsupportedJwtException("Signed JWSs are not supported.", e10);
        }
    }

    public Jwt<Header, String> parsePlaintextJwt(String str) {
        return (Jwt) parse(str, new JwtHandlerAdapter<Jwt<Header, String>>() {
            public Jwt<Header, String> onPlaintextJwt(Jwt<Header, String> jwt) {
                return jwt;
            }
        });
    }

    /* access modifiers changed from: protected */
    public Map<String, Object> readValue(String str) {
        try {
            return (Map) this.objectMapper.readValue(str, Map.class);
        } catch (IOException e10) {
            throw new MalformedJwtException("Unable to read JSON value: " + str, e10);
        }
    }

    public JwtParser require(String str, Object obj) {
        Assert.hasText(str, "claim name cannot be null or empty.");
        Assert.notNull(obj, "The value cannot be null for claim name: " + str);
        this.expectedClaims.put(str, obj);
        return this;
    }

    public JwtParser requireAudience(String str) {
        this.expectedClaims.setAudience(str);
        return this;
    }

    public JwtParser requireExpiration(Date date) {
        this.expectedClaims.setExpiration(date);
        return this;
    }

    public JwtParser requireId(String str) {
        this.expectedClaims.setId(str);
        return this;
    }

    public JwtParser requireIssuedAt(Date date) {
        this.expectedClaims.setIssuedAt(date);
        return this;
    }

    public JwtParser requireIssuer(String str) {
        this.expectedClaims.setIssuer(str);
        return this;
    }

    public JwtParser requireNotBefore(Date date) {
        this.expectedClaims.setNotBefore(date);
        return this;
    }

    public JwtParser requireSubject(String str) {
        this.expectedClaims.setSubject(str);
        return this;
    }

    public JwtParser setAllowedClockSkewSeconds(long j10) {
        this.allowedClockSkewMillis = Math.max(0, j10 * 1000);
        return this;
    }

    public JwtParser setClock(Clock clock2) {
        Assert.notNull(clock2, "Clock instance cannot be null.");
        this.clock = clock2;
        return this;
    }

    public JwtParser setCompressionCodecResolver(CompressionCodecResolver compressionCodecResolver2) {
        Assert.notNull(compressionCodecResolver2, "compressionCodecResolver cannot be null.");
        this.compressionCodecResolver = compressionCodecResolver2;
        return this;
    }

    public JwtParser setSigningKey(byte[] bArr) {
        Assert.notEmpty(bArr, "signing key cannot be null or empty.");
        this.keyBytes = bArr;
        return this;
    }

    public JwtParser setSigningKeyResolver(SigningKeyResolver signingKeyResolver2) {
        Assert.notNull(signingKeyResolver2, "SigningKeyResolver cannot be null.");
        this.signingKeyResolver = signingKeyResolver2;
        return this;
    }

    public JwtParser setSigningKey(String str) {
        Assert.hasText(str, "signing key cannot be null or empty.");
        this.keyBytes = TextCodec.BASE64.decode(str);
        return this;
    }

    public JwtParser setSigningKey(Key key2) {
        Assert.notNull(key2, "signing key cannot be null.");
        this.key = key2;
        return this;
    }

    public <T> T parse(String str, JwtHandler<T> jwtHandler) {
        Assert.notNull(jwtHandler, "JwtHandler argument cannot be null.");
        Assert.hasText(str, "JWT String argument cannot be null or empty.");
        Jwt parse = parse(str);
        if (parse instanceof Jws) {
            Jws jws = (Jws) parse;
            if (jws.getBody() instanceof Claims) {
                return jwtHandler.onClaimsJws(jws);
            }
            return jwtHandler.onPlaintextJws(jws);
        } else if (parse.getBody() instanceof Claims) {
            return jwtHandler.onClaimsJwt(parse);
        } else {
            return jwtHandler.onPlaintextJwt(parse);
        }
    }
}
