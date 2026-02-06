package Oh;

import com.amazon.a.a.o.b.f;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;

public abstract class e implements Serializable {
    private static final long serialVersionUID = -2587890625525655916L;

    /* renamed from: u  reason: collision with root package name */
    public static final e f64552u = new a();

    /* renamed from: v  reason: collision with root package name */
    public static final e f64553v = new b();

    /* renamed from: w  reason: collision with root package name */
    public static final e f64554w = new c();

    /* renamed from: x  reason: collision with root package name */
    public static final e f64555x = new d();

    /* renamed from: y  reason: collision with root package name */
    public static final e f64556y = new C0946e();

    /* renamed from: z  reason: collision with root package name */
    private static final ThreadLocal f64557z = new ThreadLocal();

    /* renamed from: a  reason: collision with root package name */
    private boolean f64558a = true;

    /* renamed from: b  reason: collision with root package name */
    private boolean f64559b = true;

    /* renamed from: c  reason: collision with root package name */
    private boolean f64560c = false;

    /* renamed from: d  reason: collision with root package name */
    private boolean f64561d = true;

    /* renamed from: e  reason: collision with root package name */
    private String f64562e = "[";

    /* renamed from: f  reason: collision with root package name */
    private String f64563f = "]";

    /* renamed from: g  reason: collision with root package name */
    private String f64564g = f.f37530b;

    /* renamed from: h  reason: collision with root package name */
    private boolean f64565h = false;

    /* renamed from: i  reason: collision with root package name */
    private boolean f64566i = false;

    /* renamed from: j  reason: collision with root package name */
    private String f64567j = f.f37529a;

    /* renamed from: k  reason: collision with root package name */
    private String f64568k = "{";

    /* renamed from: l  reason: collision with root package name */
    private String f64569l = f.f37529a;

    /* renamed from: m  reason: collision with root package name */
    private boolean f64570m = true;

    /* renamed from: n  reason: collision with root package name */
    private String f64571n = "}";

    /* renamed from: o  reason: collision with root package name */
    private boolean f64572o = true;

    /* renamed from: p  reason: collision with root package name */
    private String f64573p = "<null>";

    /* renamed from: q  reason: collision with root package name */
    private String f64574q = "<size=";

    /* renamed from: r  reason: collision with root package name */
    private String f64575r = ">";

    /* renamed from: s  reason: collision with root package name */
    private String f64576s = "<";

    /* renamed from: t  reason: collision with root package name */
    private String f64577t = ">";

    private static final class a extends e {
        private static final long serialVersionUID = 1;

        a() {
        }

        private Object readResolve() {
            return e.f64552u;
        }
    }

    private static final class b extends e {
        private static final long serialVersionUID = 1;

        b() {
            c0("[");
            StringBuilder sb2 = new StringBuilder();
            String str = Nh.e.f64378G;
            sb2.append(str);
            sb2.append("  ");
            d0(sb2.toString());
            e0(true);
            b0(str + "]");
        }

        private Object readResolve() {
            return e.f64553v;
        }
    }

    private static final class c extends e {
        private static final long serialVersionUID = 1;

        c() {
            g0(false);
        }

        private Object readResolve() {
            return e.f64554w;
        }
    }

    private static final class d extends e {
        private static final long serialVersionUID = 1;

        d() {
            i0(true);
            h0(false);
        }

        private Object readResolve() {
            return e.f64555x;
        }
    }

    /* renamed from: Oh.e$e  reason: collision with other inner class name */
    private static final class C0946e extends e {
        private static final long serialVersionUID = 1;

        C0946e() {
            f0(false);
            h0(false);
            g0(false);
            c0("");
            b0("");
        }

        private Object readResolve() {
            return e.f64556y;
        }
    }

    protected e() {
    }

    static Map T() {
        return (Map) f64557z.get();
    }

    static boolean W(Object obj) {
        Map T10 = T();
        if (T10 == null || !T10.containsKey(obj)) {
            return false;
        }
        return true;
    }

    static void Z(Object obj) {
        if (obj != null) {
            if (T() == null) {
                f64557z.set(new WeakHashMap());
            }
            T().put(obj, (Object) null);
        }
    }

    static void j0(Object obj) {
        Map T10;
        if (obj != null && (T10 = T()) != null) {
            T10.remove(obj);
            if (T10.isEmpty()) {
                f64557z.remove();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void A(StringBuffer stringBuffer, String str) {
        B(stringBuffer);
    }

    /* access modifiers changed from: protected */
    public void B(StringBuffer stringBuffer) {
        stringBuffer.append(this.f64567j);
    }

    /* access modifiers changed from: protected */
    public void C(StringBuffer stringBuffer, String str) {
        if (this.f64558a && str != null) {
            stringBuffer.append(str);
            stringBuffer.append(this.f64564g);
        }
    }

    /* access modifiers changed from: protected */
    public void D(StringBuffer stringBuffer, Object obj) {
        if (X() && obj != null) {
            Z(obj);
            stringBuffer.append('@');
            stringBuffer.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    /* access modifiers changed from: protected */
    public void E(StringBuffer stringBuffer, String str, Object obj, boolean z10) {
        if (!W(obj) || (obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof Character)) {
            Z(obj);
            try {
                if (obj instanceof Collection) {
                    if (z10) {
                        m(stringBuffer, str, (Collection) obj);
                    } else {
                        R(stringBuffer, str, ((Collection) obj).size());
                    }
                } else if (obj instanceof Map) {
                    if (z10) {
                        n(stringBuffer, str, (Map) obj);
                    } else {
                        R(stringBuffer, str, ((Map) obj).size());
                    }
                } else if (obj instanceof long[]) {
                    if (z10) {
                        v(stringBuffer, str, (long[]) obj);
                    } else {
                        N(stringBuffer, str, (long[]) obj);
                    }
                } else if (obj instanceof int[]) {
                    if (z10) {
                        u(stringBuffer, str, (int[]) obj);
                    } else {
                        M(stringBuffer, str, (int[]) obj);
                    }
                } else if (obj instanceof short[]) {
                    if (z10) {
                        x(stringBuffer, str, (short[]) obj);
                    } else {
                        P(stringBuffer, str, (short[]) obj);
                    }
                } else if (obj instanceof byte[]) {
                    if (z10) {
                        q(stringBuffer, str, (byte[]) obj);
                    } else {
                        I(stringBuffer, str, (byte[]) obj);
                    }
                } else if (obj instanceof char[]) {
                    if (z10) {
                        r(stringBuffer, str, (char[]) obj);
                    } else {
                        J(stringBuffer, str, (char[]) obj);
                    }
                } else if (obj instanceof double[]) {
                    if (z10) {
                        s(stringBuffer, str, (double[]) obj);
                    } else {
                        K(stringBuffer, str, (double[]) obj);
                    }
                } else if (obj instanceof float[]) {
                    if (z10) {
                        t(stringBuffer, str, (float[]) obj);
                    } else {
                        L(stringBuffer, str, (float[]) obj);
                    }
                } else if (obj instanceof boolean[]) {
                    if (z10) {
                        y(stringBuffer, str, (boolean[]) obj);
                    } else {
                        Q(stringBuffer, str, (boolean[]) obj);
                    }
                } else if (obj.getClass().isArray()) {
                    if (z10) {
                        w(stringBuffer, str, (Object[]) obj);
                    } else {
                        O(stringBuffer, str, (Object[]) obj);
                    }
                } else if (z10) {
                    l(stringBuffer, str, obj);
                } else {
                    H(stringBuffer, str, obj);
                }
            } finally {
                j0(obj);
            }
        } else {
            e(stringBuffer, str, obj);
        }
    }

    /* access modifiers changed from: protected */
    public void F(StringBuffer stringBuffer, String str) {
        stringBuffer.append(this.f64573p);
    }

    public void G(StringBuffer stringBuffer, Object obj) {
        if (obj != null) {
            b(stringBuffer, obj);
            D(stringBuffer, obj);
            d(stringBuffer);
            if (this.f64565h) {
                B(stringBuffer);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void H(StringBuffer stringBuffer, String str, Object obj) {
        stringBuffer.append(this.f64576s);
        stringBuffer.append(U(obj.getClass()));
        stringBuffer.append(this.f64577t);
    }

    /* access modifiers changed from: protected */
    public void I(StringBuffer stringBuffer, String str, byte[] bArr) {
        R(stringBuffer, str, bArr.length);
    }

    /* access modifiers changed from: protected */
    public void J(StringBuffer stringBuffer, String str, char[] cArr) {
        R(stringBuffer, str, cArr.length);
    }

    /* access modifiers changed from: protected */
    public void K(StringBuffer stringBuffer, String str, double[] dArr) {
        R(stringBuffer, str, dArr.length);
    }

    /* access modifiers changed from: protected */
    public void L(StringBuffer stringBuffer, String str, float[] fArr) {
        R(stringBuffer, str, fArr.length);
    }

    /* access modifiers changed from: protected */
    public void M(StringBuffer stringBuffer, String str, int[] iArr) {
        R(stringBuffer, str, iArr.length);
    }

    /* access modifiers changed from: protected */
    public void N(StringBuffer stringBuffer, String str, long[] jArr) {
        R(stringBuffer, str, jArr.length);
    }

    /* access modifiers changed from: protected */
    public void O(StringBuffer stringBuffer, String str, Object[] objArr) {
        R(stringBuffer, str, objArr.length);
    }

    /* access modifiers changed from: protected */
    public void P(StringBuffer stringBuffer, String str, short[] sArr) {
        R(stringBuffer, str, sArr.length);
    }

    /* access modifiers changed from: protected */
    public void Q(StringBuffer stringBuffer, String str, boolean[] zArr) {
        R(stringBuffer, str, zArr.length);
    }

    /* access modifiers changed from: protected */
    public void R(StringBuffer stringBuffer, String str, int i10) {
        stringBuffer.append(this.f64574q);
        stringBuffer.append(i10);
        stringBuffer.append(this.f64575r);
    }

    /* access modifiers changed from: protected */
    public String S() {
        return this.f64573p;
    }

    /* access modifiers changed from: protected */
    public String U(Class cls) {
        return Nh.a.b(cls);
    }

    /* access modifiers changed from: protected */
    public boolean V(Boolean bool) {
        if (bool == null) {
            return this.f64572o;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: protected */
    public boolean X() {
        return this.f64561d;
    }

    /* access modifiers changed from: protected */
    public void Y(StringBuffer stringBuffer, String str, Object obj) {
        stringBuffer.append(this.f64568k);
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            Object obj2 = Array.get(obj, i10);
            if (i10 > 0) {
                stringBuffer.append(this.f64569l);
            }
            if (obj2 == null) {
                F(stringBuffer, str);
            } else {
                E(stringBuffer, str, obj2, this.f64570m);
            }
        }
        stringBuffer.append(this.f64571n);
    }

    public void a(StringBuffer stringBuffer, String str, Object obj, Boolean bool) {
        C(stringBuffer, str);
        if (obj == null) {
            F(stringBuffer, str);
        } else {
            E(stringBuffer, str, obj, V(bool));
        }
        A(stringBuffer, str);
    }

    /* access modifiers changed from: protected */
    public void a0(StringBuffer stringBuffer) {
        int length = stringBuffer.length();
        int length2 = this.f64567j.length();
        if (length > 0 && length2 > 0 && length >= length2) {
            int i10 = 0;
            while (i10 < length2) {
                if (stringBuffer.charAt((length - 1) - i10) == this.f64567j.charAt((length2 - 1) - i10)) {
                    i10++;
                } else {
                    return;
                }
            }
            stringBuffer.setLength(length - length2);
        }
    }

    /* access modifiers changed from: protected */
    public void b(StringBuffer stringBuffer, Object obj) {
        if (this.f64559b && obj != null) {
            Z(obj);
            if (this.f64560c) {
                stringBuffer.append(U(obj.getClass()));
            } else {
                stringBuffer.append(obj.getClass().getName());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void b0(String str) {
        if (str == null) {
            str = "";
        }
        this.f64563f = str;
    }

    /* access modifiers changed from: protected */
    public void c(StringBuffer stringBuffer) {
        stringBuffer.append(this.f64563f);
    }

    /* access modifiers changed from: protected */
    public void c0(String str) {
        if (str == null) {
            str = "";
        }
        this.f64562e = str;
    }

    /* access modifiers changed from: protected */
    public void d(StringBuffer stringBuffer) {
        stringBuffer.append(this.f64562e);
    }

    /* access modifiers changed from: protected */
    public void d0(String str) {
        if (str == null) {
            str = "";
        }
        this.f64567j = str;
    }

    /* access modifiers changed from: protected */
    public void e(StringBuffer stringBuffer, String str, Object obj) {
        Nh.c.a(stringBuffer, obj);
    }

    /* access modifiers changed from: protected */
    public void e0(boolean z10) {
        this.f64565h = z10;
    }

    /* access modifiers changed from: protected */
    public void f(StringBuffer stringBuffer, String str, byte b10) {
        stringBuffer.append(b10);
    }

    /* access modifiers changed from: protected */
    public void f0(boolean z10) {
        this.f64559b = z10;
    }

    /* access modifiers changed from: protected */
    public void g(StringBuffer stringBuffer, String str, char c10) {
        stringBuffer.append(c10);
    }

    /* access modifiers changed from: protected */
    public void g0(boolean z10) {
        this.f64558a = z10;
    }

    /* access modifiers changed from: protected */
    public void h(StringBuffer stringBuffer, String str, double d10) {
        stringBuffer.append(d10);
    }

    /* access modifiers changed from: protected */
    public void h0(boolean z10) {
        this.f64561d = z10;
    }

    /* access modifiers changed from: protected */
    public void i(StringBuffer stringBuffer, String str, float f10) {
        stringBuffer.append(f10);
    }

    /* access modifiers changed from: protected */
    public void i0(boolean z10) {
        this.f64560c = z10;
    }

    /* access modifiers changed from: protected */
    public void j(StringBuffer stringBuffer, String str, int i10) {
        stringBuffer.append(i10);
    }

    /* access modifiers changed from: protected */
    public void k(StringBuffer stringBuffer, String str, long j10) {
        stringBuffer.append(j10);
    }

    /* access modifiers changed from: protected */
    public void l(StringBuffer stringBuffer, String str, Object obj) {
        stringBuffer.append(obj);
    }

    /* access modifiers changed from: protected */
    public void m(StringBuffer stringBuffer, String str, Collection collection) {
        stringBuffer.append(collection);
    }

    /* access modifiers changed from: protected */
    public void n(StringBuffer stringBuffer, String str, Map map) {
        stringBuffer.append(map);
    }

    /* access modifiers changed from: protected */
    public void o(StringBuffer stringBuffer, String str, short s10) {
        stringBuffer.append(s10);
    }

    /* access modifiers changed from: protected */
    public void p(StringBuffer stringBuffer, String str, boolean z10) {
        stringBuffer.append(z10);
    }

    /* access modifiers changed from: protected */
    public void q(StringBuffer stringBuffer, String str, byte[] bArr) {
        stringBuffer.append(this.f64568k);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (i10 > 0) {
                stringBuffer.append(this.f64569l);
            }
            f(stringBuffer, str, bArr[i10]);
        }
        stringBuffer.append(this.f64571n);
    }

    /* access modifiers changed from: protected */
    public void r(StringBuffer stringBuffer, String str, char[] cArr) {
        stringBuffer.append(this.f64568k);
        for (int i10 = 0; i10 < cArr.length; i10++) {
            if (i10 > 0) {
                stringBuffer.append(this.f64569l);
            }
            g(stringBuffer, str, cArr[i10]);
        }
        stringBuffer.append(this.f64571n);
    }

    /* access modifiers changed from: protected */
    public void s(StringBuffer stringBuffer, String str, double[] dArr) {
        stringBuffer.append(this.f64568k);
        for (int i10 = 0; i10 < dArr.length; i10++) {
            if (i10 > 0) {
                stringBuffer.append(this.f64569l);
            }
            h(stringBuffer, str, dArr[i10]);
        }
        stringBuffer.append(this.f64571n);
    }

    /* access modifiers changed from: protected */
    public void t(StringBuffer stringBuffer, String str, float[] fArr) {
        stringBuffer.append(this.f64568k);
        for (int i10 = 0; i10 < fArr.length; i10++) {
            if (i10 > 0) {
                stringBuffer.append(this.f64569l);
            }
            i(stringBuffer, str, fArr[i10]);
        }
        stringBuffer.append(this.f64571n);
    }

    /* access modifiers changed from: protected */
    public void u(StringBuffer stringBuffer, String str, int[] iArr) {
        stringBuffer.append(this.f64568k);
        for (int i10 = 0; i10 < iArr.length; i10++) {
            if (i10 > 0) {
                stringBuffer.append(this.f64569l);
            }
            j(stringBuffer, str, iArr[i10]);
        }
        stringBuffer.append(this.f64571n);
    }

    /* access modifiers changed from: protected */
    public void v(StringBuffer stringBuffer, String str, long[] jArr) {
        stringBuffer.append(this.f64568k);
        for (int i10 = 0; i10 < jArr.length; i10++) {
            if (i10 > 0) {
                stringBuffer.append(this.f64569l);
            }
            k(stringBuffer, str, jArr[i10]);
        }
        stringBuffer.append(this.f64571n);
    }

    /* access modifiers changed from: protected */
    public void w(StringBuffer stringBuffer, String str, Object[] objArr) {
        stringBuffer.append(this.f64568k);
        for (int i10 = 0; i10 < objArr.length; i10++) {
            Object obj = objArr[i10];
            if (i10 > 0) {
                stringBuffer.append(this.f64569l);
            }
            if (obj == null) {
                F(stringBuffer, str);
            } else {
                E(stringBuffer, str, obj, this.f64570m);
            }
        }
        stringBuffer.append(this.f64571n);
    }

    /* access modifiers changed from: protected */
    public void x(StringBuffer stringBuffer, String str, short[] sArr) {
        stringBuffer.append(this.f64568k);
        for (int i10 = 0; i10 < sArr.length; i10++) {
            if (i10 > 0) {
                stringBuffer.append(this.f64569l);
            }
            o(stringBuffer, str, sArr[i10]);
        }
        stringBuffer.append(this.f64571n);
    }

    /* access modifiers changed from: protected */
    public void y(StringBuffer stringBuffer, String str, boolean[] zArr) {
        stringBuffer.append(this.f64568k);
        for (int i10 = 0; i10 < zArr.length; i10++) {
            if (i10 > 0) {
                stringBuffer.append(this.f64569l);
            }
            p(stringBuffer, str, zArr[i10]);
        }
        stringBuffer.append(this.f64571n);
    }

    public void z(StringBuffer stringBuffer, Object obj) {
        if (!this.f64566i) {
            a0(stringBuffer);
        }
        c(stringBuffer);
        j0(obj);
    }
}
