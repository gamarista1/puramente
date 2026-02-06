package io.intercom.android.sdk.m5.conversation.ui.components;

import C.C1085c;
import C.C1090h;
import C.C1093k;
import H0.F;
import J0.C1241g;
import Y.A1;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.Y0;
import io.intercom.android.sdk.m5.components.TopActionBarKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.metrics.MetricData;
import io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem;
import io.intercom.android.sdk.m5.conversation.states.TicketProgressRowState;
import io.intercom.android.sdk.m5.conversation.states.TopAppBarUiState;
import io.intercom.android.sdk.tickets.TicketProgressBannerKt;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.List;
import k0.c;
import k0.h;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import r0.C2544x0;
import v.C2737t;
import w.C2797i;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001au\u0010\f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0007H\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;", "topAppBarUiState", "Lkotlin/Function0;", "Llf/M;", "onBackClick", "onTitleClicked", "navigateToTicketDetail", "Lkotlin/Function1;", "Lio/intercom/android/sdk/m5/conversation/states/HeaderMenuItem;", "onMenuClicked", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData;", "trackMetric", "ConversationTopAppBar", "(Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;Lyf/a;Lyf/a;Lyf/a;Lyf/l;Lyf/l;LY/m;II)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ConversationTopAppBarKt {
    public static final void ConversationTopAppBar(TopAppBarUiState topAppBarUiState, C6787a aVar, C6787a aVar2, C6787a aVar3, C6798l lVar, C6798l lVar2, C1500m mVar, int i10, int i11) {
        C6787a aVar4;
        C6127q qVar;
        r rVar;
        C6159s sVar;
        C6160t tVar;
        long j10;
        long j11;
        long j12;
        String str;
        TopAppBarUiState topAppBarUiState2 = topAppBarUiState;
        C6496s.h(topAppBarUiState2, "topAppBarUiState");
        C1500m h10 = mVar.h(1613129219);
        if ((i11 & 2) != 0) {
            aVar4 = null;
        } else {
            aVar4 = aVar;
        }
        if ((i11 & 4) != 0) {
            qVar = new C6127q();
        } else {
            qVar = aVar2;
        }
        if ((i11 & 8) != 0) {
            rVar = new r();
        } else {
            rVar = aVar3;
        }
        if ((i11 & 16) != 0) {
            sVar = new C6159s();
        } else {
            sVar = lVar;
        }
        if ((i11 & 32) != 0) {
            tVar = new C6160t();
        } else {
            tVar = lVar2;
        }
        C2544x0 r22 = topAppBarUiState.m221getBackgroundColorQN2ZGVo();
        h10.T(-287890548);
        if (r22 == null) {
            j10 = IntercomTheme.INSTANCE.getColors(h10, IntercomTheme.$stable).m691getHeader0d7_KjU();
        } else {
            j10 = r22.y();
        }
        h10.M();
        A1 a10 = C2737t.a(j10, (C2797i) null, "bgColorState", (C6798l) null, h10, 384, 10);
        C2544x0 r23 = topAppBarUiState.m222getContentColorQN2ZGVo();
        h10.T(-287884181);
        if (r23 == null) {
            j11 = IntercomTheme.INSTANCE.getColors(h10, IntercomTheme.$stable).m697getOnHeader0d7_KjU();
        } else {
            j11 = r23.y();
        }
        h10.M();
        A1 a11 = C2737t.a(j11, (C2797i) null, "contentColorState", (C6798l) null, h10, 384, 10);
        C2544x0 r24 = topAppBarUiState.m223getSubTitleColorQN2ZGVo();
        h10.T(-287877773);
        if (r24 == null) {
            j12 = IntercomTheme.INSTANCE.getColors(h10, IntercomTheme.$stable).m686getDescriptionText0d7_KjU();
        } else {
            j12 = r24.y();
        }
        h10.M();
        A1 a12 = C2737t.a(j12, (C2797i) null, "subTitleColorState", (C6798l) null, h10, 384, 10);
        i.a aVar5 = i.f23074a;
        F a13 = C1090h.a(C1085c.f882a.g(), c.f23044a.k(), h10, 0);
        int a14 = C1494j.a(h10, 0);
        C1523y p10 = h10.p();
        i e10 = h.e(h10, aVar5);
        C1241g.a aVar6 = C1241g.f3853J;
        C6787a a15 = aVar6.a();
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
        F1.b(a16, a13, aVar6.c());
        F1.b(a16, p10, aVar6.e());
        p b10 = aVar6.b();
        if (a16.f() || !C6496s.c(a16.A(), Integer.valueOf(a14))) {
            a16.r(Integer.valueOf(a14));
            a16.V(Integer.valueOf(a14), b10);
        }
        F1.b(a16, e10, aVar6.d());
        C1093k kVar = C1093k.f978a;
        StringProvider title = topAppBarUiState.getTitle();
        int i12 = StringProvider.$stable;
        String text = title.getText(h10, i12);
        StringProvider subTitle = topAppBarUiState.getSubTitle();
        h10.T(603543413);
        if (subTitle == null) {
            str = null;
        } else {
            str = subTitle.getText(h10, i12);
        }
        h10.M();
        Integer subTitleLeadingIcon = topAppBarUiState.getSubTitleLeadingIcon();
        List<AvatarWrapper> avatars = topAppBarUiState.getAvatars();
        Integer navIcon = topAppBarUiState.getNavIcon();
        long y10 = ((C2544x0) a10.getValue()).y();
        A1 a17 = a11;
        long y11 = ((C2544x0) a11.getValue()).y();
        long y12 = ((C2544x0) a12.getValue()).y();
        C6798l lVar3 = sVar;
        Integer num = subTitleLeadingIcon;
        C6798l lVar4 = tVar;
        C6798l lVar5 = lVar3;
        C6787a aVar7 = aVar4;
        List<AvatarWrapper> list = avatars;
        C6798l lVar6 = lVar4;
        Integer num2 = num;
        TopActionBarKt.m207TopActionBarNpQZenA((i) null, text, str, num2, list, aVar7, navIcon, topAppBarUiState.getDisplayActiveIndicator(), y10, y11, y12, qVar, g0.c.e(-69139937, true, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState2, lVar3, a17, lVar4), h10, 54), h10, ((i10 << 12) & 458752) | 32768, ((i10 >> 3) & 112) | 384, 1);
        TicketProgressRowState ticketStatusState = topAppBarUiState.getTicketStatusState();
        h10.T(603574941);
        if (ticketStatusState != null) {
            TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), rVar, true, (i) null, h10, ((i10 >> 6) & 112) | 384, 8);
        }
        h10.M();
        h10.u();
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6161u(topAppBarUiState, aVar4, qVar, rVar, lVar5, lVar6, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationTopAppBar$lambda$0() {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationTopAppBar$lambda$1() {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationTopAppBar$lambda$2(HeaderMenuItem headerMenuItem) {
        C6496s.h(headerMenuItem, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationTopAppBar$lambda$3(MetricData metricData) {
        C6496s.h(metricData, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationTopAppBar$lambda$6(TopAppBarUiState topAppBarUiState, C6787a aVar, C6787a aVar2, C6787a aVar3, C6798l lVar, C6798l lVar2, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(topAppBarUiState, "$topAppBarUiState");
        ConversationTopAppBar(topAppBarUiState, aVar, aVar2, aVar3, lVar, lVar2, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }
}
