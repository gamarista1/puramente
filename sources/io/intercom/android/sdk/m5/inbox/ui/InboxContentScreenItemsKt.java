package io.intercom.android.sdk.m5.inbox.ui;

import D.x;
import V.B0;
import Xg.C5694f;
import Xg.N;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import g0.c;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.ComposerState;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.ConversationEndedButton;
import io.intercom.android.sdk.models.ConversationUiFlags;
import io.intercom.android.sdk.models.FooterNotice;
import io.intercom.android.sdk.models.Header;
import io.intercom.android.sdk.models.LastParticipatingAdmin;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.PoweredBy;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import m3.C2201F;
import mf.C6565s;
import n3.C2331a;
import n3.C2332b;
import qf.g;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a5\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LD/x;", "Ln3/a;", "Lio/intercom/android/sdk/models/Conversation;", "inboxConversations", "Lkotlin/Function1;", "Llf/M;", "onConversationClick", "inboxContentScreenItems", "(LD/x;Ln3/a;Lyf/l;)V", "InboxContentScreenPreview", "(LY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class InboxContentScreenItemsKt {
    @IntercomPreviews
    private static final void InboxContentScreenPreview(C1500m mVar, int i10) {
        int i11 = i10;
        C1500m h10 = mVar.h(1634106166);
        if (i11 != 0 || !h10.i()) {
            LastParticipatingAdmin.Builder withAvatar = new LastParticipatingAdmin.Builder().withFirstName("Santhosh Kumar").withAvatar(new Avatar.Builder().withInitials("SK"));
            C6496s.g(withAvatar, "withAvatar(...)");
            InboxContentScreenPreview$DisplayPaging(N.a(C2201F.f23775e.a(C6565s.e(new Conversation("123", false, (List) null, C6565s.e(new Part.Builder().withSummary("This is the last message received/sent to/from this user").withCreatedAt(1659081886)), (List) null, withAvatar, (ComposerState) null, false, false, (String) null, (String) null, false, (Ticket) null, (ConversationUiFlags) null, (Header) null, (ConversationEndedButton) null, (FooterNotice) null, (PoweredBy) null, (String) null, (String) null, 1048534, (DefaultConstructorMarker) null)))), h10, 8);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new f(i11));
        }
    }

    private static final void InboxContentScreenPreview$DisplayPaging(C5694f fVar, C1500m mVar, int i10) {
        mVar.T(1509694910);
        IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, c.e(853574228, true, new InboxContentScreenItemsKt$InboxContentScreenPreview$DisplayPaging$1(C2332b.b(fVar, (g) null, mVar, 8, 1)), mVar, 54), mVar, 3072, 7);
        mVar.M();
    }

    /* access modifiers changed from: private */
    public static final C6514M InboxContentScreenPreview$lambda$0(int i10, C1500m mVar, int i11) {
        InboxContentScreenPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void inboxContentScreenItems(x xVar, C2331a aVar, C6798l lVar) {
        C6496s.h(xVar, "<this>");
        C6496s.h(aVar, "inboxConversations");
        C6496s.h(lVar, "onConversationClick");
        x.e(xVar, aVar.g(), (C6798l) null, (C6798l) null, c.c(-1371545107, true, new InboxContentScreenItemsKt$inboxContentScreenItems$1(aVar, lVar)), 6, (Object) null);
    }
}
