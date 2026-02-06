package io.jsonwebtoken;

public class ExpiredJwtException extends ClaimJwtException {
    public ExpiredJwtException(Header header, Claims claims, String str) {
        super(header, claims, str);
    }

    public ExpiredJwtException(Header header, Claims claims, String str, Throwable th2) {
        super(header, claims, str, th2);
    }
}
