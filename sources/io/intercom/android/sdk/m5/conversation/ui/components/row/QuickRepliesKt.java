package io.intercom.android.sdk.m5.conversation.ui.components.row;

import C.C1085c;
import C.C1100s;
import C.C1106y;
import V.B0;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import androidx.compose.animation.g;
import androidx.compose.foundation.layout.q;
import c1.h;
import g0.c;
import io.intercom.android.sdk.m5.conversation.states.ReplySuggestion;
import io.intercom.android.sdk.models.ReplyOption;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import mf.C6565s;
import v.C2721d;
import w.C2763G;
import w.C2777V;
import yf.C6798l;

@Metadata(d1 = {"\u0000,\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u001a;\u0010\b\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\t\u001a;\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a;\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\u0012\u0010\u000e\u001a1\u0010\u0013\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u000f\u0010\u0015\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"", "Lio/intercom/android/sdk/m5/conversation/ui/components/row/QuickReply;", "quickReplies", "Lkotlin/Function1;", "Llf/M;", "onQuickReplyClick", "Lk0/i;", "modifier", "QuickReplies", "(Ljava/util/List;Lyf/l;Lk0/i;LY/m;II)V", "Lio/intercom/android/sdk/models/ReplyOption;", "replyOptions", "onReplyClicked", "ReplyOptions", "(Lk0/i;Ljava/util/List;Lyf/l;LY/m;II)V", "Lio/intercom/android/sdk/m5/conversation/states/ReplySuggestion;", "suggestions", "onSuggestionClick", "ComposerSuggestions", "AnimatedQuickReplies", "(Ljava/util/List;Lyf/l;LY/m;I)V", "QuickRepliesPreview", "(LY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class QuickRepliesKt {
    public static final void AnimatedQuickReplies(List<ReplyOption> list, C6798l lVar, C1500m mVar, int i10) {
        C6496s.h(list, "replyOptions");
        C6496s.h(lVar, "onReplyClicked");
        C1500m h10 = mVar.h(-2072519615);
        h10.T(-407353056);
        Object A10 = h10.A();
        C2777V v10 = A10;
        if (A10 == C1500m.f10026a.a()) {
            C2777V v11 = new C2777V(Boolean.FALSE);
            v11.h(Boolean.TRUE);
            h10.r(v11);
            v10 = v11;
        }
        h10.M();
        C2721d.f((C2777V) v10, (i) null, g.C((C2763G) null, new n0(), 1, (Object) null).c(g.o((C2763G) null, 0.0f, 3, (Object) null)), g.q((C2763G) null, 0.0f, 3, (Object) null), (String) null, c.e(992499481, true, new QuickRepliesKt$AnimatedQuickReplies$2(list, lVar), h10, 54), h10, C2777V.f27247d | 200064, 18);
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new o0(list, lVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final int AnimatedQuickReplies$lambda$13(int i10) {
        return i10 / 2;
    }

    /* access modifiers changed from: private */
    public static final C6514M AnimatedQuickReplies$lambda$14(List list, C6798l lVar, int i10, C1500m mVar, int i11) {
        C6496s.h(list, "$replyOptions");
        C6496s.h(lVar, "$onReplyClicked");
        AnimatedQuickReplies(list, lVar, mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void ComposerSuggestions(i iVar, List<ReplySuggestion> list, C6798l lVar, C1500m mVar, int i10, int i11) {
        C6496s.h(list, "suggestions");
        C6496s.h(lVar, "onSuggestionClick");
        C1500m h10 = mVar.h(-719570861);
        if ((i11 & 1) != 0) {
            iVar = i.f23074a;
        }
        Iterable<ReplySuggestion> iterable = list;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (ReplySuggestion replySuggestion : iterable) {
            arrayList.add(new QuickReply(replySuggestion.getId(), replySuggestion.getText()));
        }
        QuickReplies(arrayList, new q0(list, lVar), iVar, h10, ((i10 << 6) & 896) | 8, 0);
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new r0(iVar, list, lVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M ComposerSuggestions$lambda$10(i iVar, List list, C6798l lVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(list, "$suggestions");
        C6496s.h(lVar, "$onSuggestionClick");
        ComposerSuggestions(iVar, list, lVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ComposerSuggestions$lambda$9(List list, C6798l lVar, QuickReply quickReply) {
        Object obj;
        C6496s.h(list, "$suggestions");
        C6496s.h(lVar, "$onSuggestionClick");
        C6496s.h(quickReply, "quickReply");
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C6496s.c(((ReplySuggestion) obj).getId(), quickReply.getId())) {
                break;
            }
        }
        ReplySuggestion replySuggestion = (ReplySuggestion) obj;
        if (replySuggestion != null) {
            lVar.invoke(replySuggestion);
        }
        return C6514M.f71813a;
    }

    public static final void QuickReplies(List<QuickReply> list, C6798l lVar, i iVar, C1500m mVar, int i10, int i11) {
        i.a aVar;
        List<QuickReply> list2 = list;
        C6798l lVar2 = lVar;
        C6496s.h(list, "quickReplies");
        C6496s.h(lVar2, "onQuickReplyClick");
        C1500m h10 = mVar.h(368433331);
        if ((i11 & 4) != 0) {
            aVar = i.f23074a;
        } else {
            aVar = iVar;
        }
        i h11 = q.h(aVar, 0.0f, 1, (Object) null);
        C1085c cVar = C1085c.f882a;
        float f10 = (float) 8;
        float j10 = h.j(f10);
        c.a aVar2 = k0.c.f23044a;
        C1100s.a(h11, cVar.o(j10, aVar2.j()), cVar.p(h.j(f10), aVar2.a()), 0, 0, (C1106y) null, g0.c.e(-458232018, true, new QuickRepliesKt$QuickReplies$1(list, lVar2), h10, 54), h10, 1573296, 56);
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new p0(list, lVar, aVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M QuickReplies$lambda$0(List list, C6798l lVar, i iVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(list, "$quickReplies");
        C6496s.h(lVar, "$onQuickReplyClick");
        QuickReplies(list, lVar, iVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void QuickRepliesPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1503246755);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$QuickRepliesKt.INSTANCE.m304getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new k0(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M QuickRepliesPreview$lambda$15(int i10, C1500m mVar, int i11) {
        QuickRepliesPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void ReplyOptions(i iVar, List<ReplyOption> list, C6798l lVar, C1500m mVar, int i10, int i11) {
        C6496s.h(list, "replyOptions");
        C6496s.h(lVar, "onReplyClicked");
        C1500m h10 = mVar.h(-1003293676);
        if ((i11 & 1) != 0) {
            iVar = i.f23074a;
        }
        Iterable<ReplyOption> iterable = list;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (ReplyOption replyOption : iterable) {
            arrayList.add(new QuickReply(replyOption.getUuid(), replyOption.getText()));
        }
        QuickReplies(arrayList, new l0(list, lVar), iVar, h10, ((i10 << 6) & 896) | 8, 0);
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new m0(iVar, list, lVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M ReplyOptions$lambda$4(List list, C6798l lVar, QuickReply quickReply) {
        Object obj;
        C6496s.h(list, "$replyOptions");
        C6496s.h(lVar, "$onReplyClicked");
        C6496s.h(quickReply, "quickReply");
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C6496s.c(((ReplyOption) obj).getUuid(), quickReply.getId())) {
                break;
            }
        }
        ReplyOption replyOption = (ReplyOption) obj;
        if (replyOption != null) {
            lVar.invoke(replyOption);
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ReplyOptions$lambda$5(i iVar, List list, C6798l lVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(list, "$replyOptions");
        C6496s.h(lVar, "$onReplyClicked");
        ReplyOptions(iVar, list, lVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }
}
