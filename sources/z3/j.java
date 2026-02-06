package Z3;

import H0.C1187h;
import Y.C1500m;
import g0.c;
import k0.i;
import lf.C6514M;
import r0.C2547y0;
import w0.C2817c;
import yf.q;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f10470a = new j();

    /* renamed from: b  reason: collision with root package name */
    public static q f10471b = c.c(-1783408023, false, a.f10472a);

    static final class a implements q {

        /* renamed from: a  reason: collision with root package name */
        public static final a f10472a = new a();

        a() {
        }

        public final void a(w wVar, C1500m mVar, int i10) {
            int i11;
            int i12;
            if ((i10 & 14) == 0) {
                w wVar2 = wVar;
                C1500m mVar2 = mVar;
                if (mVar.S(wVar)) {
                    i12 = 4;
                } else {
                    i12 = 2;
                }
                i11 = i10 | i12;
            } else {
                w wVar3 = wVar;
                C1500m mVar3 = mVar;
                i11 = i10;
            }
            if ((i11 & 91) != 18 || !mVar.i()) {
                u.e(wVar, (i) null, (C2817c) null, (String) null, (k0.c) null, (C1187h) null, 0.0f, (C2547y0) null, false, mVar, i11 & 14, 255);
                return;
            }
            mVar.I();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((w) obj, (C1500m) obj2, ((Number) obj3).intValue());
            return C6514M.f71813a;
        }
    }

    public final q a() {
        return f10471b;
    }
}
