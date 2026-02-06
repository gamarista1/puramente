package io.intercom.android.sdk.m5.conversation.ui.components.row;

import C.C1085c;
import C.C1090h;
import C.C1093k;
import C.a0;
import H0.F;
import J0.C1241g;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.q;
import io.intercom.android.sdk.m5.components.avatar.AvatarShape;
import io.intercom.android.sdk.m5.conversation.states.GroupingPosition;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.List;
import k0.c;
import k0.h;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import r0.g2;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$BubbleMessageRowKt$lambda-2$1  reason: invalid class name */
final class ComposableSingletons$BubbleMessageRowKt$lambda2$1 implements p {
    public static final ComposableSingletons$BubbleMessageRowKt$lambda2$1 INSTANCE = new ComposableSingletons$BubbleMessageRowKt$lambda2$1();

    ComposableSingletons$BubbleMessageRowKt$lambda2$1() {
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$1$lambda$0() {
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        C1500m mVar2 = mVar;
        if ((i10 & 11) != 2 || !mVar.i()) {
            i.a aVar = i.f23074a;
            i d10 = b.d(q.f(aVar, 0.0f, 1, (Object) null), IntercomTheme.INSTANCE.getColors(mVar2, IntercomTheme.$stable).m678getBackground0d7_KjU(), (g2) null, 2, (Object) null);
            F a10 = C1090h.a(C1085c.f882a.g(), c.f23044a.k(), mVar2, 0);
            int a11 = C1494j.a(mVar2, 0);
            C1523y p10 = mVar.p();
            i e10 = h.e(mVar2, d10);
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
            float f10 = (float) 16;
            a0.a(q.i(aVar, c1.h.j(f10)), mVar2, 6);
            Part build = new Part.Builder().withParticipantIsAdmin(true).withBlocks(C6565s.q(BubbleMessageRowKt.getParagraphBlock(), BubbleMessageRowKt.getLongParagraphBlock())).withMetadata(new io.intercom.android.sdk.models.Metadata("Bot", "AI Agent", 1726738186L, C6565s.e(new Avatar.Builder().withInitials("BB").withShape(AvatarShape.SQUIRCLE)))).build();
            C6496s.g(build, "build(...)");
            GroupingPosition groupingPosition = GroupingPosition.TOP;
            float f11 = f10;
            BubbleMessageRowKt.BubbleMessageRow(build, groupingPosition, true, (i) null, "10:08 AM", (C6798l) null, (List<String>) null, (List<String>) null, (C6798l) null, (PendingMessage.FailedImageUploadData) null, (FailedMessage) null, (C6798l) null, mVar, 25016, 0, 4072);
            float f12 = (float) 4;
            i.a aVar3 = aVar;
            a0.a(q.i(aVar3, c1.h.j(f12)), mVar, 6);
            Part build2 = new Part.Builder().withParticipantIsAdmin(true).withBlocks(C6565s.e(BubbleMessageRowKt.getParagraphBlock())).build();
            String str = "build(...)";
            C6496s.g(build2, str);
            float f13 = f12;
            BubbleMessageRowKt.BubbleMessageRow(build2, GroupingPosition.MIDDLE, true, (i) null, "11:08 AM", (C6798l) null, (List<String>) null, (List<String>) null, (C6798l) null, (PendingMessage.FailedImageUploadData) null, (FailedMessage) null, (C6798l) null, mVar, 25016, 0, 4072);
            i.a aVar4 = aVar3;
            a0.a(q.i(aVar4, c1.h.j(f13)), mVar, 6);
            Part build3 = new Part.Builder().withParticipantIsAdmin(true).withBlocks(C6565s.e(BubbleMessageRowKt.getLongParagraphBlock())).build();
            String str2 = str;
            C6496s.g(build3, str2);
            GroupingPosition groupingPosition2 = GroupingPosition.BOTTOM;
            BubbleMessageRowKt.BubbleMessageRow(build3, groupingPosition2, true, (i) null, "11:10 AM", (C6798l) null, (List<String>) null, (List<String>) null, (C6798l) null, (PendingMessage.FailedImageUploadData) null, (FailedMessage) null, (C6798l) null, mVar, 25016, 0, 4072);
            i.a aVar5 = aVar4;
            a0.a(q.i(aVar5, c1.h.j(f11)), mVar, 6);
            Part build4 = new Part.Builder().withParticipantIsAdmin(true).withBlocks(C6565s.e(BubbleMessageRowKt.getParagraphBlock())).withMetadata(new io.intercom.android.sdk.models.Metadata("Bob", (String) null, 1726738186L, C6565s.e(new Avatar.Builder().withInitials("SK")), 2, (DefaultConstructorMarker) null)).build();
            String str3 = str2;
            C6496s.g(build4, str3);
            GroupingPosition groupingPosition3 = GroupingPosition.STANDALONE;
            BubbleMessageRowKt.BubbleMessageRow(build4, groupingPosition3, true, (i) null, "11:10 AM", (C6798l) null, (List<String>) null, (List<String>) null, (C6798l) null, (PendingMessage.FailedImageUploadData) null, (FailedMessage) null, (C6798l) null, mVar, 25016, 0, 4072);
            i.a aVar6 = aVar5;
            a0.a(q.i(aVar6, c1.h.j(f11)), mVar, 6);
            Part build5 = new Part.Builder().withParticipantIsAdmin(true).withBlocks(C6565s.e(BubbleMessageRowKt.getParagraphBlock())).build();
            String str4 = str3;
            C6496s.g(build5, str4);
            BubbleMessageRowKt.BubbleMessageRow(build5, groupingPosition, false, (i) null, "11:10 AM", (C6798l) null, (List<String>) null, (List<String>) null, (C6798l) null, (PendingMessage.FailedImageUploadData) null, (FailedMessage) null, (C6798l) null, mVar, 25016, 0, 4072);
            i.a aVar7 = aVar6;
            a0.a(q.i(aVar7, c1.h.j(f13)), mVar, 6);
            Part build6 = new Part.Builder().withParticipantIsAdmin(true).withBlocks(C6565s.e(BubbleMessageRowKt.getLongParagraphBlock())).build();
            String str5 = str4;
            C6496s.g(build6, str5);
            C1500m mVar3 = mVar;
            BubbleMessageRowKt.BubbleMessageRow(build6, groupingPosition2, false, (i) null, "11:08 AM", (C6798l) null, (List<String>) null, (List<String>) null, (C6798l) null, (PendingMessage.FailedImageUploadData) null, (FailedMessage) null, (C6798l) null, mVar3, 25016, 0, 4072);
            a0.a(q.i(aVar7, c1.h.j(f11)), mVar, 6);
            Part build7 = new Part.Builder().withParticipantIsAdmin(true).withBlocks(C6565s.e(BubbleMessageRowKt.getLongParagraphBlock())).build();
            C6496s.g(build7, str5);
            BubbleMessageRowKt.BubbleMessageRow(build7, groupingPosition3, false, (i) null, "11:08 AM", (C6798l) null, (List<String>) null, (List<String>) null, (C6798l) null, (PendingMessage.FailedImageUploadData) null, new FailedMessage("Error message", new C6157y()), (C6798l) null, mVar3, 25016, 0, 3048);
            mVar.u();
            return;
        }
        mVar.I();
    }
}
