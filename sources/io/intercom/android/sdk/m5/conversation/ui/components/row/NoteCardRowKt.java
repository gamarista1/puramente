package io.intercom.android.sdk.m5.conversation.ui.components.row;

import V.B0;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import androidx.compose.foundation.layout.n;
import c1.h;
import g0.c;
import io.intercom.android.sdk.models.Part;
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
import r0.g2;
import x.C2868g;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a)\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lk0/i;", "modifier", "Lio/intercom/android/sdk/models/Part;", "part", "", "companyName", "Llf/M;", "NoteCardRow", "(Lk0/i;Lio/intercom/android/sdk/models/Part;Ljava/lang/String;LY/m;II)V", "NoteCardRowPreview", "(LY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class NoteCardRowKt {
    public static final void NoteCardRow(i iVar, Part part, String str, C1500m mVar, int i10, int i11) {
        i iVar2;
        Part part2 = part;
        String str2 = str;
        C6496s.h(part2, "part");
        C6496s.h(str2, "companyName");
        C1500m h10 = mVar.h(-746207954);
        if ((i11 & 1) != 0) {
            iVar2 = i.f23074a;
        } else {
            iVar2 = iVar;
        }
        IntercomCardKt.IntercomCard(n.j(iVar2, h.j((float) 14), h.j((float) 12)), IntercomCardStyle.INSTANCE.m590conversationCardStylePEIptTM((g2) null, 0, 0, 0.0f, (C2868g) null, h10, IntercomCardStyle.$stable << 15, 31), c.e(2124316578, true, new NoteCardRowKt$NoteCardRow$1(part2, str2), h10, 54), h10, (IntercomCardStyle.Style.$stable << 3) | 384, 0);
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6135d0(iVar2, part, str, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M NoteCardRow$lambda$0(i iVar, Part part, String str, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(part, "$part");
        C6496s.h(str, "$companyName");
        NoteCardRow(iVar, part, str, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void NoteCardRowPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1220886807);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$NoteCardRowKt.INSTANCE.m301getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6137e0(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M NoteCardRowPreview$lambda$1(int i10, C1500m mVar, int i11) {
        NoteCardRowPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
