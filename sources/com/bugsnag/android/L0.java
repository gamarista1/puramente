package com.bugsnag.android;

import com.amazon.a.a.o.b;
import com.revenuecat.purchases.common.Constants;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

abstract class L0 implements Closeable, Flushable {

    /* renamed from: j  reason: collision with root package name */
    private static final String[] f38518j = new String[128];

    /* renamed from: k  reason: collision with root package name */
    private static final String[] f38519k;

    /* renamed from: a  reason: collision with root package name */
    private final Writer f38520a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f38521b = new int[32];

    /* renamed from: c  reason: collision with root package name */
    private int f38522c = 0;

    /* renamed from: d  reason: collision with root package name */
    private String f38523d;

    /* renamed from: e  reason: collision with root package name */
    private String f38524e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f38525f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f38526g;

    /* renamed from: h  reason: collision with root package name */
    private String f38527h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f38528i;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f38518j[i10] = String.format("\\u%04x", new Object[]{Integer.valueOf(i10)});
        }
        String[] strArr = f38518j;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f38519k = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public L0(Writer writer) {
        Q(6);
        this.f38524e = Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR;
        this.f38528i = true;
        if (writer != null) {
            this.f38520a = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    private void E() {
        if (this.f38523d != null) {
            this.f38520a.write("\n");
            int i10 = this.f38522c;
            for (int i11 = 1; i11 < i10; i11++) {
                this.f38520a.write(this.f38523d);
            }
        }
    }

    private L0 I(int i10, String str) {
        b();
        Q(i10);
        this.f38520a.write(str);
        return this;
    }

    private int M() {
        int i10 = this.f38522c;
        if (i10 != 0) {
            return this.f38521b[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void Q(int i10) {
        int i11 = this.f38522c;
        int[] iArr = this.f38521b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[(i11 * 2)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f38521b = iArr2;
        }
        int[] iArr3 = this.f38521b;
        int i12 = this.f38522c;
        this.f38522c = i12 + 1;
        iArr3[i12] = i10;
    }

    private void T(int i10) {
        this.f38521b[this.f38522c - 1] = i10;
    }

    private void V(String str) {
        String[] strArr;
        String str2;
        if (this.f38526g) {
            strArr = f38519k;
        } else {
            strArr = f38518j;
        }
        this.f38520a.write("\"");
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
                this.f38520a.write(str, i10, i11 - i10);
            }
            this.f38520a.write(str2);
            i10 = i11 + 1;
        }
        if (i10 < length) {
            this.f38520a.write(str, i10, length - i10);
        }
        this.f38520a.write("\"");
    }

    private void a() {
        int M10 = M();
        if (M10 == 5) {
            this.f38520a.write(44);
        } else if (M10 != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        E();
        T(4);
    }

    private L0 o(int i10, int i11, String str) {
        int M10 = M();
        if (M10 != i11 && M10 != i10) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f38527h == null) {
            this.f38522c--;
            if (M10 == i11) {
                E();
            }
            this.f38520a.write(str);
            return this;
        } else {
            throw new IllegalStateException("Dangling name: " + this.f38527h);
        }
    }

    private void t0() {
        if (this.f38527h != null) {
            a();
            V(this.f38527h);
            this.f38527h = null;
        }
    }

    public L0 F() {
        if (this.f38527h != null) {
            if (this.f38528i) {
                t0();
            } else {
                this.f38527h = null;
                return this;
            }
        }
        b();
        this.f38520a.write("null");
        return this;
    }

    public final void U(boolean z10) {
        this.f38528i = z10;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        int M10 = M();
        if (M10 == 1) {
            T(2);
            E();
        } else if (M10 == 2) {
            this.f38520a.write(44);
            E();
        } else if (M10 != 4) {
            if (M10 != 6) {
                if (M10 != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.f38525f) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            T(7);
        } else {
            this.f38520a.write(this.f38524e);
            T(5);
        }
    }

    public void close() {
        this.f38520a.close();
        int i10 = this.f38522c;
        if (i10 > 1 || (i10 == 1 && this.f38521b[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f38522c = 0;
    }

    public L0 f() {
        t0();
        return I(1, "[");
    }

    public L0 f0(long j10) {
        t0();
        b();
        this.f38520a.write(Long.toString(j10));
        return this;
    }

    public void flush() {
        if (this.f38522c != 0) {
            this.f38520a.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public L0 g0(Boolean bool) {
        String str;
        if (bool == null) {
            return F();
        }
        t0();
        b();
        Writer writer = this.f38520a;
        if (bool.booleanValue()) {
            str = b.f37475af;
        } else {
            str = b.f37476ag;
        }
        writer.write(str);
        return this;
    }

    public L0 h0(Number number) {
        if (number == null) {
            return F();
        }
        String obj = number.toString();
        if (this.f38525f || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            t0();
            b();
            this.f38520a.write(obj);
        } else {
            this.f38527h = null;
        }
        return this;
    }

    public L0 j0(String str) {
        if (str == null) {
            return F();
        }
        t0();
        b();
        V(str);
        return this;
    }

    public L0 n() {
        t0();
        return I(3, "{");
    }

    public L0 o0(boolean z10) {
        String str;
        t0();
        b();
        Writer writer = this.f38520a;
        if (z10) {
            str = b.f37475af;
        } else {
            str = b.f37476ag;
        }
        writer.write(str);
        return this;
    }

    public L0 q() {
        return o(1, 2, "]");
    }

    public L0 t() {
        return o(3, 5, "}");
    }

    public final boolean v() {
        return this.f38528i;
    }

    public L0 y(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.f38527h != null) {
            throw new IllegalStateException();
        } else if (this.f38522c != 0) {
            this.f38527h = str;
            return this;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }
}
