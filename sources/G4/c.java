package G4;

import Gh.C5404e;
import Gh.C5405f;
import Gh.C5406g;
import Gh.C5407h;
import Gh.K;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;

public abstract class c implements Closeable {

    /* renamed from: g  reason: collision with root package name */
    private static final String[] f31430g = new String[128];

    /* renamed from: a  reason: collision with root package name */
    int f31431a;

    /* renamed from: b  reason: collision with root package name */
    int[] f31432b = new int[32];

    /* renamed from: c  reason: collision with root package name */
    String[] f31433c = new String[32];

    /* renamed from: d  reason: collision with root package name */
    int[] f31434d = new int[32];

    /* renamed from: e  reason: collision with root package name */
    boolean f31435e;

    /* renamed from: f  reason: collision with root package name */
    boolean f31436f;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final String[] f31437a;

        /* renamed from: b  reason: collision with root package name */
        final K f31438b;

        private a(String[] strArr, K k10) {
            this.f31437a = strArr;
            this.f31438b = k10;
        }

        public static a a(String... strArr) {
            try {
                C5407h[] hVarArr = new C5407h[strArr.length];
                C5404e eVar = new C5404e();
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    c.f0(eVar, strArr[i10]);
                    eVar.readByte();
                    hVarArr[i10] = eVar.o0();
                }
                return new a((String[]) strArr.clone(), K.v(hVarArr));
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public enum b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f31430g[i10] = String.format("\\u%04x", new Object[]{Integer.valueOf(i10)});
        }
        String[] strArr = f31430g;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    c() {
    }

    public static c I(C5406g gVar) {
        return new e(gVar);
    }

    /* access modifiers changed from: private */
    public static void f0(C5405f fVar, String str) {
        String str2;
        String[] strArr = f31430g;
        fVar.K0(34);
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i10 < i11) {
                fVar.a0(str, i10, i11);
            }
            fVar.X(str2);
            i10 = i11 + 1;
        }
        if (i10 < length) {
            fVar.a0(str, i10, length);
        }
        fVar.K0(34);
    }

    public abstract String E();

    public abstract String F();

    public abstract b M();

    /* access modifiers changed from: package-private */
    public final void Q(int i10) {
        int i11 = this.f31431a;
        int[] iArr = this.f31432b;
        if (i11 == iArr.length) {
            if (i11 != 256) {
                this.f31432b = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f31433c;
                this.f31433c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f31434d;
                this.f31434d = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new a("Nesting too deep at " + m());
            }
        }
        int[] iArr3 = this.f31432b;
        int i12 = this.f31431a;
        this.f31431a = i12 + 1;
        iArr3[i12] = i10;
    }

    public abstract int T(a aVar);

    public abstract void U();

    public abstract void V();

    public abstract void b();

    public abstract void f();

    /* access modifiers changed from: package-private */
    public final b g0(String str) {
        throw new b(str + " at path " + m());
    }

    public final String m() {
        return d.a(this.f31431a, this.f31432b, this.f31433c, this.f31434d);
    }

    public abstract void n();

    public abstract void o();

    public abstract boolean q();

    public abstract boolean t();

    public abstract double v();

    public abstract int y();
}
