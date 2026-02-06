package F;

import B.k;
import B.l;
import E.C1133b;
import E.C1141j;
import E.C1150t;
import E.M;
import E.Q;
import Ef.i;
import H0.W;
import H0.X;
import Y.C1510r0;
import Y.o1;
import Y.p1;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.d;
import c1.n;
import h0.C2017a;
import h0.C2026j;
import h0.C2028l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C6494p;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.w;
import mf.C6559l;
import mf.C6565s;
import qf.C6658d;
import rf.C6680b;
import x.C2848L;
import yf.C6798l;
import yf.p;
import z.q;
import z.v;
import z.y;
import z.z;

public final class E implements y {

    /* renamed from: w  reason: collision with root package name */
    public static final c f1927w = new c((DefaultConstructorMarker) null);

    /* renamed from: x  reason: collision with root package name */
    public static final int f1928x = 8;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public static final C2026j f1929y = C2017a.a(a.f1952a, b.f1953a);

    /* renamed from: a  reason: collision with root package name */
    private final z f1930a;

    /* renamed from: b  reason: collision with root package name */
    private final C1510r0 f1931b;

    /* renamed from: c  reason: collision with root package name */
    private final p f1932c;

    /* renamed from: d  reason: collision with root package name */
    private final C1510r0 f1933d;

    /* renamed from: e  reason: collision with root package name */
    private final C1510r0 f1934e;

    /* renamed from: f  reason: collision with root package name */
    private final C1167b f1935f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public W f1936g;

    /* renamed from: h  reason: collision with root package name */
    private final X f1937h;

    /* renamed from: i  reason: collision with root package name */
    private final C1133b f1938i;

    /* renamed from: j  reason: collision with root package name */
    private final C1141j f1939j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f1940k;

    /* renamed from: l  reason: collision with root package name */
    private final androidx.compose.foundation.lazy.layout.d f1941l;

    /* renamed from: m  reason: collision with root package name */
    private final y f1942m;

    /* renamed from: n  reason: collision with root package name */
    private float f1943n;

    /* renamed from: o  reason: collision with root package name */
    private int f1944o;

    /* renamed from: p  reason: collision with root package name */
    private int f1945p;

    /* renamed from: q  reason: collision with root package name */
    private final Map f1946q;

    /* renamed from: r  reason: collision with root package name */
    private final l f1947r;

    /* renamed from: s  reason: collision with root package name */
    private final E.E f1948s;

    /* renamed from: t  reason: collision with root package name */
    private final LazyLayoutItemAnimator f1949t;

    /* renamed from: u  reason: collision with root package name */
    private final C1510r0 f1950u;

    /* renamed from: v  reason: collision with root package name */
    private final C1510r0 f1951v;

    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final a f1952a = new a();

        a() {
            super(2);
        }

        /* renamed from: a */
        public final List invoke(C2028l lVar, E e10) {
            return C6565s.q(e10.F().d(), e10.F().g());
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final b f1953a = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final E invoke(List list) {
            return new E((int[]) list.get(0), (int[]) list.get(1), (Q) null);
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C2026j a() {
            return E.f1929y;
        }

        private c() {
        }
    }

    public static final class d implements X {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ E f1954b;

        d(E e10) {
            this.f1954b = e10;
        }

        public void q(W w10) {
            this.f1954b.f1936g = w10;
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f1955a;

        /* renamed from: b  reason: collision with root package name */
        Object f1956b;

        /* renamed from: c  reason: collision with root package name */
        Object f1957c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f1958d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ E f1959e;

        /* renamed from: f  reason: collision with root package name */
        int f1960f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(E e10, C6658d dVar) {
            super(dVar);
            this.f1959e = e10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f1958d = obj;
            this.f1960f |= Integer.MIN_VALUE;
            return this.f1959e.e((C2848L) null, (p) null, this);
        }
    }

    /* synthetic */ class f extends C6494p implements p {
        f(Object obj) {
            super(2, obj, E.class, "fillNearestIndices", "fillNearestIndices(II)[I", 0);
        }

        public final int[] i(int i10, int i11) {
            return ((E) this.receiver).o(i10, i11);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return i(((Number) obj).intValue(), ((Number) obj2).intValue());
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f1961a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ E f1962b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f1963c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f1964d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(E e10, int i10, int i11, C6658d dVar) {
            super(2, dVar);
            this.f1962b = e10;
            this.f1963c = i10;
            this.f1964d = i11;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new g(this.f1962b, this.f1963c, this.f1964d, dVar);
        }

        /* renamed from: i */
        public final Object invoke(v vVar, C6658d dVar) {
            return ((g) create(vVar, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            C6680b.f();
            if (this.f1961a == 0) {
                w.b(obj);
                this.f1962b.O(this.f1963c, this.f1964d, true);
                return C6514M.f71813a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class h extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ E f1965a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(E e10) {
            super(1);
            this.f1965a = e10;
        }

        public final Float a(float f10) {
            return Float.valueOf(-this.f1965a.J(-f10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).floatValue());
        }
    }

    public E(int[] iArr, int[] iArr2, Q q10) {
        z zVar = new z(iArr, iArr2, new f(this));
        this.f1930a = zVar;
        this.f1931b = p1.h(w.b(), p1.j());
        this.f1932c = new p();
        Boolean bool = Boolean.FALSE;
        this.f1933d = u1.d(bool, (o1) null, 2, (Object) null);
        this.f1934e = u1.d(bool, (o1) null, 2, (Object) null);
        this.f1935f = new C1167b(this);
        this.f1937h = new d(this);
        this.f1938i = new C1133b();
        this.f1939j = new C1141j();
        this.f1940k = true;
        this.f1941l = new androidx.compose.foundation.lazy.layout.d(q10, (C6798l) null, 2, (DefaultConstructorMarker) null);
        this.f1942m = z.a(new h(this));
        this.f1945p = -1;
        this.f1946q = new LinkedHashMap();
        this.f1947r = k.a();
        this.f1948s = new E.E();
        this.f1949t = new LazyLayoutItemAnimator();
        zVar.e();
        this.f1950u = M.c((C1510r0) null, 1, (DefaultConstructorMarker) null);
        this.f1951v = M.c((C1510r0) null, 1, (DefaultConstructorMarker) null);
    }

    private final void H(float f10, v vVar) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        long j10;
        int f11;
        if (this.f1940k && !vVar.k().isEmpty()) {
            if (f10 < 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i10 = ((x) C6565s.z0(vVar.k())).getIndex();
            } else {
                i10 = ((x) C6565s.o0(vVar.k())).getIndex();
            }
            if (i10 != this.f1945p) {
                this.f1945p = i10;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                C o10 = vVar.o();
                int length = o10.b().length;
                for (int i14 = 0; i14 < length; i14++) {
                    if (z10) {
                        f11 = this.f1932c.e(i10, i14);
                    } else {
                        f11 = this.f1932c.f(i10, i14);
                    }
                    if (i10 < 0 || i10 >= vVar.h() || linkedHashSet.contains(Integer.valueOf(i10))) {
                        break;
                    }
                    linkedHashSet.add(Integer.valueOf(i10));
                    if (!this.f1946q.containsKey(Integer.valueOf(i10))) {
                        boolean a10 = vVar.s().a(i10);
                        if (a10) {
                            i11 = 0;
                        } else {
                            i11 = i14;
                        }
                        if (a10) {
                            i12 = length;
                        } else {
                            i12 = 1;
                        }
                        if (i12 == 1) {
                            i13 = o10.b()[i11];
                        } else {
                            int i15 = o10.a()[i11];
                            int i16 = (i11 + i12) - 1;
                            i13 = (o10.a()[i16] + o10.b()[i16]) - i15;
                        }
                        if (vVar.c() == q.Vertical) {
                            j10 = c1.b.f19206b.e(i13);
                        } else {
                            j10 = c1.b.f19206b.d(i13);
                        }
                        this.f1946q.put(Integer.valueOf(i10), this.f1941l.e(i10, j10));
                    }
                }
                n(linkedHashSet);
            }
        }
    }

    static /* synthetic */ void I(E e10, float f10, v vVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            vVar = (v) e10.f1931b.getValue();
        }
        e10.H(f10, vVar);
    }

    /* access modifiers changed from: private */
    public final float J(float f10) {
        if ((f10 < 0.0f && !d()) || (f10 > 0.0f && !c())) {
            return 0.0f;
        }
        if (Math.abs(this.f1943n) <= 0.5f) {
            float f11 = this.f1943n + f10;
            this.f1943n = f11;
            if (Math.abs(f11) > 0.5f) {
                v vVar = (v) this.f1931b.getValue();
                float f12 = this.f1943n;
                if (vVar.v(Af.a.d(f12))) {
                    k(vVar, true);
                    M.d(this.f1950u);
                    H(f12 - this.f1943n, vVar);
                } else {
                    W w10 = this.f1936g;
                    if (w10 != null) {
                        w10.h();
                    }
                    I(this, f12 - this.f1943n, (v) null, 2, (Object) null);
                }
            }
            if (Math.abs(this.f1943n) <= 0.5f) {
                return f10;
            }
            float f13 = f10 - this.f1943n;
            this.f1943n = 0.0f;
            return f13;
        }
        throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.f1943n).toString());
    }

    public static /* synthetic */ Object L(E e10, int i10, int i11, C6658d dVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return e10.K(i10, i11, dVar);
    }

    private void M(boolean z10) {
        this.f1934e.setValue(Boolean.valueOf(z10));
    }

    private void N(boolean z10) {
        this.f1933d.setValue(Boolean.valueOf(z10));
    }

    public static /* synthetic */ void l(E e10, v vVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        e10.k(vVar, z10);
    }

    private final void m(q qVar) {
        List k10 = qVar.k();
        if (this.f1945p != -1 && !k10.isEmpty()) {
            int index = ((C1174i) C6565s.o0(k10)).getIndex();
            int index2 = ((C1174i) C6565s.z0(k10)).getIndex();
            int i10 = this.f1945p;
            if (index > i10 || i10 > index2) {
                this.f1945p = -1;
                for (d.b cancel : this.f1946q.values()) {
                    cancel.cancel();
                }
                this.f1946q.clear();
            }
        }
    }

    private final void n(Set set) {
        Iterator it = this.f1946q.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!set.contains(entry.getKey())) {
                ((d.b) entry.getValue()).cancel();
                it.remove();
            }
        }
    }

    /* access modifiers changed from: private */
    public final int[] o(int i10, int i11) {
        int i12;
        int[] iArr = new int[i11];
        if (((v) this.f1931b.getValue()).s().a(i10)) {
            C6559l.y(iArr, i10, 0, 0, 6, (Object) null);
            return iArr;
        }
        this.f1932c.d(i10 + i11);
        int h10 = this.f1932c.h(i10);
        if (h10 == -2 || h10 == -1) {
            i12 = 0;
        } else if (h10 >= 0) {
            i12 = Math.min(h10, i11);
        } else {
            throw new IllegalArgumentException(("Expected positive lane number, got " + h10 + " instead.").toString());
        }
        int i13 = i12;
        int i14 = i13 - 1;
        int i15 = i10;
        while (true) {
            if (-1 >= i14) {
                break;
            }
            i15 = this.f1932c.f(i15, i14);
            iArr[i14] = i15;
            if (i15 == -1) {
                C6559l.y(iArr, -1, 0, i14, 2, (Object) null);
                break;
            }
            i14--;
        }
        iArr[i13] = i10;
        while (true) {
            i13++;
            if (i13 >= i11) {
                return iArr;
            }
            i10 = this.f1932c.e(i10, i13);
            iArr[i13] = i10;
        }
    }

    public final E.E A() {
        return this.f1948s;
    }

    public final C1510r0 B() {
        return this.f1950u;
    }

    public final androidx.compose.foundation.lazy.layout.d C() {
        return this.f1941l;
    }

    public final W D() {
        return this.f1936g;
    }

    public final X E() {
        return this.f1937h;
    }

    public final z F() {
        return this.f1930a;
    }

    public final float G() {
        return this.f1943n;
    }

    public final Object K(int i10, int i11, C6658d dVar) {
        Object a10 = y.a(this, (C2848L) null, new g(this, i10, i11, (C6658d) null), dVar, 1, (Object) null);
        if (a10 == C6680b.f()) {
            return a10;
        }
        return C6514M.f71813a;
    }

    public final void O(int i10, int i11, boolean z10) {
        boolean z11;
        int i12;
        if (this.f1930a.c() == i10 && this.f1930a.f() == i11) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            this.f1949t.o();
        }
        v vVar = (v) this.f1931b.getValue();
        C1174i a10 = w.a(vVar, i10);
        if (a10 == null || !z11) {
            this.f1930a.h(i10, i11);
        } else {
            if (vVar.c() == q.Vertical) {
                i12 = n.k(a10.a());
            } else {
                i12 = n.j(a10.a());
            }
            int i13 = i12 + i11;
            int length = vVar.n().length;
            int[] iArr = new int[length];
            for (int i14 = 0; i14 < length; i14++) {
                iArr[i14] = vVar.n()[i14] + i13;
            }
            this.f1930a.m(iArr);
        }
        if (z10) {
            W w10 = this.f1936g;
            if (w10 != null) {
                w10.h();
                return;
            }
            return;
        }
        M.d(this.f1951v);
    }

    public final int[] P(C1150t tVar, int[] iArr) {
        return this.f1930a.n(tVar, iArr);
    }

    public boolean b() {
        return this.f1942m.b();
    }

    public boolean c() {
        return ((Boolean) this.f1934e.getValue()).booleanValue();
    }

    public boolean d() {
        return ((Boolean) this.f1933d.getValue()).booleanValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: yf.p} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object e(x.C2848L r6, yf.p r7, qf.C6658d r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof F.E.e
            if (r0 == 0) goto L_0x0013
            r0 = r8
            F.E$e r0 = (F.E.e) r0
            int r1 = r0.f1960f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f1960f = r1
            goto L_0x0018
        L_0x0013:
            F.E$e r0 = new F.E$e
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f1958d
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f1960f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0045
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            lf.w.b(r8)
            goto L_0x006c
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            java.lang.Object r6 = r0.f1957c
            r7 = r6
            yf.p r7 = (yf.p) r7
            java.lang.Object r6 = r0.f1956b
            x.L r6 = (x.C2848L) r6
            java.lang.Object r2 = r0.f1955a
            F.E r2 = (F.E) r2
            lf.w.b(r8)
            goto L_0x005a
        L_0x0045:
            lf.w.b(r8)
            E.b r8 = r5.f1938i
            r0.f1955a = r5
            r0.f1956b = r6
            r0.f1957c = r7
            r0.f1960f = r4
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L_0x0059
            return r1
        L_0x0059:
            r2 = r5
        L_0x005a:
            z.y r8 = r2.f1942m
            r2 = 0
            r0.f1955a = r2
            r0.f1956b = r2
            r0.f1957c = r2
            r0.f1960f = r3
            java.lang.Object r6 = r8.e(r6, r7, r0)
            if (r6 != r1) goto L_0x006c
            return r1
        L_0x006c:
            lf.M r6 = lf.C6514M.f71813a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: F.E.e(x.L, yf.p, qf.d):java.lang.Object");
    }

    public float f(float f10) {
        return this.f1942m.f(f10);
    }

    public final void k(v vVar, boolean z10) {
        this.f1943n -= vVar.l();
        this.f1931b.setValue(vVar);
        if (z10) {
            this.f1930a.m(vVar.n());
        } else {
            this.f1930a.l(vVar);
            m(vVar);
        }
        M(vVar.g());
        N(vVar.j());
        this.f1944o++;
    }

    public final C1133b p() {
        return this.f1938i;
    }

    public final C1141j q() {
        return this.f1939j;
    }

    public final int r() {
        return this.f1930a.c();
    }

    public final int s() {
        return this.f1930a.f();
    }

    public final LazyLayoutItemAnimator t() {
        return this.f1949t;
    }

    public final int u() {
        return ((v) this.f1931b.getValue()).o().b().length;
    }

    public final p v() {
        return this.f1932c;
    }

    public final q w() {
        return (q) this.f1931b.getValue();
    }

    public final C1510r0 x() {
        return this.f1951v;
    }

    public final l y() {
        return this.f1947r;
    }

    public final i z() {
        return (i) this.f1930a.e().getValue();
    }

    public E(int i10, int i11) {
        this(new int[]{i10}, new int[]{i11}, (Q) null);
    }
}
