package io.jsonwebtoken.impl.crypto;

public interface Signer {
    byte[] sign(byte[] bArr);
}
