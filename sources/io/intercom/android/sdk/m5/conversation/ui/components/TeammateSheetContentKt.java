package io.intercom.android.sdk.m5.conversation.ui.components;

import C.C1085c;
import C.C1090h;
import C.C1093k;
import H0.F;
import J0.C1241g;
import V.B0;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.Y0;
import androidx.compose.foundation.layout.q;
import c1.h;
import io.intercom.android.sdk.m5.conversation.states.ExpandedTeamPresenceState;
import io.intercom.android.sdk.m5.conversation.ui.components.row.ExpandedTeamPresenceLayoutKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.SpecialNoticeKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6787a;
import yf.p;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a-\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lk0/i;", "modifier", "", "specialNoticeMessage", "Lio/intercom/android/sdk/m5/conversation/states/ExpandedTeamPresenceState;", "teamPresenceState", "Llf/M;", "TeammateSheetContent", "(Lk0/i;Ljava/lang/String;Lio/intercom/android/sdk/m5/conversation/states/ExpandedTeamPresenceState;LY/m;II)V", "TeammateSheetContentPreview", "(LY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TeammateSheetContentKt {
    public static final void TeammateSheetContent(i iVar, String str, ExpandedTeamPresenceState expandedTeamPresenceState, C1500m mVar, int i10, int i11) {
        i iVar2;
        String str2;
        ExpandedTeamPresenceState expandedTeamPresenceState2 = expandedTeamPresenceState;
        C6496s.h(expandedTeamPresenceState2, "teamPresenceState");
        C1500m h10 = mVar.h(755089345);
        if ((i11 & 1) != 0) {
            iVar2 = i.f23074a;
        } else {
            iVar2 = iVar;
        }
        if ((i11 & 2) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
        F a10 = C1090h.a(C1085c.f882a.n(h.j((float) 16)), c.f23044a.k(), h10, 6);
        int a11 = C1494j.a(h10, 0);
        C1523y p10 = h10.p();
        i e10 = k0.h.e(h10, iVar2);
        C1241g.a aVar = C1241g.f3853J;
        C6787a a12 = aVar.a();
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
        F1.b(a13, a10, aVar.c());
        F1.b(a13, p10, aVar.e());
        p b10 = aVar.b();
        if (a13.f() || !C6496s.c(a13.A(), Integer.valueOf(a11))) {
            a13.r(Integer.valueOf(a11));
            a13.V(Integer.valueOf(a11), b10);
        }
        F1.b(a13, e10, aVar.d());
        C1093k kVar = C1093k.f978a;
        ExpandedTeamPresenceLayoutKt.ExpandedTeamPresenceLayout(expandedTeamPresenceState2, q.h(i.f23074a, 0.0f, 1, (Object) null), h10, 56, 0);
        h10.T(-1851009825);
        if (!(str2 == null || str2.length() == 0)) {
            SpecialNoticeKt.SpecialNotice(str2, (i) null, h10, (i10 >> 3) & 14, 2);
        }
        h10.M();
        h10.u();
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new D0(iVar2, str2, expandedTeamPresenceState, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TeammateSheetContent$lambda$1(i iVar, String str, ExpandedTeamPresenceState expandedTeamPresenceState, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(expandedTeamPresenceState, "$teamPresenceState");
        TeammateSheetContent(iVar, str, expandedTeamPresenceState, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void TeammateSheetContentPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(223292015);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$TeammateSheetContentKt.INSTANCE.m247getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C0(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TeammateSheetContentPreview$lambda$2(int i10, C1500m mVar, int i11) {
        TeammateSheetContentPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
