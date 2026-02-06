package O;

import Ef.m;
import Q0.C1337u;
import Q0.T;
import Q0.U;
import V0.h;
import c1.b;
import c1.d;
import c1.f;
import c1.t;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class c {

    /* renamed from: h  reason: collision with root package name */
    public static final a f4456h = new a((DefaultConstructorMarker) null);

    /* renamed from: i  reason: collision with root package name */
    public static final int f4457i = 8;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static c f4458j;

    /* renamed from: a  reason: collision with root package name */
    private final t f4459a;

    /* renamed from: b  reason: collision with root package name */
    private final T f4460b;

    /* renamed from: c  reason: collision with root package name */
    private final d f4461c;

    /* renamed from: d  reason: collision with root package name */
    private final h.b f4462d;

    /* renamed from: e  reason: collision with root package name */
    private final T f4463e;

    /* renamed from: f  reason: collision with root package name */
    private float f4464f;

    /* renamed from: g  reason: collision with root package name */
    private float f4465g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(c cVar, t tVar, T t10, d dVar, h.b bVar) {
            if (cVar != null && tVar == cVar.g() && C6496s.c(t10, cVar.f()) && dVar.getDensity() == cVar.d().getDensity() && bVar == cVar.e()) {
                return cVar;
            }
            c a10 = c.f4458j;
            if (a10 != null && tVar == a10.g() && C6496s.c(t10, a10.f()) && dVar.getDensity() == a10.d().getDensity() && bVar == a10.e()) {
                return a10;
            }
            c cVar2 = new c(tVar, U.d(t10, tVar), f.a(dVar.getDensity(), dVar.r1()), bVar, (DefaultConstructorMarker) null);
            c.f4458j = cVar2;
            return cVar2;
        }

        private a() {
        }
    }

    public /* synthetic */ c(t tVar, T t10, d dVar, h.b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(tVar, t10, dVar, bVar);
    }

    public final long c(long j10, int i10) {
        int i11;
        int i12 = i10;
        float f10 = this.f4465g;
        float f11 = this.f4464f;
        if (Float.isNaN(f10) || Float.isNaN(f11)) {
            f10 = C1337u.b(d.f4466a, this.f4463e, c1.c.b(0, 0, 0, 0, 15, (Object) null), this.f4461c, this.f4462d, (List) null, (List) null, 1, false, 96, (Object) null).d();
            f11 = C1337u.b(d.f4467b, this.f4463e, c1.c.b(0, 0, 0, 0, 15, (Object) null), this.f4461c, this.f4462d, (List) null, (List) null, 2, false, 96, (Object) null).d() - f10;
            this.f4465g = f10;
            this.f4464f = f11;
        }
        if (i12 != 1) {
            i11 = m.h(m.d(Math.round(f10 + (f11 * ((float) (i12 - 1)))), 0), b.k(j10));
        } else {
            i11 = b.m(j10);
        }
        return c1.c.a(b.n(j10), b.l(j10), i11, b.k(j10));
    }

    public final d d() {
        return this.f4461c;
    }

    public final h.b e() {
        return this.f4462d;
    }

    public final T f() {
        return this.f4460b;
    }

    public final t g() {
        return this.f4459a;
    }

    private c(t tVar, T t10, d dVar, h.b bVar) {
        this.f4459a = tVar;
        this.f4460b = t10;
        this.f4461c = dVar;
        this.f4462d = bVar;
        this.f4463e = U.d(t10, tVar);
        this.f4464f = Float.NaN;
        this.f4465g = Float.NaN;
    }
}
