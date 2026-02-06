package io.intercom.android.sdk.tickets.create.ui;

import Y.C1500m;
import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.tickets.create.ui.ComposableSingletons$CreateTicketContentScreenKt$lambda-2$1  reason: invalid class name */
final class ComposableSingletons$CreateTicketContentScreenKt$lambda2$1 implements p {
    public static final ComposableSingletons$CreateTicketContentScreenKt$lambda2$1 INSTANCE = new ComposableSingletons$CreateTicketContentScreenKt$lambda2$1();

    ComposableSingletons$CreateTicketContentScreenKt$lambda2$1() {
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
    public static final C6514M invoke$lambda$2(String str) {
        C6496s.h(str, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$3(AnswerClickData answerClickData) {
        C6496s.h(answerClickData, "it");
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            CreateTicketContentScreenKt.CreateTicketContentScreen((i) null, new CreateTicketViewModel.CreateTicketFormUiState.Content("All form attribute types", CreateTicketContentScreenKt.questions, false, true), new C6320a(), new C6321b(), new C6322c(), new C6323d(), mVar, 224704, 1);
        } else {
            mVar.I();
        }
    }
}
