package J;

import Ef.m;
import Q0.C1321d;
import Q0.C1328k;
import Q0.C1329l;
import Q0.K;
import Q0.L;
import Q0.T;
import Q0.U;
import V0.h;
import c1.b;
import c1.c;
import c1.d;
import c1.s;
import c1.t;
import com.google.android.gms.common.api.a;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class I {

    /* renamed from: l  reason: collision with root package name */
    public static final a f2869l = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C1321d f2870a;

    /* renamed from: b  reason: collision with root package name */
    private final T f2871b;

    /* renamed from: c  reason: collision with root package name */
    private final int f2872c;

    /* renamed from: d  reason: collision with root package name */
    private final int f2873d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f2874e;

    /* renamed from: f  reason: collision with root package name */
    private final int f2875f;

    /* renamed from: g  reason: collision with root package name */
    private final d f2876g;

    /* renamed from: h  reason: collision with root package name */
    private final h.b f2877h;

    /* renamed from: i  reason: collision with root package name */
    private final List f2878i;

    /* renamed from: j  reason: collision with root package name */
    private C1329l f2879j;

    /* renamed from: k  reason: collision with root package name */
    private t f2880k;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ I(C1321d dVar, T t10, int i10, int i11, boolean z10, int i12, d dVar2, h.b bVar, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, t10, i10, i11, z10, i12, dVar2, bVar, list);
    }

    private final C1329l f() {
        C1329l lVar = this.f2879j;
        if (lVar != null) {
            return lVar;
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    private final C1328k n(long j10, t tVar) {
        int i10;
        int i11;
        m(tVar);
        int n10 = b.n(j10);
        if ((this.f2874e || b1.t.e(this.f2875f, b1.t.f19154a.b())) && b.h(j10)) {
            i10 = b.l(j10);
        } else {
            i10 = a.e.API_PRIORITY_OTHER;
        }
        if (this.f2874e || !b1.t.e(this.f2875f, b1.t.f19154a.b())) {
            i11 = this.f2872c;
        } else {
            i11 = 1;
        }
        int i12 = i11;
        if (n10 != i10) {
            i10 = m.l(c(), n10, i10);
        }
        return new C1328k(f(), b.f19206b.b(0, i10, 0, b.k(j10)), i12, b1.t.e(this.f2875f, b1.t.f19154a.b()), (DefaultConstructorMarker) null);
    }

    public final d a() {
        return this.f2876g;
    }

    public final h.b b() {
        return this.f2877h;
    }

    public final int c() {
        return J.a(f().a());
    }

    public final int d() {
        return this.f2872c;
    }

    public final int e() {
        return this.f2873d;
    }

    public final int g() {
        return this.f2875f;
    }

    public final List h() {
        return this.f2878i;
    }

    public final boolean i() {
        return this.f2874e;
    }

    public final T j() {
        return this.f2871b;
    }

    public final C1321d k() {
        return this.f2870a;
    }

    public final L l(long j10, t tVar, L l10) {
        long j11 = j10;
        if (l10 != null) {
            if (Z.a(l10, this.f2870a, this.f2871b, this.f2878i, this.f2872c, this.f2874e, this.f2875f, this.f2876g, tVar, this.f2877h, j10)) {
                K k10 = r1;
                K k11 = new K(l10.l().j(), this.f2871b, l10.l().g(), l10.l().e(), l10.l().h(), l10.l().f(), l10.l().b(), l10.l().d(), l10.l().c(), j10, (DefaultConstructorMarker) null);
                return l10.a(k10, c.f(j11, s.a(J.a(l10.w().A()), J.a(l10.w().h()))));
            }
        }
        C1328k n10 = n(j10, tVar);
        return new L(new K(this.f2870a, this.f2871b, this.f2878i, this.f2872c, this.f2874e, this.f2875f, this.f2876g, tVar, this.f2877h, j10, (DefaultConstructorMarker) null), n10, c.f(j11, s.a(J.a(n10.A()), J.a(n10.h()))), (DefaultConstructorMarker) null);
    }

    public final void m(t tVar) {
        C1329l lVar = this.f2879j;
        if (lVar == null || tVar != this.f2880k || lVar.c()) {
            this.f2880k = tVar;
            lVar = new C1329l(this.f2870a, U.d(this.f2871b, tVar), this.f2878i, this.f2876g, this.f2877h);
        }
        this.f2879j = lVar;
    }

    private I(C1321d dVar, T t10, int i10, int i11, boolean z10, int i12, d dVar2, h.b bVar, List list) {
        this.f2870a = dVar;
        this.f2871b = t10;
        this.f2872c = i10;
        this.f2873d = i11;
        this.f2874e = z10;
        this.f2875f = i12;
        this.f2876g = dVar2;
        this.f2877h = bVar;
        this.f2878i = list;
        if (i10 <= 0) {
            throw new IllegalArgumentException("no maxLines");
        } else if (i11 <= 0) {
            throw new IllegalArgumentException("no minLines");
        } else if (i11 > i10) {
            throw new IllegalArgumentException("minLines greater than maxLines");
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ I(Q0.C1321d r14, Q0.T r15, int r16, int r17, boolean r18, int r19, c1.d r20, V0.h.b r21, java.util.List r22, int r23, kotlin.jvm.internal.DefaultConstructorMarker r24) {
        /*
            r13 = this;
            r0 = r23
            r1 = r0 & 4
            if (r1 == 0) goto L_0x000b
            r1 = 2147483647(0x7fffffff, float:NaN)
            r5 = r1
            goto L_0x000d
        L_0x000b:
            r5 = r16
        L_0x000d:
            r1 = r0 & 8
            r2 = 1
            if (r1 == 0) goto L_0x0014
            r6 = r2
            goto L_0x0016
        L_0x0014:
            r6 = r17
        L_0x0016:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x001c
            r7 = r2
            goto L_0x001e
        L_0x001c:
            r7 = r18
        L_0x001e:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x002a
            b1.t$a r1 = b1.t.f19154a
            int r1 = r1.a()
            r8 = r1
            goto L_0x002c
        L_0x002a:
            r8 = r19
        L_0x002c:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0036
            java.util.List r0 = mf.C6565s.n()
            r11 = r0
            goto L_0x0038
        L_0x0036:
            r11 = r22
        L_0x0038:
            r12 = 0
            r2 = r13
            r3 = r14
            r4 = r15
            r9 = r20
            r10 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J.I.<init>(Q0.d, Q0.T, int, int, boolean, int, c1.d, V0.h$b, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
