package io.intercom.android.sdk.m5.components;

import C.C1085c;
import C.W;
import C.Y;
import C.Z;
import H0.F;
import J0.C1241g;
import Q0.A;
import Q0.T;
import V.B0;
import V.T0;
import V0.o;
import X0.e;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.Y0;
import androidx.compose.foundation.layout.n;
import androidx.compose.ui.platform.n1;
import b1.C1869a;
import b1.C1876h;
import b1.j;
import b1.k;
import b1.q;
import b1.s;
import c1.h;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import java.util.List;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import mf.C6565s;
import r0.e2;
import t0.C2606g;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a'\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u000f\u0010\b\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lk0/i;", "modifier", "", "Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "avatars", "Llf/M;", "TeamPresenceRow", "(Lk0/i;Ljava/util/List;LY/m;II)V", "TeamPresenceRowPreview", "(LY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TeamPresenceRowKt {
    public static final void TeamPresenceRow(i iVar, List<AvatarWrapper> list, C1500m mVar, int i10, int i11) {
        i.a aVar;
        List<AvatarWrapper> list2 = list;
        int i12 = i11;
        C6496s.h(list2, "avatars");
        C1500m h10 = mVar.h(1370953565);
        if ((i12 & 1) != 0) {
            aVar = i.f23074a;
        } else {
            aVar = iVar;
        }
        i a10 = n1.a(n.j(aVar, h.j((float) 16), h.j((float) 12)), "team_presence_row");
        F b10 = W.b(C1085c.f882a.f(), c.f23044a.i(), h10, 48);
        int a11 = C1494j.a(h10, 0);
        C1523y p10 = h10.p();
        i e10 = k0.h.e(h10, a10);
        C1241g.a aVar2 = C1241g.f3853J;
        C6787a a12 = aVar2.a();
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
        F1.b(a13, b10, aVar2.c());
        F1.b(a13, p10, aVar2.e());
        p b11 = aVar2.b();
        if (a13.f() || !C6496s.c(a13.A(), Integer.valueOf(a11))) {
            a13.r(Integer.valueOf(a11));
            a13.V(Integer.valueOf(a11), b11);
        }
        F1.b(a13, e10, aVar2.d());
        i iVar2 = aVar;
        T0.b(M0.i.a(R.string.intercom_the_team_can_help_if_needed, h10, 0), Y.b(Z.f873a, i.f23074a, 1.0f, false, 2, (Object) null), 0, 0, (V0.n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, T.c(IntercomTheme.INSTANCE.getTypography(h10, IntercomTheme.$stable).getType04Point5(), ColorExtensionsKt.toComposeColor$default("#757575", 0.0f, 1, (Object) null), 0, (V0.p) null, (V0.n) null, (o) null, (V0.h) null, (String) null, 0, (C1869a) null, (b1.o) null, (e) null, 0, (k) null, (e2) null, (C2606g) null, 0, 0, 0, (q) null, (A) null, (C1876h) null, 0, 0, (s) null, 16777214, (Object) null), h10, 0, 0, 65532);
        AvatarGroupKt.m136AvatarGroupJ8mCjc(C6565s.V0(list2, 3), (i) null, h.j((float) 24), 0, h10, 392, 10);
        h10.u();
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new Y0(iVar2, list2, i10, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TeamPresenceRow$lambda$1(i iVar, List list, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(list, "$avatars");
        TeamPresenceRow(iVar, list, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void TeamPresenceRowPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1211328616);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$TeamPresenceRowKt.INSTANCE.m192getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new Z0(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TeamPresenceRowPreview$lambda$2(int i10, C1500m mVar, int i11) {
        TeamPresenceRowPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
