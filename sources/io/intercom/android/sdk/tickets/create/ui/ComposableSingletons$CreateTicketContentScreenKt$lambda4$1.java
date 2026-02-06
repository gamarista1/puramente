package io.intercom.android.sdk.tickets.create.ui;

import Y.C1500m;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.tickets.create.ui.ComposableSingletons$CreateTicketContentScreenKt$lambda-4$1  reason: invalid class name */
final class ComposableSingletons$CreateTicketContentScreenKt$lambda4$1 implements p {
    public static final ComposableSingletons$CreateTicketContentScreenKt$lambda4$1 INSTANCE = new ComposableSingletons$CreateTicketContentScreenKt$lambda4$1();

    ComposableSingletons$CreateTicketContentScreenKt$lambda4$1() {
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$0() {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$1() {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$2() {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$3() {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$4(String str) {
        C6496s.h(str, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$5(AnswerClickData answerClickData) {
        C6496s.h(answerClickData, "it");
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            CreateTicketContentScreenKt.CreateTicketScreen(new CreateTicketViewModel.CreateTicketFormUiState.Error(new ErrorState.WithCTA(0, 0, (Integer) null, R.string.intercom_reload, new j(), 7, (DefaultConstructorMarker) null)), new k(), new l(), new m(), new n(), new o(), mVar, 224688);
        } else {
            mVar.I();
        }
    }
}
