package io.jsonwebtoken;

import java.security.Key;
import java.util.Date;

public interface JwtParser {
    public static final char SEPARATOR_CHAR = '.';

    boolean isSigned(String str);

    Jwt parse(String str);

    <T> T parse(String str, JwtHandler<T> jwtHandler);

    Jws<Claims> parseClaimsJws(String str);

    Jwt<Header, Claims> parseClaimsJwt(String str);

    Jws<String> parsePlaintextJws(String str);

    Jwt<Header, String> parsePlaintextJwt(String str);

    JwtParser require(String str, Object obj);

    JwtParser requireAudience(String str);

    JwtParser requireExpiration(Date date);

    JwtParser requireId(String str);

    JwtParser requireIssuedAt(Date date);

    JwtParser requireIssuer(String str);

    JwtParser requireNotBefore(Date date);

    JwtParser requireSubject(String str);

    JwtParser setAllowedClockSkewSeconds(long j10);

    JwtParser setClock(Clock clock);

    JwtParser setCompressionCodecResolver(CompressionCodecResolver compressionCodecResolver);

    JwtParser setSigningKey(String str);

    JwtParser setSigningKey(Key key);

    JwtParser setSigningKey(byte[] bArr);

    JwtParser setSigningKeyResolver(SigningKeyResolver signingKeyResolver);
}
