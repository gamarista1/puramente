package io.intercom.android.sdk.m5.conversation.ui.components.row;

import C.C1085c;
import C.C1090h;
import C.C1092j;
import C.C1093k;
import C.a0;
import H0.F;
import J0.C1241g;
import O0.g;
import V.T0;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import android.content.Context;
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.n;
import androidx.compose.ui.draw.b;
import b1.j;
import b1.k;
import c1.h;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.activities.IntercomPostActivity;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.Arrays;
import java.util.List;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import q0.C2422h;
import q0.C2427m;
import r0.C2514n0;
import r0.C2544x0;
import r0.C2547y0;
import r0.g2;
import t0.C2602c;
import t0.C2605f;
import t0.C2606g;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class PostCardRowKt$PostCardRow$1 implements q {
    final /* synthetic */ long $actionColor;
    final /* synthetic */ String $companyName;
    final /* synthetic */ Context $context;
    final /* synthetic */ Pair<Float, C2544x0>[] $gradientColors;
    final /* synthetic */ Part $part;

    PostCardRowKt$PostCardRow$1(Part part, String str, long j10, Pair<Float, C2544x0>[] pairArr, Context context) {
        this.$part = part;
        this.$companyName = str;
        this.$actionColor = j10;
        this.$gradientColors = pairArr;
        this.$context = context;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$3$lambda$0(Pair[] pairArr, C2602c cVar) {
        C6496s.h(pairArr, "$gradientColors");
        C6496s.h(cVar, "$this$drawWithContent");
        cVar.H1();
        float f10 = (float) 120;
        C2602c cVar2 = cVar;
        C2605f.c1(cVar2, C2514n0.a.k(C2514n0.f25547b, (Pair[]) Arrays.copyOf(pairArr, pairArr.length), 0.0f, 0.0f, 0, 14, (Object) null), C2422h.a(0.0f, C2427m.i(cVar.d()) - h.j(f10)), C2427m.f(cVar.d(), 0.0f, h.j(f10), 1, (Object) null), 0.0f, (C2606g) null, (C2547y0) null, 0, 120, (Object) null);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$3$lambda$1(Context context, Part part) {
        C6496s.h(context, "$context");
        C6496s.h(part, "$part");
        context.startActivity(IntercomPostActivity.buildPostIntent(context, part, part.getParentConversation().getId(), part.getParentConversation().lastParticipatingAdmin(), part.getParentConversation().getComposerState().isVisible(), false));
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1092j) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1092j jVar, C1500m mVar, int i10) {
        C1500m mVar2 = mVar;
        C6496s.h(jVar, "$this$IntercomCard");
        if ((i10 & 81) != 16 || !mVar.i()) {
            Part part = this.$part;
            String str = this.$companyName;
            long j10 = this.$actionColor;
            Pair<Float, C2544x0>[] pairArr = this.$gradientColors;
            Context context = this.$context;
            i.a aVar = i.f23074a;
            C1085c cVar = C1085c.f882a;
            C1085c.m g10 = cVar.g();
            c.a aVar2 = c.f23044a;
            F a10 = C1090h.a(g10, aVar2.k(), mVar2, 0);
            int a11 = C1494j.a(mVar2, 0);
            C1523y p10 = mVar.p();
            i e10 = k0.h.e(mVar2, aVar);
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
            p b10 = aVar3.b();
            if (a13.f() || !C6496s.c(a13.A(), Integer.valueOf(a11))) {
                a13.r(Integer.valueOf(a11));
                a13.V(Integer.valueOf(a11), b10);
            }
            F1.b(a13, e10, aVar3.d());
            C1093k kVar = C1093k.f978a;
            List<Block> blocks = part.getBlocks();
            C6496s.g(blocks, "getBlocks(...)");
            String forename = part.getParticipant().getForename();
            C6496s.g(forename, "getForename(...)");
            Avatar avatar = part.getParticipant().getAvatar();
            C6496s.g(avatar, "getAvatar(...)");
            String str2 = forename;
            C1093k kVar2 = kVar;
            long j11 = j10;
            i.a aVar4 = aVar;
            PostCardRowKt.m326PostContentFHprtrg(blocks, str2, str, new AvatarWrapper(avatar, false), j10, n.i(b.d(C1092j.c(kVar, aVar, 1.0f, false, 2, (Object) null), new i0(pairArr)), h.j((float) 12)), mVar, 4104, 0);
            i h10 = androidx.compose.foundation.layout.q.h(aVar4, 0.0f, 1, (Object) null);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i11 = IntercomTheme.$stable;
            i d10 = d.d(androidx.compose.foundation.b.d(h10, intercomTheme.getColors(mVar2, i11).m678getBackground0d7_KjU(), (g2) null, 2, (Object) null), false, (String) null, (g) null, new j0(context, part), 7, (Object) null);
            F a14 = C1090h.a(cVar.g(), aVar2.g(), mVar2, 48);
            int a15 = C1494j.a(mVar2, 0);
            C1523y p11 = mVar.p();
            i e11 = k0.h.e(mVar2, d10);
            C6787a a16 = aVar3.a();
            if (mVar.j() == null) {
                C1494j.c();
            }
            mVar.F();
            if (mVar.f()) {
                mVar2.U(a16);
            } else {
                mVar.q();
            }
            C1500m a17 = F1.a(mVar);
            F1.b(a17, a14, aVar3.c());
            F1.b(a17, p11, aVar3.e());
            p b11 = aVar3.b();
            if (a17.f() || !C6496s.c(a17.A(), Integer.valueOf(a15))) {
                a17.r(Integer.valueOf(a15));
                a17.V(Integer.valueOf(a15), b11);
            }
            F1.b(a17, e11, aVar3.d());
            IntercomDividerKt.IntercomDivider(kVar2.b(androidx.compose.foundation.layout.q.g(aVar4, 0.9f), aVar2.g()), mVar2, 0, 0);
            float f10 = (float) 14;
            a0.a(androidx.compose.foundation.layout.q.i(aVar4, h.j(f10)), mVar2, 6);
            C1500m mVar3 = mVar2;
            T0.b(M0.i.a(R.string.intercom_view_post, mVar2, 0), (i) null, j11, 0, (V0.n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, intercomTheme.getTypography(mVar2, i11).getType04SemiBold(), mVar, 0, 0, 65530);
            a0.a(androidx.compose.foundation.layout.q.i(aVar4, h.j(f10)), mVar, 6);
            mVar.u();
            mVar.u();
            return;
        }
        mVar.I();
    }
}
