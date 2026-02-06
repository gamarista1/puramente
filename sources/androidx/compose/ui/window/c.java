package androidx.compose.ui.window;

import H0.E;
import H0.F;
import H0.G;
import H0.H;
import H0.U;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import mf.C6565s;
import yf.C6798l;

public final class c implements F {

    /* renamed from: a  reason: collision with root package name */
    public static final c f14264a = new c();

    public static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ U f14266a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(U u10) {
            super(1);
            this.f14266a = u10;
        }

        public final void a(U.a aVar) {
            U.a.l(aVar, this.f14266a, 0, 0, 0.0f, 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((U.a) obj);
            return C6514M.f71813a;
        }
    }

    /* renamed from: androidx.compose.ui.window.c$c  reason: collision with other inner class name */
    public static final class C0272c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f14267a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0272c(List list) {
            super(1);
            this.f14267a = list;
        }

        public final void a(U.a aVar) {
            int p10 = C6565s.p(this.f14267a);
            if (p10 >= 0) {
                int i10 = 0;
                while (true) {
                    U.a.l(aVar, (U) this.f14267a.get(i10), 0, 0, 0.0f, 4, (Object) null);
                    if (i10 != p10) {
                        i10++;
                    } else {
                        return;
                    }
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((U.a) obj);
            return C6514M.f71813a;
        }
    }

    public final G j(H h10, List list, long j10) {
        int i10;
        int i11;
        int size = list.size();
        if (size != 0) {
            int i12 = 0;
            if (size != 1) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    arrayList.add(((E) list.get(i13)).v0(j10));
                }
                int p10 = C6565s.p(arrayList);
                if (p10 >= 0) {
                    int i14 = 0;
                    int i15 = 0;
                    while (true) {
                        U u10 = (U) arrayList.get(i12);
                        i14 = Math.max(i14, u10.X0());
                        i15 = Math.max(i15, u10.R0());
                        if (i12 == p10) {
                            break;
                        }
                        i12++;
                    }
                    i11 = i14;
                    i10 = i15;
                } else {
                    i11 = 0;
                    i10 = 0;
                }
                return H.N(h10, i11, i10, (Map) null, new C0272c(arrayList), 4, (Object) null);
            }
            U v02 = ((E) list.get(0)).v0(j10);
            return H.N(h10, v02.X0(), v02.R0(), (Map) null, new b(v02), 4, (Object) null);
        }
        return H.N(h10, 0, 0, (Map) null, a.f14265a, 4, (Object) null);
    }

    public static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f14265a = new a();

        public a() {
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
