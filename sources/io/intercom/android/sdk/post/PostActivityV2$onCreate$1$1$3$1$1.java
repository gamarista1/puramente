package io.intercom.android.sdk.post;

import C.Y;
import O0.g;
import V.T0;
import V0.h;
import V0.n;
import V0.p;
import Y.C1500m;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.compose.foundation.d;
import androidx.compose.ui.viewinterop.e;
import b1.j;
import b1.k;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.activities.ConversationReactionListener;
import io.intercom.android.sdk.conversation.ReactionInputView;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.ReactionReply;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import r0.C2550z0;
import yf.C6798l;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class PostActivityV2$onCreate$1$1$3$1$1 implements q {
    final /* synthetic */ Part $part;
    final /* synthetic */ PostActivityV2 this$0;

    PostActivityV2$onCreate$1$1$3$1$1(Part part, PostActivityV2 postActivityV2) {
        this.$part = part;
        this.this$0 = postActivityV2;
    }

    /* access modifiers changed from: private */
    public static final ReactionInputView invoke$lambda$1(Part part, PostActivityV2 postActivityV2, Context context) {
        C6496s.h(part, "$part");
        C6496s.h(postActivityV2, "this$0");
        C6496s.h(context, "it");
        ReactionInputView reactionInputView = new ReactionInputView(context, (AttributeSet) null);
        reactionInputView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        reactionInputView.setUpReactions(part.getReactionReply(), true, new ConversationReactionListener(MetricTracker.ReactionLocation.IN_APP, part.getId(), postActivityV2.getConversationId(), postActivityV2.getInjector().getApi(), postActivityV2.getInjector().getMetricTracker()));
        return reactionInputView;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$2(PostActivityV2 postActivityV2) {
        C6496s.h(postActivityV2, "this$0");
        postActivityV2.openConversation();
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$3(PostActivityV2 postActivityV2) {
        C6496s.h(postActivityV2, "this$0");
        postActivityV2.openConversation();
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((Y) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(Y y10, C1500m mVar, int i10) {
        C1500m mVar2 = mVar;
        C6496s.h(y10, "$this$BottomBarContent");
        if ((i10 & 81) == 16 && mVar.i()) {
            mVar.I();
        } else if (!ReactionReply.isNull(this.$part.getReactionReply())) {
            mVar2.T(1850078684);
            e.a(new e(this.$part, this.this$0), (i) null, (C6798l) null, mVar, 0, 6);
            mVar.M();
        } else if (this.this$0.isComposerVisible()) {
            mVar2.T(1851871135);
            i.a aVar = i.f23074a;
            i d10 = d.d(aVar, false, (String) null, (g) null, new f(this.this$0), 7, (Object) null);
            String string = this.this$0.getString(R.string.intercom_reply_to_conversation);
            C6496s.g(string, "getString(...)");
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i11 = IntercomTheme.$stable;
            C1500m mVar3 = mVar;
            T0.b(string, d10, C2550z0.d(4288585374L), 0, (n) null, (p) null, (h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, intercomTheme.getTypography(mVar2, i11).getType04(), mVar3, 384, 0, 65528);
            i d11 = d.d(aVar, false, (String) null, (g) null, new g(this.this$0), 7, (Object) null);
            String string2 = this.this$0.getString(R.string.intercom_send);
            C6496s.g(string2, "getString(...)");
            T0.b(string2, d11, C2550z0.d(4288585374L), 0, (n) null, (p) null, (h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, intercomTheme.getTypography(mVar, i11).getType04(), mVar3, 384, 0, 65528);
            mVar.M();
        } else {
            mVar.T(1852835235);
            mVar.M();
        }
    }
}
