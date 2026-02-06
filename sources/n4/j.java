package N4;

import com.adjust.sdk.Constants;
import com.fasterxml.jackson.core.base.GeneratorBase;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Formatter;

public final class j {

    /* renamed from: A  reason: collision with root package name */
    private static final Charset f32812A = Charset.forName(Constants.ENCODING);

    /* renamed from: B  reason: collision with root package name */
    private static final EOFException f32813B = new c();

    /* renamed from: z  reason: collision with root package name */
    private static final boolean[] f32814z;

    /* renamed from: a  reason: collision with root package name */
    private int f32815a;

    /* renamed from: b  reason: collision with root package name */
    private int f32816b;

    /* renamed from: c  reason: collision with root package name */
    private long f32817c;

    /* renamed from: d  reason: collision with root package name */
    private byte f32818d;

    /* renamed from: e  reason: collision with root package name */
    private int f32819e;

    /* renamed from: f  reason: collision with root package name */
    private final char[] f32820f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f32821g;

    /* renamed from: h  reason: collision with root package name */
    protected byte[] f32822h;

    /* renamed from: i  reason: collision with root package name */
    protected char[] f32823i;

    /* renamed from: j  reason: collision with root package name */
    private InputStream f32824j;

    /* renamed from: k  reason: collision with root package name */
    private int f32825k;

    /* renamed from: l  reason: collision with root package name */
    private int f32826l;

    /* renamed from: m  reason: collision with root package name */
    private final q f32827m;

    /* renamed from: n  reason: collision with root package name */
    private final q f32828n;

    /* renamed from: o  reason: collision with root package name */
    private final s f32829o;

    /* renamed from: p  reason: collision with root package name */
    private final byte[] f32830p;

    /* renamed from: q  reason: collision with root package name */
    private final int f32831q;

    /* renamed from: r  reason: collision with root package name */
    protected final d f32832r;

    /* renamed from: s  reason: collision with root package name */
    protected final b f32833s;

    /* renamed from: t  reason: collision with root package name */
    protected final int f32834t;

    /* renamed from: u  reason: collision with root package name */
    protected final g f32835u;

    /* renamed from: v  reason: collision with root package name */
    protected final int f32836v;

    /* renamed from: w  reason: collision with root package name */
    private final int f32837w;

    /* renamed from: x  reason: collision with root package name */
    private final StringBuilder f32838x;

    /* renamed from: y  reason: collision with root package name */
    private final Formatter f32839y;

    public enum b {
        EXACT(0),
        HIGH(1),
        DEFAULT(3),
        LOW(4);
        

        /* renamed from: a  reason: collision with root package name */
        final int f32845a;

        private b(int i10) {
            this.f32845a = i10;
        }
    }

    private static class c extends EOFException {
        private c() {
        }

        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    public enum d {
        WITH_STACK_TRACE,
        DESCRIPTION_AND_POSITION,
        DESCRIPTION_ONLY,
        MINIMAL
    }

    public interface e {
    }

    public interface f {
        Object a(j jVar);
    }

    public enum g {
        LONG_AND_BIGDECIMAL,
        LONG_AND_DOUBLE,
        BIGDECIMAL,
        DOUBLE
    }

    static {
        boolean[] zArr = new boolean[256];
        f32814z = zArr;
        zArr[137] = true;
        zArr[138] = true;
        zArr[139] = true;
        zArr[140] = true;
        zArr[141] = true;
        zArr[160] = true;
        zArr[32] = true;
        zArr[97] = true;
        zArr[98] = true;
        zArr[99] = true;
    }

    private j(char[] cArr, byte[] bArr, int i10, Object obj, q qVar, q qVar2, s sVar, d dVar, b bVar, g gVar, int i11, int i12) {
        this.f32816b = 0;
        this.f32817c = 0;
        this.f32818d = 32;
        StringBuilder sb2 = new StringBuilder(0);
        this.f32838x = sb2;
        this.f32839y = new Formatter(sb2);
        this.f32820f = cArr;
        this.f32822h = bArr;
        this.f32819e = i10;
        int length = bArr.length - 38;
        this.f32826l = length;
        this.f32821g = obj;
        this.f32823i = cArr;
        this.f32827m = qVar;
        this.f32828n = qVar2;
        this.f32829o = sVar;
        this.f32832r = dVar;
        this.f32833s = bVar;
        this.f32835u = gVar;
        this.f32836v = i11;
        this.f32837w = i12;
        this.f32834t = bVar.f32845a + 15;
        this.f32830p = bArr;
        this.f32831q = length;
    }

    private static int C(byte[] bArr, InputStream inputStream, int i10) {
        int read;
        while (i10 < bArr.length && (read = inputStream.read(bArr, i10, bArr.length - i10)) != -1) {
            i10 += read;
        }
        return i10;
    }

    private boolean M() {
        byte b10 = this.f32818d;
        if (!(b10 == -96 || b10 == 32)) {
            switch (b10) {
                case -31:
                    int i10 = this.f32816b;
                    if (i10 + 1 < this.f32819e) {
                        byte[] bArr = this.f32822h;
                        if (bArr[i10] == -102 && bArr[i10 + 1] == Byte.MIN_VALUE) {
                            this.f32816b = i10 + 2;
                            this.f32818d = 32;
                            return true;
                        }
                    }
                    return false;
                case -30:
                    int i11 = this.f32816b;
                    if (i11 + 1 >= this.f32819e) {
                        return false;
                    }
                    byte[] bArr2 = this.f32822h;
                    byte b11 = bArr2[i11];
                    byte b12 = bArr2[i11 + 1];
                    if (b11 == -127 && b12 == -97) {
                        this.f32816b = i11 + 2;
                        this.f32818d = 32;
                        return true;
                    } else if (b11 != Byte.MIN_VALUE) {
                        return false;
                    } else {
                        if (!(b12 == -88 || b12 == -87 || b12 == -81)) {
                            switch (b12) {
                                case Byte.MIN_VALUE:
                                case -127:
                                case -126:
                                case -125:
                                case -124:
                                case -123:
                                case -122:
                                case -121:
                                case -120:
                                case -119:
                                case -118:
                                    break;
                                default:
                                    return false;
                            }
                        }
                        this.f32816b = i11 + 2;
                        this.f32818d = 32;
                        return true;
                    }
                case -29:
                    int i12 = this.f32816b;
                    if (i12 + 1 < this.f32819e) {
                        byte[] bArr3 = this.f32822h;
                        if (bArr3[i12] == Byte.MIN_VALUE && bArr3[i12 + 1] == Byte.MIN_VALUE) {
                            this.f32816b = i12 + 2;
                            this.f32818d = 32;
                            return true;
                        }
                    }
                    return false;
                default:
                    switch (b10) {
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            break;
                        default:
                            return false;
                    }
            }
        }
        return true;
    }

    private int j(byte b10) {
        if (b10 >= 48 && b10 <= 57) {
            return b10 - 48;
        }
        if (b10 >= 65 && b10 <= 70) {
            return b10 - 55;
        }
        if (b10 >= 97 && b10 <= 102) {
            return b10 - 87;
        }
        throw t("Could not parse unicode escape, expected a hexadecimal digit", Byte.valueOf(b10));
    }

    private void v(int i10, StringBuilder sb2) {
        sb2.append("at position: ");
        sb2.append(w(i10));
        int i11 = this.f32816b;
        if (i11 > i10) {
            try {
                int min = Math.min(i11 - i10, 20);
                String str = new String(this.f32822h, (this.f32816b - i10) - min, min, f32812A);
                sb2.append(", following: `");
                sb2.append(str);
                sb2.append('`');
            } catch (Exception unused) {
            }
        }
        int i12 = this.f32816b;
        int i13 = i12 - i10;
        int i14 = this.f32825k;
        if (i13 < i14) {
            try {
                String str2 = new String(this.f32822h, this.f32816b - i10, Math.min((i14 - i12) + i10, 20), f32812A);
                sb2.append(", before: `");
                sb2.append(str2);
                sb2.append('`');
            } catch (Exception unused2) {
            }
        }
    }

    private int y() {
        int i10 = this.f32819e;
        int i11 = this.f32816b;
        int i12 = i10 - i11;
        byte[] bArr = this.f32822h;
        System.arraycopy(bArr, i11, bArr, 0, i12);
        int C10 = C(this.f32822h, this.f32824j, i12);
        long j10 = this.f32817c;
        int i13 = this.f32816b;
        this.f32817c = j10 + ((long) i13);
        if (C10 == i12) {
            int i14 = this.f32819e - i13;
            this.f32825k = i14;
            this.f32819e = i14;
            this.f32816b = 0;
        } else {
            int i15 = this.f32826l;
            if (C10 < i15) {
                i15 = C10;
            }
            this.f32825k = i15;
            this.f32819e = C10;
            this.f32816b = 0;
        }
        return C10;
    }

    public final byte A() {
        if (this.f32824j != null && this.f32816b > this.f32825k) {
            y();
        }
        int i10 = this.f32816b;
        if (i10 < this.f32819e) {
            byte[] bArr = this.f32822h;
            this.f32816b = i10 + 1;
            byte b10 = bArr[i10];
            this.f32818d = b10;
            return b10;
        }
        throw o.a("Unexpected end of JSON input", f32813B, N());
    }

    public final byte[] B() {
        if (this.f32824j != null && a.c(this.f32822h, this.f32816b) == this.f32822h.length) {
            int u10 = u();
            byte[] bArr = new byte[u10];
            for (int i10 = 0; i10 < u10; i10++) {
                bArr[i10] = (byte) this.f32823i[i10];
            }
            return a.a(bArr, 0, u10);
        } else if (this.f32818d == 34) {
            int i11 = this.f32816b;
            int c10 = a.c(this.f32822h, i11);
            byte[] bArr2 = this.f32822h;
            this.f32816b = c10 + 1;
            byte b10 = bArr2[c10];
            this.f32818d = b10;
            if (b10 == 34) {
                return a.a(bArr2, i11, c10);
            }
            throw n("Expecting '\"' for base64 end");
        } else {
            throw n("Expecting '\"' for base64 start");
        }
    }

    public final String D() {
        String str;
        int u10 = u();
        q qVar = this.f32827m;
        if (qVar != null) {
            str = qVar.a(this.f32823i, u10);
        } else {
            str = new String(this.f32823i, 0, u10);
        }
        if (h() == 58) {
            h();
            return str;
        }
        throw n("Expecting ':' after attribute name");
    }

    public final char[] E() {
        char[] cArr;
        if (this.f32818d == 34) {
            int i10 = this.f32816b;
            this.f32815a = i10;
            int i11 = 0;
            while (true) {
                try {
                    cArr = this.f32820f;
                    if (i11 >= cArr.length) {
                        break;
                    }
                    int i12 = i10 + 1;
                    byte b10 = this.f32822h[i10];
                    if (b10 == 34) {
                        i10 = i12;
                        break;
                    }
                    cArr[i11] = (char) b10;
                    i11++;
                    i10 = i12;
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw p("JSON string was not closed with a double quote", 0);
                }
            }
            if (i10 <= this.f32819e) {
                this.f32816b = i10;
                return cArr;
            }
            throw p("JSON string was not closed with a double quote", 0);
        }
        throw n("Expecting '\"' for string start");
    }

    public final String F() {
        char[] cArr;
        if (this.f32818d == 34) {
            int i10 = this.f32816b;
            int i11 = 0;
            while (true) {
                try {
                    cArr = this.f32820f;
                    if (i11 >= cArr.length) {
                        break;
                    }
                    int i12 = i10 + 1;
                    byte b10 = this.f32822h[i10];
                    if (b10 == 34) {
                        i10 = i12;
                        break;
                    }
                    int i13 = i11 + 1;
                    cArr[i11] = (char) b10;
                    i11 = i13;
                    i10 = i12;
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw p("JSON string was not closed with a double quote", 0);
                }
            }
            if (i10 <= this.f32819e) {
                this.f32816b = i10;
                return new String(cArr, 0, i11);
            }
            throw p("JSON string was not closed with a double quote", 0);
        }
        throw n("Expecting '\"' for string start");
    }

    public final String G() {
        int u10 = u();
        q qVar = this.f32828n;
        if (qVar == null) {
            return new String(this.f32823i, 0, u10);
        }
        return qVar.a(this.f32823i, u10);
    }

    /* access modifiers changed from: package-private */
    public final void H() {
        this.f32822h = this.f32830p;
        this.f32826l = this.f32831q;
        this.f32816b = 0;
        this.f32819e = 0;
        this.f32825k = 0;
        this.f32824j = null;
    }

    public final int I() {
        int i10 = this.f32816b;
        this.f32815a = i10 - 1;
        byte b10 = this.f32818d;
        int i11 = 1;
        while (i10 < this.f32819e) {
            int i12 = i10 + 1;
            b10 = this.f32822h[i10];
            if (b10 == 44 || b10 == 125 || b10 == 93) {
                break;
            }
            i11++;
            i10 = i12;
        }
        this.f32816b += i11 - 1;
        this.f32818d = b10;
        return this.f32815a;
    }

    public final boolean J() {
        if (this.f32818d != 102) {
            return false;
        }
        int i10 = this.f32816b;
        if (i10 + 3 < this.f32819e) {
            byte[] bArr = this.f32822h;
            if (bArr[i10] == 97 && bArr[i10 + 1] == 108 && bArr[i10 + 2] == 115 && bArr[i10 + 3] == 101) {
                this.f32816b = i10 + 4;
                this.f32818d = 101;
                return true;
            }
        }
        throw p("Invalid false constant found", 0);
    }

    public final boolean K() {
        if (this.f32818d != 110) {
            return false;
        }
        int i10 = this.f32816b;
        if (i10 + 2 < this.f32819e) {
            byte[] bArr = this.f32822h;
            if (bArr[i10] == 117 && bArr[i10 + 1] == 108 && bArr[i10 + 2] == 108) {
                this.f32816b = i10 + 3;
                this.f32818d = 108;
                return true;
            }
        }
        throw p("Invalid null constant found", 0);
    }

    public final boolean L() {
        if (this.f32818d != 116) {
            return false;
        }
        int i10 = this.f32816b;
        if (i10 + 2 < this.f32819e) {
            byte[] bArr = this.f32822h;
            if (bArr[i10] == 114 && bArr[i10 + 1] == 117 && bArr[i10 + 2] == 101) {
                this.f32816b = i10 + 3;
                this.f32818d = 101;
                return true;
            }
        }
        throw p("Invalid true constant found", 0);
    }

    /* access modifiers changed from: package-private */
    public boolean N() {
        if (this.f32832r == d.WITH_STACK_TRACE) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(int i10, int i11) {
        byte[] bArr = this.f32822h;
        while (i10 < i11) {
            if (!f32814z[bArr[i10] + 128]) {
                return false;
            }
            i10++;
        }
        return true;
    }

    public final StringBuffer b(StringBuffer stringBuffer) {
        stringBuffer.append(this.f32823i, 0, u());
        return stringBuffer;
    }

    public final StringBuilder c(StringBuilder sb2) {
        sb2.append(this.f32823i, 0, u());
        return sb2;
    }

    public final void d() {
        if (this.f32818d == 93) {
            return;
        }
        if (this.f32816b >= this.f32819e) {
            throw q("Unexpected end of JSON in collection", 0, f32813B);
        }
        throw n("Expecting ']' as array end");
    }

    public final void e(f fVar, Collection collection) {
        if (K()) {
            collection.add((Object) null);
        } else {
            collection.add(fVar.a(this));
        }
        while (h() == 44) {
            h();
            if (K()) {
                collection.add((Object) null);
            } else {
                collection.add(fVar.a(this));
            }
        }
        d();
    }

    public final ArrayList f(f fVar) {
        ArrayList arrayList = new ArrayList(4);
        e(fVar, arrayList);
        return arrayList;
    }

    public final int g() {
        return this.f32816b;
    }

    public final byte h() {
        A();
        if (f32814z[this.f32818d + 128]) {
            while (M()) {
                A();
            }
        }
        return this.f32818d;
    }

    public final int i() {
        return this.f32815a;
    }

    /* access modifiers changed from: package-private */
    public final boolean k() {
        if (this.f32824j == null) {
            if (this.f32819e == this.f32816b) {
                return true;
            }
            return false;
        } else if (this.f32819e != this.f32816b) {
            return false;
        } else {
            if (y() == 0) {
                return true;
            }
            return false;
        }
    }

    public final byte l() {
        return this.f32818d;
    }

    public final int m() {
        return this.f32819e;
    }

    public final o n(String str) {
        return o(str, 0);
    }

    public final o o(String str, int i10) {
        if (this.f32832r == d.MINIMAL) {
            return o.b(str, false);
        }
        this.f32838x.setLength(0);
        this.f32838x.append(str);
        this.f32838x.append(". Found ");
        this.f32838x.append((char) this.f32818d);
        if (this.f32832r == d.DESCRIPTION_ONLY) {
            return o.b(this.f32838x.toString(), false);
        }
        this.f32838x.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        v(i10, this.f32838x);
        return o.b(this.f32838x.toString(), N());
    }

    public final o p(String str, int i10) {
        d dVar = this.f32832r;
        if (dVar == d.MINIMAL || dVar == d.DESCRIPTION_ONLY) {
            return o.b(str, false);
        }
        this.f32838x.setLength(0);
        this.f32838x.append(str);
        this.f32838x.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        v(i10, this.f32838x);
        return o.b(this.f32838x.toString(), N());
    }

    public final o q(String str, int i10, Exception exc) {
        if (exc == null) {
            throw new IllegalArgumentException("cause can't be null");
        } else if (this.f32832r == d.MINIMAL) {
            return o.a(str, exc, false);
        } else {
            this.f32838x.setLength(0);
            String message = exc.getMessage();
            if (message != null && message.length() > 0) {
                this.f32838x.append(message);
                if (!message.endsWith(".")) {
                    this.f32838x.append(".");
                }
                this.f32838x.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            }
            this.f32838x.append(str);
            if (this.f32832r == d.DESCRIPTION_ONLY) {
                return o.a(this.f32838x.toString(), exc, false);
            }
            this.f32838x.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            v(i10, this.f32838x);
            return o.b(this.f32838x.toString(), N());
        }
    }

    public final o r(String str, int i10, String str2, Object... objArr) {
        if (this.f32832r == d.MINIMAL) {
            return o.b(str, false);
        }
        this.f32838x.setLength(0);
        this.f32839y.format(str2, objArr);
        if (this.f32832r == d.DESCRIPTION_ONLY) {
            return o.b(this.f32838x.toString(), false);
        }
        this.f32838x.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        v(i10, this.f32838x);
        return o.b(this.f32838x.toString(), N());
    }

    public final o s(String str, int i10, String str2, String str3, Object obj, String str4) {
        if (this.f32832r == d.MINIMAL) {
            return o.b(str, false);
        }
        this.f32838x.setLength(0);
        this.f32838x.append(str2);
        this.f32838x.append(str3);
        if (obj != null) {
            this.f32838x.append(": '");
            this.f32838x.append(obj.toString());
            this.f32838x.append("'");
        }
        this.f32838x.append(str4);
        if (this.f32832r == d.DESCRIPTION_ONLY) {
            return o.b(this.f32838x.toString(), false);
        }
        this.f32838x.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        v(i10, this.f32838x);
        return o.b(this.f32838x.toString(), N());
    }

    public final o t(String str, Object obj) {
        return s(str, 0, "", str, obj, "");
    }

    public String toString() {
        return new String(this.f32822h, 0, this.f32819e, f32812A);
    }

    /* access modifiers changed from: package-private */
    public final int u() {
        int i10;
        int i11;
        int i12 = this.f32816b;
        if (this.f32818d == 34) {
            int i13 = this.f32819e;
            if (i12 != i13) {
                char[] cArr = this.f32823i;
                int i14 = i13 - i12;
                if (cArr.length < i14) {
                    i14 = cArr.length;
                }
                int i15 = i12;
                int i16 = 0;
                while (true) {
                    if (i16 >= i14) {
                        break;
                    }
                    int i17 = i15 + 1;
                    byte b10 = this.f32822h[i15];
                    if (b10 == 34) {
                        this.f32816b = i17;
                        return i16;
                    } else if ((b10 ^ 92) < 1) {
                        i15 = i17;
                        break;
                    } else {
                        cArr[i16] = (char) b10;
                        i16++;
                        i15 = i17;
                    }
                }
                if (i16 == cArr.length) {
                    char[] cArr2 = this.f32823i;
                    int length = cArr2.length * 2;
                    int i18 = this.f32837w;
                    if (length <= i18) {
                        cArr = Arrays.copyOf(cArr2, length);
                        this.f32823i = cArr;
                    } else {
                        throw t("Maximum string buffer limit exceeded", Integer.valueOf(i18));
                    }
                }
                int length2 = cArr.length;
                int i19 = i15 - 1;
                this.f32816b = i19;
                int i20 = i19 - i12;
                while (!k()) {
                    int A10 = A();
                    if (A10 == 34) {
                        return i20;
                    }
                    if (A10 == 92) {
                        if (i20 >= length2 - 6) {
                            char[] cArr3 = this.f32823i;
                            int length3 = cArr3.length * 2;
                            int i21 = this.f32837w;
                            if (length3 <= i21) {
                                cArr = Arrays.copyOf(cArr3, length3);
                                this.f32823i = cArr;
                                length2 = cArr.length;
                            } else {
                                throw t("Maximum string buffer limit exceeded", Integer.valueOf(i21));
                            }
                        }
                        byte[] bArr = this.f32822h;
                        int i22 = this.f32816b;
                        int i23 = i22 + 1;
                        this.f32816b = i23;
                        byte b11 = bArr[i22];
                        if (b11 == 34 || b11 == 47 || b11 == 92) {
                            A10 = b11;
                            cArr[i20] = (char) A10;
                            i20++;
                        } else {
                            if (b11 == 98) {
                                A10 = 8;
                            } else if (b11 == 102) {
                                A10 = 12;
                            } else if (b11 == 110) {
                                A10 = 10;
                            } else if (b11 == 114) {
                                A10 = 13;
                            } else if (b11 == 116) {
                                A10 = 9;
                            } else if (b11 == 117) {
                                this.f32816b = i22 + 2;
                                byte[] bArr2 = this.f32822h;
                                int i24 = this.f32816b;
                                this.f32816b = i24 + 1;
                                int j10 = (j(bArr[i23]) << 12) + (j(bArr2[i24]) << 8);
                                byte[] bArr3 = this.f32822h;
                                int i25 = this.f32816b;
                                this.f32816b = i25 + 1;
                                i10 = j10 + (j(bArr3[i25]) << 4);
                                byte[] bArr4 = this.f32822h;
                                int i26 = this.f32816b;
                                this.f32816b = i26 + 1;
                                i11 = j(bArr4[i26]);
                            } else {
                                throw t("Invalid escape combination detected", Integer.valueOf(b11));
                            }
                            cArr[i20] = (char) A10;
                            i20++;
                        }
                    } else {
                        if ((A10 & 128) != 0) {
                            if (i20 >= length2 - 4) {
                                char[] cArr4 = this.f32823i;
                                int length4 = cArr4.length * 2;
                                int i27 = this.f32837w;
                                if (length4 <= i27) {
                                    char[] copyOf = Arrays.copyOf(cArr4, length4);
                                    this.f32823i = copyOf;
                                    cArr = copyOf;
                                    length2 = copyOf.length;
                                } else {
                                    throw t("Maximum string buffer limit exceeded", Integer.valueOf(i27));
                                }
                            }
                            byte[] bArr5 = this.f32822h;
                            int i28 = this.f32816b;
                            int i29 = i28 + 1;
                            this.f32816b = i29;
                            byte b12 = bArr5[i28];
                            if ((A10 & 224) == 192) {
                                i10 = (A10 & 31) << 6;
                                i11 = b12 & 63;
                            } else {
                                int i30 = i28 + 2;
                                this.f32816b = i30;
                                byte b13 = bArr5[i29];
                                if ((A10 & 240) == 224) {
                                    i10 = ((A10 & 15) << 12) + ((b12 & 63) << 6);
                                    i11 = b13 & 63;
                                } else {
                                    this.f32816b = i28 + 3;
                                    byte b14 = bArr5[i30];
                                    if ((A10 & 248) == 240) {
                                        A10 = ((A10 & 7) << 18) + ((b12 & 63) << 12) + ((b13 & 63) << 6) + (b14 & 63);
                                        if (A10 >= 65536) {
                                            if (A10 < 1114112) {
                                                int i31 = A10 - 65536;
                                                int i32 = i20 + 1;
                                                cArr[i20] = (char) ((i31 >>> 10) + GeneratorBase.SURR1_FIRST);
                                                i20 += 2;
                                                cArr[i32] = (char) ((i31 & 1023) + GeneratorBase.SURR2_FIRST);
                                            } else {
                                                throw p("Invalid unicode character detected", 0);
                                            }
                                        }
                                    } else {
                                        throw p("Invalid unicode character detected", 0);
                                    }
                                }
                            }
                        } else if (i20 >= length2) {
                            char[] cArr5 = this.f32823i;
                            int length5 = cArr5.length * 2;
                            int i33 = this.f32837w;
                            if (length5 <= i33) {
                                char[] copyOf2 = Arrays.copyOf(cArr5, length5);
                                this.f32823i = copyOf2;
                                cArr = copyOf2;
                                length2 = copyOf2.length;
                            } else {
                                throw t("Maximum string buffer limit exceeded", Integer.valueOf(i33));
                            }
                        }
                        cArr[i20] = (char) A10;
                        i20++;
                    }
                    A10 = i10 + i11;
                    cArr[i20] = (char) A10;
                    i20++;
                }
                throw p("JSON string was not closed with a double quote", 0);
            }
            throw p("Premature end of JSON string", 0);
        }
        throw n("Expecting '\"' for string start");
    }

    public final long w(int i10) {
        return (this.f32817c + ((long) this.f32816b)) - ((long) i10);
    }

    /* access modifiers changed from: package-private */
    public final char[] x(int i10, int i11) {
        char[] cArr;
        if (i11 <= this.f32836v) {
            while (true) {
                cArr = this.f32823i;
                if (cArr.length >= i11) {
                    break;
                }
                this.f32823i = Arrays.copyOf(cArr, cArr.length * 2);
            }
            byte[] bArr = this.f32822h;
            for (int i12 = 0; i12 < i11; i12++) {
                cArr[i12] = (char) bArr[i10 + i12];
            }
            return cArr;
        }
        throw s("Too many digits detected in number", i11, "", "Too many digits detected in number", Integer.valueOf(i11), "");
    }

    public final j z(InputStream inputStream) {
        this.f32817c = 0;
        this.f32816b = 0;
        this.f32824j = inputStream;
        if (inputStream != null) {
            int i10 = this.f32819e;
            int i11 = this.f32826l;
            if (i10 >= i11) {
                i10 = i11;
            }
            this.f32825k = i10;
            int C10 = C(this.f32822h, inputStream, 0);
            int i12 = this.f32826l;
            if (C10 < i12) {
                i12 = C10;
            }
            this.f32825k = i12;
            this.f32819e = C10;
        }
        return this;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    j(byte[] bArr, int i10, Object obj, char[] cArr, q qVar, q qVar2, s sVar, d dVar, b bVar, g gVar, int i11, int i12) {
        this(cArr, bArr, i10, obj, qVar, qVar2, sVar, dVar, bVar, gVar, i11, i12);
        byte[] bArr2 = bArr;
        int i13 = i10;
        if (cArr == null) {
            throw new IllegalArgumentException("tmp buffer provided as null.");
        } else if (i13 > bArr2.length) {
            throw new IllegalArgumentException("length can't be longer than buffer.length");
        } else if (i13 < bArr2.length) {
            bArr2[i13] = 0;
        }
    }
}
