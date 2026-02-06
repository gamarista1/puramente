package io.intercom.android.sdk.m5.helpcenter.ui.components;

import B.l;
import C.C1085c;
import C.C1090h;
import C.C1093k;
import C.W;
import C.Y;
import C.Z;
import H0.F;
import J0.C1241g;
import O0.g;
import V.B0;
import V.C1389k;
import V.C1391l;
import V.C1393m;
import V.T0;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.Y0;
import android.content.Context;
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.n;
import androidx.compose.foundation.layout.q;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b1.j;
import b1.k;
import c1.h;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.IntercomChevronKt;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityLauncher;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import mf.C6565s;
import r0.C2544x0;
import r0.g2;
import x.C2869h;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u000f\u0010\u0006\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u000f\u0010\b\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lk0/i;", "modifier", "Llf/M;", "BrowseAllHelpTopicsComponent", "(Lk0/i;LY/m;II)V", "BrowseAllHelpTopicsAsItem", "BrowseAllHelpTopicsComponentPreview", "(LY/m;I)V", "BrowseAllHelpTopicsASItemPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BrowseAllHelpTopicsComponentKt {
    @IntercomPreviews
    private static final void BrowseAllHelpTopicsASItemPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1268619456);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$BrowseAllHelpTopicsComponentKt.INSTANCE.m349getLambda3$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6209l(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M BrowseAllHelpTopicsASItemPreview$lambda$8(int i10, C1500m mVar, int i11) {
        BrowseAllHelpTopicsASItemPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void BrowseAllHelpTopicsAsItem(i iVar, C1500m mVar, int i10, int i11) {
        int i12;
        i iVar2;
        i.a aVar;
        int i13;
        int i14 = i10;
        int i15 = i11;
        C1500m h10 = mVar.h(-384199751);
        int i16 = i15 & 1;
        if (i16 != 0) {
            i12 = i14 | 6;
            iVar2 = iVar;
        } else if ((i14 & 14) == 0) {
            iVar2 = iVar;
            if (h10.S(iVar2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i14;
        } else {
            iVar2 = iVar;
            i12 = i14;
        }
        if ((i12 & 11) != 2 || !h10.i()) {
            if (i16 != 0) {
                aVar = i.f23074a;
            } else {
                aVar = iVar2;
            }
            float f10 = (float) 16;
            i m10 = n.m(d.d(q.h(aVar, 0.0f, 1, (Object) null), false, (String) null, (g) null, new p((Context) h10.m(AndroidCompositionLocals_androidKt.g())), 7, (Object) null), h.j(f10), h.j(f10), 0.0f, 0.0f, 12, (Object) null);
            C1085c cVar = C1085c.f882a;
            C1085c.m g10 = cVar.g();
            c.a aVar2 = c.f23044a;
            F a10 = C1090h.a(g10, aVar2.k(), h10, 0);
            int a11 = C1494j.a(h10, 0);
            C1523y p10 = h10.p();
            i e10 = k0.h.e(h10, m10);
            C1241g.a aVar3 = C1241g.f3853J;
            C6787a a12 = aVar3.a();
            if (h10.j() == null) {
                C1494j.c();
            }
            h10.F();
            if (h10.f()) {
                h10.U(a12);
            } else {
                h10.q();
            }
            C1500m a13 = F1.a(h10);
            F1.b(a13, a10, aVar3.c());
            F1.b(a13, p10, aVar3.e());
            p b10 = aVar3.b();
            if (a13.f() || !C6496s.c(a13.A(), Integer.valueOf(a11))) {
                a13.r(Integer.valueOf(a11));
                a13.V(Integer.valueOf(a11), b10);
            }
            F1.b(a13, e10, aVar3.d());
            C1093k kVar = C1093k.f978a;
            c.C0368c i17 = aVar2.i();
            i.a aVar4 = i.f23074a;
            F b11 = W.b(cVar.f(), i17, h10, 48);
            int a14 = C1494j.a(h10, 0);
            C1523y p11 = h10.p();
            i e11 = k0.h.e(h10, aVar4);
            C6787a a15 = aVar3.a();
            if (h10.j() == null) {
                C1494j.c();
            }
            h10.F();
            if (h10.f()) {
                h10.U(a15);
            } else {
                h10.q();
            }
            C1500m a16 = F1.a(h10);
            F1.b(a16, b11, aVar3.c());
            F1.b(a16, p11, aVar3.e());
            p b12 = aVar3.b();
            if (a16.f() || !C6496s.c(a16.A(), Integer.valueOf(a14))) {
                a16.r(Integer.valueOf(a14));
                a16.V(Integer.valueOf(a14), b12);
            }
            F1.b(a16, e11, aVar3.d());
            i b13 = Y.b(Z.f873a, aVar4, 1.0f, false, 2, (Object) null);
            F a17 = C1090h.a(cVar.g(), aVar2.k(), h10, 0);
            int a18 = C1494j.a(h10, 0);
            C1523y p12 = h10.p();
            i e12 = k0.h.e(h10, b13);
            C6787a a19 = aVar3.a();
            if (h10.j() == null) {
                C1494j.c();
            }
            h10.F();
            if (h10.f()) {
                h10.U(a19);
            } else {
                h10.q();
            }
            C1500m a20 = F1.a(h10);
            F1.b(a20, a17, aVar3.c());
            F1.b(a20, p12, aVar3.e());
            p b14 = aVar3.b();
            if (a20.f() || !C6496s.c(a20.A(), Integer.valueOf(a18))) {
                a20.r(Integer.valueOf(a18));
                a20.V(Integer.valueOf(a18), b14);
            }
            F1.b(a20, e12, aVar3.d());
            T0.b(M0.i.a(R.string.intercom_browse_all_help_topics, h10, 0), (i) null, 0, 0, (V0.n) null, V0.p.f8210b.d(), (V0.h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, IntercomTheme.INSTANCE.getTypography(h10, IntercomTheme.$stable).getType04Point5(), h10, 196608, 0, 65502);
            h10.u();
            IntercomChevronKt.IntercomChevron(n.k(aVar4, h.j((float) 22), 0.0f, 2, (Object) null), h10, 6, 0);
            h10.u();
            h10.u();
            iVar2 = aVar;
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new q(iVar2, i14, i15));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M BrowseAllHelpTopicsAsItem$lambda$2(Context context) {
        C6496s.h(context, "$context");
        IntercomRootActivityLauncher.INSTANCE.startHelpCenterCollections(context, C6565s.n(), MetricTracker.Place.COLLECTION_LIST);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M BrowseAllHelpTopicsAsItem$lambda$6(i iVar, int i10, int i11, C1500m mVar, int i12) {
        BrowseAllHelpTopicsAsItem(iVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    public static final void BrowseAllHelpTopicsComponent(i iVar, C1500m mVar, int i10, int i11) {
        int i12;
        i iVar2;
        i.a aVar;
        int i13;
        int i14 = i10;
        int i15 = i11;
        C1500m h10 = mVar.h(-1332059523);
        int i16 = i15 & 1;
        if (i16 != 0) {
            i12 = i14 | 6;
            iVar2 = iVar;
        } else if ((i14 & 14) == 0) {
            iVar2 = iVar;
            if (h10.S(iVar2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i14;
        } else {
            iVar2 = iVar;
            i12 = i14;
        }
        if ((i12 & 11) != 2 || !h10.i()) {
            if (i16 != 0) {
                aVar = i.f23074a;
            } else {
                aVar = iVar2;
            }
            C1389k kVar = C1389k.f7680a;
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i17 = IntercomTheme.$stable;
            i iVar3 = aVar;
            C1393m.b(new C6210m((Context) h10.m(AndroidCompositionLocals_androidKt.g())), iVar3, false, (g2) null, kVar.p(intercomTheme.getColors(h10, i17).m678getBackground0d7_KjU(), intercomTheme.getColors(h10, i17).m700getPrimaryText0d7_KjU(), 0, 0, h10, C1389k.f7694o << 12, 12), (C1391l) null, C2869h.a(h.j((float) 1), C2544x0.o(intercomTheme.getColors(h10, i17).m700getPrimaryText0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null)), n.b(h.j((float) 16), h.j((float) 8)), (l) null, ComposableSingletons$BrowseAllHelpTopicsComponentKt.INSTANCE.m347getLambda1$intercom_sdk_base_release(), h10, ((i12 << 3) & 112) | 817889280, 300);
            iVar2 = aVar;
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6211n(iVar2, i10, i15));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M BrowseAllHelpTopicsComponent$lambda$0(Context context) {
        C6496s.h(context, "$context");
        IntercomRootActivityLauncher.INSTANCE.startHelpCenterCollections(context, C6565s.n(), MetricTracker.Place.COLLECTION_LIST);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M BrowseAllHelpTopicsComponent$lambda$1(i iVar, int i10, int i11, C1500m mVar, int i12) {
        BrowseAllHelpTopicsComponent(iVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void BrowseAllHelpTopicsComponentPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1843811940);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$BrowseAllHelpTopicsComponentKt.INSTANCE.m348getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new o(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M BrowseAllHelpTopicsComponentPreview$lambda$7(int i10, C1500m mVar, int i11) {
        BrowseAllHelpTopicsComponentPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
