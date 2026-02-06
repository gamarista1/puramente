package io.jsonwebtoken.impl.compression;

import io.jsonwebtoken.CompressionCodec;

@Deprecated
public final class CompressionCodecs {
    @Deprecated
    public static final CompressionCodec DEFLATE = io.jsonwebtoken.CompressionCodecs.DEFLATE;
    @Deprecated
    public static final CompressionCodec GZIP = io.jsonwebtoken.CompressionCodecs.GZIP;

    /* renamed from: I  reason: collision with root package name */
    private static final CompressionCodecs f71502I = new CompressionCodecs();

    private CompressionCodecs() {
    }
}
