package io.intercom.android.sdk.m5.conversation.ui.components.row;

import C.C1085c;
import C.W;
import C.Z;
import C.a0;
import H0.F;
import J0.C1241g;
import V.B0;
import V.T0;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.Y0;
import androidx.compose.foundation.layout.n;
import androidx.compose.foundation.layout.q;
import b1.j;
import b1.k;
import c1.h;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
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
import r0.C2544x0;
import r0.C2550z0;
import r0.g2;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a)\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lk0/i;", "modifier", "", "label", "Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "avatar", "Llf/M;", "EventRow", "(Lk0/i;Ljava/lang/String;Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;LY/m;II)V", "ParticipantAddedRowPreview", "(LY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class EventRowKt {
    public static final void EventRow(i iVar, String str, AvatarWrapper avatarWrapper, C1500m mVar, int i10, int i11) {
        i.a aVar;
        C6496s.h(str, "label");
        C6496s.h(avatarWrapper, "avatar");
        C1500m h10 = mVar.h(2120787343);
        if ((i11 & 1) != 0) {
            aVar = i.f23074a;
        } else {
            aVar = iVar;
        }
        i k10 = n.k(aVar, h.j((float) 16), 0.0f, 2, (Object) null);
        F b10 = W.b(C1085c.f882a.b(), c.f23044a.i(), h10, 54);
        int a10 = C1494j.a(h10, 0);
        C1523y p10 = h10.p();
        i e10 = k0.h.e(h10, k10);
        C1241g.a aVar2 = C1241g.f3853J;
        C6787a a11 = aVar2.a();
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
        F1.b(a12, b10, aVar2.c());
        F1.b(a12, p10, aVar2.e());
        p b11 = aVar2.b();
        if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
            a12.r(Integer.valueOf(a10));
            a12.V(Integer.valueOf(a10), b11);
        }
        F1.b(a12, e10, aVar2.d());
        Z z10 = Z.f873a;
        i.a aVar3 = i.f23074a;
        AvatarIconKt.m208AvatarIconRd90Nhg(q.n(aVar3, h.j((float) 36)), avatarWrapper, (g2) null, false, 0, C2544x0.k(C2550z0.d(4294046193L)), h10, 196678, 28);
        a0.a(q.r(aVar3, h.j((float) 8)), h10, 6);
        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
        int i12 = IntercomTheme.$stable;
        i iVar2 = aVar;
        String str2 = str;
        C1500m mVar2 = h10;
        T0.b(str2, (i) null, intercomTheme.getColors(h10, i12).m686getDescriptionText0d7_KjU(), 0, (V0.n) null, (V0.p) null, (V0.h) null, 0, (k) null, j.h(j.f19110b.f()), 0, 0, false, 0, 0, (C6798l) null, intercomTheme.getTypography(h10, i12).getType04Point5(), mVar2, (i10 >> 3) & 14, 0, 65018);
        h10.u();
        Y0 k11 = h10.k();
        if (k11 != null) {
            k11.a(new C(iVar2, str, avatarWrapper, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M EventRow$lambda$1(i iVar, String str, AvatarWrapper avatarWrapper, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(str, "$label");
        C6496s.h(avatarWrapper, "$avatar");
        EventRow(iVar, str, avatarWrapper, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void ParticipantAddedRowPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(524974868);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$EventRowKt.INSTANCE.m289getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new D(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M ParticipantAddedRowPreview$lambda$2(int i10, C1500m mVar, int i11) {
        ParticipantAddedRowPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
