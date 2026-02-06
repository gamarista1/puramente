package io.intercom.android.sdk.survey.ui.questiontype.numericscale;

import Y.C1500m;
import Y.M0;
import Y.Y0;
import androidx.compose.foundation.layout.q;
import c1.h;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a1\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"", "emojiUrl", "contentDescription", "", "showInColor", "Lk0/i;", "modifier", "Llf/M;", "EmojiRating", "(Ljava/lang/String;Ljava/lang/String;ZLk0/i;LY/m;II)V", "SelectedEmoji", "(LY/m;I)V", "UnSelectedEmoji", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class EmojiRatingKt {
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void EmojiRating(java.lang.String r25, java.lang.String r26, boolean r27, k0.i r28, Y.C1500m r29, int r30, int r31) {
        /*
            r1 = r25
            r12 = r26
            r13 = r28
            r14 = r30
            r0 = 2
            r2 = 4
            java.lang.String r3 = "emojiUrl"
            kotlin.jvm.internal.C6496s.h(r1, r3)
            java.lang.String r3 = "contentDescription"
            kotlin.jvm.internal.C6496s.h(r12, r3)
            java.lang.String r3 = "modifier"
            kotlin.jvm.internal.C6496s.h(r13, r3)
            r3 = -538688650(0xffffffffdfe44376, float:-3.289624E19)
            r4 = r29
            Y.m r11 = r4.h(r3)
            r3 = 1
            r4 = r31 & 1
            if (r4 == 0) goto L_0x002a
            r4 = r14 | 6
            goto L_0x003a
        L_0x002a:
            r4 = r14 & 14
            if (r4 != 0) goto L_0x0039
            boolean r4 = r11.S(r1)
            if (r4 == 0) goto L_0x0036
            r4 = r2
            goto L_0x0037
        L_0x0036:
            r4 = r0
        L_0x0037:
            r4 = r4 | r14
            goto L_0x003a
        L_0x0039:
            r4 = r14
        L_0x003a:
            r0 = r31 & 2
            if (r0 == 0) goto L_0x0041
            r4 = r4 | 48
            goto L_0x0051
        L_0x0041:
            r0 = r14 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x0051
            boolean r0 = r11.S(r12)
            if (r0 == 0) goto L_0x004e
            r0 = 32
            goto L_0x0050
        L_0x004e:
            r0 = 16
        L_0x0050:
            r4 = r4 | r0
        L_0x0051:
            r0 = r31 & 4
            if (r0 == 0) goto L_0x005a
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x0057:
            r2 = r27
            goto L_0x006c
        L_0x005a:
            r2 = r14 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x0057
            r2 = r27
            boolean r5 = r11.b(r2)
            if (r5 == 0) goto L_0x0069
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x006b
        L_0x0069:
            r5 = 128(0x80, float:1.794E-43)
        L_0x006b:
            r4 = r4 | r5
        L_0x006c:
            r5 = r31 & 8
            if (r5 == 0) goto L_0x0073
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x0083
        L_0x0073:
            r5 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x0083
            boolean r5 = r11.S(r13)
            if (r5 == 0) goto L_0x0080
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x0082
        L_0x0080:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x0082:
            r4 = r4 | r5
        L_0x0083:
            r5 = r4 & 5851(0x16db, float:8.199E-42)
            r6 = 1170(0x492, float:1.64E-42)
            if (r5 != r6) goto L_0x0098
            boolean r5 = r11.i()
            if (r5 != 0) goto L_0x0090
            goto L_0x0098
        L_0x0090:
            r11.I()
            r3 = r2
            r16 = r11
            goto L_0x0111
        L_0x0098:
            if (r0 == 0) goto L_0x009c
            r0 = r3
            goto L_0x009d
        L_0x009c:
            r0 = r2
        L_0x009d:
            Y.I0 r2 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r2 = r11.m(r2)
            android.content.Context r2 = (android.content.Context) r2
            X3.g r16 = io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt.getImageLoader(r2)
            r2 = 1750824323(0x685b7583, float:4.145464E24)
            r11.z(r2)
            j4.i$a r2 = new j4.i$a
            Y.I0 r5 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r5 = r11.m(r5)
            android.content.Context r5 = (android.content.Context) r5
            r2.<init>(r5)
            j4.i$a r2 = r2.d(r1)
            r2.c(r3)
            j4.i r15 = r2.a()
            r23 = 72
            r24 = 124(0x7c, float:1.74E-43)
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = r11
            Z3.f r2 = Z3.h.c(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r11.R()
            r0.y0$a r5 = r0.C2547y0.f25576b
            r6 = 0
            float[] r3 = r0.C2435A0.b(r6, r3, r6)
            if (r0 == 0) goto L_0x00ee
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00ef
        L_0x00ee:
            r6 = 0
        L_0x00ef:
            r0.C2435A0.e(r3, r6)
            lf.M r6 = lf.C6514M.f71813a
            r0.y0 r8 = r5.a(r3)
            r3 = r4 & 112(0x70, float:1.57E-43)
            int r4 = r4 >> 3
            r4 = r4 & 896(0x380, float:1.256E-42)
            r10 = r3 | r4
            r15 = 56
            r5 = 0
            r6 = 0
            r7 = 0
            r3 = r26
            r4 = r28
            r9 = r11
            r16 = r11
            r11 = r15
            x.C2842F.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r3 = r0
        L_0x0111:
            Y.Y0 r7 = r16.k()
            if (r7 == 0) goto L_0x012a
            io.intercom.android.sdk.survey.ui.questiontype.numericscale.e r8 = new io.intercom.android.sdk.survey.ui.questiontype.numericscale.e
            r0 = r8
            r1 = r25
            r2 = r26
            r4 = r28
            r5 = r30
            r6 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x012a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.survey.ui.questiontype.numericscale.EmojiRatingKt.EmojiRating(java.lang.String, java.lang.String, boolean, k0.i, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M EmojiRating$lambda$2(String str, String str2, boolean z10, i iVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(str, "$emojiUrl");
        C6496s.h(str2, "$contentDescription");
        C6496s.h(iVar, "$modifier");
        EmojiRating(str, str2, z10, iVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    public static final void SelectedEmoji(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1230381561);
        if (i10 != 0 || !h10.i()) {
            EmojiRating("https://js.intercomcdn.com/images/emojis/v2/72x72/1f929.png", "🤩", true, q.n(i.f23074a, h.j((float) 44)), h10, 3510, 0);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new c(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M SelectedEmoji$lambda$3(int i10, C1500m mVar, int i11) {
        SelectedEmoji(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void UnSelectedEmoji(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(2043776160);
        if (i10 != 0 || !h10.i()) {
            EmojiRating("https://js.intercomcdn.com/images/emojis/v2/72x72/1f929.png", "🤩", false, q.n(i.f23074a, h.j((float) 44)), h10, 3510, 0);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new d(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M UnSelectedEmoji$lambda$4(int i10, C1500m mVar, int i11) {
        UnSelectedEmoji(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
