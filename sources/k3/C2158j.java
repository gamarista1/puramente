package k3;

import Y.C1500m;
import Y.C1506p;
import Y.C1521x;
import Y.J0;
import Y.M0;
import Y.Y0;
import Z1.a;
import a2.C1542a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.C1788k;
import androidx.lifecycle.a0;
import androidx.lifecycle.c0;
import androidx.lifecycle.e0;
import h0.C2020d;
import j3.k;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.O;
import lf.C6514M;
import yf.p;

/* renamed from: k3.j  reason: case insensitive filesystem */
public abstract class C2158j {

    /* renamed from: k3.j$a */
    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2020d f23353a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f23354b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C2020d dVar, p pVar) {
            super(2);
            this.f23353a = dVar;
            this.f23354b = pVar;
        }

        public final void a(C1500m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(-52928304, i10, -1, "androidx.navigation.compose.LocalOwnersProvider.<anonymous> (NavBackStackEntryProvider.kt:51)");
                }
                C2158j.b(this.f23353a, this.f23354b, mVar, 0);
                if (C1506p.H()) {
                    C1506p.P();
                    return;
                }
                return;
            }
            mVar.I();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: k3.j$b */
    static final class b extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f23355a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2020d f23356b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p f23357c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f23358d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(k kVar, C2020d dVar, p pVar, int i10) {
            super(2);
            this.f23355a = kVar;
            this.f23356b = dVar;
            this.f23357c = pVar;
            this.f23358d = i10;
        }

        public final void a(C1500m mVar, int i10) {
            C2158j.a(this.f23355a, this.f23356b, this.f23357c, mVar, M0.a(this.f23358d | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: k3.j$c */
    static final class c extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2020d f23359a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f23360b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f23361c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C2020d dVar, p pVar, int i10) {
            super(2);
            this.f23359a = dVar;
            this.f23360b = pVar;
            this.f23361c = i10;
        }

        public final void a(C1500m mVar, int i10) {
            C2158j.b(this.f23359a, this.f23360b, mVar, M0.a(this.f23361c | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    public static final void a(k kVar, C2020d dVar, p pVar, C1500m mVar, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        C1500m h10 = mVar.h(-1579360880);
        if ((i10 & 6) == 0) {
            if (h10.C(kVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (h10.C(dVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (h10.C(pVar)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 147) != 146 || !h10.i()) {
            if (C1506p.H()) {
                C1506p.Q(-1579360880, i11, -1, "androidx.navigation.compose.LocalOwnersProvider (NavBackStackEntryProvider.kt:45)");
            }
            C1521x.b(new J0[]{C1542a.f10582a.b(kVar), X1.a.a().d(kVar), AndroidCompositionLocals_androidKt.j().d(kVar)}, g0.c.e(-52928304, true, new a(dVar, pVar), h10, 54), h10, J0.f9784i | 48);
            if (C1506p.H()) {
                C1506p.P();
            }
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new b(kVar, dVar, pVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final void b(C2020d dVar, p pVar, C1500m mVar, int i10) {
        int i11;
        Z1.a aVar;
        int i12;
        int i13;
        C1500m h10 = mVar.h(1211832233);
        if ((i10 & 6) == 0) {
            if (h10.C(dVar)) {
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
        int i14 = i11;
        if ((i14 & 19) != 18 || !h10.i()) {
            if (C1506p.H()) {
                C1506p.Q(1211832233, i14, -1, "androidx.navigation.compose.SaveableStateProvider (NavBackStackEntryProvider.kt:56)");
            }
            h10.z(1729797275);
            e0 a10 = C1542a.f10582a.a(h10, 6);
            if (a10 != null) {
                if (a10 instanceof C1788k) {
                    aVar = ((C1788k) a10).getDefaultViewModelCreationExtras();
                } else {
                    aVar = a.C0192a.f10387b;
                }
                a0 b10 = a2.c.b(O.b(C2149a.class), a10, (String) null, (c0.c) null, aVar, h10, 0, 0);
                h10.R();
                C2149a aVar2 = (C2149a) b10;
                aVar2.d(new WeakReference(dVar));
                dVar.c(aVar2.b(), pVar, h10, (i14 & 112) | ((i14 << 6) & 896));
                if (C1506p.H()) {
                    C1506p.P();
                }
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new c(dVar, pVar, i10));
        }
    }
}
