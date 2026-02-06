package io.jsonwebtoken;

public interface CompressionCodec {
    byte[] compress(byte[] bArr);

    byte[] decompress(byte[] bArr);

    String getAlgorithmName();
}
