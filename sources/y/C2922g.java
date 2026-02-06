package y;

import Y.C1500m;
import Y.C1506p;
import Y.M0;
import Y.Y0;
import Y.p1;
import g0.c;
import i0.r;
import k0.i;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6787a;
import yf.p;
import yf.q;

/* renamed from: y.g  reason: case insensitive filesystem */
public final class C2922g {

    /* renamed from: a  reason: collision with root package name */
    private final r f28468a = p1.f();

    /* renamed from: y.g$a */
    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2922g f28469a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2917b f28470b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f28471c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C2922g gVar, C2917b bVar, int i10) {
            super(2);
            this.f28469a = gVar;
            this.f28470b = bVar;
            this.f28471c = i10;
        }

        public final void a(C1500m mVar, int i10) {
            this.f28469a.a(this.f28470b, mVar, M0.a(this.f28471c | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: y.g$b */
    static final class b extends C6498u implements q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f28472a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f28473b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ i f28474c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ q f28475d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C6787a f28476e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(p pVar, boolean z10, i iVar, q qVar, C6787a aVar) {
            super(3);
            this.f28472a = pVar;
            this.f28473b = z10;
            this.f28474c = iVar;
            this.f28475d = qVar;
            this.f28476e = aVar;
        }

        public final void a(C2917b bVar, C1500m mVar, int i10) {
            int i11;
            if ((i10 & 6) == 0) {
                if (mVar.S(bVar)) {
                    i11 = 4;
                } else {
                    i11 = 2;
                }
                i10 |= i11;
            }
            if ((i10 & 19) != 18 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(262103052, i10, -1, "androidx.compose.foundation.contextmenu.ContextMenuScope.item.<anonymous> (ContextMenuUi.android.kt:275)");
                }
                String str = (String) this.f28472a.invoke(mVar, 0);
                if (!Sg.p.d0(str)) {
                    C2926k.b(str, this.f28473b, bVar, this.f28474c, this.f28475d, this.f28476e, mVar, (i10 << 6) & 896, 0);
                    if (C1506p.H()) {
                        C1506p.P();
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Label must not be blank");
            }
            mVar.I();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C2917b) obj, (C1500m) obj2, ((Number) obj3).intValue());
            return C6514M.f71813a;
        }
    }

    public static /* synthetic */ void d(C2922g gVar, p pVar, i iVar, boolean z10, q qVar, C6787a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            iVar = i.f23074a;
        }
        i iVar2 = iVar;
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if ((i10 & 8) != 0) {
            qVar = null;
        }
        gVar.c(pVar, iVar2, z11, qVar, aVar);
    }

    public final void a(C2917b bVar, C1500m mVar, int i10) {
        int i11;
        int i12;
        int i13;
        C1500m h10 = mVar.h(1320309496);
        if ((i10 & 6) == 0) {
            if (h10.S(bVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (h10.S(this)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) != 18 || !h10.i()) {
            if (C1506p.H()) {
                C1506p.Q(1320309496, i11, -1, "androidx.compose.foundation.contextmenu.ContextMenuScope.Content (ContextMenuUi.android.kt:233)");
            }
            r rVar = this.f28468a;
            int size = rVar.size();
            for (int i14 = 0; i14 < size; i14++) {
                ((q) rVar.get(i14)).invoke(bVar, h10, Integer.valueOf(i11 & 14));
            }
            if (C1506p.H()) {
                C1506p.P();
            }
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new a(this, bVar, i10));
        }
    }

    public final void b() {
        this.f28468a.clear();
    }

    public final void c(p pVar, i iVar, boolean z10, q qVar, C6787a aVar) {
        this.f28468a.add(c.c(262103052, true, new b(pVar, z10, iVar, qVar, aVar)));
    }
}
