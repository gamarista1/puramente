package io.intercom.android.sdk.helpcenter.search;

import C.f0;
import C.j0;
import V.C1377e;
import V.U0;
import V.V0;
import V.W0;
import Xg.N;
import Xg.x;
import Y.C1500m;
import Y.C1510r0;
import Y.M0;
import Y.P;
import Y.Y0;
import Y.o1;
import androidx.compose.ui.focus.o;
import androidx.compose.ui.platform.C1644k0;
import g0.c;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.ApplyStatusBarColorKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import p0.e;
import qf.C6658d;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.q;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u001aK\u0010\b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0003H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b²\u0006\u000e\u0010\n\u001a\u00020\u00058\n@\nX\u0002"}, d2 = {"Lkotlin/Function0;", "Llf/M;", "onBackClick", "Lkotlin/Function1;", "LXg/x;", "", "onTextChanged", "onSearchAction", "HelpCenterSearchTopBar", "(Lyf/a;Lyf/l;Lyf/l;LY/m;I)V", "searchText", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class HelpCenterSearchTopBarKt {
    public static final void HelpCenterSearchTopBar(C6787a aVar, C6798l lVar, C6798l lVar2, C1500m mVar, int i10) {
        int i11;
        C1500m mVar2;
        int i12;
        int i13;
        int i14;
        C6787a aVar2 = aVar;
        C6798l lVar3 = lVar;
        C6798l lVar4 = lVar2;
        int i15 = i10;
        C6496s.h(aVar2, "onBackClick");
        C6496s.h(lVar3, "onTextChanged");
        C6496s.h(lVar4, "onSearchAction");
        C1500m h10 = mVar.h(1649601348);
        if ((i15 & 14) == 0) {
            if (h10.C(aVar2)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i15;
        } else {
            i11 = i15;
        }
        if ((i15 & 112) == 0) {
            if (h10.C(lVar3)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i15 & 896) == 0) {
            if (h10.C(lVar4)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 731) != 146 || !h10.i()) {
            h10.T(149286267);
            Object A10 = h10.A();
            C1500m.a aVar3 = C1500m.f10026a;
            if (A10 == aVar3.a()) {
                A10 = new o();
                h10.r(A10);
            }
            o oVar = (o) A10;
            h10.M();
            e eVar = (e) h10.m(C1644k0.f());
            h10.T(149289501);
            Object A11 = h10.A();
            if (A11 == aVar3.a()) {
                A11 = u1.d("", (o1) null, 2, (Object) null);
                h10.r(A11);
            }
            C1510r0 r0Var = (C1510r0) A11;
            h10.M();
            h10.T(149291135);
            Object A12 = h10.A();
            if (A12 == aVar3.a()) {
                A12 = N.a("");
                h10.r(A12);
            }
            x xVar = (x) A12;
            h10.M();
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i16 = IntercomTheme.$stable;
            ApplyStatusBarColorKt.ApplyStatusBarContentColor(!ColorExtensionsKt.m718isDarkColor8_81llA(intercomTheme.getColors(h10, i16).m691getHeader0d7_KjU()), h10, 0);
            C6514M m10 = C6514M.f71813a;
            P.g(m10, new HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$1(lVar3, xVar, (C6658d<? super HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$1>) null), h10, 70);
            h10.T(149303595);
            Object A13 = h10.A();
            if (A13 == aVar3.a()) {
                A13 = new HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$2$1(oVar, (C6658d<? super HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$2$1>) null);
                h10.r(A13);
            }
            h10.M();
            P.g(m10, (p) A13, h10, 70);
            i e10 = j0.e(i.f23074a);
            U0 e11 = V0.f7135a.e(intercomTheme.getColors(h10, i16).m691getHeader0d7_KjU(), 0, intercomTheme.getColors(h10, i16).m697getOnHeader0d7_KjU(), intercomTheme.getColors(h10, i16).m697getOnHeader0d7_KjU(), intercomTheme.getColors(h10, i16).m697getOnHeader0d7_KjU(), h10, V0.f7141g << 15, 2);
            x xVar2 = xVar;
            C1500m mVar3 = h10;
            mVar2 = mVar3;
            C1377e.d(c.e(-227105272, true, new HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$3(oVar, r0Var, lVar2, eVar, xVar2), mVar3, 54), e10, c.e(-1996576886, true, new HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$4(aVar2), mVar3, 54), (q) null, 0.0f, (f0) null, e11, (W0) null, mVar2, 390, 184);
        } else {
            h10.I();
            mVar2 = h10;
        }
        Y0 k10 = mVar2.k();
        if (k10 != null) {
            k10.a(new a(aVar2, lVar3, lVar4, i15));
        }
    }

    /* access modifiers changed from: private */
    public static final String HelpCenterSearchTopBar$lambda$2(C1510r0 r0Var) {
        return (String) r0Var.getValue();
    }

    /* access modifiers changed from: private */
    public static final void HelpCenterSearchTopBar$lambda$3(C1510r0 r0Var, String str) {
        r0Var.setValue(str);
    }

    /* access modifiers changed from: private */
    public static final C6514M HelpCenterSearchTopBar$lambda$6(C6787a aVar, C6798l lVar, C6798l lVar2, int i10, C1500m mVar, int i11) {
        C6496s.h(aVar, "$onBackClick");
        C6496s.h(lVar, "$onTextChanged");
        C6496s.h(lVar2, "$onSearchAction");
        HelpCenterSearchTopBar(aVar, lVar, lVar2, mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
