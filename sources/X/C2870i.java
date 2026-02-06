package x;

import C.a0;
import Y.C1500m;
import Y.C1506p;
import Y.M0;
import Y.Y0;
import androidx.compose.ui.draw.b;
import k0.i;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;
import yf.p;

/* renamed from: x.i  reason: case insensitive filesystem */
public abstract class C2870i {

    /* renamed from: x.i$a */
    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f27965a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6798l f27966b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f27967c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(i iVar, C6798l lVar, int i10) {
            super(2);
            this.f27965a = iVar;
            this.f27966b = lVar;
            this.f27967c = i10;
        }

        public final void a(C1500m mVar, int i10) {
            C2870i.a(this.f27965a, this.f27966b, mVar, M0.a(this.f27967c | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    public static final void a(i iVar, C6798l lVar, C1500m mVar, int i10) {
        int i11;
        int i12;
        int i13;
        C1500m h10 = mVar.h(-932836462);
        if ((i10 & 6) == 0) {
            if (h10.S(iVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (h10.C(lVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) != 18 || !h10.i()) {
            if (C1506p.H()) {
                C1506p.Q(-932836462, i11, -1, "androidx.compose.foundation.Canvas (Canvas.kt:42)");
            }
            a0.a(b.b(iVar, lVar), h10, 0);
            if (C1506p.H()) {
                C1506p.P();
            }
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new a(iVar, lVar, i10));
        }
    }
}
