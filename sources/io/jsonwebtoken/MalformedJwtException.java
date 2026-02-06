package io.jsonwebtoken;

public class MalformedJwtException extends JwtException {
    public MalformedJwtException(String str) {
        super(str);
    }

    public MalformedJwtException(String str, Throwable th2) {
        super(str, th2);
    }
}
