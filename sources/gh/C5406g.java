package Gh;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* renamed from: Gh.g  reason: case insensitive filesystem */
public interface C5406g extends W, ReadableByteChannel {
    C5407h A0(long j10);

    boolean F0(long j10, C5407h hVar);

    byte[] H0();

    boolean J0();

    String N(long j10);

    long N0(C5407h hVar);

    long O0();

    long Z(C5407h hVar);

    void Z0(C5404e eVar, long j10);

    String b1(Charset charset);

    long d0(U u10);

    boolean e0(long j10);

    C5404e i();

    String i0();

    byte[] l0(long j10);

    int m1();

    short p0();

    String p1();

    C5406g peek();

    long r0();

    int r1(K k10);

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    void skip(long j10);

    void u0(long j10);

    long v1();

    C5404e x();

    InputStream x1();

    String z0(long j10);
}
