package J;

import H0.E;
import H0.F;
import H0.G;
import H0.H;
import H0.U;
import c1.b;
import c1.c;
import c1.n;
import c1.o;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import q0.C2423i;
import yf.C6787a;
import yf.C6798l;

final class f0 implements F {

    /* renamed from: a  reason: collision with root package name */
    private final C6787a f3169a;

    /* renamed from: b  reason: collision with root package name */
    private final C6787a f3170b;

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f3171a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f3172b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(List list, List list2) {
            super(1);
            this.f3171a = list;
            this.f3172b = list2;
        }

        public final void a(U.a aVar) {
            long a10;
            List list = this.f3171a;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Pair pair = (Pair) list.get(i10);
                    U.a.j(aVar, (U) pair.a(), ((n) pair.b()).p(), 0.0f, 2, (Object) null);
                }
            }
            List list2 = this.f3172b;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    Pair pair2 = (Pair) list2.get(i11);
                    U u10 = (U) pair2.a();
                    C6787a aVar2 = (C6787a) pair2.b();
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

    public f0(C6787a aVar, C6787a aVar2) {
        this.f3169a = aVar;
        this.f3170b = aVar2;
    }

    public G j(H h10, List list, long j10) {
        Pair pair;
        List list2 = list;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list2.get(i10);
            if (!(((E) obj).a() instanceof j0)) {
                arrayList.add(obj);
            }
        }
        List list3 = (List) this.f3170b.invoke();
        ArrayList arrayList2 = null;
        if (list3 != null) {
            ArrayList arrayList3 = new ArrayList(list3.size());
            int size2 = list3.size();
            for (int i11 = 0; i11 < size2; i11++) {
                C2423i iVar = (C2423i) list3.get(i11);
                if (iVar != null) {
                    pair = new Pair(((E) arrayList.get(i11)).v0(c.b(0, (int) ((float) Math.floor((double) iVar.n())), 0, (int) ((float) Math.floor((double) iVar.h())), 5, (Object) null)), n.b(o.a(Math.round(iVar.i()), Math.round(iVar.l()))));
                } else {
                    pair = null;
                }
                if (pair != null) {
                    arrayList3.add(pair);
                }
            }
            arrayList2 = arrayList3;
        }
        ArrayList arrayList4 = new ArrayList(list.size());
        int size3 = list.size();
        for (int i12 = 0; i12 < size3; i12++) {
            Object obj2 = list2.get(i12);
            if (((E) obj2).a() instanceof j0) {
                arrayList4.add(obj2);
            }
        }
        return H.N(h10, b.l(j10), b.k(j10), (Map) null, new a(arrayList2, C1208d.i(arrayList4, this.f3169a)), 4, (Object) null);
    }
}
