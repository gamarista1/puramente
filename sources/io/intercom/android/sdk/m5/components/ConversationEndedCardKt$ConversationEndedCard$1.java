package io.intercom.android.sdk.m5.components;

import C.C1085c;
import C.C1090h;
import C.C1092j;
import C.C1093k;
import C.a0;
import H0.F;
import J0.C1241g;
import V.T0;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import androidx.compose.foundation.layout.n;
import androidx.compose.ui.platform.n1;
import b1.j;
import b1.k;
import c1.h;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class ConversationEndedCardKt$ConversationEndedCard$1 implements q {
    final /* synthetic */ ComposerState.ConversationEnded $conversationEndedUiState;
    final /* synthetic */ C6787a $onButtonClick;

    ConversationEndedCardKt$ConversationEndedCard$1(ComposerState.ConversationEnded conversationEnded, C6787a aVar) {
        this.$conversationEndedUiState = conversationEnded;
        this.$onButtonClick = aVar;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$1$lambda$0() {
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1092j) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1092j jVar, C1500m mVar, int i10) {
        C1500m mVar2 = mVar;
        C6496s.h(jVar, "$this$Card");
        if ((i10 & 81) != 16 || !mVar.i()) {
            i.a aVar = i.f23074a;
            i i11 = n.i(androidx.compose.foundation.layout.q.h(aVar, 0.0f, 1, (Object) null), h.j((float) 20));
            C1085c.f b10 = C1085c.f882a.b();
            c.b g10 = c.f23044a.g();
            ComposerState.ConversationEnded conversationEnded = this.$conversationEndedUiState;
            C6787a aVar2 = this.$onButtonClick;
            F a10 = C1090h.a(b10, g10, mVar2, 54);
            int a11 = C1494j.a(mVar2, 0);
            C1523y p10 = mVar.p();
            i e10 = k0.h.e(mVar2, i11);
            C1241g.a aVar3 = C1241g.f3853J;
            C6787a a12 = aVar3.a();
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
            F1.b(a13, a10, aVar3.c());
            F1.b(a13, p10, aVar3.e());
            p b11 = aVar3.b();
            if (a13.f() || !C6496s.c(a13.A(), Integer.valueOf(a11))) {
                a13.r(Integer.valueOf(a11));
                a13.V(Integer.valueOf(a11), b11);
            }
            F1.b(a13, e10, aVar3.d());
            C1093k kVar = C1093k.f978a;
            StringProvider message = conversationEnded.getMessage();
            int i12 = StringProvider.$stable;
            int i13 = i12;
            C6787a aVar4 = aVar2;
            ComposerState.ConversationEnded conversationEnded2 = conversationEnded;
            i.a aVar5 = aVar;
            T0.b(message.getText(mVar2, i12), (i) null, 0, 0, (V0.n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, IntercomTheme.INSTANCE.getTypography(mVar2, IntercomTheme.$stable).getType04(), mVar, 0, 0, 65534);
            C1500m mVar3 = mVar;
            mVar3.T(-1044601143);
            if (conversationEnded2.getCta() != null) {
                i.a aVar6 = aVar5;
                a0.a(androidx.compose.foundation.layout.q.i(aVar6, h.j((float) 12)), mVar3, 6);
                IntercomPrimaryButtonKt.IntercomPrimaryButton(conversationEnded2.getCta().getTitle().getText(mVar3, i13), n1.a(aVar6, "start-new-conversation-button"), Integer.valueOf(conversationEnded2.getCta().getTrailingIcon()), aVar4 == null ? new P() : aVar4, mVar, 48, 0);
            }
            mVar.M();
            mVar.u();
            return;
        }
        mVar.I();
    }
}
