package H0;

import H0.U;
import J0.G;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

public final class Y extends G.f {

    /* renamed from: b  reason: collision with root package name */
    public static final Y f2557b = new Y();

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ U f2559a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(U u10) {
            super(1);
            this.f2559a = u10;
        }

        public final void a(U.a aVar) {
            U.a.p(aVar, this.f2559a, 0, 0, 0.0f, (C6798l) null, 12, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((U.a) obj);
            return C6514M.f71813a;
        }
    }

    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f2560a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(List list) {
            super(1);
            this.f2560a = list;
        }

        public final void a(U.a aVar) {
            List list = this.f2560a;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                U.a.p(aVar, (U) list.get(i10), 0, 0, 0.0f, (C6798l) null, 12, (Object) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((U.a) obj);
            return C6514M.f71813a;
        }
    }

    private Y() {
        super("Undefined intrinsics block and it is required");
    }

    public G j(H h10, List list, long j10) {
        if (list.isEmpty()) {
            return H.N(h10, c1.b.n(j10), c1.b.m(j10), (Map) null, a.f2558a, 4, (Object) null);
        }
        if (list.size() == 1) {
            U v02 = ((E) list.get(0)).v0(j10);
            return H.N(h10, c1.c.i(j10, v02.X0()), c1.c.h(j10, v02.R0()), (Map) null, new b(v02), 4, (Object) null);
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((E) list.get(i10)).v0(j10));
        }
        int size2 = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size2; i13++) {
            U u10 = (U) arrayList.get(i13);
            i11 = Math.max(u10.X0(), i11);
            i12 = Math.max(u10.R0(), i12);
        }
        return H.N(h10, c1.c.i(j10, i11), c1.c.h(j10, i12), (Map) null, new c(arrayList), 4, (Object) null);
    }

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f2558a = new a();

        a() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((U.a) obj);
            return C6514M.f71813a;
        }

        public final void a(U.a aVar) {
        }
    }
}
