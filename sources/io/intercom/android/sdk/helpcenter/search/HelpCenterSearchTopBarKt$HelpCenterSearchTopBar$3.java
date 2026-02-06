package io.intercom.android.sdk.helpcenter.search;

import B.l;
import J.C1225v;
import J.C1226w;
import J.C1227x;
import Q0.T;
import V.P0;
import V.Q0;
import V.R0;
import V.S;
import V.U;
import W0.C1456y;
import W0.K;
import W0.c0;
import W0.r;
import Xg.x;
import Y.C1500m;
import Y.C1510r0;
import androidx.compose.foundation.layout.q;
import androidx.compose.ui.focus.o;
import c1.h;
import g0.c;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import p0.e;
import r0.C2544x0;
import r0.g2;
import yf.C6798l;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$3 implements p {
    final /* synthetic */ e $focusManager;
    final /* synthetic */ o $focusRequester;
    final /* synthetic */ C6798l $onSearchAction;
    final /* synthetic */ C1510r0 $searchText$delegate;
    final /* synthetic */ x $textFlow;

    HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$3(o oVar, C1510r0 r0Var, C6798l lVar, e eVar, x xVar) {
        this.$focusRequester = oVar;
        this.$searchText$delegate = r0Var;
        this.$onSearchAction = lVar;
        this.$focusManager = eVar;
        this.$textFlow = xVar;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$0(C6798l lVar, e eVar, C1510r0 r0Var, C1225v vVar) {
        C6496s.h(lVar, "$onSearchAction");
        C6496s.h(eVar, "$focusManager");
        C6496s.h(r0Var, "$searchText$delegate");
        C6496s.h(vVar, "$this$KeyboardActions");
        if (HelpCenterSearchTopBarKt.HelpCenterSearchTopBar$lambda$2(r0Var).length() > 0) {
            lVar.invoke(HelpCenterSearchTopBarKt.HelpCenterSearchTopBar$lambda$2(r0Var));
            e.c(eVar, false, 1, (Object) null);
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$1(x xVar, C1510r0 r0Var, String str) {
        C6496s.h(xVar, "$textFlow");
        C6496s.h(r0Var, "$searchText$delegate");
        C6496s.h(str, "newText");
        HelpCenterSearchTopBarKt.HelpCenterSearchTopBar$lambda$3(r0Var, str);
        xVar.setValue(str);
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        C1500m mVar2 = mVar;
        if ((i10 & 11) != 2 || !mVar.i()) {
            String access$HelpCenterSearchTopBar$lambda$2 = HelpCenterSearchTopBarKt.HelpCenterSearchTopBar$lambda$2(this.$searchText$delegate);
            i a10 = androidx.compose.ui.focus.p.a(q.i(q.h(i.f23074a, 0.0f, 1, (Object) null), h.j((float) 56)), this.$focusRequester);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i11 = IntercomTheme.$stable;
            T type04 = intercomTheme.getTypography(mVar2, i11).getType04();
            C1227x xVar = r15;
            C1227x xVar2 = new C1227x(0, (Boolean) null, C1456y.f8623b.h(), r.f8593b.g(), (K) null, (Boolean) null, (X0.e) null, 115, (DefaultConstructorMarker) null);
            C1226w wVar = r25;
            C1226w wVar2 = new C1226w((C6798l) null, (C6798l) null, (C6798l) null, (C6798l) null, new b(this.$onSearchAction, this.$focusManager, this.$searchText$delegate), (C6798l) null, 47, (DefaultConstructorMarker) null);
            Q0 q02 = Q0.f6883a;
            long r22 = intercomTheme.getColors(mVar2, i11).m700getPrimaryText0d7_KjU();
            long r42 = intercomTheme.getColors(mVar2, i11).m700getPrimaryText0d7_KjU();
            long r62 = intercomTheme.getColors(mVar2, i11).m700getPrimaryText0d7_KjU();
            C2544x0.a aVar = C2544x0.f25560b;
            long g10 = aVar.g();
            long g11 = aVar.g();
            long g12 = aVar.g();
            P0 d10 = q02.d(r22, r42, r62, 0, aVar.g(), aVar.g(), aVar.g(), 0, intercomTheme.getColors(mVar2, i11).m700getPrimaryText0d7_KjU(), 0, (P.K) null, g10, g11, g12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, mVar, 1794048, 3504, 0, 0, 3072, 2147468936, 4095);
            c cVar = r4;
            c cVar2 = new c(this.$textFlow, this.$searchText$delegate);
            p r102 = ComposableSingletons$HelpCenterSearchTopBarKt.INSTANCE.m133getLambda1$intercom_sdk_base_release();
            final C1510r0 r0Var = this.$searchText$delegate;
            final x xVar3 = this.$textFlow;
            R0.a(access$HelpCenterSearchTopBar$lambda$2, cVar, a10, false, false, type04, (p) null, r102, (p) null, c.e(1908343233, true, new p() {
                /* access modifiers changed from: private */
                public static final C6514M invoke$lambda$0(x xVar, C1510r0 r0Var) {
                    C6496s.h(xVar, "$textFlow");
                    C6496s.h(r0Var, "$searchText$delegate");
                    HelpCenterSearchTopBarKt.HelpCenterSearchTopBar$lambda$3(r0Var, "");
                    xVar.setValue("");
                    return C6514M.f71813a;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C1500m) obj, ((Number) obj2).intValue());
                    return C6514M.f71813a;
                }

                public final void invoke(C1500m mVar, int i10) {
                    if ((i10 & 11) == 2 && mVar.i()) {
                        mVar.I();
                    } else if (HelpCenterSearchTopBarKt.HelpCenterSearchTopBar$lambda$2(r0Var).length() > 0) {
                        U.b(new d(xVar3, r0Var), (i) null, false, (S) null, (l) null, ComposableSingletons$HelpCenterSearchTopBarKt.INSTANCE.m134getLambda2$intercom_sdk_base_release(), mVar, 196608, 30);
                    }
                }
            }, mVar2, 54), (p) null, (p) null, (p) null, false, (c0) null, xVar, wVar, true, 0, 0, (l) null, (g2) null, d10, mVar, 817889280, 12779520, 0, 3964248);
            return;
        }
        mVar.I();
    }
}
