package io.intercom.android.sdk.m5.components;

import V.B0;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import g0.c;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.p;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a/\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lk0/i;", "modifier", "", "cardTitle", "Lkotlin/Function0;", "Llf/M;", "content", "HomeCardScaffold", "(Lk0/i;Ljava/lang/String;Lyf/p;LY/m;II)V", "HomeCardScaffoldPreview", "(LY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class HomeCardScaffoldKt {
    public static final void HomeCardScaffold(i iVar, String str, p pVar, C1500m mVar, int i10, int i11) {
        int i12;
        i iVar2;
        i iVar3;
        int i13;
        int i14;
        int i15;
        String str2 = str;
        p pVar2 = pVar;
        int i16 = i10;
        C6496s.h(str, "cardTitle");
        C6496s.h(pVar, "content");
        C1500m mVar2 = mVar;
        C1500m h10 = mVar.h(-1721620037);
        int i17 = i11 & 1;
        if (i17 != 0) {
            i12 = i16 | 6;
            iVar2 = iVar;
        } else if ((i16 & 14) == 0) {
            iVar2 = iVar;
            if (h10.S(iVar)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i16;
        } else {
            iVar2 = iVar;
            i12 = i16;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i16 & 112) == 0) {
            if (h10.S(str)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i16 & 896) == 0) {
            if (h10.C(pVar)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 731) != 146 || !h10.i()) {
            if (i17 != 0) {
                iVar3 = i.f23074a;
            } else {
                iVar3 = iVar2;
            }
            IntercomCardKt.IntercomCard(iVar3, (IntercomCardStyle.Style) null, c.e(1218435015, true, new HomeCardScaffoldKt$HomeCardScaffold$1(str, pVar), h10, 54), h10, (i12 & 14) | 384, 2);
        } else {
            h10.I();
            iVar3 = iVar2;
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6047r0(iVar3, str, pVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M HomeCardScaffold$lambda$0(i iVar, String str, p pVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(str, "$cardTitle");
        C6496s.h(pVar, "$content");
        HomeCardScaffold(iVar, str, pVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void HomeCardScaffoldPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1294989986);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$HomeCardScaffoldKt.INSTANCE.m168getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6046q0(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M HomeCardScaffoldPreview$lambda$1(int i10, C1500m mVar, int i11) {
        HomeCardScaffoldPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
