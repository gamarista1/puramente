package P;

import P.C1295k;
import Q0.L;
import Q0.Q;
import b1.i;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.J;
import lf.C6514M;
import yf.C6798l;

public abstract class y {

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ J f4974a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(J j10) {
            super(1);
            this.f4974a = j10;
        }

        public final void a(C1294j jVar) {
            if (jVar.c().length() > 0) {
                this.f4974a.f71755a = false;
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C1294j) obj);
            return C6514M.f71813a;
        }
    }

    /* access modifiers changed from: private */
    public static final i b(L l10, int i10) {
        if (e(l10, i10)) {
            return l10.y(i10);
        }
        return l10.c(i10);
    }

    public static final x c(L l10, int i10, int i11, int i12, long j10, boolean z10, boolean z11) {
        C1295k kVar;
        L l11 = l10;
        if (z10) {
            kVar = null;
        } else {
            kVar = new C1295k(new C1295k.a(b(l10, Q.n(j10)), Q.n(j10), 1), new C1295k.a(b(l10, Q.i(j10)), Q.i(j10), 1), Q.m(j10));
        }
        return new E(z11, 1, 1, kVar, new C1294j(1, 1, i10, i11, i12, l10));
    }

    public static final boolean d(C1295k kVar, x xVar) {
        C1295k.a aVar;
        C1295k.a aVar2;
        if (kVar == null || xVar == null) {
            return true;
        }
        if (kVar.e().d() != kVar.c().d()) {
            if (kVar.d()) {
                aVar = kVar.e();
            } else {
                aVar = kVar.c();
            }
            if (aVar.c() != 0) {
                return false;
            }
            if (kVar.d()) {
                aVar2 = kVar.c();
            } else {
                aVar2 = kVar.e();
            }
            if (xVar.c().l() != aVar2.c()) {
                return false;
            }
            J j10 = new J();
            j10.f71755a = true;
            xVar.g(new a(j10));
            return j10.f71755a;
        } else if (kVar.e().c() == kVar.c().c()) {
            return true;
        } else {
            return false;
        }
    }

    private static final boolean e(L l10, int i10) {
        if (l10.l().j().length() == 0) {
            return true;
        }
        int q10 = l10.q(i10);
        if ((i10 == 0 || q10 != l10.q(i10 - 1)) && (i10 == l10.l().j().length() || q10 != l10.q(i10 + 1))) {
            return true;
        }
        return false;
    }
}
