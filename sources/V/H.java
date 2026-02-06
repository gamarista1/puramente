package V;

import W.q;
import Y.A1;
import androidx.compose.ui.window.r;
import c1.d;
import c1.n;
import c1.o;
import c1.s;
import c1.t;
import java.util.List;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import yf.p;

public final class H implements r {

    /* renamed from: a  reason: collision with root package name */
    private final d f6536a;

    /* renamed from: b  reason: collision with root package name */
    private final int f6537b;

    /* renamed from: c  reason: collision with root package name */
    private final A1 f6538c;

    /* renamed from: d  reason: collision with root package name */
    private final int f6539d;

    /* renamed from: e  reason: collision with root package name */
    private final p f6540e;

    /* renamed from: f  reason: collision with root package name */
    private final q.a f6541f;

    /* renamed from: g  reason: collision with root package name */
    private final q.a f6542g;

    /* renamed from: h  reason: collision with root package name */
    private final q.a f6543h;

    /* renamed from: i  reason: collision with root package name */
    private final q.a f6544i;

    /* renamed from: j  reason: collision with root package name */
    private final q.b f6545j;

    /* renamed from: k  reason: collision with root package name */
    private final q.b f6546k;

    /* renamed from: l  reason: collision with root package name */
    private final q.b f6547l;

    /* renamed from: m  reason: collision with root package name */
    private final q.b f6548m;

    public H(d dVar, int i10, A1 a12, int i11, p pVar) {
        this.f6536a = dVar;
        this.f6537b = i10;
        this.f6538c = a12;
        this.f6539d = i11;
        this.f6540e = pVar;
        q qVar = q.f8389a;
        this.f6541f = q.l(qVar, 0, 1, (Object) null);
        this.f6542g = q.f(qVar, 0, 1, (Object) null);
        this.f6543h = q.h(qVar, 0, 1, (Object) null);
        this.f6544i = q.j(qVar, 0, 1, (Object) null);
        this.f6545j = q.n(qVar, 0, 1, (Object) null);
        this.f6546k = q.b(qVar, 0, 1, (Object) null);
        this.f6547l = qVar.o(i11);
        this.f6548m = qVar.c(i11);
    }

    public long a(c1.p pVar, long j10, t tVar, long j11) {
        q.a aVar;
        int i10;
        q.b bVar;
        int i11;
        int a10;
        c1.p pVar2 = pVar;
        A1 a12 = this.f6538c;
        if (a12 != null) {
            a12.getValue();
        }
        long a11 = s.a(c1.r.g(j10), c1.r.f(j10) + this.f6537b);
        q.a aVar2 = this.f6541f;
        q.a aVar3 = this.f6542g;
        if (n.j(pVar.e()) < c1.r.g(a11) / 2) {
            aVar = this.f6543h;
        } else {
            aVar = this.f6544i;
        }
        List q10 = C6565s.q(aVar2, aVar3, aVar);
        int size = q10.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                i10 = 0;
                break;
            }
            int i13 = i12;
            i10 = ((q.a) q10.get(i12)).a(pVar, a11, c1.r.g(j11), tVar);
            if (i13 == C6565s.p(q10) || (i10 >= 0 && c1.r.g(j11) + i10 <= c1.r.g(a11))) {
                break;
            }
            i12 = i13 + 1;
        }
        q.b bVar2 = this.f6545j;
        q.b bVar3 = this.f6546k;
        if (n.k(pVar.e()) < c1.r.f(a11) / 2) {
            bVar = this.f6547l;
        } else {
            bVar = this.f6548m;
        }
        List q11 = C6565s.q(bVar2, bVar3, bVar);
        int size2 = q11.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size2) {
                i11 = 0;
                break;
            }
            a10 = ((q.b) q11.get(i14)).a(pVar2, a11, c1.r.f(j11));
            if (i14 == C6565s.p(q11) || (a10 >= 0 && c1.r.f(j11) + a10 <= c1.r.f(a11))) {
                i11 = a10;
            } else {
                i14++;
            }
        }
        i11 = a10;
        long a13 = o.a(i10, i11);
        this.f6540e.invoke(pVar2, c1.q.a(a13, j11));
        return a13;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ H(d dVar, int i10, A1 a12, int i11, p pVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, i10, (i12 & 4) != 0 ? null : a12, (i12 & 8) != 0 ? dVar.E0(C1374c0.j()) : i11, (i12 & 16) != 0 ? a.f6549a : pVar);
    }

    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final a f6549a = new a();

        a() {
            super(2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((c1.p) obj, (c1.p) obj2);
            return C6514M.f71813a;
        }

        public final void a(c1.p pVar, c1.p pVar2) {
        }
    }
}
