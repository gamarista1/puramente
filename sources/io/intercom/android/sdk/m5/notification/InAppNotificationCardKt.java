package io.intercom.android.sdk.m5.notification;

import C.C1085c;
import C.C1090h;
import C.C1093k;
import C.W;
import C.Z;
import H0.F;
import J0.C1241g;
import Q0.A;
import Q0.C1321d;
import Q0.T;
import V.B0;
import V.T0;
import V.X;
import V0.o;
import X0.e;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.Y0;
import android.content.Context;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.n;
import androidx.compose.foundation.layout.q;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import b1.C1869a;
import b1.C1876h;
import b1.j;
import b1.k;
import b1.s;
import b1.t;
import c1.h;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.TicketHeaderKt;
import io.intercom.android.sdk.m5.components.TicketStatusHeaderArgs;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.MessageStyle;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.overlay.ComposeCompatibilityUtilKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import io.intercom.android.sdk.utilities.Phrase;
import java.util.List;
import java.util.Map;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import o0.C2349l;
import r0.C2544x0;
import r0.C2550z0;
import r0.e2;
import r0.g2;
import t0.C2606g;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a!\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a!\u0010\u000f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/platform/ComposeView;", "composeView", "Lio/intercom/android/sdk/models/Conversation;", "conversation", "Llf/M;", "addTicketHeaderToCompose", "(Landroidx/compose/ui/platform/ComposeView;Lio/intercom/android/sdk/models/Conversation;)V", "addInappNotificationCardToView", "Lk0/i;", "modifier", "InAppNotificationCard", "(Lio/intercom/android/sdk/models/Conversation;Lk0/i;LY/m;II)V", "", "name", "ticketStatus", "TicketInAppNotificationContent", "(Ljava/lang/String;Ljava/lang/String;LY/m;I)V", "InAppNotificationCardPreview", "(LY/m;I)V", "InAppNotificationCardTicketPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class InAppNotificationCardKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                io.intercom.android.sdk.models.MessageStyle[] r0 = io.intercom.android.sdk.models.MessageStyle.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.intercom.android.sdk.models.MessageStyle r1 = io.intercom.android.sdk.models.MessageStyle.TICKET_STATE_UPDATED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                io.intercom.android.sdk.models.MessageStyle r1 = io.intercom.android.sdk.models.MessageStyle.CHAT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.notification.InAppNotificationCardKt.WhenMappings.<clinit>():void");
        }
    }

    public static final void InAppNotificationCard(Conversation conversation, i iVar, C1500m mVar, int i10, int i11) {
        String str;
        int i12;
        IntercomTheme intercomTheme;
        int i13;
        i iVar2;
        Conversation conversation2 = conversation;
        int i14 = i11;
        C6496s.h(conversation2, "conversation");
        C1500m h10 = mVar.h(-320085669);
        i.a aVar = (i14 & 2) != 0 ? i.f23074a : iVar;
        Context context = (Context) h10.m(AndroidCompositionLocals_androidKt.g());
        float j10 = h.j((float) 2);
        IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
        int i15 = IntercomTheme.$stable;
        float f10 = (float) 16;
        i j11 = n.j(b.c(C2349l.b(aVar, j10, intercomTheme2.getShapes(h10, i15).e(), false, 0, 0, 24, (Object) null), X.f7146a.a(h10, X.f7147b).a(), intercomTheme2.getShapes(h10, i15).e()), h.j(f10), h.j(f10));
        c.a aVar2 = c.f23044a;
        F h11 = d.h(aVar2.o(), false);
        int a10 = C1494j.a(h10, 0);
        C1523y p10 = h10.p();
        i e10 = k0.h.e(h10, j11);
        C1241g.a aVar3 = C1241g.f3853J;
        C6787a a11 = aVar3.a();
        if (h10.j() == null) {
            C1494j.c();
        }
        h10.F();
        if (h10.f()) {
            h10.U(a11);
        } else {
            h10.q();
        }
        C1500m a12 = F1.a(h10);
        F1.b(a12, h11, aVar3.c());
        F1.b(a12, p10, aVar3.e());
        p b10 = aVar3.b();
        if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
            a12.r(Integer.valueOf(a10));
            a12.V(Integer.valueOf(a10), b10);
        }
        F1.b(a12, e10, aVar3.d());
        f fVar = f.f12848a;
        i.a aVar4 = i.f23074a;
        i h12 = q.h(aVar4, 0.0f, 1, (Object) null);
        C1085c cVar = C1085c.f882a;
        F b11 = W.b(cVar.n(h.j((float) 8)), aVar2.l(), h10, 54);
        int a13 = C1494j.a(h10, 0);
        C1523y p11 = h10.p();
        i e11 = k0.h.e(h10, h12);
        C6787a a14 = aVar3.a();
        if (h10.j() == null) {
            C1494j.c();
        }
        h10.F();
        if (h10.f()) {
            h10.U(a14);
        } else {
            h10.q();
        }
        C1500m a15 = F1.a(h10);
        F1.b(a15, b11, aVar3.c());
        F1.b(a15, p11, aVar3.e());
        p b12 = aVar3.b();
        if (a15.f() || !C6496s.c(a15.A(), Integer.valueOf(a13))) {
            a15.r(Integer.valueOf(a13));
            a15.V(Integer.valueOf(a13), b12);
        }
        F1.b(a15, e11, aVar3.d());
        Z z10 = Z.f873a;
        Avatar avatar = conversation.lastAdmin().getAvatar();
        C6496s.g(avatar, "getAvatar(...)");
        Boolean isBot = conversation.lastAdmin().isBot();
        C6496s.g(isBot, "isBot(...)");
        int i16 = i15;
        IntercomTheme intercomTheme3 = intercomTheme2;
        Context context2 = context;
        i iVar3 = aVar;
        AvatarIconKt.m208AvatarIconRd90Nhg(q.n(aVar4, h.j((float) 32)), new AvatarWrapper(avatar, isBot.booleanValue()), (g2) null, false, 0, (C2544x0) null, h10, 70, 60);
        F a16 = C1090h.a(cVar.n(h.j((float) 4)), aVar2.k(), h10, 6);
        int a17 = C1494j.a(h10, 0);
        C1523y p12 = h10.p();
        i e12 = k0.h.e(h10, aVar4);
        C6787a a18 = aVar3.a();
        if (h10.j() == null) {
            C1494j.c();
        }
        h10.F();
        if (h10.f()) {
            h10.U(a18);
        } else {
            h10.q();
        }
        C1500m a19 = F1.a(h10);
        F1.b(a19, a16, aVar3.c());
        F1.b(a19, p12, aVar3.e());
        p b13 = aVar3.b();
        if (a19.f() || !C6496s.c(a19.A(), Integer.valueOf(a17))) {
            a19.r(Integer.valueOf(a17));
            a19.V(Integer.valueOf(a17), b13);
        }
        F1.b(a19, e12, aVar3.d());
        C1093k kVar = C1093k.f978a;
        h10.T(110714318);
        if (conversation.getTicket() != null) {
            i12 = 1;
            str = null;
            TicketHeaderKt.TicketHeader((i) null, new TicketStatusHeaderArgs(conversation.getTicket().getTitle(), conversation.isRead() ? V0.p.f8210b.c() : V0.p.f8210b.d()), h10, 0, 1);
        } else {
            i12 = 1;
            str = null;
        }
        h10.M();
        if (!conversation.parts().isEmpty()) {
            h10.T(-862357444);
            Part part = conversation.parts().get(0);
            MessageStyle messageStyle = part.getMessageStyle();
            int i17 = messageStyle == null ? -1 : WhenMappings.$EnumSwitchMapping$0[messageStyle.ordinal()];
            if (i17 == i12) {
                iVar2 = iVar3;
                i13 = i16;
                intercomTheme = intercomTheme3;
                h10.T(-862205668);
                if (!C6496s.c(part.getEventData().getStatus(), MetricTracker.Action.SUBMITTED)) {
                    str = part.getParticipant().getForename();
                }
                TicketInAppNotificationContent(str, part.getEventData().getEventAsPlainText(), h10, 0);
                h10.M();
                C6514M m10 = C6514M.f71813a;
            } else if (i17 != 2) {
                h10.T(-861351804);
                h10.M();
                C6514M m11 = C6514M.f71813a;
                iVar2 = iVar3;
                i13 = i16;
                intercomTheme = intercomTheme3;
            } else {
                h10.T(-861741164);
                String summary = part.getSummary();
                C6496s.g(summary, "getSummary(...)");
                int i18 = i16;
                IntercomTheme intercomTheme4 = intercomTheme3;
                iVar2 = iVar3;
                i13 = i18;
                intercomTheme = intercomTheme4;
                T0.b(summary, (i) null, 0, 0, (V0.n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, 0, t.f19154a.b(), false, 2, 0, (C6798l) null, intercomTheme4.getTypography(h10, i18).getType04Point5(), h10, 0, 3120, 55294);
                h10.M();
                C6514M m12 = C6514M.f71813a;
            }
            h10.M();
        } else {
            iVar2 = iVar3;
            i13 = i16;
            intercomTheme = intercomTheme3;
            if (conversation.getTicket() != null) {
                h10.T(-861150955);
                Ticket ticket = conversation.getTicket();
                if (!C6496s.c(ticket.getCurrentStatus().getType(), MetricTracker.Action.SUBMITTED)) {
                    str = ticket.getAssignee().build().getForename();
                }
                TicketInAppNotificationContent(str, ticket.getCurrentStatus().getTitle(), h10, 0);
                h10.M();
            } else {
                h10.T(-860723713);
                h10.M();
            }
        }
        h10.T(110783162);
        if (conversation.getTicket() == null) {
            T0.b(Phrase.from(context2, R.string.intercom_reply_from_admin).put("name", (CharSequence) conversation.lastAdmin().getName()).format().toString(), (i) null, 0, 0, (V0.n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, 0, 0, false, 1, 0, (C6798l) null, T.c(intercomTheme.getTypography(h10, i13).getType04Point5(), C2550z0.d(4285887861L), 0, (V0.p) null, (V0.n) null, (o) null, (V0.h) null, (String) null, 0, (C1869a) null, (b1.o) null, (e) null, 0, (k) null, (e2) null, (C2606g) null, 0, 0, 0, (b1.q) null, (A) null, (C1876h) null, 0, 0, (s) null, 16777214, (Object) null), h10, 0, 3072, 57342);
        }
        h10.M();
        h10.u();
        h10.u();
        h10.u();
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new a(conversation2, iVar2, i10, i14));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M InAppNotificationCard$lambda$5(Conversation conversation, i iVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(conversation, "$conversation");
        InAppNotificationCard(conversation, iVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void InAppNotificationCardPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-2144100909);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$InAppNotificationCardKt.INSTANCE.m404getLambda1$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new c(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M InAppNotificationCardPreview$lambda$7(int i10, C1500m mVar, int i11) {
        InAppNotificationCardPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void InAppNotificationCardTicketPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-186124313);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$InAppNotificationCardKt.INSTANCE.m405getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new b(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M InAppNotificationCardTicketPreview$lambda$8(int i10, C1500m mVar, int i11) {
        InAppNotificationCardTicketPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    private static final void TicketInAppNotificationContent(String str, String str2, C1500m mVar, int i10) {
        int i11;
        C1321d dVar;
        int i12;
        int i13;
        String str3 = str;
        String str4 = str2;
        int i14 = i10;
        C1500m h10 = mVar.h(2076215052);
        if ((i14 & 14) == 0) {
            if (h10.S(str3)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i14;
        } else {
            i11 = i14;
        }
        if ((i14 & 112) == 0) {
            if (h10.S(str4)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 91) != 18 || !h10.i()) {
            if (str3 != null) {
                h10.T(856083707);
                dVar = new C1321d(Phrase.from((Context) h10.m(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_event_moved).put("teammate", (CharSequence) str3).put("status", (CharSequence) str4).format().toString(), (List) null, (List) null, 6, (DefaultConstructorMarker) null);
                h10.M();
            } else {
                h10.T(856363978);
                dVar = new C1321d(M0.i.a(R.string.intercom_tickets_status_description_prefix_when_submitted, h10, 0) + ' ' + str4, (List) null, (List) null, 6, (DefaultConstructorMarker) null);
                h10.M();
            }
            T0.c(dVar, (i) null, 0, 0, (V0.n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, 0, t.f19154a.b(), false, 2, 0, (Map) null, (C6798l) null, IntercomTheme.INSTANCE.getTypography(h10, IntercomTheme.$stable).getType05(), h10, 0, 3120, 120830);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new d(str3, str4, i14));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TicketInAppNotificationContent$lambda$6(String str, String str2, int i10, C1500m mVar, int i11) {
        C6496s.h(str2, "$ticketStatus");
        TicketInAppNotificationContent(str, str2, mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void addInappNotificationCardToView(ComposeView composeView, Conversation conversation) {
        C6496s.h(composeView, "composeView");
        C6496s.h(conversation, "conversation");
        if (!ComposeCompatibilityUtilKt.isLegacyActivity(composeView)) {
            composeView.setContent(g0.c.c(-1448950486, true, new InAppNotificationCardKt$addInappNotificationCardToView$1$1(conversation)));
        }
    }

    public static final void addTicketHeaderToCompose(ComposeView composeView, Conversation conversation) {
        C6496s.h(composeView, "composeView");
        C6496s.h(conversation, "conversation");
        if (!ComposeCompatibilityUtilKt.isLegacyActivity(composeView)) {
            composeView.setContent(g0.c.c(-744078063, true, new InAppNotificationCardKt$addTicketHeaderToCompose$1$1(conversation)));
        }
    }
}
