package com.google.gson.internal.bind;

import Sc.d;
import com.google.gson.h;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.m;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

public final class g extends Sc.a {

    /* renamed from: u  reason: collision with root package name */
    private static final Reader f58220u = new a();

    /* renamed from: v  reason: collision with root package name */
    private static final Object f58221v = new Object();

    /* renamed from: q  reason: collision with root package name */
    private Object[] f58222q = new Object[32];

    /* renamed from: r  reason: collision with root package name */
    private int f58223r = 0;

    /* renamed from: s  reason: collision with root package name */
    private String[] f58224s = new String[32];

    /* renamed from: t  reason: collision with root package name */
    private int[] f58225t = new int[32];

    class a extends Reader {
        a() {
        }

        public void close() {
            throw new AssertionError();
        }

        public int read(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f58226a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                Sc.b[] r0 = Sc.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f58226a = r0
                Sc.b r1 = Sc.b.NAME     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f58226a     // Catch:{ NoSuchFieldError -> 0x001d }
                Sc.b r1 = Sc.b.END_ARRAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f58226a     // Catch:{ NoSuchFieldError -> 0x0028 }
                Sc.b r1 = Sc.b.END_OBJECT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f58226a     // Catch:{ NoSuchFieldError -> 0x0033 }
                Sc.b r1 = Sc.b.END_DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.g.b.<clinit>():void");
        }
    }

    public g(h hVar) {
        super(f58220u);
        M1(hVar);
    }

    private String E(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i10 = 0;
        while (true) {
            int i11 = this.f58223r;
            if (i10 >= i11) {
                return sb2.toString();
            }
            Object[] objArr = this.f58222q;
            Object obj = objArr[i10];
            if (obj instanceof com.google.gson.g) {
                i10++;
                if (i10 < i11 && (objArr[i10] instanceof Iterator)) {
                    int i12 = this.f58225t[i10];
                    if (z10 && i12 > 0 && (i10 == i11 - 1 || i10 == i11 - 2)) {
                        i12--;
                    }
                    sb2.append('[');
                    sb2.append(i12);
                    sb2.append(']');
                }
            } else if ((obj instanceof k) && (i10 = i10 + 1) < i11 && (objArr[i10] instanceof Iterator)) {
                sb2.append('.');
                String str = this.f58224s[i10];
                if (str != null) {
                    sb2.append(str);
                }
            }
            i10++;
        }
    }

    private void G1(Sc.b bVar) {
        if (I0() != bVar) {
            throw new IllegalStateException("Expected " + bVar + " but was " + I0() + U());
        }
    }

    private String I1(boolean z10) {
        String str;
        G1(Sc.b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) J1()).next();
        String str2 = (String) entry.getKey();
        String[] strArr = this.f58224s;
        int i10 = this.f58223r - 1;
        if (z10) {
            str = "<skipped>";
        } else {
            str = str2;
        }
        strArr[i10] = str;
        M1(entry.getValue());
        return str2;
    }

    private Object J1() {
        return this.f58222q[this.f58223r - 1];
    }

    private Object K1() {
        Object[] objArr = this.f58222q;
        int i10 = this.f58223r - 1;
        this.f58223r = i10;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    private void M1(Object obj) {
        int i10 = this.f58223r;
        Object[] objArr = this.f58222q;
        if (i10 == objArr.length) {
            int i11 = i10 * 2;
            this.f58222q = Arrays.copyOf(objArr, i11);
            this.f58225t = Arrays.copyOf(this.f58225t, i11);
            this.f58224s = (String[]) Arrays.copyOf(this.f58224s, i11);
        }
        Object[] objArr2 = this.f58222q;
        int i12 = this.f58223r;
        this.f58223r = i12 + 1;
        objArr2[i12] = obj;
    }

    private String U() {
        return " at path " + m();
    }

    public String B0() {
        Sc.b I02 = I0();
        Sc.b bVar = Sc.b.STRING;
        if (I02 == bVar || I02 == Sc.b.NUMBER) {
            String g10 = ((m) K1()).g();
            int i10 = this.f58223r;
            if (i10 > 0) {
                int[] iArr = this.f58225t;
                int i11 = i10 - 1;
                iArr[i11] = iArr[i11] + 1;
            }
            return g10;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + I02 + U());
    }

    public void D1() {
        int i10 = b.f58226a[I0().ordinal()];
        if (i10 == 1) {
            I1(true);
        } else if (i10 == 2) {
            t();
        } else if (i10 == 3) {
            v();
        } else if (i10 != 4) {
            K1();
            int i11 = this.f58223r;
            if (i11 > 0) {
                int[] iArr = this.f58225t;
                int i12 = i11 - 1;
                iArr[i12] = iArr[i12] + 1;
            }
        }
    }

    public String F() {
        return E(true);
    }

    /* access modifiers changed from: package-private */
    public h H1() {
        Sc.b I02 = I0();
        if (I02 == Sc.b.NAME || I02 == Sc.b.END_ARRAY || I02 == Sc.b.END_OBJECT || I02 == Sc.b.END_DOCUMENT) {
            throw new IllegalStateException("Unexpected " + I02 + " when reading a JsonElement.");
        }
        h hVar = (h) J1();
        D1();
        return hVar;
    }

    public Sc.b I0() {
        if (this.f58223r == 0) {
            return Sc.b.END_DOCUMENT;
        }
        Object J12 = J1();
        if (J12 instanceof Iterator) {
            boolean z10 = this.f58222q[this.f58223r - 2] instanceof k;
            Iterator it = (Iterator) J12;
            if (it.hasNext()) {
                if (z10) {
                    return Sc.b.NAME;
                }
                M1(it.next());
                return I0();
            } else if (z10) {
                return Sc.b.END_OBJECT;
            } else {
                return Sc.b.END_ARRAY;
            }
        } else if (J12 instanceof k) {
            return Sc.b.BEGIN_OBJECT;
        } else {
            if (J12 instanceof com.google.gson.g) {
                return Sc.b.BEGIN_ARRAY;
            }
            if (J12 instanceof m) {
                m mVar = (m) J12;
                if (mVar.I()) {
                    return Sc.b.STRING;
                }
                if (mVar.D()) {
                    return Sc.b.BOOLEAN;
                }
                if (mVar.H()) {
                    return Sc.b.NUMBER;
                }
                throw new AssertionError();
            } else if (J12 instanceof j) {
                return Sc.b.NULL;
            } else {
                if (J12 == f58221v) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new d("Custom JsonElement subclass " + J12.getClass().getName() + " is not supported");
            }
        }
    }

    public void L1() {
        G1(Sc.b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) J1()).next();
        M1(entry.getValue());
        M1(new m((String) entry.getKey()));
    }

    public boolean M() {
        Sc.b I02 = I0();
        if (I02 == Sc.b.END_OBJECT || I02 == Sc.b.END_ARRAY || I02 == Sc.b.END_DOCUMENT) {
            return false;
        }
        return true;
    }

    public boolean V() {
        G1(Sc.b.BOOLEAN);
        boolean v10 = ((m) K1()).v();
        int i10 = this.f58223r;
        if (i10 > 0) {
            int[] iArr = this.f58225t;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return v10;
    }

    public void b() {
        G1(Sc.b.BEGIN_ARRAY);
        M1(((com.google.gson.g) J1()).iterator());
        this.f58225t[this.f58223r - 1] = 0;
    }

    public void close() {
        this.f58222q = new Object[]{f58221v};
        this.f58223r = 1;
    }

    public void f() {
        G1(Sc.b.BEGIN_OBJECT);
        M1(((k) J1()).t().iterator());
    }

    public double f0() {
        Sc.b I02 = I0();
        Sc.b bVar = Sc.b.NUMBER;
        if (I02 == bVar || I02 == Sc.b.STRING) {
            double x10 = ((m) J1()).x();
            if (Q() || (!Double.isNaN(x10) && !Double.isInfinite(x10))) {
                K1();
                int i10 = this.f58223r;
                if (i10 > 0) {
                    int[] iArr = this.f58225t;
                    int i11 = i10 - 1;
                    iArr[i11] = iArr[i11] + 1;
                }
                return x10;
            }
            throw new d("JSON forbids NaN and infinities: " + x10);
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + I02 + U());
    }

    public int g0() {
        Sc.b I02 = I0();
        Sc.b bVar = Sc.b.NUMBER;
        if (I02 == bVar || I02 == Sc.b.STRING) {
            int z10 = ((m) J1()).z();
            K1();
            int i10 = this.f58223r;
            if (i10 > 0) {
                int[] iArr = this.f58225t;
                int i11 = i10 - 1;
                iArr[i11] = iArr[i11] + 1;
            }
            return z10;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + I02 + U());
    }

    public long h0() {
        Sc.b I02 = I0();
        Sc.b bVar = Sc.b.NUMBER;
        if (I02 == bVar || I02 == Sc.b.STRING) {
            long A10 = ((m) J1()).A();
            K1();
            int i10 = this.f58223r;
            if (i10 > 0) {
                int[] iArr = this.f58225t;
                int i11 = i10 - 1;
                iArr[i11] = iArr[i11] + 1;
            }
            return A10;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + I02 + U());
    }

    public String j0() {
        return I1(false);
    }

    public String m() {
        return E(false);
    }

    public void t() {
        G1(Sc.b.END_ARRAY);
        K1();
        K1();
        int i10 = this.f58223r;
        if (i10 > 0) {
            int[] iArr = this.f58225t;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    public void t0() {
        G1(Sc.b.NULL);
        K1();
        int i10 = this.f58223r;
        if (i10 > 0) {
            int[] iArr = this.f58225t;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    public String toString() {
        return g.class.getSimpleName() + U();
    }

    public void v() {
        G1(Sc.b.END_OBJECT);
        this.f58224s[this.f58223r - 1] = null;
        K1();
        K1();
        int i10 = this.f58223r;
        if (i10 > 0) {
            int[] iArr = this.f58225t;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }
}
