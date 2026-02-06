package P;

import Y.C1500m;
import Y.C1506p;
import Y.C1521x;
import Y.J0;
import Y.M0;
import Y.Y0;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.p;

public abstract class s {

    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f4930a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f4931b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(p pVar, int i10) {
            super(2);
            this.f4930a = pVar;
            this.f4931b = i10;
        }

        public final void a(C1500m mVar, int i10) {
            s.a(this.f4930a, mVar, M0.a(this.f4931b | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    public static final void a(p pVar, C1500m mVar, int i10) {
        int i11;
        int i12;
        C1500m h10 = mVar.h(336063542);
        if ((i10 & 6) == 0) {
            if (h10.C(pVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !h10.i()) {
            if (C1506p.H()) {
                C1506p.Q(336063542, i11, -1, "androidx.compose.foundation.text.selection.DisableSelection (SelectionContainer.kt:67)");
            }
            C1521x.a(C.a().d((Object) null), pVar, h10, ((i11 << 3) & 112) | J0.f9784i);
            if (C1506p.H()) {
                C1506p.P();
            }
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new a(pVar, i10));
        }
    }
}
