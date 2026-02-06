package io.intercom.android.sdk.m5.components;

import C.N;
import H0.F;
import J0.C1241g;
import V.B0;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.Y0;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.q;
import c1.h;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.ComposerState;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.ConversationEndedButton;
import io.intercom.android.sdk.models.ConversationUiFlags;
import io.intercom.android.sdk.models.FooterNotice;
import io.intercom.android.sdk.models.Header;
import io.intercom.android.sdk.models.LastParticipatingAdmin;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.models.PoweredBy;
import io.intercom.android.sdk.models.TeamPresence;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import java.util.ArrayList;
import java.util.List;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import q0.C2422h;
import q0.C2427m;
import r0.C2547y0;
import r0.C2550z0;
import t0.C2605f;
import t0.C2606g;
import x.C2870i;
import yf.C6787a;
import yf.p;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aC\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0013\u001a\u0019\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u000f\u0010\u0017\u001a\u00020\tH\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u000f\u0010\u0019\u001a\u00020\tH\u0001¢\u0006\u0004\b\u0019\u0010\u0018\u001a\u000f\u0010\u001a\u001a\u00020\tH\u0001¢\u0006\u0004\b\u001a\u0010\u0018\u001a\u000f\u0010\u001b\u001a\u00020\tH\u0001¢\u0006\u0004\b\u001b\u0010\u0018\u001a%\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\u001b\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lio/intercom/android/sdk/models/Conversation;", "conversation", "Lk0/i;", "modifier", "LC/N;", "contentPadding", "", "showUnreadIndicator", "Lkotlin/Function0;", "Llf/M;", "onClick", "ConversationItem", "(Lio/intercom/android/sdk/models/Conversation;Lk0/i;LC/N;ZLyf/a;LY/m;II)V", "", "Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "getActiveAdminsAvatars", "()Ljava/util/List;", "", "getWorkspaceName", "()Ljava/lang/String;", "getUserIntercomId", "UnreadIndicator", "(Lk0/i;LY/m;II)V", "ReadConversationWithSimpleTicketHeaderPreview", "(LY/m;I)V", "UnreadConversationWithSimpleTicketHeaderPreview", "UnreadConversationCardPreview", "UnreadConversationCardWithBotPreview", "Lio/intercom/android/sdk/models/Ticket;", "ticket", "isRead", "sampleConversation", "(Lio/intercom/android/sdk/models/Ticket;Z)Lio/intercom/android/sdk/models/Conversation;", "sampleConversationWithBot", "(Lio/intercom/android/sdk/models/Ticket;)Lio/intercom/android/sdk/models/Conversation;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ConversationItemKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: yf.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void ConversationItem(io.intercom.android.sdk.models.Conversation r21, k0.i r22, C.N r23, boolean r24, yf.C6787a r25, Y.C1500m r26, int r27, int r28) {
        /*
            r1 = r21
            r5 = r25
            r6 = r27
            java.lang.String r0 = "conversation"
            kotlin.jvm.internal.C6496s.h(r1, r0)
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C6496s.h(r5, r0)
            r0 = -1756864283(0xffffffff974860e5, float:-6.4745783E-25)
            r2 = r26
            Y.m r0 = r2.h(r0)
            r2 = r28 & 2
            if (r2 == 0) goto L_0x0020
            k0.i$a r2 = k0.i.f23074a
            goto L_0x0022
        L_0x0020:
            r2 = r22
        L_0x0022:
            r3 = r28 & 4
            r4 = 0
            if (r3 == 0) goto L_0x0031
            float r3 = (float) r4
            float r3 = c1.h.j(r3)
            C.N r3 = androidx.compose.foundation.layout.n.a(r3)
            goto L_0x0033
        L_0x0031:
            r3 = r23
        L_0x0033:
            r7 = r28 & 8
            r14 = 1
            if (r7 == 0) goto L_0x003f
            boolean r7 = r21.isRead()
            r7 = r7 ^ r14
            r15 = r7
            goto L_0x0041
        L_0x003f:
            r15 = r24
        L_0x0041:
            Y.I0 r7 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r7 = r0.m(r7)
            r13 = r7
            android.content.Context r13 = (android.content.Context) r13
            r7 = -437498000(0xffffffffe5ec4f70, float:-1.3949298E23)
            r0.T(r7)
            r7 = 57344(0xe000, float:8.0356E-41)
            r7 = r7 & r6
            r7 = r7 ^ 24576(0x6000, float:3.4438E-41)
            r8 = 16384(0x4000, float:2.2959E-41)
            if (r7 <= r8) goto L_0x0062
            boolean r7 = r0.S(r5)
            if (r7 != 0) goto L_0x0066
        L_0x0062:
            r7 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r7 != r8) goto L_0x0067
        L_0x0066:
            r4 = r14
        L_0x0067:
            java.lang.Object r7 = r0.A()
            if (r4 != 0) goto L_0x0075
            Y.m$a r4 = Y.C1500m.f10026a
            java.lang.Object r4 = r4.a()
            if (r7 != r4) goto L_0x007d
        L_0x0075:
            io.intercom.android.sdk.m5.components.a0 r7 = new io.intercom.android.sdk.m5.components.a0
            r7.<init>(r5)
            r0.r(r7)
        L_0x007d:
            r11 = r7
            yf.a r11 = (yf.C6787a) r11
            r0.M()
            r12 = 7
            r4 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r7 = r2
            r14 = r13
            r13 = r4
            k0.i r7 = androidx.compose.foundation.d.d(r7, r8, r9, r10, r11, r12, r13)
            io.intercom.android.sdk.m5.components.ConversationItemKt$ConversationItem$2 r4 = new io.intercom.android.sdk.m5.components.ConversationItemKt$ConversationItem$2
            r4.<init>(r3, r1, r15, r14)
            r8 = 54
            r9 = 1413097514(0x543a282a, float:3.19815103E12)
            r10 = 1
            g0.a r16 = g0.c.e(r9, r10, r4, r0, r8)
            r18 = 12582912(0xc00000, float:1.7632415E-38)
            r19 = 126(0x7e, float:1.77E-43)
            r8 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r4 = 0
            r20 = r15
            r15 = r4
            r17 = r0
            V.O0.a(r7, r8, r9, r11, r13, r14, r15, r16, r17, r18, r19)
            Y.Y0 r8 = r0.k()
            if (r8 == 0) goto L_0x00cb
            io.intercom.android.sdk.m5.components.b0 r9 = new io.intercom.android.sdk.m5.components.b0
            r0 = r9
            r1 = r21
            r4 = r20
            r5 = r25
            r6 = r27
            r7 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x00cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.components.ConversationItemKt.ConversationItem(io.intercom.android.sdk.models.Conversation, k0.i, C.N, boolean, yf.a, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationItem$lambda$1$lambda$0(C6787a aVar) {
        C6496s.h(aVar, "$onClick");
        aVar.invoke();
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationItem$lambda$2(Conversation conversation, i iVar, N n10, boolean z10, C6787a aVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(conversation, "$conversation");
        C6496s.h(aVar, "$onClick");
        ConversationItem(conversation, iVar, n10, z10, aVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void ReadConversationWithSimpleTicketHeaderPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1446702226);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$ConversationItemKt.INSTANCE.m152getLambda1$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new X(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M ReadConversationWithSimpleTicketHeaderPreview$lambda$7(int i10, C1500m mVar, int i11) {
        ReadConversationWithSimpleTicketHeaderPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void UnreadConversationCardPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1292079862);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$ConversationItemKt.INSTANCE.m154getLambda3$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new W(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M UnreadConversationCardPreview$lambda$9(int i10, C1500m mVar, int i11) {
        UnreadConversationCardPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void UnreadConversationCardWithBotPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-516742229);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$ConversationItemKt.INSTANCE.m155getLambda4$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new Y(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M UnreadConversationCardWithBotPreview$lambda$10(int i10, C1500m mVar, int i11) {
        UnreadConversationCardWithBotPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void UnreadConversationWithSimpleTicketHeaderPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1866912491);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$ConversationItemKt.INSTANCE.m153getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new Z(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M UnreadConversationWithSimpleTicketHeaderPreview$lambda$8(int i10, C1500m mVar, int i11) {
        UnreadConversationWithSimpleTicketHeaderPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void UnreadIndicator(i iVar, C1500m mVar, int i10, int i11) {
        int i12;
        int i13;
        C1500m h10 = mVar.h(481161991);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (h10.S(iVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        if ((i12 & 11) != 2 || !h10.i()) {
            if (i14 != 0) {
                iVar = i.f23074a;
            }
            i n10 = q.n(iVar, h.j((float) 16));
            F h11 = d.h(c.f23044a.f(), false);
            int a10 = C1494j.a(h10, 0);
            C1523y p10 = h10.p();
            i e10 = k0.h.e(h10, n10);
            C1241g.a aVar = C1241g.f3853J;
            C6787a a11 = aVar.a();
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
            F1.b(a12, h11, aVar.c());
            F1.b(a12, p10, aVar.e());
            p b10 = aVar.b();
            if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
                a12.r(Integer.valueOf(a10));
                a12.V(Integer.valueOf(a10), b10);
            }
            F1.b(a12, e10, aVar.d());
            f fVar = f.f12848a;
            C2870i.a(q.n(i.f23074a, h.j((float) 8)), new C6018c0(), h10, 54);
            h10.u();
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6020d0(iVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M UnreadIndicator$lambda$5$lambda$4(C2605f fVar) {
        C6496s.h(fVar, "$this$Canvas");
        C2605f.n0(fVar, C2550z0.d(4292544041L), 0.0f, C2422h.a(C2427m.k(fVar.d()) / 2.0f, C2427m.i(fVar.d()) / 2.0f), 0.0f, (C2606g) null, (C2547y0) null, 0, 122, (Object) null);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M UnreadIndicator$lambda$6(i iVar, int i10, int i11, C1500m mVar, int i12) {
        UnreadIndicator(iVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final List<AvatarWrapper> getActiveAdminsAvatars() {
        Iterable<Participant> V02 = C6565s.V0(((TeamPresence) Injector.get().getDataLayer().getTeamPresence().getValue()).getBuiltActiveAdmins(), 3);
        ArrayList arrayList = new ArrayList(C6565s.y(V02, 10));
        for (Participant participant : V02) {
            Avatar avatar = participant.getAvatar();
            C6496s.g(avatar, "getAvatar(...)");
            Boolean isBot = participant.isBot();
            C6496s.g(isBot, "isBot(...)");
            arrayList.add(new AvatarWrapper(avatar, isBot.booleanValue()));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static final String getUserIntercomId() {
        if (Injector.isNotInitialised()) {
            return "";
        }
        String intercomId = Injector.get().getUserIdentity().getIntercomId();
        C6496s.g(intercomId, "getIntercomId(...)");
        return intercomId;
    }

    /* access modifiers changed from: private */
    public static final String getWorkspaceName() {
        return Injector.get().getAppConfigProvider().get().getName();
    }

    /* access modifiers changed from: private */
    public static final Conversation sampleConversation(Ticket ticket, boolean z10) {
        boolean z11 = z10;
        LastParticipatingAdmin.Builder withAvatar = new LastParticipatingAdmin.Builder().withFirstName("Santhosh Kumar").withAvatar(new Avatar.Builder().withInitials("SK"));
        LastParticipatingAdmin.Builder builder = withAvatar;
        C6496s.g(withAvatar, "withAvatar(...)");
        return new Conversation("123", z11, (List) null, C6565s.e(new Part.Builder().withSummary("This is the last message received/sent to/from this user").withCreatedAt(1659081886)), (List) null, builder, (ComposerState) null, false, false, (String) null, (String) null, false, ticket, (ConversationUiFlags) null, (Header) null, (ConversationEndedButton) null, (FooterNotice) null, (PoweredBy) null, (String) null, (String) null, 1044436, (DefaultConstructorMarker) null);
    }

    static /* synthetic */ Conversation sampleConversation$default(Ticket ticket, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            ticket = null;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return sampleConversation(ticket, z10);
    }

    private static final Conversation sampleConversationWithBot(Ticket ticket) {
        LastParticipatingAdmin.Builder withIsBot = new LastParticipatingAdmin.Builder().withFirstName("Operator").withAvatar(new Avatar.Builder().withInitials("O")).withIsBot(Boolean.TRUE);
        LastParticipatingAdmin.Builder builder = withIsBot;
        C6496s.g(withIsBot, "withIsBot(...)");
        return new Conversation("123", false, (List) null, C6565s.e(new Part.Builder().withSummary("This is the last message received/sent to/from this user").withCreatedAt(1659081886)), (List) null, builder, (ComposerState) null, false, false, (String) null, (String) null, false, ticket, (ConversationUiFlags) null, (Header) null, (ConversationEndedButton) null, (FooterNotice) null, (PoweredBy) null, (String) null, (String) null, 1044438, (DefaultConstructorMarker) null);
    }

    static /* synthetic */ Conversation sampleConversationWithBot$default(Ticket ticket, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            ticket = null;
        }
        return sampleConversationWithBot(ticket);
    }
}
