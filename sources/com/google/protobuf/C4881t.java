package com.google.protobuf;

import com.adjust.sdk.Constants;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.t  reason: case insensitive filesystem */
public abstract class C4881t {

    /* renamed from: a  reason: collision with root package name */
    static final Charset f58661a = Charset.forName("US-ASCII");

    /* renamed from: b  reason: collision with root package name */
    static final Charset f58662b = Charset.forName(Constants.ENCODING);

    /* renamed from: c  reason: collision with root package name */
    static final Charset f58663c = Charset.forName("ISO-8859-1");

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f58664d;

    /* renamed from: e  reason: collision with root package name */
    public static final ByteBuffer f58665e;

    /* renamed from: f  reason: collision with root package name */
    public static final C4869g f58666f;

    /* renamed from: com.google.protobuf.t$a */
    public interface a {
        int d();
    }

    /* renamed from: com.google.protobuf.t$b */
    public interface b {
    }

    /* renamed from: com.google.protobuf.t$c */
    public interface c {
    }

    /* renamed from: com.google.protobuf.t$d */
    public interface d extends e {
        void T(int i10);

        d c(int i10);

        int getInt(int i10);
    }

    /* renamed from: com.google.protobuf.t$e */
    public interface e extends List, RandomAccess {
        e c(int i10);

        void l();

        boolean o();
    }

    static {
        byte[] bArr = new byte[0];
        f58664d = bArr;
        f58665e = ByteBuffer.wrap(bArr);
        f58666f = C4869g.a(bArr);
    }

    static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    static Object b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static int c(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    static int e(byte[] bArr, int i10, int i11) {
        int h10 = h(i11, bArr, i10, i11);
        if (h10 == 0) {
            return 1;
        }
        return h10;
    }

    public static int f(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static boolean g(byte[] bArr) {
        return l0.l(bArr);
    }

    static int h(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public static String i(byte[] bArr) {
        return new String(bArr, f58662b);
    }
}
