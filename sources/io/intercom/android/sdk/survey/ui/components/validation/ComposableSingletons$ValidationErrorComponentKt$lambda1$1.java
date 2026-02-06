package io.intercom.android.sdk.survey.ui.components.validation;

import Y.C1500m;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.survey.ValidationError;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.List;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.survey.ui.components.validation.ComposableSingletons$ValidationErrorComponentKt$lambda-1$1  reason: invalid class name */
final class ComposableSingletons$ValidationErrorComponentKt$lambda1$1 implements p {
    public static final ComposableSingletons$ValidationErrorComponentKt$lambda1$1 INSTANCE = new ComposableSingletons$ValidationErrorComponentKt$lambda1$1();

    ComposableSingletons$ValidationErrorComponentKt$lambda1$1() {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            ValidationErrorComponentKt.m470ValidationErrorComponentFNF3uiM((i) null, new ValidationError.ValidationStringError(R.string.intercom_inbox_error_state_title, (List) null, 2, (DefaultConstructorMarker) null), IntercomTheme.INSTANCE.getColors(mVar, IntercomTheme.$stable).m689getError0d7_KjU(), mVar, 64, 1);
        } else {
            mVar.I();
        }
    }
}
