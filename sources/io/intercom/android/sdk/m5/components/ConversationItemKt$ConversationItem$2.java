package io.intercom.android.sdk.m5.components;

import C.C1085c;
import C.C1090h;
import C.C1093k;
import C.N;
import C.W;
import C.Y;
import C.Z;
import C.a0;
import H0.F;
import J0.C1241g;
import Q0.A;
import Q0.T;
import V.T0;
import V0.o;
import X0.e;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import android.content.Context;
import androidx.compose.foundation.layout.n;
import androidx.compose.foundation.layout.q;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b1.C1869a;
import b1.C1876h;
import b1.j;
import b1.k;
import b1.s;
import b1.t;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.LastParticipatingAdmin;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.GroupConversationTextFormatter;
import io.intercom.android.sdk.utilities.TimeFormatterExtKt;
import java.util.List;
import k0.c;
import k0.h;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import mf.C6565s;
import r0.e2;
import r0.g2;
import t0.C2606g;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class ConversationItemKt$ConversationItem$2 implements p {
    final /* synthetic */ N $contentPadding;
    final /* synthetic */ Context $context;
    final /* synthetic */ Conversation $conversation;
    final /* synthetic */ boolean $showUnreadIndicator;

    ConversationItemKt$ConversationItem$2(N n10, Conversation conversation, boolean z10, Context context) {
        this.$contentPadding = n10;
        this.$conversation = conversation;
        this.$showUnreadIndicator = z10;
        this.$context = context;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        List list;
        i.a aVar;
        Context context;
        Conversation conversation;
        boolean z10;
        Context context2;
        String str;
        C1500m mVar2 = mVar;
        if ((i10 & 11) != 2 || !mVar.i()) {
            i.a aVar2 = i.f23074a;
            i h10 = n.h(aVar2, this.$contentPadding);
            c.a aVar3 = c.f23044a;
            c.C0368c i11 = aVar3.i();
            Conversation conversation2 = this.$conversation;
            boolean z11 = this.$showUnreadIndicator;
            Context context3 = this.$context;
            C1085c cVar = C1085c.f882a;
            F b10 = W.b(cVar.f(), i11, mVar2, 48);
            int a10 = C1494j.a(mVar2, 0);
            C1523y p10 = mVar.p();
            i e10 = h.e(mVar2, h10);
            C1241g.a aVar4 = C1241g.f3853J;
            C6787a a11 = aVar4.a();
            if (mVar.j() == null) {
                C1494j.c();
            }
            mVar.F();
            if (mVar.f()) {
                mVar2.U(a11);
            } else {
                mVar.q();
            }
            C1500m a12 = F1.a(mVar);
            F1.b(a12, b10, aVar4.c());
            F1.b(a12, p10, aVar4.e());
            p b11 = aVar4.b();
            if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
                a12.r(Integer.valueOf(a10));
                a12.V(Integer.valueOf(a10), b11);
            }
            F1.b(a12, e10, aVar4.d());
            Z z12 = Z.f873a;
            if (LastParticipatingAdmin.isNull(conversation2.lastParticipatingAdmin())) {
                list = ConversationItemKt.getActiveAdminsAvatars();
            } else {
                Avatar avatar = conversation2.lastParticipatingAdmin().getAvatar();
                C6496s.g(avatar, "getAvatar(...)");
                list = C6565s.e(new AvatarWrapper(avatar, conversation2.lastParticipatingAdmin().isBot()));
            }
            AvatarTriangleGroupKt.m137AvatarTriangleGroupjt2gSs(list, z12.c(aVar2, aVar3.i()), (g2) null, c1.h.j((float) 32), mVar, 3080, 4);
            a0.a(q.r(aVar2, c1.h.j((float) 12)), mVar2, 6);
            i b12 = Y.b(z12, aVar2, 2.0f, false, 2, (Object) null);
            F a13 = C1090h.a(cVar.g(), aVar3.k(), mVar2, 0);
            int a14 = C1494j.a(mVar2, 0);
            C1523y p11 = mVar.p();
            i e11 = h.e(mVar2, b12);
            C6787a a15 = aVar4.a();
            if (mVar.j() == null) {
                C1494j.c();
            }
            mVar.F();
            if (mVar.f()) {
                mVar2.U(a15);
            } else {
                mVar.q();
            }
            C1500m a16 = F1.a(mVar);
            F1.b(a16, a13, aVar4.c());
            F1.b(a16, p11, aVar4.e());
            p b13 = aVar4.b();
            if (a16.f() || !C6496s.c(a16.A(), Integer.valueOf(a14))) {
                a16.r(Integer.valueOf(a14));
                a16.V(Integer.valueOf(a14), b13);
            }
            F1.b(a16, e11, aVar4.d());
            C1093k kVar = C1093k.f978a;
            mVar2.T(-1283476508);
            if (conversation2.getTicket() != null) {
                TicketHeaderKt.TicketHeader((i) null, new TicketStatusHeaderArgs(conversation2.getTicket().getTitle(), conversation2.isRead() ? V0.p.f8210b.c() : V0.p.f8210b.d()), mVar2, 0, 1);
            }
            mVar.M();
            String summary = conversation2.lastPart().getSummary();
            String str2 = "";
            if (summary.length() == 0) {
                summary = conversation2.getTicket() != null ? conversation2.getTicket().getCurrentStatus().getStatusDetail() : str2;
            }
            mVar2.T(-1283454258);
            C6496s.e(summary);
            if (summary.length() > 0) {
                mVar2.T(-1283451787);
                if (conversation2.lastPart().getParticipant().isUserWithId(ConversationItemKt.getUserIntercomId())) {
                    summary = ((Context) mVar2.m(AndroidCompositionLocals_androidKt.g())).getString(R.string.intercom_you) + ": " + summary;
                }
                mVar.M();
                C6496s.e(summary);
                context = context3;
                z10 = z11;
                conversation = conversation2;
                aVar = aVar2;
                T0.b(summary, n.m(aVar2, 0.0f, 0.0f, 0.0f, c1.h.j((float) 4), 7, (Object) null), 0, 0, (V0.n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, 0, t.f19154a.b(), false, 1, 0, (C6798l) null, T.c(IntercomTheme.INSTANCE.getTypography(mVar2, IntercomTheme.$stable).getType04(), 0, 0, conversation2.isRead() ? V0.p.f8210b.c() : V0.p.f8210b.d(), (V0.n) null, (o) null, (V0.h) null, (String) null, 0, (C1869a) null, (b1.o) null, (e) null, 0, (k) null, (e2) null, (C2606g) null, 0, 0, 0, (b1.q) null, (A) null, (C1876h) null, 0, 0, (s) null, 16777211, (Object) null), mVar, 48, 3120, 55292);
            } else {
                context = context3;
                z10 = z11;
                conversation = conversation2;
                aVar = aVar2;
            }
            mVar.M();
            C1500m mVar3 = mVar;
            F b14 = W.b(cVar.f(), aVar3.l(), mVar3, 0);
            int a17 = C1494j.a(mVar3, 0);
            C1523y p12 = mVar.p();
            i.a aVar5 = aVar;
            i e12 = h.e(mVar3, aVar5);
            C6787a a18 = aVar4.a();
            if (mVar.j() == null) {
                C1494j.c();
            }
            mVar.F();
            if (mVar.f()) {
                mVar3.U(a18);
            } else {
                mVar.q();
            }
            C1500m a19 = F1.a(mVar);
            F1.b(a19, b14, aVar4.c());
            F1.b(a19, p12, aVar4.e());
            p b15 = aVar4.b();
            if (a19.f() || !C6496s.c(a19.A(), Integer.valueOf(a17))) {
                a19.r(Integer.valueOf(a17));
                a19.V(Integer.valueOf(a17), b15);
            }
            F1.b(a19, e12, aVar4.d());
            String firstName = conversation.lastParticipatingAdmin().getFirstName();
            C6496s.g(firstName, "getFirstName(...)");
            if (firstName.length() == 0) {
                str = ConversationItemKt.getWorkspaceName();
                context2 = context;
            } else {
                String firstName2 = conversation.lastParticipatingAdmin().getFirstName();
                C6496s.g(firstName2, "getFirstName(...)");
                context2 = context;
                str = GroupConversationTextFormatter.groupConversationSubtitle(firstName2, conversation.groupConversationParticipants().size(), context2).toString();
            }
            String formattedDateFromLong = TimeFormatterExtKt.formattedDateFromLong(conversation.lastPart().getCreatedAt(), context2);
            if (formattedDateFromLong.length() == 0) {
                if (conversation.getTicket() != null) {
                    str2 = TimeFormatterExtKt.formattedDateFromLong(conversation.getTicket().getCurrentStatus().getCreatedDate(), context2);
                }
                formattedDateFromLong = str2;
            }
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i12 = IntercomTheme.$stable;
            i.a aVar6 = aVar5;
            TextWithSeparatorKt.m206TextWithSeparatorwV1YYcM(str, formattedDateFromLong, (i) null, (String) null, intercomTheme.getTypography(mVar3, i12).getType04(), intercomTheme.getColors(mVar3, i12).m686getDescriptionText0d7_KjU(), 0, 0, (j) null, mVar, 0, 460);
            mVar.u();
            mVar.u();
            if (z10) {
                mVar3.T(-1055527017);
                ConversationItemKt.UnreadIndicator((i) null, mVar3, 0, 1);
                mVar.M();
            } else {
                mVar3.T(-1055471186);
                IntercomChevronKt.IntercomChevron(n.m(aVar6, c1.h.j((float) 6), 0.0f, 0.0f, 0.0f, 14, (Object) null), mVar3, 6, 0);
                mVar.M();
            }
            mVar.u();
            return;
        }
        mVar.I();
    }
}
