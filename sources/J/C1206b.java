package J;

import H0.E;
import H0.F;
import H0.G;
import H0.H;
import H0.U;
import J0.C1241g;
import Q0.C1321d;
import Y.C1494j;
import Y.C1500m;
import Y.C1506p;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.Y0;
import android.support.v4.media.session.c;
import c1.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k0.h;
import k0.i;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import mf.C6565s;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.q;

/* renamed from: J.b  reason: case insensitive filesystem */
public abstract class C1206b {

    /* renamed from: a  reason: collision with root package name */
    private static final Pair f3018a = new Pair(C6565s.n(), C6565s.n());

    /* renamed from: J.b$a */
    static final class a implements F {

        /* renamed from: a  reason: collision with root package name */
        public static final a f3019a = new a();

        /* renamed from: J.b$a$a  reason: collision with other inner class name */
        static final class C0067a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ List f3020a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0067a(List list) {
                super(1);
                this.f3020a = list;
            }

            public final void a(U.a aVar) {
                List list = this.f3020a;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    U.a.l(aVar, (U) list.get(i10), 0, 0, 0.0f, 4, (Object) null);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((U.a) obj);
                return C6514M.f71813a;
            }
        }

        a() {
        }

        public final G j(H h10, List list, long j10) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(((E) list.get(i10)).v0(j10));
            }
            return H.N(h10, b.l(j10), b.k(j10), (Map) null, new C0067a(arrayList), 4, (Object) null);
        }
    }

    /* renamed from: J.b$b  reason: collision with other inner class name */
    static final class C0068b extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1321d f3021a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f3022b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f3023c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0068b(C1321d dVar, List list, int i10) {
            super(2);
            this.f3021a = dVar;
            this.f3022b = list;
            this.f3023c = i10;
        }

        public final void a(C1500m mVar, int i10) {
            C1206b.a(this.f3021a, this.f3022b, mVar, M0.a(this.f3023c | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    public static final void a(C1321d dVar, List list, C1500m mVar, int i10) {
        int i11;
        int i12;
        int i13;
        C1321d dVar2 = dVar;
        List list2 = list;
        int i14 = i10;
        C1500m h10 = mVar.h(-1794596951);
        if ((i14 & 6) == 0) {
            if (h10.S(dVar2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i14;
        } else {
            i11 = i14;
        }
        if ((i14 & 48) == 0) {
            if (h10.C(list2)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) != 18 || !h10.i()) {
            if (C1506p.H()) {
                C1506p.Q(-1794596951, i11, -1, "androidx.compose.foundation.text.InlineChildren (AnnotatedStringResolveInlineContent.kt:73)");
            }
            int size = list.size();
            int i15 = 0;
            int i16 = 0;
            while (i16 < size) {
                C1321d.c cVar = (C1321d.c) list2.get(i16);
                q qVar = (q) cVar.a();
                int b10 = cVar.b();
                int c10 = cVar.c();
                a aVar = a.f3019a;
                i.a aVar2 = i.f23074a;
                int a10 = C1494j.a(h10, i15);
                C1523y p10 = h10.p();
                i e10 = h.e(h10, aVar2);
                C1241g.a aVar3 = C1241g.f3853J;
                C6787a a11 = aVar3.a();
                if (h10.j() == null) {
                    C1494j.c();
                }
                h10.F();
                if (h10.f()) {
                    h10.U(a11);
                } else {
                    h10.q();
                }
                C1500m a12 = F1.a(h10);
                F1.b(a12, aVar, aVar3.c());
                F1.b(a12, p10, aVar3.e());
                p b11 = aVar3.b();
                if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
                    a12.r(Integer.valueOf(a10));
                    a12.V(Integer.valueOf(a10), b11);
                }
                F1.b(a12, e10, aVar3.d());
                qVar.invoke(dVar2.subSequence(b10, c10).j(), h10, 0);
                h10.u();
                i16++;
                i15 = 0;
            }
            if (C1506p.H()) {
                C1506p.P();
            }
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C0068b(dVar2, list2, i14));
        }
    }

    public static final boolean b(C1321d dVar) {
        return dVar.o("androidx.compose.foundation.text.inlineContent", 0, dVar.j().length());
    }

    public static final Pair c(C1321d dVar, Map map) {
        if (map == null || map.isEmpty()) {
            return f3018a;
        }
        List i10 = dVar.i("androidx.compose.foundation.text.inlineContent", 0, dVar.j().length());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = i10.size();
        for (int i11 = 0; i11 < size; i11++) {
            c.a(map.get(((C1321d.c) i10.get(i11)).g()));
        }
        return new Pair(arrayList, arrayList2);
    }
}
