package io.intercom.android.sdk.m5.conversation.ui;

import C.C1087e;
import C.C1088f;
import C.N;
import C.f0;
import C.i0;
import C.j0;
import C.l0;
import D.A;
import D.B;
import Ug.C5600w0;
import Ug.K;
import Ug.M;
import V.C1415x0;
import V.J0;
import V.K0;
import Y.A1;
import Y.C1500m;
import Y.C1510r0;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.n;
import androidx.compose.foundation.o;
import androidx.compose.ui.platform.C1644k0;
import androidx.compose.ui.platform.C1651m1;
import androidx.compose.ui.platform.n1;
import c1.d;
import c1.h;
import g0.C2005a;
import g0.c;
import io.intercom.android.sdk.m5.components.FooterNoticeKt;
import io.intercom.android.sdk.m5.conversation.states.BottomBarUiState;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.m5.conversation.states.ContentRow;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiState;
import io.intercom.android.sdk.m5.conversation.states.FloatingIndicatorState;
import io.intercom.android.sdk.m5.conversation.states.FooterNoticeState;
import io.intercom.android.sdk.m5.conversation.states.JumpToBottomButtonState;
import io.intercom.android.sdk.m5.conversation.ui.components.ConversationTopAppBarKt;
import io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt;
import io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.ConversationBottomBarKt;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.TextInputSource;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.ui.component.JumpToBottomKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import java.util.List;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.C6535s;
import qf.C6658d;
import qf.g;
import r0.C2544x0;
import r0.g2;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class ConversationScreenKt$ConversationScreenContent$31 implements q {
    final /* synthetic */ K $coroutineScope;
    final /* synthetic */ A1 $keyboardAsState$delegate;
    final /* synthetic */ C1651m1 $keyboardController;
    final /* synthetic */ A $lazyListState;
    final /* synthetic */ i $modifier;
    final /* synthetic */ C6798l $navigateToAnotherConversation;
    final /* synthetic */ C6787a $navigateToTicketDetail;
    final /* synthetic */ C6787a $onBackClick;
    final /* synthetic */ C6798l $onCreateTicket;
    final /* synthetic */ C6787a $onGifInputSelected;
    final /* synthetic */ C6798l $onInputChange;
    final /* synthetic */ p $onJumpToBottomButtonClicked;
    final /* synthetic */ C6787a $onMediaInputSelected;
    final /* synthetic */ C6798l $onMenuClicked;
    final /* synthetic */ C6787a $onNewConversationClicked;
    final /* synthetic */ C6787a $onPrivacyNoticeDismissed;
    final /* synthetic */ C6798l $onReplyClicked;
    final /* synthetic */ C6787a $onRetryClick;
    final /* synthetic */ C6798l $onRetryImageClicked;
    final /* synthetic */ C6798l $onRetryMessageClicked;
    final /* synthetic */ p $onSendMessage;
    final /* synthetic */ C6798l $onSubmitAttribute;
    final /* synthetic */ C6798l $onSuggestionClick;
    final /* synthetic */ C6787a $onTitleClicked;
    final /* synthetic */ C6787a $onTyping;
    final /* synthetic */ C1510r0 $openBottomSheet;
    final /* synthetic */ o $scrollState;
    final /* synthetic */ K0 $snackbarHostState;
    final /* synthetic */ C6798l $trackMetric;
    final /* synthetic */ ConversationUiState $uiState;

    ConversationScreenKt$ConversationScreenContent$31(i iVar, ConversationUiState conversationUiState, C6787a aVar, C6787a aVar2, C6798l lVar, C6798l lVar2, C6787a aVar3, C1651m1 m1Var, K k10, C1510r0 r0Var, A1 a12, C6798l lVar3, C6787a aVar4, C6798l lVar4, C6787a aVar5, C6787a aVar6, o oVar, p pVar, C6787a aVar7, C6787a aVar8, K0 k02, C6787a aVar9, A a10, C6798l lVar5, C6798l lVar6, C6798l lVar7, C6798l lVar8, C6798l lVar9, C6798l lVar10, p pVar2) {
        this.$modifier = iVar;
        this.$uiState = conversationUiState;
        this.$onBackClick = aVar;
        this.$navigateToTicketDetail = aVar2;
        this.$onMenuClicked = lVar;
        this.$trackMetric = lVar2;
        this.$onTitleClicked = aVar3;
        this.$keyboardController = m1Var;
        this.$coroutineScope = k10;
        this.$openBottomSheet = r0Var;
        this.$keyboardAsState$delegate = a12;
        this.$onInputChange = lVar3;
        this.$onNewConversationClicked = aVar4;
        this.$navigateToAnotherConversation = lVar4;
        this.$onPrivacyNoticeDismissed = aVar5;
        this.$onTyping = aVar6;
        this.$scrollState = oVar;
        this.$onSendMessage = pVar;
        this.$onGifInputSelected = aVar7;
        this.$onMediaInputSelected = aVar8;
        this.$snackbarHostState = k02;
        this.$onRetryClick = aVar9;
        this.$lazyListState = a10;
        this.$onSuggestionClick = lVar5;
        this.$onReplyClicked = lVar6;
        this.$onRetryMessageClicked = lVar7;
        this.$onRetryImageClicked = lVar8;
        this.$onSubmitAttribute = lVar9;
        this.$onCreateTicket = lVar10;
        this.$onJumpToBottomButtonClicked = pVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1088f) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1088f fVar, C1500m mVar, int i10) {
        C1500m mVar2 = mVar;
        C6496s.h(fVar, "$this$BoxWithConstraints");
        if ((i10 & 81) != 16 || !mVar.i()) {
            final d dVar = (d) mVar2.m(C1644k0.e());
            i d10 = i0.d(b.d(this.$modifier, IntercomTheme.INSTANCE.getColors(mVar2, IntercomTheme.$stable).m678getBackground0d7_KjU(), (g2) null, 2, (Object) null), l0.b(f0.f925a, mVar2, 8));
            final ConversationUiState conversationUiState = this.$uiState;
            final C6787a aVar = this.$onBackClick;
            final C6787a aVar2 = this.$navigateToTicketDetail;
            final C6798l lVar = this.$onMenuClicked;
            final C6798l lVar2 = this.$trackMetric;
            final C6787a aVar3 = this.$onTitleClicked;
            final C1651m1 m1Var = this.$keyboardController;
            final K k10 = this.$coroutineScope;
            final C1510r0 r0Var = this.$openBottomSheet;
            final A1 a12 = this.$keyboardAsState$delegate;
            C2005a e10 = c.e(1398915036, true, new p() {
                /* access modifiers changed from: private */
                public static final C6514M invoke$lambda$0(ConversationUiState conversationUiState, C6787a aVar, C1651m1 m1Var, K k10, C1510r0 r0Var, A1 a12) {
                    C6496s.h(conversationUiState, "$uiState");
                    C6496s.h(k10, "$coroutineScope");
                    C6496s.h(r0Var, "$openBottomSheet");
                    C6496s.h(a12, "$keyboardAsState$delegate");
                    if (conversationUiState instanceof ConversationUiState.Content) {
                        aVar.invoke();
                        ConversationScreenKt.ConversationScreenContent$hideKeyboardAndShowBottomSheet(m1Var, k10, r0Var, a12);
                    }
                    return C6514M.f71813a;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C1500m) obj, ((Number) obj2).intValue());
                    return C6514M.f71813a;
                }

                public final void invoke(C1500m mVar, int i10) {
                    if ((i10 & 11) != 2 || !mVar.i()) {
                        ConversationTopAppBarKt.ConversationTopAppBar(conversationUiState.getTopAppBarUiState(), aVar, new x0(conversationUiState, aVar3, m1Var, k10, r0Var, a12), aVar2, lVar, lVar2, mVar, 8, 0);
                    } else {
                        mVar.I();
                    }
                }
            }, mVar2, 54);
            ConversationUiState conversationUiState2 = this.$uiState;
            C6798l lVar3 = this.$onInputChange;
            C6787a aVar4 = this.$onNewConversationClicked;
            C6798l lVar4 = this.$trackMetric;
            C6798l lVar5 = this.$navigateToAnotherConversation;
            C6787a aVar5 = this.$onPrivacyNoticeDismissed;
            C6787a aVar6 = this.$onTyping;
            K k11 = this.$coroutineScope;
            o oVar = this.$scrollState;
            p pVar = this.$onSendMessage;
            C6787a aVar7 = this.$onGifInputSelected;
            C2005a aVar8 = e10;
            C1510r0 r0Var2 = this.$openBottomSheet;
            i iVar = d10;
            C6787a aVar9 = this.$onMediaInputSelected;
            final ConversationUiState conversationUiState3 = conversationUiState2;
            final C6798l lVar6 = lVar3;
            final C6787a aVar10 = aVar4;
            final C6798l lVar7 = lVar4;
            final C6798l lVar8 = lVar5;
            final C6787a aVar11 = aVar5;
            final C6787a aVar12 = aVar6;
            final K k12 = k11;
            final o oVar2 = oVar;
            final p pVar2 = pVar;
            final C6787a aVar13 = aVar7;
            final C1510r0 r0Var3 = r0Var2;
            final C6787a aVar14 = aVar9;
            final C1651m1 m1Var2 = this.$keyboardController;
            final A1 a13 = this.$keyboardAsState$delegate;
            C1500m mVar3 = mVar;
            C2005a e11 = c.e(379052445, true, new p() {
                /* access modifiers changed from: private */
                public static final C6514M invoke$lambda$0(K k10, o oVar, p pVar, String str, TextInputSource textInputSource) {
                    C6496s.h(k10, "$coroutineScope");
                    C6496s.h(oVar, "$scrollState");
                    C6496s.h(str, MetricTracker.Object.MESSAGE);
                    C6496s.h(textInputSource, "textInputSource");
                    C5600w0 unused = C5576k.d(k10, (g) null, (M) null, new ConversationScreenKt$ConversationScreenContent$31$2$1$1(oVar, pVar, str, textInputSource, (C6658d<? super ConversationScreenKt$ConversationScreenContent$31$2$1$1>) null), 3, (Object) null);
                    return C6514M.f71813a;
                }

                /* access modifiers changed from: private */
                public static final C6514M invoke$lambda$1(C6787a aVar, K k10, C1510r0 r0Var) {
                    C6496s.h(k10, "$coroutineScope");
                    C6496s.h(r0Var, "$openBottomSheet");
                    aVar.invoke();
                    ConversationScreenKt.ConversationScreenContent$showBottomSheet(k10, r0Var);
                    return C6514M.f71813a;
                }

                /* access modifiers changed from: private */
                public static final C6514M invoke$lambda$2(C6787a aVar, C1651m1 m1Var, K k10, C1510r0 r0Var, A1 a12) {
                    C6496s.h(k10, "$coroutineScope");
                    C6496s.h(r0Var, "$openBottomSheet");
                    C6496s.h(a12, "$keyboardAsState$delegate");
                    aVar.invoke();
                    ConversationScreenKt.ConversationScreenContent$hideKeyboardAndShowBottomSheet(m1Var, k10, r0Var, a12);
                    return C6514M.f71813a;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C1500m) obj, ((Number) obj2).intValue());
                    return C6514M.f71813a;
                }

                public final void invoke(C1500m mVar, int i10) {
                    if ((i10 & 11) == 2 && mVar.i()) {
                        mVar.I();
                    } else if (conversationUiState3 instanceof ConversationUiState.Content) {
                        i d10 = b.d(j0.b(i.f23074a), C2544x0.f25560b.g(), (g2) null, 2, (Object) null);
                        BottomBarUiState bottomBarUiState = ((ConversationUiState.Content) conversationUiState3).getBottomBarUiState();
                        float j10 = h.j((float) 56);
                        ConversationBottomBarKt.m273ConversationBottomBarwn8IZOc(d10, bottomBarUiState, new y0(k12, oVar2, pVar2), lVar6, new z0(aVar13, k12, r0Var3), aVar10, new A0(aVar14, m1Var2, k12, r0Var3, a13), lVar7, j10, lVar8, aVar11, aVar12, mVar, 100663360, 0, 0);
                    }
                }
            }, mVar3, 54);
            final K0 k02 = this.$snackbarHostState;
            C2005a e12 = c.e(-640810146, true, new p() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C1500m) obj, ((Number) obj2).intValue());
                    return C6514M.f71813a;
                }

                public final void invoke(C1500m mVar, int i10) {
                    if ((i10 & 11) != 2 || !mVar.i()) {
                        J0.b(k02, (i) null, ComposableSingletons$ConversationScreenKt.INSTANCE.m226getLambda1$intercom_sdk_base_release(), mVar, 384, 2);
                    } else {
                        mVar.I();
                    }
                }
            }, mVar3, 54);
            final ConversationUiState conversationUiState4 = this.$uiState;
            C6787a aVar15 = this.$onRetryClick;
            A a10 = this.$lazyListState;
            C6798l lVar9 = this.$onSuggestionClick;
            C6798l lVar10 = this.$onReplyClicked;
            C6798l lVar11 = this.$onRetryMessageClicked;
            C6798l lVar12 = this.$onRetryImageClicked;
            C6798l lVar13 = this.$onSubmitAttribute;
            C6787a aVar16 = this.$navigateToTicketDetail;
            C6798l lVar14 = this.$onCreateTicket;
            C6798l lVar15 = this.$navigateToAnotherConversation;
            C2005a aVar17 = e12;
            o oVar3 = this.$scrollState;
            C2005a aVar18 = e11;
            final C6798l lVar16 = lVar15;
            final C6787a aVar19 = aVar15;
            final A a11 = a10;
            final C6798l lVar17 = lVar9;
            final C6798l lVar18 = lVar10;
            final C6798l lVar19 = lVar11;
            final C6798l lVar20 = lVar12;
            final C6798l lVar21 = lVar13;
            final C6787a aVar20 = aVar16;
            final C6798l lVar22 = lVar14;
            final o oVar4 = oVar3;
            final K k13 = this.$coroutineScope;
            final p pVar3 = this.$onJumpToBottomButtonClicked;
            C1500m mVar4 = mVar;
            C1415x0.a(iVar, aVar8, aVar18, aVar17, (p) null, 0, 0, 0, (f0) null, c.e(1154287591, true, new q() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((N) obj, (C1500m) obj2, ((Number) obj3).intValue());
                    return C6514M.f71813a;
                }

                public final void invoke(N n10, C1500m mVar, int i10) {
                    int i11;
                    N n11 = n10;
                    C1500m mVar2 = mVar;
                    C6496s.h(n11, "paddingValues");
                    if ((i10 & 14) == 0) {
                        i11 = i10 | (mVar2.S(n11) ? 4 : 2);
                    } else {
                        i11 = i10;
                    }
                    if ((i11 & 91) != 18 || !mVar.i()) {
                        ConversationUiState conversationUiState = conversationUiState4;
                        if (conversationUiState instanceof ConversationUiState.Loading) {
                            mVar2.T(-21428081);
                            ConversationLoadingScreenKt.ConversationLoadingScreen(n.h(i.f23074a, n11), mVar2, 0, 0);
                            mVar.M();
                        } else if (conversationUiState instanceof ConversationUiState.Error) {
                            mVar2.T(-21200789);
                            ConversationErrorScreenKt.ConversationErrorScreen((ConversationUiState.Error) conversationUiState4, aVar19, n.h(i.f23074a, n11), mVar, 8, 0);
                            mVar.M();
                        } else if (conversationUiState instanceof ConversationUiState.Content) {
                            mVar2.T(-20567273);
                            i f10 = androidx.compose.foundation.layout.q.f(i.f23074a, 0.0f, 1, (Object) null);
                            final ConversationUiState conversationUiState2 = conversationUiState4;
                            final A a10 = a11;
                            final C6798l lVar = lVar17;
                            final C6798l lVar2 = lVar18;
                            final C6798l lVar3 = lVar19;
                            final C6798l lVar4 = lVar20;
                            final C6798l lVar5 = lVar21;
                            final C6787a aVar = aVar20;
                            final C6798l lVar6 = lVar22;
                            final C6798l lVar7 = lVar16;
                            o oVar = oVar4;
                            final K k10 = k13;
                            p pVar = pVar3;
                            d dVar = dVar;
                            final N n12 = n10;
                            AnonymousClass1 r02 = r1;
                            final o oVar2 = oVar;
                            d dVar2 = dVar;
                            final p pVar2 = pVar;
                            final d dVar3 = dVar2;
                            AnonymousClass1 r12 = new q() {
                                /* access modifiers changed from: private */
                                public static final C6514M invoke$lambda$1(A a10, K k10, p pVar, o oVar, ConversationUiState conversationUiState, d dVar, C1088f fVar) {
                                    C6496s.h(k10, "$coroutineScope");
                                    C6496s.h(pVar, "$onJumpToBottomButtonClicked");
                                    C6496s.h(oVar, "$scrollState");
                                    C6496s.h(conversationUiState, "$uiState");
                                    C6496s.h(dVar, "$density");
                                    C6496s.h(fVar, "$this_BoxWithConstraints");
                                    if (a10 == null || !ConversationScreenKt.getLazyMessageListEnabled()) {
                                        C5600w0 unused = C5576k.d(k10, (g) null, (M) null, new ConversationScreenKt$ConversationScreenContent$31$4$1$2$2(conversationUiState, oVar, fVar, dVar, (C6658d<? super ConversationScreenKt$ConversationScreenContent$31$4$1$2$2>) null), 3, (Object) null);
                                        pVar.invoke(Integer.valueOf(oVar.m()), 0);
                                    } else {
                                        C5600w0 unused2 = C5576k.d(k10, (g) null, (M) null, new ConversationScreenKt$ConversationScreenContent$31$4$1$2$1(conversationUiState, a10, dVar, pVar, (C6658d<? super ConversationScreenKt$ConversationScreenContent$31$4$1$2$1>) null), 3, (Object) null);
                                    }
                                    return C6514M.f71813a;
                                }

                                /* access modifiers changed from: private */
                                public static final C6514M invoke$lambda$2(A a10, K k10, o oVar) {
                                    C6496s.h(k10, "$coroutineScope");
                                    C6496s.h(oVar, "$scrollState");
                                    if (a10 == null || !ConversationScreenKt.getLazyMessageListEnabled()) {
                                        C5600w0 unused = C5576k.d(k10, (g) null, (M) null, new ConversationScreenKt$ConversationScreenContent$31$4$1$3$2(oVar, (C6658d<? super ConversationScreenKt$ConversationScreenContent$31$4$1$3$2>) null), 3, (Object) null);
                                    } else {
                                        C5600w0 unused2 = C5576k.d(k10, (g) null, (M) null, new ConversationScreenKt$ConversationScreenContent$31$4$1$3$1(a10, (C6658d<? super ConversationScreenKt$ConversationScreenContent$31$4$1$3$1>) null), 3, (Object) null);
                                    }
                                    return C6514M.f71813a;
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                    invoke((C1088f) obj, (C1500m) obj2, ((Number) obj3).intValue());
                                    return C6514M.f71813a;
                                }

                                public final void invoke(C1088f fVar, C1500m mVar, int i10) {
                                    int i11;
                                    String str;
                                    JumpToBottomButtonState jumpToBottomButtonState;
                                    C1088f fVar2 = fVar;
                                    C1500m mVar2 = mVar;
                                    C6496s.h(fVar2, "$this$BoxWithConstraints");
                                    if ((i10 & 14) == 0) {
                                        i11 = i10 | (mVar2.S(fVar2) ? 4 : 2);
                                    } else {
                                        i11 = i10;
                                    }
                                    if ((i11 & 91) != 18 || !mVar.i()) {
                                        if (ConversationScreenKt.getLazyMessageListEnabled()) {
                                            mVar2.T(-1930801066);
                                            i a10 = n1.a(n.h(fVar2.e(i.f23074a, k0.c.f23044a.e()), ConversationScreenKt.getPaddingValuesForComposer(n12, ((ConversationUiState.Content) conversationUiState2).getBottomBarUiState(), mVar2, 64)), "message list");
                                            List<ContentRow> contentRows = ((ConversationUiState.Content) conversationUiState2).getContentRows();
                                            A a11 = a10;
                                            mVar2.T(1461756150);
                                            if (a11 == null) {
                                                a11 = B.c(0, 0, mVar2, 0, 3);
                                            }
                                            A a12 = a11;
                                            mVar.M();
                                            LazyMessageListKt.LazyMessageList(a10, contentRows, a12, lVar, lVar2, lVar3, lVar4, lVar5, aVar, lVar6, (((ConversationUiState.Content) conversationUiState2).getBottomBarUiState().getComposerState() instanceof ComposerState.TextInput) || (((ConversationUiState.Content) conversationUiState2).getBottomBarUiState().getComposerState() instanceof ComposerState.VoiceInput), lVar7, ((ConversationUiState.Content) conversationUiState2).getBottomBarUiState().getBottomBadge() instanceof BottomBarUiState.BottomBadgeState.PoweredByBadgeState, mVar, 64, 0, 0);
                                            mVar.M();
                                        } else {
                                            mVar2.T(-1928986915);
                                            MessageListKt.MessageList(n1.a(n.h(fVar2.e(i.f23074a, k0.c.f23044a.e()), ConversationScreenKt.getPaddingValuesForComposer(n12, ((ConversationUiState.Content) conversationUiState2).getBottomBarUiState(), mVar2, 64)), "message list"), ((ConversationUiState.Content) conversationUiState2).getContentRows(), oVar2, lVar, lVar2, lVar3, lVar4, lVar5, aVar, lVar6, (((ConversationUiState.Content) conversationUiState2).getBottomBarUiState().getComposerState() instanceof ComposerState.TextInput) || (((ConversationUiState.Content) conversationUiState2).getBottomBarUiState().getComposerState() instanceof ComposerState.VoiceInput), lVar7, mVar, 64, 0, 0);
                                            mVar.M();
                                        }
                                        FloatingIndicatorState floatingIndicatorState = ((ConversationUiState.Content) conversationUiState2).getFloatingIndicatorState();
                                        if (floatingIndicatorState instanceof FloatingIndicatorState.JumpToBottomIndicator) {
                                            mVar2.T(-1927157853);
                                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                            int i12 = IntercomTheme.$stable;
                                            long r92 = intercomTheme.getColors(mVar2, i12).m678getBackground0d7_KjU();
                                            long r11 = intercomTheme.getColors(mVar2, i12).m673getActionContrastWhite0d7_KjU();
                                            float f10 = (float) 24;
                                            i e10 = fVar2.e(n.l(i.f23074a, h.j(f10), h.j((float) 8), h.j(f10), n12.a()), k0.c.f23044a.b());
                                            FloatingIndicatorState floatingIndicatorState2 = ((ConversationUiState.Content) conversationUiState2).getFloatingIndicatorState();
                                            FloatingIndicatorState.JumpToBottomIndicator jumpToBottomIndicator = floatingIndicatorState2 instanceof FloatingIndicatorState.JumpToBottomIndicator ? (FloatingIndicatorState.JumpToBottomIndicator) floatingIndicatorState2 : null;
                                            if (!(jumpToBottomIndicator == null || (jumpToBottomButtonState = jumpToBottomIndicator.getJumpToBottomButtonState()) == null)) {
                                                Integer valueOf = Integer.valueOf(jumpToBottomButtonState.getUnreadMessages());
                                                if (valueOf.intValue() <= 0) {
                                                    valueOf = null;
                                                }
                                                if (valueOf != null) {
                                                    str = valueOf.toString();
                                                    long r15 = intercomTheme.getColors(mVar2, i12).m679getBadge0d7_KjU();
                                                    long r17 = ColorExtensionsKt.m712generateTextColor8_81llA(intercomTheme.getColors(mVar2, i12).m679getBadge0d7_KjU());
                                                    A a13 = a10;
                                                    K k10 = k10;
                                                    p pVar = pVar2;
                                                    o oVar = oVar2;
                                                    ConversationUiState conversationUiState = conversationUiState2;
                                                    C1500m mVar3 = mVar2;
                                                    JumpToBottomKt.m603JumpToBottomkNRdK3w(e10, r92, r11, str, r15, r17, new B0(a13, k10, pVar, oVar, conversationUiState, dVar3, fVar), mVar, 0, 0);
                                                    mVar.M();
                                                    return;
                                                }
                                            }
                                            str = null;
                                            long r152 = intercomTheme.getColors(mVar2, i12).m679getBadge0d7_KjU();
                                            long r172 = ColorExtensionsKt.m712generateTextColor8_81llA(intercomTheme.getColors(mVar2, i12).m679getBadge0d7_KjU());
                                            A a132 = a10;
                                            K k102 = k10;
                                            p pVar2 = pVar2;
                                            o oVar2 = oVar2;
                                            ConversationUiState conversationUiState2 = conversationUiState2;
                                            C1500m mVar32 = mVar2;
                                            JumpToBottomKt.m603JumpToBottomkNRdK3w(e10, r92, r11, str, r152, r172, new B0(a132, k102, pVar2, oVar2, conversationUiState2, dVar3, fVar), mVar, 0, 0);
                                            mVar.M();
                                            return;
                                        }
                                        C1500m mVar4 = mVar2;
                                        if (floatingIndicatorState instanceof FloatingIndicatorState.FooterNoticeIndicator) {
                                            mVar4.T(-1922664620);
                                            C1500m mVar5 = mVar4;
                                            FooterNoticeState footerNoticeState = ((FloatingIndicatorState.FooterNoticeIndicator) ((ConversationUiState.Content) conversationUiState2).getFloatingIndicatorState()).getFooterNoticeState();
                                            float f11 = (float) 24;
                                            FooterNoticeKt.FooterNoticePill(fVar2.e(n.m(i.f23074a, h.j(f11), 0.0f, h.j(f11), n12.a(), 2, (Object) null), k0.c.f23044a.b()), footerNoticeState.getTitle(), footerNoticeState.getAvatars(), new C0(a10, k10, oVar2), mVar, 512, 0);
                                            mVar.M();
                                            return;
                                        }
                                        C1500m mVar6 = mVar4;
                                        if (floatingIndicatorState instanceof FloatingIndicatorState.None) {
                                            mVar6.T(-1921079931);
                                            mVar.M();
                                            return;
                                        }
                                        mVar6.T(1461852304);
                                        mVar.M();
                                        throw new C6535s();
                                    }
                                    mVar.I();
                                }
                            };
                            C1087e.a(f10, (k0.c) null, false, c.e(432364561, true, r02, mVar, 54), mVar, 3078, 6);
                            mVar.M();
                        } else {
                            mVar2.T(-554872146);
                            mVar.M();
                            throw new C6535s();
                        }
                    } else {
                        mVar.I();
                    }
                }
            }, mVar4, 54), mVar4, 805309872, 496);
            return;
        }
        mVar.I();
    }
}
