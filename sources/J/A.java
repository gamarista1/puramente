package J;

import H0.F;
import H0.G;
import H0.H;
import H0.U;
import c1.b;
import c1.n;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6787a;
import yf.C6798l;

final class A implements F {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C6787a f2816a;

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f2817a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ A f2818b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(List list, A a10) {
            super(1);
            this.f2817a = list;
            this.f2818b = a10;
        }

        public final void a(U.a aVar) {
            long a10;
            List h10 = C1208d.i(this.f2817a, this.f2818b.f2816a);
            if (h10 != null) {
                int size = h10.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Pair pair = (Pair) h10.get(i10);
                    U u10 = (U) pair.a();
                    C6787a aVar2 = (C6787a) pair.b();
                    if (aVar2 != null) {
                        a10 = ((n) aVar2.invoke()).p();
                    } else {
                        a10 = n.f19226b.a();
                    }
                    U.a.j(aVar, u10, a10, 0.0f, 2, (Object) null);
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((U.a) obj);
            return C6514M.f71813a;
        }
    }

    public A(C6787a aVar) {
        this.f2816a = aVar;
    }

    public G j(H h10, List list, long j10) {
        return H.N(h10, b.l(j10), b.k(j10), (Map) null, new a(list, this), 4, (Object) null);
    }
}
