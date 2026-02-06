package io.intercom.android.sdk.m5.conversation.ui.components.row;

import C.C1085c;
import C.C1090h;
import C.C1093k;
import C.N;
import C.a0;
import D0.T;
import H0.F;
import J0.C1241g;
import Y.C1494j;
import Y.C1500m;
import Y.C1510r0;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.Y0;
import Y.o1;
import android.content.Context;
import androidx.compose.foundation.layout.n;
import androidx.compose.foundation.layout.q;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C1638i0;
import androidx.compose.ui.platform.C1644k0;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.utilities.Phrase;
import java.util.List;
import k0.c;
import k0.h;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import mf.C6565s;
import qf.C6658d;
import yf.C6787a;
import yf.p;
import yf.s;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aw\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2$\u0010\u000f\u001a \u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u000b0\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014²\u0006\u000e\u0010\u0013\u001a\u00020\u00128\n@\nX\u0002"}, d2 = {"Lio/intercom/android/sdk/models/Part;", "conversationPart", "Lk0/i;", "modifier", "Lio/intercom/android/sdk/m5/conversation/ui/components/row/BottomMetadata;", "bottomMetadata", "Lk0/c$b;", "horizontalAlignment", "LC/N;", "paddingValues", "Lkotlin/Function0;", "Llf/M;", "onRetryMessageClicked", "Lkotlin/Function3;", "LC/j;", "content", "ClickableMessageRow", "(Lio/intercom/android/sdk/models/Part;Lk0/i;Lio/intercom/android/sdk/m5/conversation/ui/components/row/BottomMetadata;Lk0/c$b;LC/N;Lyf/a;Lyf/s;LY/m;II)V", "", "showTimestamp", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ClickableMessageRowKt {
    public static final void ClickableMessageRow(Part part, i iVar, BottomMetadata bottomMetadata, c.b bVar, N n10, C6787a aVar, s sVar, C1500m mVar, int i10, int i11) {
        i.a aVar2;
        c.b bVar2;
        N n11;
        C6787a aVar3;
        C6787a aVar4;
        N n12;
        c.b bVar3;
        i iVar2;
        String str;
        String attribution;
        Part part2 = part;
        C6496s.h(part2, "conversationPart");
        C6496s.h(sVar, "content");
        C1500m h10 = mVar.h(-932954058);
        if ((i11 & 2) != 0) {
            aVar2 = i.f23074a;
        } else {
            aVar2 = iVar;
        }
        if ((i11 & 8) != 0) {
            bVar2 = c.f23044a.k();
        } else {
            bVar2 = bVar;
        }
        if ((i11 & 16) != 0) {
            n11 = n.c(0.0f, 0.0f, 3, (Object) null);
        } else {
            n11 = n10;
        }
        if ((i11 & 32) != 0) {
            aVar3 = null;
        } else {
            aVar3 = aVar;
        }
        h10.T(1099059020);
        Object A10 = h10.A();
        C1500m.a aVar5 = C1500m.f10026a;
        if (A10 == aVar5.a()) {
            A10 = u1.d(Boolean.FALSE, (o1) null, 2, (Object) null);
            h10.r(A10);
        }
        C1510r0 r0Var = (C1510r0) A10;
        h10.M();
        r rVar = new r((C1638i0) h10.m(C1644k0.d()), part2);
        h10.T(1099065861);
        if (aVar3 == null) {
            h10.T(1099066636);
            Object A11 = h10.A();
            if (A11 == aVar5.a()) {
                A11 = new C6151s(r0Var);
                h10.r(A11);
            }
            h10.M();
            aVar4 = (C6787a) A11;
        } else {
            aVar4 = aVar3;
        }
        h10.M();
        i h11 = q.h(aVar2, 0.0f, 1, (Object) null);
        C6514M m10 = C6514M.f71813a;
        h10.T(1099071132);
        boolean S10 = h10.S(rVar) | h10.S(aVar4);
        Object A12 = h10.A();
        if (S10 || A12 == aVar5.a()) {
            A12 = new ClickableMessageRowKt$ClickableMessageRow$1$1(rVar, aVar4, (C6658d<? super ClickableMessageRowKt$ClickableMessageRow$1$1>) null);
            h10.r(A12);
        }
        h10.M();
        i h12 = n.h(T.d(h11, m10, (p) A12), n11);
        F a10 = C1090h.a(C1085c.f882a.g(), bVar2, h10, (((i10 >> 3) & 896) >> 3) & 112);
        int a11 = C1494j.a(h10, 0);
        C1523y p10 = h10.p();
        i e10 = h.e(h10, h12);
        C1241g.a aVar6 = C1241g.f3853J;
        C6787a a12 = aVar6.a();
        if (h10.j() == null) {
            C1494j.c();
        }
        h10.F();
        if (h10.f()) {
            h10.U(a12);
        } else {
            h10.q();
        }
        C1500m a13 = F1.a(h10);
        F1.b(a13, a10, aVar6.c());
        F1.b(a13, p10, aVar6.e());
        p b10 = aVar6.b();
        if (a13.f() || !C6496s.c(a13.A(), Integer.valueOf(a11))) {
            a13.r(Integer.valueOf(a11));
            a13.V(Integer.valueOf(a11), b10);
        }
        F1.b(a13, e10, aVar6.d());
        sVar.invoke(C1093k.f978a, part, aVar4, h10, Integer.valueOf(((i10 >> 9) & 7168) | 70));
        h10.T(-1990945499);
        if ((bottomMetadata == null || !ClickableMessageRow$lambda$1(r0Var)) && (bottomMetadata == null || !bottomMetadata.getAlwaysShow())) {
            n12 = n11;
            bVar3 = bVar2;
            iVar2 = aVar2;
        } else {
            a0.a(q.i(i.f23074a, bottomMetadata.m279getPaddingD9Ej5fM()), h10, 0);
            String text = bottomMetadata.getText();
            h10.T(-1990935821);
            String str2 = "";
            if (BubbleMessageRowKt.shouldShowAttribution(part)) {
                Phrase from = Phrase.from((Context) h10.m(AndroidCompositionLocals_androidKt.g()), R.string.intercom_gif_attribution);
                List<Block> blocks = part.getBlocks();
                C6496s.g(blocks, "getBlocks(...)");
                Block block = (Block) C6565s.q0(blocks);
                if (!(block == null || (attribution = block.getAttribution()) == null)) {
                    str2 = attribution;
                }
                str = from.put("providername", (CharSequence) str2).format().toString();
            } else {
                str = str2;
            }
            h10.M();
            n12 = n11;
            bVar3 = bVar2;
            iVar2 = aVar2;
            BubbleMessageRowKt.MessageMeta((i) null, text, str, true, h10, 3072, 1);
        }
        h10.M();
        h10.u();
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6152t(part, iVar2, bottomMetadata, bVar3, n12, aVar3, sVar, i10, i11));
        }
    }

    private static final boolean ClickableMessageRow$lambda$1(C1510r0 r0Var) {
        return ((Boolean) r0Var.getValue()).booleanValue();
    }

    private static final void ClickableMessageRow$lambda$2(C1510r0 r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C6514M ClickableMessageRow$lambda$3(C1638i0 i0Var, Part part) {
        C6496s.h(i0Var, "$clipboardManager");
        C6496s.h(part, "$conversationPart");
        i0Var.a(BubbleMessageRowKt.getCopyText(part));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ClickableMessageRow$lambda$5$lambda$4(C1510r0 r0Var) {
        C6496s.h(r0Var, "$showTimestamp$delegate");
        ClickableMessageRow$lambda$2(r0Var, !ClickableMessageRow$lambda$1(r0Var));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ClickableMessageRow$lambda$8(Part part, i iVar, BottomMetadata bottomMetadata, c.b bVar, N n10, C6787a aVar, s sVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(part, "$conversationPart");
        s sVar2 = sVar;
        C6496s.h(sVar2, "$content");
        ClickableMessageRow(part, iVar, bottomMetadata, bVar, n10, aVar, sVar2, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }
}
