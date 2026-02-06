package io.intercom.android.sdk.m5.conversation.ui;

import C.C1085c;
import C.C1090h;
import C.C1092j;
import C.C1093k;
import C.j0;
import H0.F;
import J0.C1241g;
import Ug.K;
import Y.C1494j;
import Y.C1500m;
import Y.C1510r0;
import Y.C1523y;
import Y.F1;
import androidx.compose.foundation.layout.n;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.conversation.states.BottomSheetState;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiState;
import io.intercom.android.sdk.m5.conversation.ui.components.MediaInputSheetContentKt;
import io.intercom.android.sdk.m5.conversation.ui.components.TeammateSheetContentKt;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.GifGridKt;
import java.util.List;
import k0.c;
import k0.h;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.C6535s;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class ConversationScreenKt$ConversationScreenContent$30 implements q {
    final /* synthetic */ K $coroutineScope;
    final /* synthetic */ C6798l $onGifClick;
    final /* synthetic */ C6798l $onGifSearchQueryChange;
    final /* synthetic */ C6798l $onMediaSelected;
    final /* synthetic */ C1510r0 $openBottomSheet;
    final /* synthetic */ C6798l $trackClickedInput;
    final /* synthetic */ ConversationUiState $uiState;

    ConversationScreenKt$ConversationScreenContent$30(ConversationUiState conversationUiState, C6798l lVar, C6798l lVar2, C6798l lVar3, K k10, C1510r0 r0Var, C6798l lVar4) {
        this.$uiState = conversationUiState;
        this.$trackClickedInput = lVar;
        this.$onGifSearchQueryChange = lVar2;
        this.$onMediaSelected = lVar3;
        this.$coroutineScope = k10;
        this.$openBottomSheet = r0Var;
        this.$onGifClick = lVar4;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$3$lambda$0(C6798l lVar, K k10, C1510r0 r0Var, List list) {
        C6496s.h(k10, "$coroutineScope");
        C6496s.h(r0Var, "$openBottomSheet");
        C6496s.h(list, "it");
        ConversationScreenKt.ConversationScreenContent$hideBottomSheet(k10, r0Var);
        lVar.invoke(list);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$3$lambda$1(K k10, C1510r0 r0Var) {
        C6496s.h(k10, "$coroutineScope");
        C6496s.h(r0Var, "$openBottomSheet");
        ConversationScreenKt.ConversationScreenContent$hideBottomSheet(k10, r0Var);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$3$lambda$2(C6798l lVar, K k10, C1510r0 r0Var, Block block) {
        C6496s.h(k10, "$coroutineScope");
        C6496s.h(r0Var, "$openBottomSheet");
        C6496s.h(block, "it");
        ConversationScreenKt.ConversationScreenContent$hideBottomSheet(k10, r0Var);
        lVar.invoke(block);
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1092j) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1092j jVar, C1500m mVar, int i10) {
        C1500m mVar2 = mVar;
        C6496s.h(jVar, "$this$ModalBottomSheet");
        if ((i10 & 81) != 16 || !mVar.i()) {
            i.a aVar = i.f23074a;
            i c10 = j0.c(aVar);
            ConversationUiState conversationUiState = this.$uiState;
            C6798l lVar = this.$trackClickedInput;
            C6798l lVar2 = this.$onGifSearchQueryChange;
            C6798l lVar3 = this.$onMediaSelected;
            K k10 = this.$coroutineScope;
            C1510r0 r0Var = this.$openBottomSheet;
            C6798l lVar4 = this.$onGifClick;
            F a10 = C1090h.a(C1085c.f882a.g(), c.f23044a.k(), mVar2, 0);
            int a11 = C1494j.a(mVar2, 0);
            C1523y p10 = mVar.p();
            i e10 = h.e(mVar2, c10);
            C1241g.a aVar2 = C1241g.f3853J;
            C6787a a12 = aVar2.a();
            if (mVar.j() == null) {
                C1494j.c();
            }
            mVar.F();
            if (mVar.f()) {
                mVar2.U(a12);
            } else {
                mVar.q();
            }
            C1500m a13 = F1.a(mVar);
            F1.b(a13, a10, aVar2.c());
            F1.b(a13, p10, aVar2.e());
            p b10 = aVar2.b();
            if (a13.f() || !C6496s.c(a13.A(), Integer.valueOf(a11))) {
                a13.r(Integer.valueOf(a11));
                a13.V(Integer.valueOf(a11), b10);
            }
            F1.b(a13, e10, aVar2.d());
            C1093k kVar = C1093k.f978a;
            mVar2.T(-555043311);
            if (conversationUiState instanceof ConversationUiState.Content) {
                ConversationUiState.Content content = (ConversationUiState.Content) conversationUiState;
                BottomSheetState bottomSheetState = content.getBottomSheetState();
                if (bottomSheetState instanceof BottomSheetState.MediaInput) {
                    mVar2.T(-26360708);
                    MediaInputSheetContentKt.MediaInputSheetContent(n.i(androidx.compose.foundation.layout.q.v(aVar, (c.C0368c) null, false, 3, (Object) null), c1.h.j((float) 16)), new u0(lVar3, k10, r0Var), new v0(k10, r0Var), lVar, content.getBottomBarUiState().getInputTypeState(), mVar, 32774, 0);
                    mVar.M();
                } else if (bottomSheetState instanceof BottomSheetState.TeammatePresence) {
                    mVar2.T(-25543579);
                    TeammateSheetContentKt.TeammateSheetContent(n.i(androidx.compose.foundation.layout.q.v(aVar, (c.C0368c) null, false, 3, (Object) null), c1.h.j((float) 16)), content.getTeamPresenceState().getSpecialNotice(), content.getTeamPresenceState().getExpandedTeamPresenceState(), mVar, 518, 0);
                    mVar.M();
                } else if (bottomSheetState instanceof BottomSheetState.GifSearch) {
                    mVar2.T(-25017850);
                    GifGridKt.GifGrid(androidx.compose.foundation.layout.q.d(aVar, 0.0f, 1, (Object) null), ((BottomSheetState.GifSearch) content.getBottomSheetState()).getGifs(), new w0(lVar4, k10, r0Var), lVar2, mVar, 70, 0);
                    mVar.M();
                } else if (C6496s.c(bottomSheetState, BottomSheetState.Empty.INSTANCE)) {
                    mVar2.T(-24482542);
                    mVar.M();
                    ConversationScreenKt.ConversationScreenContent$hideBottomSheet(k10, r0Var);
                } else {
                    mVar2.T(-555041283);
                    mVar.M();
                    throw new C6535s();
                }
            }
            mVar.M();
            mVar.u();
            return;
        }
        mVar.I();
    }
}
