package Z;

import Ef.m;
import Y.C0;
import Y.C1483f;
import Y.C1485f1;
import Y.S0;
import java.util.Arrays;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6559l;

public final class g extends h {

    /* renamed from: i  reason: collision with root package name */
    public static final a f10369i = new a((DefaultConstructorMarker) null);

    /* renamed from: j  reason: collision with root package name */
    public static final int f10370j = 8;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public d[] f10371a = new d[16];
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public int f10372b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public int[] f10373c = new int[16];

    /* renamed from: d  reason: collision with root package name */
    private int f10374d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public Object[] f10375e = new Object[16];

    /* renamed from: f  reason: collision with root package name */
    private int f10376f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public int f10377g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public int f10378h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final class b implements e {

        /* renamed from: a  reason: collision with root package name */
        private int f10379a;

        /* renamed from: b  reason: collision with root package name */
        private int f10380b;

        /* renamed from: c  reason: collision with root package name */
        private int f10381c;

        public b() {
        }

        public Object a(int i10) {
            return g.this.f10375e[this.f10381c + i10];
        }

        public int b(int i10) {
            return g.this.f10373c[this.f10380b + i10];
        }

        public final d c() {
            d dVar = g.this.f10371a[this.f10379a];
            C6496s.e(dVar);
            return dVar;
        }

        public final boolean d() {
            if (this.f10379a >= g.this.f10372b) {
                return false;
            }
            d c10 = c();
            this.f10380b += c10.b();
            this.f10381c += c10.d();
            int i10 = this.f10379a + 1;
            this.f10379a = i10;
            if (i10 < g.this.f10372b) {
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: private */
    public final int A(int i10) {
        return (this.f10376f - v().d()) + i10;
    }

    /* access modifiers changed from: private */
    public final int n(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return -1 >>> (32 - i10);
    }

    private final int o(int i10, int i11) {
        return m.d(i10 + m.h(i10, 1024), i11);
    }

    private final void p(int i10) {
        int[] iArr = this.f10373c;
        int length = iArr.length;
        if (i10 > length) {
            int[] copyOf = Arrays.copyOf(iArr, o(length, i10));
            C6496s.g(copyOf, "copyOf(this, newSize)");
            this.f10373c = copyOf;
        }
    }

    private final void q(int i10) {
        Object[] objArr = this.f10375e;
        int length = objArr.length;
        if (i10 > length) {
            Object[] copyOf = Arrays.copyOf(objArr, o(length, i10));
            C6496s.g(copyOf, "copyOf(this, newSize)");
            this.f10375e = copyOf;
        }
    }

    /* access modifiers changed from: private */
    public final d v() {
        d dVar = this.f10371a[this.f10372b - 1];
        C6496s.e(dVar);
        return dVar;
    }

    /* access modifiers changed from: private */
    public final int z(int i10) {
        return (this.f10374d - v().b()) + i10;
    }

    public final void m() {
        this.f10372b = 0;
        this.f10374d = 0;
        C6559l.w(this.f10375e, (Object) null, 0, this.f10376f);
        this.f10376f = 0;
    }

    public final void r(C1483f fVar, C1485f1 f1Var, S0 s02) {
        if (u()) {
            b bVar = new b();
            do {
                bVar.c().a(bVar, fVar, f1Var, s02);
            } while (bVar.d());
        }
        m();
    }

    public final int s() {
        return this.f10372b;
    }

    public final boolean t() {
        if (s() == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return super.toString();
    }

    public final boolean u() {
        if (s() != 0) {
            return true;
        }
        return false;
    }

    public final void w(g gVar) {
        if (!t()) {
            d[] dVarArr = this.f10371a;
            int i10 = this.f10372b - 1;
            this.f10372b = i10;
            d dVar = dVarArr[i10];
            C6496s.e(dVar);
            this.f10371a[this.f10372b] = null;
            gVar.y(dVar);
            int i11 = this.f10376f;
            int i12 = gVar.f10376f;
            int d10 = dVar.d();
            for (int i13 = 0; i13 < d10; i13++) {
                i12--;
                i11--;
                Object[] objArr = gVar.f10375e;
                Object[] objArr2 = this.f10375e;
                objArr[i12] = objArr2[i11];
                objArr2[i11] = null;
            }
            int i14 = this.f10374d;
            int i15 = gVar.f10374d;
            int b10 = dVar.b();
            for (int i16 = 0; i16 < b10; i16++) {
                i15--;
                i14--;
                int[] iArr = gVar.f10373c;
                int[] iArr2 = this.f10373c;
                iArr[i15] = iArr2[i14];
                iArr2[i14] = 0;
            }
            this.f10376f -= dVar.d();
            this.f10374d -= dVar.b();
            return;
        }
        throw new NoSuchElementException("Cannot pop(), because the stack is empty.");
    }

    public final void x(d dVar) {
        boolean z10;
        if (dVar.b() == 0 && dVar.d() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            C0.a("Cannot push " + dVar + " without arguments because it expects " + dVar.b() + " ints and " + dVar.d() + " objects.");
        }
        y(dVar);
    }

    public final void y(d dVar) {
        this.f10377g = 0;
        this.f10378h = 0;
        int i10 = this.f10372b;
        if (i10 == this.f10371a.length) {
            Object[] copyOf = Arrays.copyOf(this.f10371a, this.f10372b + m.h(i10, 1024));
            C6496s.g(copyOf, "copyOf(this, newSize)");
            this.f10371a = (d[]) copyOf;
        }
        p(this.f10374d + dVar.b());
        q(this.f10376f + dVar.d());
        d[] dVarArr = this.f10371a;
        int i11 = this.f10372b;
        this.f10372b = i11 + 1;
        dVarArr[i11] = dVar;
        this.f10374d += dVar.b();
        this.f10376f += dVar.d();
    }

    public static final class c {
        public static final d b(g gVar) {
            return gVar.v();
        }

        public static final void c(g gVar, int i10, int i11) {
            boolean z10 = true;
            int i12 = 1 << i10;
            if ((gVar.f10377g & i12) != 0) {
                z10 = false;
            }
            if (!z10) {
                C0.b("Already pushed argument " + b(gVar).e(i10));
            }
            gVar.f10377g = gVar.f10377g | i12;
            gVar.f10373c[gVar.z(i10)] = i11;
        }

        public static final void d(g gVar, int i10, Object obj) {
            boolean z10 = true;
            int i11 = 1 << i10;
            if ((gVar.f10378h & i11) != 0) {
                z10 = false;
            }
            if (!z10) {
                C0.b("Already pushed argument " + b(gVar).f(i10));
            }
            gVar.f10378h = gVar.f10378h | i11;
            gVar.f10375e[gVar.A(i10)] = obj;
        }

        public static g a(g gVar) {
            return gVar;
        }
    }
}
