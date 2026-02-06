package io.intercom.android.sdk.m5.navigation;

import Ug.C5600w0;
import Ug.K;
import Ug.M;
import V.C1386i0;
import V.C1388j0;
import V.E0;
import Xg.C5695g;
import Y.A1;
import Y.B;
import Y.C1500m;
import Y.C1510r0;
import Y.P;
import Y.o1;
import Y.p1;
import a2.C1542a;
import android.os.Bundle;
import androidx.activity.C1554j;
import androidx.lifecycle.e0;
import g0.c;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionArgs;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import io.intercom.android.sdk.tickets.create.model.CreateTicketLaunchedFrom;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;
import io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import j3.k;
import j3.x;
import k0.i;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.C6527k;
import lf.C6535s;
import lf.w;
import qf.C6658d;
import qf.g;
import qf.h;
import r0.C2544x0;
import r0.a2;
import r0.g2;
import rf.C6680b;
import v.C2719b;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.r;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class CreateTicketDestinationKt$createTicketDestination$4 implements r {
    final /* synthetic */ x $navController;
    final /* synthetic */ C1554j $rootActivity;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
    @f(c = "io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt$createTicketDestination$4$1", f = "CreateTicketDestination.kt", l = {101}, m = "invokeSuspend")
    /* renamed from: io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt$createTicketDestination$4$1  reason: invalid class name */
    static final class AnonymousClass1 extends l implements p {
        int label;

        public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
            return new AnonymousClass1(createTicketViewModel2, xVar, k11, r0Var2, dVar);
        }

        public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
            return ((AnonymousClass1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.label;
            if (i10 == 0) {
                w.b(obj);
                Xg.B effect = createTicketViewModel2.getEffect();
                final x xVar = xVar;
                final K k10 = k11;
                final C1510r0 r0Var = r0Var2;
                AnonymousClass1 r12 = new C5695g() {
                    public final Object emit(CreateTicketViewModel.TicketSideEffect ticketSideEffect, C6658d<? super C6514M> dVar) {
                        if (C6496s.c(ticketSideEffect, CreateTicketViewModel.TicketSideEffect.Finish.INSTANCE)) {
                            xVar.X();
                            IntercomRouterKt.openTicketDetailScreen$default(xVar, true, (TransitionArgs) null, false, 6, (Object) null);
                        } else if (ticketSideEffect instanceof CreateTicketViewModel.TicketSideEffect.AnswerClicked) {
                            CreateTicketDestinationKt$createTicketDestination$4.invoke$showSheet(k10, r0Var, ((CreateTicketViewModel.TicketSideEffect.AnswerClicked) ticketSideEffect).getAnswerClickData());
                        } else {
                            throw new C6535s();
                        }
                        return C6514M.f71813a;
                    }
                };
                this.label = 1;
                if (effect.collect(r12, this) == f10) {
                    return f10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                w.b(obj);
            }
            throw new C6527k();
        }
    }

    CreateTicketDestinationKt$createTicketDestination$4(C1554j jVar, x xVar) {
        this.$rootActivity = jVar;
        this.$navController = xVar;
    }

    /* access modifiers changed from: private */
    public static final void invoke$dismissSheet(K k10, C1510r0 r0Var) {
        C5600w0 unused = C5576k.d(k10, (g) null, (M) null, new CreateTicketDestinationKt$createTicketDestination$4$dismissSheet$1(r0Var, (C6658d<? super CreateTicketDestinationKt$createTicketDestination$4$dismissSheet$1>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$2$lambda$1(K k10, C1510r0 r0Var) {
        C6496s.h(k10, "$scope");
        C6496s.h(r0Var, "$answerClickedData");
        invoke$dismissSheet(k10, r0Var);
        return C6514M.f71813a;
    }

    private static final CreateTicketViewModel.CreateTicketFormUiState invoke$lambda$3(A1 a12) {
        return (CreateTicketViewModel.CreateTicketFormUiState) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$4(CreateTicketViewModel createTicketViewModel, K k10) {
        C6496s.h(createTicketViewModel, "$viewModel");
        C6496s.h(k10, "$scope");
        createTicketViewModel.createTicket(k10);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$5(CreateTicketViewModel createTicketViewModel, String str) {
        C6496s.h(createTicketViewModel, "$viewModel");
        C6496s.h(str, "it");
        createTicketViewModel.onAnswerUpdated(str);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$6(CreateTicketViewModel createTicketViewModel, AnswerClickData answerClickData) {
        C6496s.h(createTicketViewModel, "$viewModel");
        C6496s.h(answerClickData, "it");
        createTicketViewModel.onAnswerClicked(answerClickData);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final void invoke$showSheet(K k10, C1510r0 r0Var, AnswerClickData answerClickData) {
        C5600w0 unused = C5576k.d(k10, (g) null, (M) null, new CreateTicketDestinationKt$createTicketDestination$4$showSheet$1(r0Var, answerClickData, (C6658d<? super CreateTicketDestinationKt$createTicketDestination$4$showSheet$1>) null), 3, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((C2719b) obj, (k) obj2, (C1500m) obj3, ((Number) obj4).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C2719b bVar, k kVar, C1500m mVar, int i10) {
        String str;
        CreateTicketLaunchedFrom createTicketLaunchedFrom;
        CreateTicketViewModel createTicketViewModel;
        K k10;
        long r92;
        C1500m mVar2 = mVar;
        C6496s.h(bVar, "$this$composable");
        C6496s.h(kVar, "navBackStackEntry");
        Bundle c10 = kVar.c();
        Integer valueOf = c10 != null ? Integer.valueOf(c10.getInt(CreateTicketDestinationKt.TICKET_TYPE_ID)) : null;
        Bundle c11 = kVar.c();
        String string = c11 != null ? c11.getString(CreateTicketDestinationKt.CONVERSATION_ID) : null;
        Bundle c12 = kVar.c();
        if (c12 == null || (str = c12.getString(TicketDetailDestinationKt.LAUNCHED_FROM)) == null) {
            str = "conversation";
        }
        if (valueOf != null) {
            CreateTicketViewModel.Companion companion = CreateTicketViewModel.Companion;
            e0 a10 = C1542a.f10582a.a(mVar2, C1542a.f10584c);
            if (a10 == null) {
                a10 = this.$rootActivity;
            }
            int intValue = valueOf.intValue();
            if (C6496s.c(str, "conversation")) {
                createTicketLaunchedFrom = CreateTicketLaunchedFrom.Conversation;
            } else {
                createTicketLaunchedFrom = CreateTicketLaunchedFrom.Home;
            }
            CreateTicketViewModel create = companion.create(a10, intValue, string, createTicketLaunchedFrom);
            mVar2.T(-693655600);
            Object A10 = mVar.A();
            C1500m.a aVar = C1500m.f10026a;
            if (A10 == aVar.a()) {
                A10 = u1.d((Object) null, (o1) null, 2, (Object) null);
                mVar2.r(A10);
            }
            C1510r0 r0Var = (C1510r0) A10;
            mVar.M();
            E0 l10 = C1386i0.l(true, (C6798l) null, mVar2, 6, 2);
            Object A11 = mVar.A();
            if (A11 == aVar.a()) {
                B b10 = new B(P.j(h.f72645a, mVar2));
                mVar2.r(b10);
                A11 = b10;
            }
            K a11 = ((B) A11).a();
            final x xVar = this.$navController;
            final CreateTicketViewModel createTicketViewModel2 = create;
            final K k11 = a11;
            final C1510r0 r0Var2 = r0Var;
            P.g("", new AnonymousClass1((C6658d<? super AnonymousClass1>) null), mVar2, 70);
            AnswerClickData answerClickData = (AnswerClickData) r0Var.getValue();
            mVar2.T(-693618191);
            if (answerClickData == null) {
                createTicketViewModel = create;
                k10 = a11;
            } else {
                mVar2.T(-693614197);
                if (answerClickData.getClickedItem().getUploadStatus() instanceof Answer.MediaAnswer.FileUploadStatus.Success) {
                    r92 = C2544x0.f25560b.a();
                } else {
                    r92 = IntercomTheme.INSTANCE.getColors(mVar2, IntercomTheme.$stable).m678getBackground0d7_KjU();
                }
                long j10 = r92;
                mVar.M();
                g2 a12 = a2.a();
                C6261y yVar = r9;
                C6261y yVar2 = new C6261y(a11, r0Var);
                k10 = a11;
                createTicketViewModel = create;
                C1386i0.a(yVar, (i) null, l10, 0.0f, a12, j10, 0, 0.0f, 0, (p) null, (p) null, (C1388j0) null, c.e(60091801, true, new CreateTicketDestinationKt$createTicketDestination$4$2$2(answerClickData, create, a11, r0Var), mVar2, 54), mVar, 805330944, 384, 3530);
                C6514M m10 = C6514M.f71813a;
            }
            mVar.M();
            CreateTicketViewModel.CreateTicketFormUiState invoke$lambda$3 = invoke$lambda$3(p1.a(createTicketViewModel.getUiState(), CreateTicketViewModel.CreateTicketFormUiState.Initial.INSTANCE, (g) null, mVar, 56, 2));
            final x xVar2 = this.$navController;
            final C1554j jVar = this.$rootActivity;
            AnonymousClass3 r22 = new C6787a() {
                public final void invoke() {
                    CreateTicketDestinationKt.createTicketDestination$navigateUp(x.this, jVar);
                }
            };
            CreateTicketViewModel createTicketViewModel3 = createTicketViewModel;
            C6263z zVar = new C6263z(createTicketViewModel3, k10);
            final x xVar3 = this.$navController;
            final C1554j jVar2 = this.$rootActivity;
            CreateTicketContentScreenKt.CreateTicketScreen(invoke$lambda$3, r22, zVar, new C6787a() {
                public final void invoke() {
                    CreateTicketDestinationKt.createTicketDestination$navigateUp(x.this, jVar2);
                }
            }, new A(createTicketViewModel3), new B(createTicketViewModel3), mVar, 0);
        }
    }
}
