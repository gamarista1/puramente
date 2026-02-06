package io.intercom.android.sdk.m5.conversation.ui.components.row;

import C.C1085c;
import C.C1090h;
import C.C1093k;
import C.W;
import C.Z;
import C.a0;
import H0.F;
import J0.C1241g;
import V.B0;
import V.T0;
import V0.p;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.Y0;
import android.content.Context;
import androidx.compose.foundation.layout.n;
import androidx.compose.foundation.layout.q;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b1.j;
import b1.k;
import c1.h;
import c1.w;
import g0.c;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.survey.block.BlockRenderData;
import io.intercom.android.sdk.survey.block.BlockRenderTextStyle;
import io.intercom.android.sdk.survey.block.BlockViewKt;
import io.intercom.android.sdk.survey.block.ImageRenderType;
import io.intercom.android.sdk.survey.block.SuffixText;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.Phrase;
import java.util.List;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import lf.C6514M;
import mf.C6565s;
import r0.C2544x0;
import r0.g2;
import x.C2868g;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a)\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001aG\u0010\u0014\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u000f\u0010\u0015\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lk0/i;", "modifier", "Lio/intercom/android/sdk/models/Part;", "part", "", "companyName", "Llf/M;", "PostCardRow", "(Lk0/i;Lio/intercom/android/sdk/models/Part;Ljava/lang/String;LY/m;II)V", "", "Lio/intercom/android/sdk/blocks/lib/models/Block;", "blocks", "participantName", "participantCompanyName", "Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "participantAvatarWrapper", "Lr0/x0;", "headerColor", "PostContent-FHprtrg", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;JLk0/i;LY/m;II)V", "PostContent", "PostCardPreview", "(LY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PostCardRowKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                io.intercom.android.sdk.blocks.lib.BlockType[] r0 = io.intercom.android.sdk.blocks.lib.BlockType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.intercom.android.sdk.blocks.lib.BlockType r1 = io.intercom.android.sdk.blocks.lib.BlockType.HEADING     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                io.intercom.android.sdk.blocks.lib.BlockType r1 = io.intercom.android.sdk.blocks.lib.BlockType.SUBHEADING     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.ui.components.row.PostCardRowKt.WhenMappings.<clinit>():void");
        }
    }

    @IntercomPreviews
    private static final void PostCardPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(620144177);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$PostCardRowKt.INSTANCE.m302getLambda1$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new g0(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M PostCardPreview$lambda$5(int i10, C1500m mVar, int i11) {
        PostCardPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void PostCardRow(i iVar, Part part, String str, C1500m mVar, int i10, int i11) {
        i.a aVar;
        C6496s.h(part, "part");
        C6496s.h(str, "companyName");
        C1500m h10 = mVar.h(-1691901714);
        if ((i11 & 1) != 0) {
            aVar = i.f23074a;
        } else {
            aVar = iVar;
        }
        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
        int i12 = IntercomTheme.$stable;
        long r42 = ColorExtensionsKt.m715getAccessibleColorOnWhiteBackground8_81llA(intercomTheme.getColors(h10, i12).m672getAction0d7_KjU());
        Pair[] pairArr = {C6502A.a(Float.valueOf(0.0f), C2544x0.k(C2544x0.f25560b.g())), C6502A.a(Float.valueOf(0.9f), C2544x0.k(intercomTheme.getColors(h10, i12).m678getBackground0d7_KjU()))};
        i iVar2 = aVar;
        IntercomCardKt.IntercomCard(q.i(n.j(aVar, h.j((float) 14), h.j((float) 12)), h.j((float) 200)), IntercomCardStyle.INSTANCE.m590conversationCardStylePEIptTM((g2) null, 0, 0, 0.0f, (C2868g) null, h10, IntercomCardStyle.$stable << 15, 31), c.e(1178622818, true, new PostCardRowKt$PostCardRow$1(part, str, r42, pairArr, (Context) h10.m(AndroidCompositionLocals_androidKt.g())), h10, 54), h10, (IntercomCardStyle.Style.$stable << 3) | 384, 0);
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new h0(iVar2, part, str, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M PostCardRow$lambda$0(i iVar, Part part, String str, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(part, "$part");
        C6496s.h(str, "$companyName");
        PostCardRow(iVar, part, str, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    /* renamed from: PostContent-FHprtrg  reason: not valid java name */
    public static final void m326PostContentFHprtrg(List<? extends Block> list, String str, String str2, AvatarWrapper avatarWrapper, long j10, i iVar, C1500m mVar, int i10, int i11) {
        i.a aVar;
        int i12;
        float f10;
        float j11;
        List<? extends Block> list2 = list;
        String str3 = str;
        String str4 = str2;
        C6496s.h(list2, "blocks");
        C6496s.h(str3, "participantName");
        C6496s.h(str4, "participantCompanyName");
        C6496s.h(avatarWrapper, "participantAvatarWrapper");
        C1500m h10 = mVar.h(-1350453300);
        if ((i11 & 32) != 0) {
            aVar = i.f23074a;
        } else {
            aVar = iVar;
        }
        Context context = (Context) h10.m(AndroidCompositionLocals_androidKt.g());
        C1085c cVar = C1085c.f882a;
        C1085c.m g10 = cVar.g();
        c.a aVar2 = k0.c.f23044a;
        F a10 = C1090h.a(g10, aVar2.k(), h10, 0);
        int a11 = C1494j.a(h10, 0);
        C1523y p10 = h10.p();
        i e10 = k0.h.e(h10, aVar);
        C1241g.a aVar3 = C1241g.f3853J;
        C6787a a12 = aVar3.a();
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
        F1.b(a13, a10, aVar3.c());
        F1.b(a13, p10, aVar3.e());
        p b10 = aVar3.b();
        if (a13.f() || !C6496s.c(a13.A(), Integer.valueOf(a11))) {
            a13.r(Integer.valueOf(a11));
            a13.V(Integer.valueOf(a11), b10);
        }
        F1.b(a13, e10, aVar3.d());
        C1093k kVar = C1093k.f978a;
        c.C0368c i13 = aVar2.i();
        i.a aVar4 = i.f23074a;
        F b11 = W.b(cVar.f(), i13, h10, 48);
        int a14 = C1494j.a(h10, 0);
        C1523y p11 = h10.p();
        i e11 = k0.h.e(h10, aVar4);
        C6787a a15 = aVar3.a();
        if (h10.j() == null) {
            C1494j.c();
        }
        h10.F();
        if (h10.f()) {
            h10.U(a15);
        } else {
            h10.q();
        }
        C1500m a16 = F1.a(h10);
        F1.b(a16, b11, aVar3.c());
        F1.b(a16, p11, aVar3.e());
        p b12 = aVar3.b();
        if (a16.f() || !C6496s.c(a16.A(), Integer.valueOf(a14))) {
            a16.r(Integer.valueOf(a14));
            a16.V(Integer.valueOf(a14), b12);
        }
        F1.b(a16, e11, aVar3.d());
        Z z10 = Z.f873a;
        i iVar2 = aVar;
        i.a aVar5 = aVar4;
        AvatarIconKt.m208AvatarIconRd90Nhg(q.n(aVar4, h.j((float) 24)), avatarWrapper, (g2) null, false, 0, (C2544x0) null, h10, 70, 60);
        a0.a(q.r(aVar5, h.j((float) 12)), h10, 6);
        T0.b(Phrase.from(context, R.string.intercom_teammate_from_company).put("name", (CharSequence) str3).put("company", (CharSequence) str4).format().toString(), (i) null, 0, 0, (V0.n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, IntercomTheme.INSTANCE.getTypography(h10, IntercomTheme.$stable).getType04(), h10, 0, 0, 65534);
        h10.u();
        float f11 = (float) 16;
        a0.a(q.i(aVar5, h.j(f11)), h10, 6);
        h10.T(-83078379);
        int i14 = 0;
        for (Object next : list2) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                C6565s.x();
            }
            Block block = (Block) next;
            i.a aVar6 = i.f23074a;
            i h11 = q.h(aVar6, 0.0f, 1, (Object) null);
            long f12 = w.f(20);
            p.a aVar7 = V0.p.f8210b;
            BlockRenderTextStyle blockRenderTextStyle = new BlockRenderTextStyle(f12, aVar7.b(), 0, C2544x0.k(j10), (C2544x0) null, (j) null, 52, (DefaultConstructorMarker) null);
            BlockViewKt.BlockView(h11, new BlockRenderData(block, (C2544x0) null, blockRenderTextStyle, new BlockRenderTextStyle(w.f(16), aVar7.c(), 0, C2544x0.k(j10), (C2544x0) null, (j) null, 52, (DefaultConstructorMarker) null), (BlockRenderTextStyle) null, 18, (DefaultConstructorMarker) null), false, (SuffixText) null, false, (String) null, (ImageRenderType) null, (C6787a) null, (C6798l) null, (C6798l) null, h10, 70, 1020);
            BlockType type = block.getType();
            if (type == null) {
                i12 = -1;
            } else {
                i12 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    j11 = h.j((float) 8);
                } else {
                    j11 = h.j(f11);
                }
                f10 = j11;
            } else {
                f10 = h.j((float) 32);
            }
            h10.T(-83051140);
            if (i14 != C6565s.p(list)) {
                a0.a(q.i(aVar6, f10), h10, 0);
            }
            h10.M();
            i14 = i15;
        }
        h10.M();
        h10.u();
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6139f0(list, str, str2, avatarWrapper, j10, iVar2, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M PostContent_FHprtrg$lambda$4(List list, String str, String str2, AvatarWrapper avatarWrapper, long j10, i iVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(list, "$blocks");
        C6496s.h(str, "$participantName");
        C6496s.h(str2, "$participantCompanyName");
        C6496s.h(avatarWrapper, "$participantAvatarWrapper");
        m326PostContentFHprtrg(list, str, str2, avatarWrapper, j10, iVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }
}
