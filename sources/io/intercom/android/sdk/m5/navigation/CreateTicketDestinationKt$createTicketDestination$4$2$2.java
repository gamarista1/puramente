package io.intercom.android.sdk.m5.navigation;

import C.C1092j;
import C.j0;
import H0.F;
import J0.C1241g;
import Ug.K;
import Y.C1494j;
import Y.C1500m;
import Y.C1510r0;
import Y.C1523y;
import Y.F1;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.f;
import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import io.intercom.android.sdk.survey.ui.questiontype.files.FileActionSheetKt;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;
import k0.c;
import k0.h;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6787a;
import yf.p;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class CreateTicketDestinationKt$createTicketDestination$4$2$2 implements q {
    final /* synthetic */ C1510r0 $answerClickedData;
    final /* synthetic */ AnswerClickData $data;
    final /* synthetic */ K $scope;
    final /* synthetic */ CreateTicketViewModel $viewModel;

    CreateTicketDestinationKt$createTicketDestination$4$2$2(AnswerClickData answerClickData, CreateTicketViewModel createTicketViewModel, K k10, C1510r0 r0Var) {
        this.$data = answerClickData;
        this.$viewModel = createTicketViewModel;
        this.$scope = k10;
        this.$answerClickedData = r0Var;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$4$lambda$0(CreateTicketViewModel createTicketViewModel, AnswerClickData answerClickData, K k10, C1510r0 r0Var) {
        C6496s.h(createTicketViewModel, "$viewModel");
        C6496s.h(answerClickData, "$data");
        C6496s.h(k10, "$scope");
        C6496s.h(r0Var, "$answerClickedData");
        createTicketViewModel.onRetryFileClicked(answerClickData);
        CreateTicketDestinationKt$createTicketDestination$4.invoke$dismissSheet(k10, r0Var);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$4$lambda$1(CreateTicketViewModel createTicketViewModel, AnswerClickData answerClickData, K k10, C1510r0 r0Var) {
        C6496s.h(createTicketViewModel, "$viewModel");
        C6496s.h(answerClickData, "$data");
        C6496s.h(k10, "$scope");
        C6496s.h(r0Var, "$answerClickedData");
        createTicketViewModel.onDeleteFileClicked(answerClickData);
        CreateTicketDestinationKt$createTicketDestination$4.invoke$dismissSheet(k10, r0Var);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$4$lambda$2(CreateTicketViewModel createTicketViewModel, AnswerClickData answerClickData, K k10, C1510r0 r0Var) {
        C6496s.h(createTicketViewModel, "$viewModel");
        C6496s.h(answerClickData, "$data");
        C6496s.h(k10, "$scope");
        C6496s.h(r0Var, "$answerClickedData");
        createTicketViewModel.onDeleteFileClicked(answerClickData);
        CreateTicketDestinationKt$createTicketDestination$4.invoke$dismissSheet(k10, r0Var);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$4$lambda$3(K k10, C1510r0 r0Var) {
        C6496s.h(k10, "$scope");
        C6496s.h(r0Var, "$answerClickedData");
        CreateTicketDestinationKt$createTicketDestination$4.invoke$dismissSheet(k10, r0Var);
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1092j) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1092j jVar, C1500m mVar, int i10) {
        C6496s.h(jVar, "$this$ModalBottomSheet");
        if ((i10 & 81) != 16 || !mVar.i()) {
            i c10 = j0.c(i.f23074a);
            AnswerClickData answerClickData = this.$data;
            CreateTicketViewModel createTicketViewModel = this.$viewModel;
            K k10 = this.$scope;
            C1510r0 r0Var = this.$answerClickedData;
            F h10 = d.h(c.f23044a.o(), false);
            int a10 = C1494j.a(mVar, 0);
            C1523y p10 = mVar.p();
            i e10 = h.e(mVar, c10);
            C1241g.a aVar = C1241g.f3853J;
            C6787a a11 = aVar.a();
            if (mVar.j() == null) {
                C1494j.c();
            }
            mVar.F();
            if (mVar.f()) {
                mVar.U(a11);
            } else {
                mVar.q();
            }
            C1500m a12 = F1.a(mVar);
            F1.b(a12, h10, aVar.c());
            F1.b(a12, p10, aVar.e());
            p b10 = aVar.b();
            if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
                a12.r(Integer.valueOf(a10));
                a12.V(Integer.valueOf(a10), b10);
            }
            F1.b(a12, e10, aVar.d());
            f fVar = f.f12848a;
            FileActionSheetKt.FileActionSheet(answerClickData.getClickedItem(), new C(createTicketViewModel, answerClickData, k10, r0Var), new D(createTicketViewModel, answerClickData, k10, r0Var), new E(createTicketViewModel, answerClickData, k10, r0Var), new F(k10, r0Var), mVar, 0);
            mVar.u();
            return;
        }
        mVar.I();
    }
}
