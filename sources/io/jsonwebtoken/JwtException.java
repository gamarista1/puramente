package io.jsonwebtoken;

public class JwtException extends RuntimeException {
    public JwtException(String str) {
        super(str);
    }

    public JwtException(String str, Throwable th2) {
        super(str, th2);
    }
}
