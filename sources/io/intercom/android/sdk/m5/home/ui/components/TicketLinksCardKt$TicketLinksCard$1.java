package io.intercom.android.sdk.m5.home.ui.components;

import C.C1085c;
import C.C1090h;
import C.C1092j;
import C.C1093k;
import C.W;
import C.Y;
import C.Z;
import C.a0;
import H0.C1187h;
import H0.F;
import J0.C1241g;
import O0.g;
import Q0.T;
import V.T0;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import android.content.Context;
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.n;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b1.j;
import b1.k;
import b1.t;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.TicketLink;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import j4.C3622i;
import k0.c;
import k0.h;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import mf.C6565s;
import r0.C2547y0;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class TicketLinksCardKt$TicketLinksCard$1 implements q {
    final /* synthetic */ C6798l $onTicketLinkClicked;
    final /* synthetic */ HomeCards.HomeTicketLinksData $ticketLinksData;

    TicketLinksCardKt$TicketLinksCard$1(HomeCards.HomeTicketLinksData homeTicketLinksData, C6798l lVar) {
        this.$ticketLinksData = homeTicketLinksData;
        this.$onTicketLinkClicked = lVar;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$3$lambda$2$lambda$0(C6798l lVar, TicketLink ticketLink) {
        C6496s.h(lVar, "$onTicketLinkClicked");
        C6496s.h(ticketLink, "$item");
        lVar.invoke(ticketLink.getTicketType());
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1092j) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1092j jVar, C1500m mVar, int i10) {
        HomeCards.HomeTicketLinksData homeTicketLinksData;
        C6798l lVar;
        C1500m mVar2 = mVar;
        C6496s.h(jVar, "$this$IntercomCard");
        if ((i10 & 81) != 16 || !mVar.i()) {
            HomeCards.HomeTicketLinksData homeTicketLinksData2 = this.$ticketLinksData;
            C6798l lVar2 = this.$onTicketLinkClicked;
            i.a aVar = i.f23074a;
            F a10 = C1090h.a(C1085c.f882a.g(), c.f23044a.k(), mVar2, 0);
            int a11 = C1494j.a(mVar2, 0);
            C1523y p10 = mVar.p();
            i e10 = h.e(mVar2, aVar);
            C1241g.a aVar2 = C1241g.f3853J;
            C6787a a12 = aVar2.a();
            if (mVar.j() == null) {
                C1494j.c();
            }
            mVar.F();
            if (mVar.f()) {
                mVar2.U(a12);
            } else {
                mVar.q();
            }
            C1500m a13 = F1.a(mVar);
            F1.b(a13, a10, aVar2.c());
            F1.b(a13, p10, aVar2.e());
            p b10 = aVar2.b();
            if (a13.f() || !C6496s.c(a13.A(), Integer.valueOf(a11))) {
                a13.r(Integer.valueOf(a11));
                a13.V(Integer.valueOf(a11), b10);
            }
            F1.b(a13, e10, aVar2.d());
            C1093k kVar = C1093k.f978a;
            mVar2.T(466717469);
            String cardTitle = homeTicketLinksData2.getCardTitle();
            if (cardTitle == null || Sg.p.d0(cardTitle)) {
                lVar = lVar2;
                homeTicketLinksData = homeTicketLinksData2;
            } else {
                lVar = lVar2;
                homeTicketLinksData = homeTicketLinksData2;
                T0.b(homeTicketLinksData2.getCardTitle(), n.m(n.k(aVar, c1.h.j((float) 16), 0.0f, 2, (Object) null), 0.0f, c1.h.j((float) 12), 0.0f, c1.h.j((float) 4), 5, (Object) null), 0, 0, (V0.n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, IntercomTheme.INSTANCE.getTypography(mVar2, IntercomTheme.$stable).getType04SemiBold(), mVar, 48, 0, 65532);
            }
            mVar.M();
            C1500m mVar3 = mVar;
            mVar3.T(466732020);
            int i11 = 0;
            for (Object next : homeTicketLinksData.getLinks()) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C6565s.x();
                }
                TicketLink ticketLink = (TicketLink) next;
                i.a aVar3 = i.f23074a;
                C6798l lVar3 = lVar;
                float f10 = (float) 16;
                i j10 = n.j(d.d(androidx.compose.foundation.layout.q.h(aVar3, 0.0f, 1, (Object) null), false, (String) null, (g) null, new v(lVar3, ticketLink), 7, (Object) null), c1.h.j(f10), c1.h.j((float) 12));
                F b11 = W.b(C1085c.f882a.f(), c.f23044a.i(), mVar3, 48);
                int a14 = C1494j.a(mVar3, 0);
                C1523y p11 = mVar.p();
                i e11 = h.e(mVar3, j10);
                C1241g.a aVar4 = C1241g.f3853J;
                C6787a a15 = aVar4.a();
                if (mVar.j() == null) {
                    C1494j.c();
                }
                mVar.F();
                if (mVar.f()) {
                    mVar3.U(a15);
                } else {
                    mVar.q();
                }
                C1500m a16 = F1.a(mVar);
                F1.b(a16, b11, aVar4.c());
                F1.b(a16, p11, aVar4.e());
                p b12 = aVar4.b();
                if (a16.f() || !C6496s.c(a16.A(), Integer.valueOf(a14))) {
                    a16.r(Integer.valueOf(a14));
                    a16.V(Integer.valueOf(a14), b12);
                }
                F1.b(a16, e11, aVar4.d());
                float f11 = f10;
                C6798l lVar4 = lVar3;
                T0.b(ticketLink.getTicketTypeName(), Y.b(Z.f873a, aVar3, 1.0f, false, 2, (Object) null), 0, 0, (V0.n) null, V0.p.f8210b.c(), (V0.h) null, 0, (k) null, (j) null, 0, t.f19154a.b(), false, 1, 0, (C6798l) null, (T) null, mVar, 196608, 3120, 120796);
                i.a aVar5 = aVar3;
                C1500m mVar4 = mVar;
                a0.a(androidx.compose.foundation.layout.q.r(aVar5, c1.h.j(f11)), mVar4, 6);
                i.a aVar6 = aVar5;
                Z3.c.d(new C3622i.a((Context) mVar4.m(AndroidCompositionLocals_androidKt.g())).d(ticketLink.getIconUrl()).c(true).a(), (String) null, IntercomImageLoaderKt.getImageLoader((Context) mVar4.m(AndroidCompositionLocals_androidKt.g())), androidx.compose.foundation.layout.q.n(aVar5, c1.h.j(f11)), (C6798l) null, (C6798l) null, (c) null, (C1187h) null, 0.0f, C2547y0.a.c(C2547y0.f25576b, IntercomTheme.INSTANCE.getColors(mVar4, IntercomTheme.$stable).m673getActionContrastWhite0d7_KjU(), 0, 2, (Object) null), 0, false, (Z3.p) null, mVar, 3640, 0, 7664);
                mVar.u();
                C1500m mVar5 = mVar;
                mVar5.T(466773453);
                if (i11 != homeTicketLinksData.getLinks().size() - 1) {
                    IntercomDividerKt.IntercomDivider(n.k(androidx.compose.foundation.layout.q.h(aVar6, 0.0f, 1, (Object) null), c1.h.j(f11), 0.0f, 2, (Object) null), mVar5, 6, 0);
                }
                mVar.M();
                mVar3 = mVar5;
                lVar = lVar4;
                i11 = i12;
            }
            C1500m mVar6 = mVar3;
            mVar.M();
            mVar.u();
            return;
        }
        mVar.I();
    }
}
