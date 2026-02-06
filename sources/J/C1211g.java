package J;

import P.G;
import P.I;
import Y.C1500m;
import Y.C1506p;
import Y.M0;
import Y.Y0;
import k0.i;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import y.C2916a;
import y.C2924i;
import y.C2925j;
import yf.C6787a;
import yf.p;

/* renamed from: J.g  reason: case insensitive filesystem */
public abstract class C1211g {

    /* renamed from: J.g$a */
    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2924i f3173a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C2924i iVar) {
            super(0);
            this.f3173a = iVar;
        }

        public final void invoke() {
            C2925j.a(this.f3173a);
        }
    }

    /* renamed from: J.g$b */
    static final class b extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ G f3174a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f3175b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f3176c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(G g10, p pVar, int i10) {
            super(2);
            this.f3174a = g10;
            this.f3175b = pVar;
            this.f3176c = i10;
        }

        public final void a(C1500m mVar, int i10) {
            C1211g.a(this.f3174a, this.f3175b, mVar, M0.a(this.f3176c | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    public static final void a(G g10, p pVar, C1500m mVar, int i10) {
        int i11;
        int i12;
        int i13;
        C1500m h10 = mVar.h(-1985516685);
        if ((i10 & 6) == 0) {
            if (h10.C(g10)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (h10.C(pVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) != 18 || !h10.i()) {
            if (C1506p.H()) {
                C1506p.Q(-1985516685, i11, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:35)");
            }
            Object A10 = h10.A();
            C1500m.a aVar = C1500m.f10026a;
            if (A10 == aVar.a()) {
                A10 = new C2924i((C2924i.a) null, 1, (DefaultConstructorMarker) null);
                h10.r(A10);
            }
            C2924i iVar = (C2924i) A10;
            Object A11 = h10.A();
            if (A11 == aVar.a()) {
                A11 = new a(iVar);
                h10.r(A11);
            }
            int i14 = ((i11 << 12) & 458752) | 54;
            C2916a.b(iVar, (C6787a) A11, I.a(g10, iVar), (i) null, g10.E(), pVar, h10, i14, 8);
            if (C1506p.H()) {
                C1506p.P();
            }
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new b(g10, pVar, i10));
        }
    }
}
