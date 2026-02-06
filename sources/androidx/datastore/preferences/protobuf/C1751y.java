package androidx.datastore.preferences.protobuf;

import com.adjust.sdk.Constants;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.y  reason: case insensitive filesystem */
public abstract class C1751y {

    /* renamed from: a  reason: collision with root package name */
    static final Charset f16572a = Charset.forName(Constants.ENCODING);

    /* renamed from: b  reason: collision with root package name */
    static final Charset f16573b = Charset.forName("ISO-8859-1");

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f16574c;

    /* renamed from: d  reason: collision with root package name */
    public static final ByteBuffer f16575d;

    /* renamed from: e  reason: collision with root package name */
    public static final C1735h f16576e;

    /* renamed from: androidx.datastore.preferences.protobuf.y$a */
    public interface a {
        boolean a(int i10);
    }

    /* renamed from: androidx.datastore.preferences.protobuf.y$b */
    public interface b extends List, RandomAccess {
        b c(int i10);

        void l();

        boolean o();
    }

    static {
        byte[] bArr = new byte[0];
        f16574c = bArr;
        f16575d = ByteBuffer.wrap(bArr);
        f16576e = C1735h.h(bArr);
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
        int i12 = i(i11, bArr, i10, i11);
        if (i12 == 0) {
            return 1;
        }
        return i12;
    }

    public static int f(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static boolean g(byte[] bArr) {
        return q0.m(bArr);
    }

    static Object h(Object obj, Object obj2) {
        return ((O) obj).g().v((O) obj2).n();
    }

    static int i(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public static String j(byte[] bArr) {
        return new String(bArr, f16572a);
    }
}
