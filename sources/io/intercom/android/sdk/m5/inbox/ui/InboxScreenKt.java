package io.intercom.android.sdk.m5.inbox.ui;

import B.l;
import C.C1085c;
import C.C1090h;
import C.C1093k;
import C.N;
import C.f0;
import C.i0;
import C.l0;
import H0.F;
import J0.C1241g;
import Q0.T;
import V.C1387j;
import V.C1391l;
import V.C1393m;
import V.C1400p0;
import V.C1415x0;
import V.T0;
import X1.a;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import Y.L;
import Y.M;
import Y.M0;
import Y.P;
import Y.Y0;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.n;
import androidx.compose.foundation.layout.q;
import androidx.lifecycle.C1790m;
import androidx.lifecycle.C1798v;
import b1.j;
import b1.k;
import c1.h;
import g0.C2005a;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.inbox.InboxViewModel;
import io.intercom.android.sdk.m5.inbox.reducers.InboxPagingItemsReducerKt;
import io.intercom.android.sdk.m5.inbox.states.InboxUiState;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import m3.r;
import n3.C2331a;
import n3.C2332b;
import qf.C6658d;
import qf.g;
import r0.g2;
import x.C2868g;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a_\u0010\f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\f\u0010\r\u001a\u000f\u0010\u000e\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lio/intercom/android/sdk/m5/inbox/InboxViewModel;", "viewModel", "Lkotlin/Function0;", "Llf/M;", "onSendMessageButtonClick", "onBrowseHelpCenterButtonClick", "onBackButtonClick", "Lkotlin/Function1;", "Lio/intercom/android/sdk/m5/inbox/states/InboxUiEffects$NavigateToConversation;", "onConversationClicked", "", "navIcon", "InboxScreen", "(Lio/intercom/android/sdk/m5/inbox/InboxViewModel;Lyf/a;Lyf/a;Lyf/a;Lyf/l;ILY/m;I)V", "InboxLoadingRow", "(LY/m;I)V", "Lio/intercom/android/sdk/m5/components/ErrorState;", "errorState", "InboxErrorRow", "(Lio/intercom/android/sdk/m5/components/ErrorState;LY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class InboxScreenKt {
    /* access modifiers changed from: private */
    public static final void InboxErrorRow(ErrorState errorState, C1500m mVar, int i10) {
        int i11;
        int i12;
        ErrorState errorState2 = errorState;
        int i13 = i10;
        C1500m h10 = mVar.h(-126725909);
        if ((i13 & 14) == 0) {
            if (h10.S(errorState2)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i13;
        } else {
            i11 = i13;
        }
        if ((i11 & 11) != 2 || !h10.i()) {
            i.a aVar = i.f23074a;
            i h11 = q.h(n.k(aVar, 0.0f, h.j((float) 16), 1, (Object) null), 0.0f, 1, (Object) null);
            c.a aVar2 = c.f23044a;
            F h12 = d.h(aVar2.e(), false);
            int a10 = C1494j.a(h10, 0);
            C1523y p10 = h10.p();
            i e10 = k0.h.e(h10, h11);
            C1241g.a aVar3 = C1241g.f3853J;
            C6787a a11 = aVar3.a();
            if (h10.j() == null) {
                C1494j.c();
            }
            h10.F();
            if (h10.f()) {
                h10.U(a11);
            } else {
                h10.q();
            }
            C1500m a12 = F1.a(h10);
            F1.b(a12, h12, aVar3.c());
            F1.b(a12, p10, aVar3.e());
            p b10 = aVar3.b();
            if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
                a12.r(Integer.valueOf(a10));
                a12.V(Integer.valueOf(a10), b10);
            }
            F1.b(a12, e10, aVar3.d());
            f fVar = f.f12848a;
            F a13 = C1090h.a(C1085c.f882a.g(), aVar2.g(), h10, 48);
            int a14 = C1494j.a(h10, 0);
            C1523y p11 = h10.p();
            i e11 = k0.h.e(h10, aVar);
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
            F1.b(a16, a13, aVar3.c());
            F1.b(a16, p11, aVar3.e());
            p b11 = aVar3.b();
            if (a16.f() || !C6496s.c(a16.A(), Integer.valueOf(a14))) {
                a16.r(Integer.valueOf(a14));
                a16.V(Integer.valueOf(a14), b11);
            }
            F1.b(a16, e11, aVar3.d());
            C1093k kVar = C1093k.f978a;
            T0.b(M0.i.a(errorState.getMessageResId(), h10, 0), (i) null, 0, 0, (V0.n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, (T) null, h10, 0, 0, 131070);
            h10.T(-868882283);
            if (errorState2 instanceof ErrorState.WithCTA) {
                C1393m.c(((ErrorState.WithCTA) errorState2).getOnCtaClick(), (i) null, false, (g2) null, (C1387j) null, (C1391l) null, (C2868g) null, (N) null, (l) null, g0.c.e(-282010049, true, new InboxScreenKt$InboxErrorRow$1$1$1(errorState2), h10, 54), h10, 805306368, 510);
            }
            h10.M();
            h10.u();
            h10.u();
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new t(errorState2, i13));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M InboxErrorRow$lambda$8(ErrorState errorState, int i10, C1500m mVar, int i11) {
        C6496s.h(errorState, "$errorState");
        InboxErrorRow(errorState, mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final void InboxLoadingRow(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1843849504);
        if (i10 != 0 || !h10.i()) {
            i h11 = q.h(n.k(i.f23074a, 0.0f, h.j((float) 16), 1, (Object) null), 0.0f, 1, (Object) null);
            F h12 = d.h(c.f23044a.e(), false);
            int a10 = C1494j.a(h10, 0);
            C1523y p10 = h10.p();
            i e10 = k0.h.e(h10, h11);
            C1241g.a aVar = C1241g.f3853J;
            C6787a a11 = aVar.a();
            if (h10.j() == null) {
                C1494j.c();
            }
            h10.F();
            if (h10.f()) {
                h10.U(a11);
            } else {
                h10.q();
            }
            C1500m a12 = F1.a(h10);
            F1.b(a12, h12, aVar.c());
            F1.b(a12, p10, aVar.e());
            p b10 = aVar.b();
            if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
                a12.r(Integer.valueOf(a10));
                a12.V(Integer.valueOf(a10), b10);
            }
            F1.b(a12, e10, aVar.d());
            f fVar = f.f12848a;
            C1400p0.a((i) null, IntercomTheme.INSTANCE.getColors(h10, IntercomTheme.$stable).m673getActionContrastWhite0d7_KjU(), 0.0f, 0, 0, h10, 0, 29);
            h10.u();
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new x(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M InboxLoadingRow$lambda$5(int i10, C1500m mVar, int i11) {
        InboxLoadingRow(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void InboxScreen(InboxViewModel inboxViewModel, C6787a aVar, C6787a aVar2, C6787a aVar3, C6798l lVar, int i10, C1500m mVar, int i11) {
        InboxViewModel inboxViewModel2 = inboxViewModel;
        C6787a aVar4 = aVar;
        C6787a aVar5 = aVar2;
        C6787a aVar6 = aVar3;
        C6798l lVar2 = lVar;
        C6496s.h(inboxViewModel2, "viewModel");
        C6496s.h(aVar4, "onSendMessageButtonClick");
        C6496s.h(aVar5, "onBrowseHelpCenterButtonClick");
        C6496s.h(aVar6, "onBackButtonClick");
        C6496s.h(lVar2, "onConversationClicked");
        C1500m h10 = mVar.h(988563388);
        C2331a b10 = C2332b.b(inboxViewModel.getInboxPagingData(), (g) null, h10, 8, 1);
        C2331a aVar7 = b10;
        InboxUiState reduceToInboxUiState = InboxPagingItemsReducerKt.reduceToInboxUiState(b10, inboxViewModel.getEmptyState(), (AppConfig) null, i10, h10, C2331a.f24669f | ((i11 >> 6) & 7168), 2);
        C1798v vVar = (C1798v) h10.m(a.a());
        P.c(vVar, new v(vVar, aVar7), h10, 8);
        P.g((Object) null, new InboxScreenKt$InboxScreen$2(inboxViewModel2, lVar2, aVar7, (C6658d<? super InboxScreenKt$InboxScreen$2>) null), h10, 70);
        i d10 = i0.d(b.d(i.f23074a, IntercomTheme.INSTANCE.getColors(h10, IntercomTheme.$stable).m678getBackground0d7_KjU(), (g2) null, 2, (Object) null), l0.b(f0.f925a, h10, 8));
        C2005a e10 = g0.c.e(-682199168, true, new InboxScreenKt$InboxScreen$3(reduceToInboxUiState, aVar6), h10, 54);
        C2005a e11 = g0.c.e(958560707, true, new InboxScreenKt$InboxScreen$4(reduceToInboxUiState, aVar4), h10, 54);
        C1415x0.a(d10, e10, (p) null, (p) null, e11, 0, 0, 0, (f0) null, g0.c.e(-1682074485, true, new InboxScreenKt$InboxScreen$5(reduceToInboxUiState, inboxViewModel2, aVar4, aVar5), h10, 54), h10, 805330992, 492);
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new w(inboxViewModel, aVar, aVar2, aVar3, lVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final L InboxScreen$lambda$2(C1798v vVar, C2331a aVar, M m10) {
        C6496s.h(vVar, "$lifecycleOwner");
        C6496s.h(aVar, "$lazyPagingItems");
        C6496s.h(m10, "$this$DisposableEffect");
        u uVar = new u(aVar);
        vVar.getLifecycle().a(uVar);
        return new InboxScreenKt$InboxScreen$lambda$2$$inlined$onDispose$1(vVar, uVar);
    }

    /* access modifiers changed from: private */
    public static final void InboxScreen$lambda$2$lambda$0(C2331a aVar, C1798v vVar, C1790m.a aVar2) {
        C6496s.h(aVar, "$lazyPagingItems");
        C6496s.h(vVar, "<unused var>");
        C6496s.h(aVar2, "event");
        if (aVar2 == C1790m.a.ON_RESUME && (aVar.i().d() instanceof r.c)) {
            aVar.j();
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M InboxScreen$lambda$3(InboxViewModel inboxViewModel, C6787a aVar, C6787a aVar2, C6787a aVar3, C6798l lVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(inboxViewModel, "$viewModel");
        C6496s.h(aVar, "$onSendMessageButtonClick");
        C6496s.h(aVar2, "$onBrowseHelpCenterButtonClick");
        C6496s.h(aVar3, "$onBackButtonClick");
        C6496s.h(lVar, "$onConversationClicked");
        InboxScreen(inboxViewModel, aVar, aVar2, aVar3, lVar, i10, mVar, M0.a(i11 | 1));
        return C6514M.f71813a;
    }
}
