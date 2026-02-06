package io.intercom.android.sdk.m5.conversation.ui.components.row;

import V.B0;
import Y.C1500m;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import kotlin.Metadata;
import lf.C6514M;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$NoteCardRowKt$lambda-2$1  reason: invalid class name */
final class ComposableSingletons$NoteCardRowKt$lambda2$1 implements p {
    public static final ComposableSingletons$NoteCardRowKt$lambda2$1 INSTANCE = new ComposableSingletons$NoteCardRowKt$lambda2$1();

    ComposableSingletons$NoteCardRowKt$lambda2$1() {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$NoteCardRowKt.INSTANCE.m300getLambda1$intercom_sdk_base_release(), mVar, 3072, 7);
        } else {
            mVar.I();
        }
    }
}
