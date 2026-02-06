package io.intercom.android.sdk.tickets.create.ui;

import Y.C1500m;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.survey.QuestionState;
import io.intercom.android.sdk.survey.ValidationError;
import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;
import java.util.List;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.tickets.create.ui.ComposableSingletons$CreateTicketContentScreenKt$lambda-5$1  reason: invalid class name */
final class ComposableSingletons$CreateTicketContentScreenKt$lambda5$1 implements p {
    public static final ComposableSingletons$CreateTicketContentScreenKt$lambda5$1 INSTANCE = new ComposableSingletons$CreateTicketContentScreenKt$lambda5$1();

    ComposableSingletons$CreateTicketContentScreenKt$lambda5$1() {
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
    public static final C6514M invoke$lambda$3(String str) {
        C6496s.h(str, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$4(AnswerClickData answerClickData) {
        C6496s.h(answerClickData, "it");
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            List V02 = C6565s.V0(CreateTicketContentScreenKt.questions, 4);
            ((QuestionState) C6565s.o0(V02)).setValidationError(new ValidationError.ValidationStringError(R.string.intercom_surveys_email_error, (List) null, 2, (DefaultConstructorMarker) null));
            C6514M m10 = C6514M.f71813a;
            CreateTicketContentScreenKt.CreateTicketContentScreen((i) null, new CreateTicketViewModel.CreateTicketFormUiState.Content("All form attribute types", V02, false, false), new p(), new q(), new r(), new s(), mVar, 224704, 1);
            return;
        }
        mVar.I();
    }
}
