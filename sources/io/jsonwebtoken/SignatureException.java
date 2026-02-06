package io.jsonwebtoken;

public class SignatureException extends JwtException {
    public SignatureException(String str) {
        super(str);
    }

    public SignatureException(String str, Throwable th2) {
        super(str, th2);
    }
}
