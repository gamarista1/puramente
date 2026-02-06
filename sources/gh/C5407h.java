package Gh;

import Hh.b;
import Sg.p;
import java.io.EOFException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6559l;

/* renamed from: Gh.h  reason: case insensitive filesystem */
public class C5407h implements Serializable, Comparable {

    /* renamed from: d  reason: collision with root package name */
    public static final a f63295d = new a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final C5407h f63296e = new C5407h(new byte[0]);
    private static final long serialVersionUID = 1;

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f63297a;

    /* renamed from: b  reason: collision with root package name */
    private transient int f63298b;

    /* renamed from: c  reason: collision with root package name */
    private transient String f63299c;

    /* renamed from: Gh.h$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ C5407h g(a aVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = C5401b.c();
            }
            return aVar.f(bArr, i10, i11);
        }

        public final C5407h a(String str) {
            C6496s.h(str, "<this>");
            byte[] a10 = C5400a.a(str);
            if (a10 != null) {
                return new C5407h(a10);
            }
            return null;
        }

        public final C5407h b(String str) {
            C6496s.h(str, "<this>");
            if (str.length() % 2 == 0) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i10 = 0; i10 < length; i10++) {
                    int i11 = i10 * 2;
                    bArr[i10] = (byte) ((b.e(str.charAt(i11)) << 4) + b.e(str.charAt(i11 + 1)));
                }
                return new C5407h(bArr);
            }
            throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
        }

        public final C5407h c(String str, Charset charset) {
            C6496s.h(str, "<this>");
            C6496s.h(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            C6496s.g(bytes, "getBytes(...)");
            return new C5407h(bytes);
        }

        public final C5407h d(String str) {
            C6496s.h(str, "<this>");
            C5407h hVar = new C5407h(a0.a(str));
            hVar.I(str);
            return hVar;
        }

        public final C5407h e(byte... bArr) {
            C6496s.h(bArr, "data");
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            C6496s.g(copyOf, "copyOf(...)");
            return new C5407h(copyOf);
        }

        public final C5407h f(byte[] bArr, int i10, int i11) {
            C6496s.h(bArr, "<this>");
            int f10 = C5401b.f(bArr, i11);
            C5401b.b((long) bArr.length, (long) i10, (long) f10);
            return new C5407h(C6559l.r(bArr, i10, f10 + i10));
        }

        public final C5407h h(InputStream inputStream, int i10) {
            C6496s.h(inputStream, "<this>");
            if (i10 >= 0) {
                byte[] bArr = new byte[i10];
                int i11 = 0;
                while (i11 < i10) {
                    int read = inputStream.read(bArr, i11, i10 - i11);
                    if (read != -1) {
                        i11 += read;
                    } else {
                        throw new EOFException();
                    }
                }
                return new C5407h(bArr);
            }
            throw new IllegalArgumentException(("byteCount < 0: " + i10).toString());
        }

        private a() {
        }
    }

    public C5407h(byte[] bArr) {
        C6496s.h(bArr, "data");
        this.f63297a = bArr;
    }

    public static /* synthetic */ int C(C5407h hVar, C5407h hVar2, int i10, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                i10 = C5401b.c();
            }
            return hVar.z(hVar2, i10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }

    public static final C5407h E(byte... bArr) {
        return f63295d.e(bArr);
    }

    public static /* synthetic */ C5407h R(C5407h hVar, int i10, int i11, int i12, Object obj) {
        if (obj == null) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = C5401b.c();
            }
            return hVar.Q(i10, i11);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
    }

    public static final C5407h c(String str) {
        return f63295d.a(str);
    }

    public static final C5407h f(String str) {
        return f63295d.d(str);
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        C5407h h10 = f63295d.h(objectInputStream, objectInputStream.readInt());
        Field declaredField = C5407h.class.getDeclaredField("a");
        declaredField.setAccessible(true);
        declaredField.set(this, h10.f63297a);
    }

    public static /* synthetic */ int u(C5407h hVar, C5407h hVar2, int i10, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                i10 = 0;
            }
            return hVar.s(hVar2, i10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.f63297a.length);
        objectOutputStream.write(this.f63297a);
    }

    public int A(byte[] bArr, int i10) {
        C6496s.h(bArr, "other");
        for (int min = Math.min(C5401b.e(this, i10), l().length - bArr.length); -1 < min; min--) {
            if (C5401b.a(l(), min, bArr, 0, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    public final C5407h D() {
        return e("MD5");
    }

    public boolean F(int i10, C5407h hVar, int i11, int i12) {
        C6496s.h(hVar, "other");
        return hVar.G(i11, l(), i10, i12);
    }

    public boolean G(int i10, byte[] bArr, int i11, int i12) {
        C6496s.h(bArr, "other");
        if (i10 < 0 || i10 > l().length - i12 || i11 < 0 || i11 > bArr.length - i12 || !C5401b.a(l(), i10, bArr, i11, i12)) {
            return false;
        }
        return true;
    }

    public final void H(int i10) {
        this.f63298b = i10;
    }

    public final void I(String str) {
        this.f63299c = str;
    }

    public final C5407h J() {
        return e("SHA-1");
    }

    public final C5407h N() {
        return e("SHA-256");
    }

    public final int O() {
        return o();
    }

    public final boolean P(C5407h hVar) {
        C6496s.h(hVar, "prefix");
        return F(0, hVar, 0, hVar.O());
    }

    public C5407h Q(int i10, int i11) {
        int e10 = C5401b.e(this, i11);
        if (i10 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        } else if (e10 > l().length) {
            throw new IllegalArgumentException(("endIndex > length(" + l().length + ')').toString());
        } else if (e10 - i10 < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        } else if (i10 == 0 && e10 == l().length) {
            return this;
        } else {
            return new C5407h(C6559l.r(l(), i10, e10));
        }
    }

    public C5407h S() {
        int i10 = 0;
        while (i10 < l().length) {
            byte b10 = l()[i10];
            if (b10 < 65 || b10 > 90) {
                i10++;
            } else {
                byte[] l10 = l();
                byte[] copyOf = Arrays.copyOf(l10, l10.length);
                C6496s.g(copyOf, "copyOf(...)");
                copyOf[i10] = (byte) (b10 + 32);
                for (int i11 = i10 + 1; i11 < copyOf.length; i11++) {
                    byte b11 = copyOf[i11];
                    if (b11 >= 65 && b11 <= 90) {
                        copyOf[i11] = (byte) (b11 + 32);
                    }
                }
                return new C5407h(copyOf);
            }
        }
        return this;
    }

    public byte[] T() {
        byte[] l10 = l();
        byte[] copyOf = Arrays.copyOf(l10, l10.length);
        C6496s.g(copyOf, "copyOf(...)");
        return copyOf;
    }

    public String W() {
        String p10 = p();
        if (p10 != null) {
            return p10;
        }
        String c10 = a0.c(x());
        I(c10);
        return c10;
    }

    public void X(C5404e eVar, int i10, int i11) {
        C6496s.h(eVar, "buffer");
        b.d(this, eVar, i10, i11);
    }

    public String a() {
        return C5400a.c(l(), (byte[]) null, 1, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        if (r0 < r1) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
        if (r7 < r8) goto L_0x002a;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(Gh.C5407h r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.C6496s.h(r10, r0)
            int r0 = r9.O()
            int r1 = r10.O()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L_0x0013:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L_0x002e
            byte r7 = r9.j(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.j(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L_0x0028
            int r4 = r4 + 1
            goto L_0x0013
        L_0x0028:
            if (r7 >= r8) goto L_0x002c
        L_0x002a:
            r3 = r5
            goto L_0x0034
        L_0x002c:
            r3 = r6
            goto L_0x0034
        L_0x002e:
            if (r0 != r1) goto L_0x0031
            goto L_0x0034
        L_0x0031:
            if (r0 >= r1) goto L_0x002c
            goto L_0x002a
        L_0x0034:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Gh.C5407h.compareTo(Gh.h):int");
    }

    public C5407h e(String str) {
        C6496s.h(str, "algorithm");
        MessageDigest instance = MessageDigest.getInstance(str);
        instance.update(this.f63297a, 0, O());
        byte[] digest = instance.digest();
        C6496s.e(digest);
        return new C5407h(digest);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5407h) {
            C5407h hVar = (C5407h) obj;
            if (hVar.O() == l().length && hVar.G(0, l(), 0, l().length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int m10 = m();
        if (m10 != 0) {
            return m10;
        }
        int hashCode = Arrays.hashCode(l());
        H(hashCode);
        return hashCode;
    }

    public final boolean i(C5407h hVar) {
        C6496s.h(hVar, "suffix");
        return F(O() - hVar.O(), hVar, 0, hVar.O());
    }

    public final byte j(int i10) {
        return y(i10);
    }

    public final byte[] l() {
        return this.f63297a;
    }

    public final int m() {
        return this.f63298b;
    }

    public int o() {
        return l().length;
    }

    public final String p() {
        return this.f63299c;
    }

    public String r() {
        char[] cArr = new char[(l().length * 2)];
        int i10 = 0;
        for (byte b10 : l()) {
            int i11 = i10 + 1;
            cArr[i10] = b.f()[(b10 >> 4) & 15];
            i10 += 2;
            cArr[i11] = b.f()[b10 & 15];
        }
        return p.q(cArr);
    }

    public final int s(C5407h hVar, int i10) {
        C6496s.h(hVar, "other");
        return t(hVar.x(), i10);
    }

    public int t(byte[] bArr, int i10) {
        C6496s.h(bArr, "other");
        int length = l().length - bArr.length;
        int max = Math.max(i10, 0);
        if (max <= length) {
            while (!C5401b.a(l(), max, bArr, 0, bArr.length)) {
                if (max != length) {
                    max++;
                }
            }
            return max;
        }
        return -1;
    }

    public String toString() {
        C5407h hVar;
        String str;
        if (l().length == 0) {
            str = "[size=0]";
        } else {
            int a10 = b.c(l(), 64);
            if (a10 != -1) {
                String W10 = W();
                String substring = W10.substring(0, a10);
                C6496s.g(substring, "substring(...)");
                String D10 = p.D(p.D(p.D(substring, "\\", "\\\\", false, 4, (Object) null), "\n", "\\n", false, 4, (Object) null), "\r", "\\r", false, 4, (Object) null);
                if (a10 < W10.length()) {
                    return "[size=" + l().length + " text=" + D10 + "…]";
                }
                return "[text=" + D10 + ']';
            } else if (l().length <= 64) {
                str = "[hex=" + r() + ']';
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("[size=");
                sb2.append(l().length);
                sb2.append(" hex=");
                int e10 = C5401b.e(this, 64);
                if (e10 > l().length) {
                    throw new IllegalArgumentException(("endIndex > length(" + l().length + ')').toString());
                } else if (e10 >= 0) {
                    if (e10 == l().length) {
                        hVar = this;
                    } else {
                        hVar = new C5407h(C6559l.r(l(), 0, e10));
                    }
                    sb2.append(hVar.r());
                    sb2.append("…]");
                    return sb2.toString();
                } else {
                    throw new IllegalArgumentException("endIndex < beginIndex");
                }
            }
        }
        return str;
    }

    public byte[] x() {
        return l();
    }

    public byte y(int i10) {
        return l()[i10];
    }

    public final int z(C5407h hVar, int i10) {
        C6496s.h(hVar, "other");
        return A(hVar.x(), i10);
    }
}
