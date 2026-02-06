package Sc;

import com.amazon.a.a.o.b;
import com.amazon.a.a.o.b.f;
import com.google.gson.d;
import com.google.gson.q;
import com.revenuecat.purchases.common.Constants;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

public class c implements Closeable, Flushable {

    /* renamed from: l  reason: collision with root package name */
    private static final Pattern f52410l = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: m  reason: collision with root package name */
    private static final String[] f52411m = new String[128];

    /* renamed from: n  reason: collision with root package name */
    private static final String[] f52412n;

    /* renamed from: a  reason: collision with root package name */
    private final Writer f52413a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f52414b = new int[32];

    /* renamed from: c  reason: collision with root package name */
    private int f52415c = 0;

    /* renamed from: d  reason: collision with root package name */
    private d f52416d;

    /* renamed from: e  reason: collision with root package name */
    private String f52417e;

    /* renamed from: f  reason: collision with root package name */
    private String f52418f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f52419g;

    /* renamed from: h  reason: collision with root package name */
    private q f52420h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f52421i;

    /* renamed from: j  reason: collision with root package name */
    private String f52422j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f52423k;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f52411m[i10] = String.format("\\u%04x", new Object[]{Integer.valueOf(i10)});
        }
        String[] strArr = f52411m;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f52412n = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        f0(6);
        this.f52420h = q.LEGACY_STRICT;
        this.f52423k = true;
        Objects.requireNonNull(writer, "out == null");
        this.f52413a = writer;
        h0(d.f58137d);
    }

    private void Q() {
        if (!this.f52419g) {
            this.f52413a.write(this.f52416d.b());
            int i10 = this.f52415c;
            for (int i11 = 1; i11 < i10; i11++) {
                this.f52413a.write(this.f52416d.a());
            }
        }
    }

    private c U(int i10, char c10) {
        f();
        f0(i10);
        this.f52413a.write(c10);
        return this;
    }

    private int V() {
        int i10 = this.f52415c;
        if (i10 != 0) {
            return this.f52414b[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void W0() {
        if (this.f52422j != null) {
            b();
            x0(this.f52422j);
            this.f52422j = null;
        }
    }

    private static boolean a(Class cls) {
        if (cls == Integer.class || cls == Long.class || cls == Byte.class || cls == Short.class || cls == BigDecimal.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class) {
            return true;
        }
        return false;
    }

    private void b() {
        int V10 = V();
        if (V10 == 5) {
            this.f52413a.write(this.f52418f);
        } else if (V10 != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        Q();
        g0(4);
    }

    private void f() {
        int V10 = V();
        if (V10 == 1) {
            g0(2);
            Q();
        } else if (V10 == 2) {
            this.f52413a.append(this.f52418f);
            Q();
        } else if (V10 != 4) {
            if (V10 != 6) {
                if (V10 != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (this.f52420h != q.LENIENT) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            g0(7);
        } else {
            this.f52413a.append(this.f52417e);
            g0(5);
        }
    }

    private void f0(int i10) {
        int i11 = this.f52415c;
        int[] iArr = this.f52414b;
        if (i11 == iArr.length) {
            this.f52414b = Arrays.copyOf(iArr, i11 * 2);
        }
        int[] iArr2 = this.f52414b;
        int i12 = this.f52415c;
        this.f52415c = i12 + 1;
        iArr2[i12] = i10;
    }

    private void g0(int i10) {
        this.f52414b[this.f52415c - 1] = i10;
    }

    private c q(int i10, int i11, char c10) {
        int V10 = V();
        if (V10 != i11 && V10 != i10) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f52422j == null) {
            this.f52415c--;
            if (V10 == i11) {
                Q();
            }
            this.f52413a.write(c10);
            return this;
        } else {
            throw new IllegalStateException("Dangling name: " + this.f52422j);
        }
    }

    private void x0(String str) {
        String[] strArr;
        String str2;
        if (this.f52421i) {
            strArr = f52412n;
        } else {
            strArr = f52411m;
        }
        this.f52413a.write(34);
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
                this.f52413a.write(str, i10, i11 - i10);
            }
            this.f52413a.write(str2);
            i10 = i11 + 1;
        }
        if (i10 < length) {
            this.f52413a.write(str, i10, length - i10);
        }
        this.f52413a.write(34);
    }

    public c B0(double d10) {
        W0();
        if (this.f52420h == q.LENIENT || (!Double.isNaN(d10) && !Double.isInfinite(d10))) {
            f();
            this.f52413a.append(Double.toString(d10));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
    }

    public final q E() {
        return this.f52420h;
    }

    public c E0(long j10) {
        W0();
        f();
        this.f52413a.write(Long.toString(j10));
        return this;
    }

    public final boolean F() {
        return this.f52421i;
    }

    public boolean I() {
        if (this.f52420h == q.LENIENT) {
            return true;
        }
        return false;
    }

    public c I0(Boolean bool) {
        String str;
        if (bool == null) {
            return T();
        }
        W0();
        f();
        Writer writer = this.f52413a;
        if (bool.booleanValue()) {
            str = b.f37475af;
        } else {
            str = b.f37476ag;
        }
        writer.write(str);
        return this;
    }

    public c L0(Number number) {
        if (number == null) {
            return T();
        }
        W0();
        String obj = number.toString();
        Class<?> cls = number.getClass();
        if (!a(cls)) {
            if (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN")) {
                if (this.f52420h != q.LENIENT) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was " + obj);
                }
            } else if (!(cls == Float.class || cls == Double.class || f52410l.matcher(obj).matches())) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
            }
        }
        f();
        this.f52413a.append(obj);
        return this;
    }

    public c M(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f52422j == null) {
            int V10 = V();
            if (V10 == 3 || V10 == 5) {
                this.f52422j = str;
                return this;
            }
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        throw new IllegalStateException("Already wrote a name, expecting a value.");
    }

    public c P0(String str) {
        if (str == null) {
            return T();
        }
        W0();
        f();
        x0(str);
        return this;
    }

    public c R0(boolean z10) {
        String str;
        W0();
        f();
        Writer writer = this.f52413a;
        if (z10) {
            str = b.f37475af;
        } else {
            str = b.f37476ag;
        }
        writer.write(str);
        return this;
    }

    public c T() {
        if (this.f52422j != null) {
            if (this.f52423k) {
                W0();
            } else {
                this.f52422j = null;
                return this;
            }
        }
        f();
        this.f52413a.write("null");
        return this;
    }

    public void close() {
        this.f52413a.close();
        int i10 = this.f52415c;
        if (i10 > 1 || (i10 == 1 && this.f52414b[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f52415c = 0;
    }

    public void flush() {
        if (this.f52415c != 0) {
            this.f52413a.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void h0(d dVar) {
        boolean z10;
        Objects.requireNonNull(dVar);
        this.f52416d = dVar;
        this.f52418f = f.f37529a;
        if (dVar.c()) {
            this.f52417e = ": ";
            if (this.f52416d.b().isEmpty()) {
                this.f52418f = ", ";
            }
        } else {
            this.f52417e = Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR;
        }
        if (!this.f52416d.b().isEmpty() || !this.f52416d.a().isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f52419g = z10;
    }

    public final void j0(boolean z10) {
        this.f52421i = z10;
    }

    public c n() {
        W0();
        return U(1, '[');
    }

    public c o() {
        W0();
        return U(3, '{');
    }

    public final void o0(boolean z10) {
        this.f52423k = z10;
    }

    public c t() {
        return q(1, 2, ']');
    }

    public final void t0(q qVar) {
        Objects.requireNonNull(qVar);
        this.f52420h = qVar;
    }

    public c v() {
        return q(3, 5, '}');
    }

    public final boolean y() {
        return this.f52423k;
    }
}
