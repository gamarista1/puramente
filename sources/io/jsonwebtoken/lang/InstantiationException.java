package io.jsonwebtoken.lang;

public class InstantiationException extends RuntimeException {
    public InstantiationException(String str, Throwable th2) {
        super(str, th2);
    }
}
