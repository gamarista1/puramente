package io.intercom.android.sdk.m5.conversation.ui.components.row;

import C.C1085c;
import C.C1090h;
import C.C1092j;
import C.C1093k;
import C.W;
import C.Z;
import H0.F;
import J0.C1241g;
import V.O0;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import c1.h;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.ui.components.MessageMetadataKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.MessageStyle;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.s;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class BubbleMessageRowKt$BubbleMessageRow$6 implements s {
    final /* synthetic */ Part $conversationPart;
    final /* synthetic */ List<String> $failedAttributeIdentifiers;
    final /* synthetic */ PendingMessage.FailedImageUploadData $failedImageUploadData;
    final /* synthetic */ FailedMessage $failedMessage;
    final /* synthetic */ boolean $isAdminOrAltParticipant;
    final /* synthetic */ List<String> $loadingAttributeIdentifiers;
    final /* synthetic */ MessageStyle $messageStyle;
    final /* synthetic */ C6798l $onCreateTicket;
    final /* synthetic */ C6798l $onRetryImageClicked;
    final /* synthetic */ C6798l $onSubmitAttribute;

    BubbleMessageRowKt$BubbleMessageRow$6(FailedMessage failedMessage, MessageStyle messageStyle, Part part, List<String> list, List<String> list2, C6798l lVar, C6798l lVar2, boolean z10, PendingMessage.FailedImageUploadData failedImageUploadData, C6798l lVar3) {
        this.$failedMessage = failedMessage;
        this.$messageStyle = messageStyle;
        this.$conversationPart = part;
        this.$failedAttributeIdentifiers = list;
        this.$loadingAttributeIdentifiers = list2;
        this.$onSubmitAttribute = lVar;
        this.$onCreateTicket = lVar2;
        this.$isAdminOrAltParticipant = z10;
        this.$failedImageUploadData = failedImageUploadData;
        this.$onRetryImageClicked = lVar3;
    }

    /* access modifiers changed from: private */
    public static final void invoke$lambda$5$Content(Part part, Part part2, List<String> list, List<String> list2, C6798l lVar, MessageStyle messageStyle, C6787a aVar, C6798l lVar2, boolean z10, PendingMessage.FailedImageUploadData failedImageUploadData, C6798l lVar3, long j10, i iVar, C1500m mVar, int i10, int i11) {
        boolean z11;
        C1500m mVar2 = mVar;
        mVar2.T(1340766378);
        long r92 = (i11 & 1) != 0 ? IntercomTheme.INSTANCE.getColors(mVar2, IntercomTheme.$stable).m700getPrimaryText0d7_KjU() : j10;
        i iVar2 = (i11 & 2) != 0 ? i.f23074a : iVar;
        F a10 = C1090h.a(C1085c.f882a.n(h.j((float) 8)), c.f23044a.k(), mVar2, 6);
        int a11 = C1494j.a(mVar2, 0);
        C1523y p10 = mVar.p();
        i e10 = k0.h.e(mVar2, iVar2);
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
        io.intercom.android.sdk.models.Metadata metadata = part.getMetadata();
        mVar2.T(301232084);
        if (metadata != null) {
            Iterable<Avatar> avatars = metadata.getAvatars();
            ArrayList arrayList = new ArrayList(C6565s.y(avatars, 10));
            for (Avatar avatarWrapper : avatars) {
                arrayList.add(new AvatarWrapper(avatarWrapper, false, 2, (DefaultConstructorMarker) null));
            }
            MessageMetadataKt.MessageMetadata(arrayList, metadata.getTitle(), (i) null, metadata.getSuffix(), metadata.getTimestamp(), mVar, 8, 4);
        }
        mVar.M();
        List<Block> blocks = part.getBlocks();
        C6496s.g(blocks, "getBlocks(...)");
        Iterable iterable = blocks;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((Block) it.next()).getType() == BlockType.CREATETICKETCARD) {
                    if (part.getParentConversation().getTicket() != null) {
                        z11 = false;
                    }
                }
            }
        }
        z11 = true;
        BubbleMessageRowKt.m280MessageContent993knro(part2, list, list2, lVar, r92, z11, messageStyle.getContentShape(), aVar, lVar2, z10, failedImageUploadData, lVar3, h.j((float) 12), mVar, ((i10 << 12) & 57344) | 584, 384, 0);
        mVar.u();
        mVar.M();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        invoke((C1092j) obj, (Part) obj2, (C6787a) obj3, (C1500m) obj4, ((Number) obj5).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1092j jVar, Part part, C6787a aVar, C1500m mVar, int i10) {
        C1500m mVar2 = mVar;
        C6496s.h(jVar, "$this$ClickableMessageRow");
        C6496s.h(part, "part");
        C6496s.h(aVar, "onClick");
        C1085c.f n10 = C1085c.f882a.n(h.j((float) 8));
        c.C0368c i11 = c.f23044a.i();
        FailedMessage failedMessage = this.$failedMessage;
        MessageStyle messageStyle = this.$messageStyle;
        Part part2 = this.$conversationPart;
        List<String> list = this.$failedAttributeIdentifiers;
        List<String> list2 = this.$loadingAttributeIdentifiers;
        C6798l lVar = this.$onSubmitAttribute;
        C6798l lVar2 = this.$onCreateTicket;
        boolean z10 = this.$isAdminOrAltParticipant;
        PendingMessage.FailedImageUploadData failedImageUploadData = this.$failedImageUploadData;
        C6798l lVar3 = this.$onRetryImageClicked;
        i.a aVar2 = i.f23074a;
        F b10 = W.b(n10, i11, mVar2, 54);
        int a10 = C1494j.a(mVar2, 0);
        C1523y p10 = mVar.p();
        i e10 = k0.h.e(mVar2, aVar2);
        C1241g.a aVar3 = C1241g.f3853J;
        C6787a a11 = aVar3.a();
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
        F1.b(a12, b10, aVar3.c());
        F1.b(a12, p10, aVar3.e());
        p b11 = aVar3.b();
        if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
            a12.r(Integer.valueOf(a10));
            a12.V(Integer.valueOf(a10), b11);
        }
        F1.b(a12, e10, aVar3.d());
        Z z11 = Z.f873a;
        mVar2.T(-737212874);
        if (failedMessage != null) {
            BubbleMessageRowKt.FailedMessageIcon((i) null, mVar2, 0, 1);
        }
        mVar.M();
        mVar2.T(-737209582);
        MessageStyle.BubbleStyle bubbleStyle = messageStyle.getBubbleStyle();
        O0.a((i) null, bubbleStyle.getShape(), bubbleStyle.m325getColor0d7_KjU(), 0, 0.0f, 0.0f, bubbleStyle.getBorderStroke(), g0.c.e(722028815, true, new BubbleMessageRowKt$BubbleMessageRow$6$1$1$1(bubbleStyle, part2, part, list, list2, lVar, messageStyle, aVar, lVar2, z10, failedImageUploadData, lVar3), mVar2, 54), mVar, 12582912, 57);
        mVar.M();
        mVar.u();
    }
}
