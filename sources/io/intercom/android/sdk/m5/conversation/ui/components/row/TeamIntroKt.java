package io.intercom.android.sdk.m5.conversation.ui.components.row;

import V.B0;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\u0007\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "text", "Lk0/i;", "modifier", "Llf/M;", "TeamIntro", "(Ljava/lang/String;Lk0/i;LY/m;II)V", "TeamIntroPreview", "(LY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TeamIntroKt {
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void TeamIntro(java.lang.String r63, k0.i r64, Y.C1500m r65, int r66, int r67) {
        /*
            r0 = r63
            r1 = r66
            r2 = r67
            java.lang.String r3 = "text"
            kotlin.jvm.internal.C6496s.h(r0, r3)
            r3 = 673666815(0x282756ff, float:9.2892265E-15)
            r4 = r65
            Y.m r3 = r4.h(r3)
            r4 = r2 & 1
            r5 = 2
            if (r4 == 0) goto L_0x001c
            r4 = r1 | 6
            goto L_0x002c
        L_0x001c:
            r4 = r1 & 14
            if (r4 != 0) goto L_0x002b
            boolean r4 = r3.S(r0)
            if (r4 == 0) goto L_0x0028
            r4 = 4
            goto L_0x0029
        L_0x0028:
            r4 = r5
        L_0x0029:
            r4 = r4 | r1
            goto L_0x002c
        L_0x002b:
            r4 = r1
        L_0x002c:
            r6 = r2 & 2
            if (r6 == 0) goto L_0x0036
            r4 = r4 | 48
        L_0x0032:
            r7 = r64
        L_0x0034:
            r8 = r4
            goto L_0x0049
        L_0x0036:
            r7 = r1 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x0032
            r7 = r64
            boolean r8 = r3.S(r7)
            if (r8 == 0) goto L_0x0045
            r8 = 32
            goto L_0x0047
        L_0x0045:
            r8 = 16
        L_0x0047:
            r4 = r4 | r8
            goto L_0x0034
        L_0x0049:
            r4 = r8 & 91
            r9 = 18
            if (r4 != r9) goto L_0x005b
            boolean r4 = r3.i()
            if (r4 != 0) goto L_0x0056
            goto L_0x005b
        L_0x0056:
            r3.I()
            goto L_0x00fa
        L_0x005b:
            if (r6 == 0) goto L_0x0062
            k0.i$a r4 = k0.i.f23074a
            r30 = r4
            goto L_0x0064
        L_0x0062:
            r30 = r7
        L_0x0064:
            r4 = 0
            android.text.Spanned r4 = w1.b.a(r0, r4)
            java.lang.String r6 = "fromHtml(...)"
            kotlin.jvm.internal.C6496s.g(r4, r6)
            Y.I0 r6 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r6 = r3.m(r6)
            android.content.Context r6 = (android.content.Context) r6
            r7 = 0
            Q0.d r4 = io.intercom.android.sdk.survey.block.BlockExtensionsKt.toAnnotatedString$default(r4, r6, r7, r5, r7)
            io.intercom.android.sdk.ui.theme.IntercomTheme r5 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r6 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomTypography r7 = r5.getTypography(r3, r6)
            Q0.T r31 = r7.getType04Point5()
            io.intercom.android.sdk.ui.theme.IntercomColors r5 = r5.getColors(r3, r6)
            long r32 = r5.m686getDescriptionText0d7_KjU()
            r61 = 16777214(0xfffffe, float:2.3509884E-38)
            r62 = 0
            r34 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r51 = 0
            r52 = 0
            r53 = 0
            r55 = 0
            r56 = 0
            r57 = 0
            r58 = 0
            r59 = 0
            r60 = 0
            Q0.T r25 = Q0.T.c(r31, r32, r34, r36, r37, r38, r39, r40, r41, r43, r44, r45, r46, r48, r49, r50, r51, r52, r53, r55, r56, r57, r58, r59, r60, r61, r62)
            b1.j$a r5 = b1.j.f19110b
            int r5 = r5.a()
            b1.j r16 = b1.j.h(r5)
            r27 = r8 & 112(0x70, float:1.57E-43)
            r28 = 0
            r29 = 130556(0x1fdfc, float:1.82948E-40)
            r6 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r5 = r30
            r26 = r3
            V.T0.c(r4, r5, r6, r8, r10, r11, r12, r13, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r7 = r30
        L_0x00fa:
            Y.Y0 r3 = r3.k()
            if (r3 == 0) goto L_0x0108
            io.intercom.android.sdk.m5.conversation.ui.components.row.x0 r4 = new io.intercom.android.sdk.m5.conversation.ui.components.row.x0
            r4.<init>(r0, r7, r1, r2)
            r3.a(r4)
        L_0x0108:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.ui.components.row.TeamIntroKt.TeamIntro(java.lang.String, k0.i, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M TeamIntro$lambda$0(String str, i iVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(str, "$text");
        TeamIntro(str, iVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void TeamIntroPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(825513769);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$TeamIntroKt.INSTANCE.m310getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new w0(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TeamIntroPreview$lambda$1(int i10, C1500m mVar, int i11) {
        TeamIntroPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
