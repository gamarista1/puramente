package W;

import V.C1374c0;
import W.q;
import androidx.compose.ui.window.r;
import c1.d;
import c1.n;
import c1.o;
import c1.t;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import yf.p;

public final class j implements r {

    /* renamed from: a  reason: collision with root package name */
    private final long f8347a;

    /* renamed from: b  reason: collision with root package name */
    private final d f8348b;

    /* renamed from: c  reason: collision with root package name */
    private final int f8349c;

    /* renamed from: d  reason: collision with root package name */
    private final p f8350d;

    /* renamed from: e  reason: collision with root package name */
    private final q.a f8351e;

    /* renamed from: f  reason: collision with root package name */
    private final q.a f8352f;

    /* renamed from: g  reason: collision with root package name */
    private final q.a f8353g;

    /* renamed from: h  reason: collision with root package name */
    private final q.a f8354h;

    /* renamed from: i  reason: collision with root package name */
    private final q.b f8355i;

    /* renamed from: j  reason: collision with root package name */
    private final q.b f8356j;

    /* renamed from: k  reason: collision with root package name */
    private final q.b f8357k;

    /* renamed from: l  reason: collision with root package name */
    private final q.b f8358l;

    /* renamed from: m  reason: collision with root package name */
    private final q.b f8359m;

    public /* synthetic */ j(long j10, d dVar, int i10, p pVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, dVar, i10, pVar);
    }

    public long a(c1.p pVar, long j10, t tVar, long j11) {
        q.a aVar;
        int i10;
        q.b bVar;
        c1.p pVar2 = pVar;
        int i11 = 0;
        q.a aVar2 = this.f8351e;
        q.a aVar3 = this.f8352f;
        if (n.j(pVar.e()) < c1.r.g(j10) / 2) {
            aVar = this.f8353g;
        } else {
            aVar = this.f8354h;
        }
        List q10 = C6565s.q(aVar2, aVar3, aVar);
        int size = q10.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                i10 = 0;
                break;
            }
            i10 = ((q.a) q10.get(i12)).a(pVar, j10, c1.r.g(j11), tVar);
            if (i12 == C6565s.p(q10) || (i10 >= 0 && c1.r.g(j11) + i10 <= c1.r.g(j10))) {
                break;
            }
            i12++;
        }
        q.b bVar2 = this.f8355i;
        q.b bVar3 = this.f8356j;
        q.b bVar4 = this.f8357k;
        if (n.k(pVar.e()) < c1.r.f(j10) / 2) {
            bVar = this.f8358l;
        } else {
            bVar = this.f8359m;
        }
        List q11 = C6565s.q(bVar2, bVar3, bVar4, bVar);
        int size2 = q11.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size2) {
                break;
            }
            int a10 = ((q.b) q11.get(i13)).a(pVar2, j10, c1.r.f(j11));
            if (i13 == C6565s.p(q11) || (a10 >= this.f8349c && c1.r.f(j11) + a10 <= c1.r.f(j10) - this.f8349c)) {
                i11 = a10;
            } else {
                i13++;
            }
        }
        long a11 = o.a(i10, i11);
        this.f8350d.invoke(pVar2, c1.q.a(a11, j11));
        return a11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (c1.j.d(this.f8347a, jVar.f8347a) && C6496s.c(this.f8348b, jVar.f8348b) && this.f8349c == jVar.f8349c && C6496s.c(this.f8350d, jVar.f8350d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((c1.j.g(this.f8347a) * 31) + this.f8348b.hashCode()) * 31) + Integer.hashCode(this.f8349c)) * 31) + this.f8350d.hashCode();
    }

    public String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + c1.j.h(this.f8347a) + ", density=" + this.f8348b + ", verticalMargin=" + this.f8349c + ", onPositionCalculated=" + this.f8350d + ')';
    }

    private j(long j10, d dVar, int i10, p pVar) {
        this.f8347a = j10;
        this.f8348b = dVar;
        this.f8349c = i10;
        this.f8350d = pVar;
        int E02 = dVar.E0(c1.j.e(j10));
        q qVar = q.f8389a;
        this.f8351e = qVar.k(E02);
        this.f8352f = qVar.e(E02);
        this.f8353g = qVar.g(0);
        this.f8354h = qVar.i(0);
        int E03 = dVar.E0(c1.j.f(j10));
        this.f8355i = qVar.m(E03);
        this.f8356j = qVar.a(E03);
        this.f8357k = qVar.d(E03);
        this.f8358l = qVar.o(i10);
        this.f8359m = qVar.c(i10);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(long j10, d dVar, int i10, p pVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, dVar, (i11 & 4) != 0 ? dVar.E0(C1374c0.j()) : i10, (i11 & 8) != 0 ? a.f8360a : pVar, (DefaultConstructorMarker) null);
    }

    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final a f8360a = new a();

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
