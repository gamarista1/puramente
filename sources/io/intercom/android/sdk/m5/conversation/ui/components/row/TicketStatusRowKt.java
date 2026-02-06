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

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aI\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0000H\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "eventStatus", "statusText", "time", "Lk0/i;", "modifier", "customStateLabel", "customStatePrefix", "Llf/M;", "TicketStatusRow", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lk0/i;Ljava/lang/String;Ljava/lang/String;LY/m;II)V", "SimplePreview", "(LY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TicketStatusRowKt {
    @IntercomPreviews
    public static final void SimplePreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1725833053);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$TicketStatusRowKt.INSTANCE.m312getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new y0(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M SimplePreview$lambda$4(int i10, C1500m mVar, int i11) {
        SimplePreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:126:0x04a4  */
    /* JADX WARNING: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void TicketStatusRow(java.lang.String r47, java.lang.String r48, java.lang.String r49, k0.i r50, java.lang.String r51, java.lang.String r52, Y.C1500m r53, int r54, int r55) {
        /*
            r1 = r47
            r2 = r48
            r0 = r49
            r15 = r54
            r3 = 3
            r4 = 8
            r5 = 16
            r6 = 32
            r14 = 6
            java.lang.String r7 = "eventStatus"
            kotlin.jvm.internal.C6496s.h(r1, r7)
            java.lang.String r7 = "statusText"
            kotlin.jvm.internal.C6496s.h(r2, r7)
            java.lang.String r7 = "time"
            kotlin.jvm.internal.C6496s.h(r0, r7)
            r7 = -1382529243(0xffffffffad984725, float:-1.7311994E-11)
            r8 = r53
            Y.m r13 = r8.h(r7)
            r7 = 1
            r8 = r55 & 1
            r9 = 2
            r12 = 4
            if (r8 == 0) goto L_0x0032
            r8 = r15 | 6
            goto L_0x0042
        L_0x0032:
            r8 = r15 & 14
            if (r8 != 0) goto L_0x0041
            boolean r8 = r13.S(r1)
            if (r8 == 0) goto L_0x003e
            r8 = r12
            goto L_0x003f
        L_0x003e:
            r8 = r9
        L_0x003f:
            r8 = r8 | r15
            goto L_0x0042
        L_0x0041:
            r8 = r15
        L_0x0042:
            r10 = r55 & 2
            if (r10 == 0) goto L_0x0049
            r8 = r8 | 48
            goto L_0x0057
        L_0x0049:
            r10 = r15 & 112(0x70, float:1.57E-43)
            if (r10 != 0) goto L_0x0057
            boolean r10 = r13.S(r2)
            if (r10 == 0) goto L_0x0055
            r10 = r6
            goto L_0x0056
        L_0x0055:
            r10 = r5
        L_0x0056:
            r8 = r8 | r10
        L_0x0057:
            r10 = r55 & 4
            if (r10 == 0) goto L_0x005e
            r8 = r8 | 384(0x180, float:5.38E-43)
            goto L_0x006e
        L_0x005e:
            r10 = r15 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x006e
            boolean r10 = r13.S(r0)
            if (r10 == 0) goto L_0x006b
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x006d
        L_0x006b:
            r10 = 128(0x80, float:1.794E-43)
        L_0x006d:
            r8 = r8 | r10
        L_0x006e:
            r10 = r55 & 8
            if (r10 == 0) goto L_0x0077
            r8 = r8 | 3072(0xc00, float:4.305E-42)
        L_0x0074:
            r11 = r50
            goto L_0x008a
        L_0x0077:
            r11 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x0074
            r11 = r50
            boolean r16 = r13.S(r11)
            if (r16 == 0) goto L_0x0086
            r16 = 2048(0x800, float:2.87E-42)
            goto L_0x0088
        L_0x0086:
            r16 = 1024(0x400, float:1.435E-42)
        L_0x0088:
            r8 = r8 | r16
        L_0x008a:
            r5 = r55 & 16
            if (r5 == 0) goto L_0x0093
            r8 = r8 | 24576(0x6000, float:3.4438E-41)
            r12 = r51
            goto L_0x00a9
        L_0x0093:
            r16 = 57344(0xe000, float:8.0356E-41)
            r16 = r15 & r16
            r12 = r51
            if (r16 != 0) goto L_0x00a9
            boolean r16 = r13.S(r12)
            if (r16 == 0) goto L_0x00a5
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a7
        L_0x00a5:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x00a7:
            r8 = r8 | r16
        L_0x00a9:
            r6 = r55 & 32
            r24 = 196608(0x30000, float:2.75506E-40)
            if (r6 == 0) goto L_0x00b6
            r8 = r8 | r24
            r9 = r52
        L_0x00b3:
            r25 = r8
            goto L_0x00cc
        L_0x00b6:
            r16 = 458752(0x70000, float:6.42848E-40)
            r16 = r15 & r16
            r9 = r52
            if (r16 != 0) goto L_0x00b3
            boolean r17 = r13.S(r9)
            if (r17 == 0) goto L_0x00c7
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c9
        L_0x00c7:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00c9:
            r8 = r8 | r17
            goto L_0x00b3
        L_0x00cc:
            r8 = 374491(0x5b6db, float:5.24774E-40)
            r8 = r25 & r8
            r14 = 74898(0x12492, float:1.04954E-40)
            if (r8 != r14) goto L_0x00e5
            boolean r8 = r13.i()
            if (r8 != 0) goto L_0x00dd
            goto L_0x00e5
        L_0x00dd:
            r13.I()
            r6 = r9
            r5 = r12
            r4 = r13
            goto L_0x049e
        L_0x00e5:
            if (r10 == 0) goto L_0x00eb
            k0.i$a r8 = k0.i.f23074a
            r14 = r8
            goto L_0x00ec
        L_0x00eb:
            r14 = r11
        L_0x00ec:
            r8 = 0
            if (r5 == 0) goto L_0x00f2
            r41 = r8
            goto L_0x00f4
        L_0x00f2:
            r41 = r12
        L_0x00f4:
            if (r6 == 0) goto L_0x00f9
            r42 = r8
            goto L_0x00fb
        L_0x00f9:
            r42 = r9
        L_0x00fb:
            r5 = 54
            r6 = 0
            r9 = 0
            if (r41 == 0) goto L_0x02f3
            if (r42 == 0) goto L_0x02f3
            r10 = 1097247159(0x4166a9b7, float:14.416434)
            r13.T(r10)
            k0.i r6 = androidx.compose.foundation.layout.q.h(r14, r6, r7, r8)
            k0.i r6 = androidx.compose.foundation.layout.q.v(r6, r8, r9, r3, r8)
            C.c r7 = C.C1085c.f882a
            C.c$f r8 = r7.b()
            k0.c$a r10 = k0.c.f23044a
            k0.c$b r11 = r10.g()
            H0.F r5 = C.C1090h.a(r8, r11, r13, r5)
            int r8 = Y.C1494j.a(r13, r9)
            Y.y r11 = r13.p()
            k0.i r6 = k0.h.e(r13, r6)
            J0.g$a r12 = J0.C1241g.f3853J
            yf.a r3 = r12.a()
            Y.f r16 = r13.j()
            if (r16 != 0) goto L_0x013c
            Y.C1494j.c()
        L_0x013c:
            r13.F()
            boolean r16 = r13.f()
            if (r16 == 0) goto L_0x0149
            r13.U(r3)
            goto L_0x014c
        L_0x0149:
            r13.q()
        L_0x014c:
            Y.m r3 = Y.F1.a(r13)
            yf.p r4 = r12.c()
            Y.F1.b(r3, r5, r4)
            yf.p r4 = r12.e()
            Y.F1.b(r3, r11, r4)
            yf.p r4 = r12.b()
            boolean r5 = r3.f()
            if (r5 != 0) goto L_0x0176
            java.lang.Object r5 = r3.A()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            boolean r5 = kotlin.jvm.internal.C6496s.c(r5, r11)
            if (r5 != 0) goto L_0x0184
        L_0x0176:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r3.r(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r3.V(r5, r4)
        L_0x0184:
            yf.p r4 = r12.d()
            Y.F1.b(r3, r6, r4)
            C.k r3 = C.C1093k.f978a
            k0.i$a r11 = k0.i.f23074a
            C.c$e r3 = r7.f()
            k0.c$c r4 = r10.l()
            H0.F r3 = C.W.b(r3, r4, r13, r9)
            int r4 = Y.C1494j.a(r13, r9)
            Y.y r5 = r13.p()
            k0.i r6 = k0.h.e(r13, r11)
            yf.a r7 = r12.a()
            Y.f r8 = r13.j()
            if (r8 != 0) goto L_0x01b4
            Y.C1494j.c()
        L_0x01b4:
            r13.F()
            boolean r8 = r13.f()
            if (r8 == 0) goto L_0x01c1
            r13.U(r7)
            goto L_0x01c4
        L_0x01c1:
            r13.q()
        L_0x01c4:
            Y.m r7 = Y.F1.a(r13)
            yf.p r8 = r12.c()
            Y.F1.b(r7, r3, r8)
            yf.p r3 = r12.e()
            Y.F1.b(r7, r5, r3)
            yf.p r3 = r12.b()
            boolean r5 = r7.f()
            if (r5 != 0) goto L_0x01ee
            java.lang.Object r5 = r7.A()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            boolean r5 = kotlin.jvm.internal.C6496s.c(r5, r8)
            if (r5 != 0) goto L_0x01fc
        L_0x01ee:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r7.r(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7.V(r4, r3)
        L_0x01fc:
            yf.p r3 = r12.d()
            Y.F1.b(r7, r6, r3)
            C.Z r3 = C.Z.f873a
            int r3 = io.intercom.android.sdk.R.drawable.intercom_ticket_detail_icon
            w0.c r16 = M0.e.c(r3, r13, r9)
            io.intercom.android.sdk.ui.theme.IntercomTheme r12 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r10 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomColors r3 = r12.getColors(r13, r10)
            long r19 = r3.m686getDescriptionText0d7_KjU()
            r22 = 56
            r23 = 4
            r17 = 0
            r18 = 0
            r21 = r13
            V.V.a(r16, r17, r18, r19, r21, r22, r23)
            r3 = 8
            float r3 = (float) r3
            float r3 = c1.h.j(r3)
            k0.i r3 = androidx.compose.foundation.layout.q.r(r11, r3)
            r8 = 6
            C.a0.a(r3, r13, r8)
            io.intercom.android.sdk.ui.theme.IntercomColors r3 = r12.getColors(r13, r10)
            long r16 = r3.m686getDescriptionText0d7_KjU()
            io.intercom.android.sdk.ui.theme.IntercomTypography r3 = r12.getTypography(r13, r10)
            Q0.T r7 = r3.getType04Point5()
            b1.j$a r19 = b1.j.f19110b
            int r3 = r19.a()
            b1.t$a r20 = b1.t.f19154a
            int r18 = r20.b()
            b1.j r21 = b1.j.h(r3)
            int r3 = r25 >> 15
            r3 = r3 & 14
            r4 = 14155776(0xd80000, float:1.9836467E-38)
            r3 = r3 | r4
            r4 = 3
            int r4 = r25 >> 3
            r4 = r4 & 112(0x70, float:1.57E-43)
            r22 = r3 | r4
            r23 = 12
            r5 = 0
            r6 = 0
            r26 = 1
            r3 = r42
            r4 = r49
            r27 = r8
            r8 = r16
            r43 = r10
            r10 = r18
            r44 = r11
            r11 = r26
            r45 = r12
            r12 = r21
            r50 = r13
            r46 = r14
            r14 = r22
            r15 = r23
            io.intercom.android.sdk.m5.components.TextWithSeparatorKt.m206TextWithSeparatorwV1YYcM(r3, r4, r5, r6, r7, r8, r10, r11, r12, r13, r14, r15)
            r50.u()
            r3 = 4
            float r3 = (float) r3
            float r3 = c1.h.j(r3)
            r4 = r44
            k0.i r3 = androidx.compose.foundation.layout.q.i(r4, r3)
            r4 = r50
            r10 = 6
            C.a0.a(r3, r4, r10)
            r5 = r43
            r3 = r45
            io.intercom.android.sdk.ui.theme.IntercomColors r6 = r3.getColors(r4, r5)
            long r17 = r6.m686getDescriptionText0d7_KjU()
            io.intercom.android.sdk.ui.theme.IntercomTypography r3 = r3.getTypography(r4, r5)
            Q0.T r35 = r3.getType04Point5()
            int r3 = r19.a()
            int r30 = r20.b()
            V0.p$a r5 = V0.p.f8210b
            V0.p r22 = r5.a()
            b1.j r27 = b1.j.h(r3)
            int r3 = r25 >> 12
            r3 = r3 & 14
            r37 = r3 | r24
            r38 = 3120(0xc30, float:4.372E-42)
            r39 = 54746(0xd5da, float:7.6715E-41)
            r16 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r28 = 0
            r31 = 0
            r32 = 1
            r33 = 0
            r34 = 0
            r15 = r41
            r36 = r4
            V.T0.b(r15, r16, r17, r19, r21, r22, r23, r24, r26, r27, r28, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            r4.u()
            r4.M()
            r11 = r46
            goto L_0x049a
        L_0x02f3:
            r4 = r13
            r46 = r14
            r10 = 6
            r3 = 1098677964(0x417c7ecc, float:15.780956)
            r4.T(r3)
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r3 = r2.toLowerCase(r3)
            java.lang.String r11 = "toLowerCase(...)"
            kotlin.jvm.internal.C6496s.g(r3, r11)
            java.lang.String r11 = "submitted"
            boolean r11 = kotlin.jvm.internal.C6496s.c(r1, r11)
            java.lang.String r12 = "timestamp"
            java.lang.String r13 = "</b>"
            java.lang.String r14 = "<b>"
            if (r11 == 0) goto L_0x0350
            r11 = 1098747900(0x417d8ffc, float:15.847652)
            r4.T(r11)
            Y.I0 r11 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r11 = r4.m(r11)
            android.content.Context r11 = (android.content.Context) r11
            int r15 = io.intercom.android.sdk.R.string.intercom_tickets_status_event_submitted
            io.intercom.android.sdk.utilities.Phrase r11 = io.intercom.android.sdk.utilities.Phrase.from((android.content.Context) r11, (int) r15)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r14)
            r15.append(r3)
            r15.append(r13)
            java.lang.String r3 = r15.toString()
            java.lang.String r13 = "submitted_status"
            io.intercom.android.sdk.utilities.Phrase r3 = r11.put((java.lang.String) r13, (java.lang.CharSequence) r3)
            io.intercom.android.sdk.utilities.Phrase r3 = r3.put((java.lang.String) r12, (java.lang.CharSequence) r0)
            java.lang.CharSequence r3 = r3.format()
            r4.M()
            goto L_0x0389
        L_0x0350:
            r11 = 1098996489(0x41815b09, float:16.16945)
            r4.T(r11)
            Y.I0 r11 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r11 = r4.m(r11)
            android.content.Context r11 = (android.content.Context) r11
            int r15 = io.intercom.android.sdk.R.string.intercom_tickets_status_change_event
            io.intercom.android.sdk.utilities.Phrase r11 = io.intercom.android.sdk.utilities.Phrase.from((android.content.Context) r11, (int) r15)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r14)
            r15.append(r3)
            r15.append(r13)
            java.lang.String r3 = r15.toString()
            java.lang.String r13 = "status"
            io.intercom.android.sdk.utilities.Phrase r3 = r11.put((java.lang.String) r13, (java.lang.CharSequence) r3)
            io.intercom.android.sdk.utilities.Phrase r3 = r3.put((java.lang.String) r12, (java.lang.CharSequence) r0)
            java.lang.CharSequence r3 = r3.format()
            r4.M()
        L_0x0389:
            java.lang.String r3 = r3.toString()
            android.text.Spanned r3 = w1.b.a(r3, r9)
            java.lang.String r11 = "fromHtml(...)"
            kotlin.jvm.internal.C6496s.g(r3, r11)
            Y.I0 r11 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r11 = r4.m(r11)
            android.content.Context r11 = (android.content.Context) r11
            r12 = 2
            Q0.d r3 = io.intercom.android.sdk.survey.block.BlockExtensionsKt.toAnnotatedString$default(r3, r11, r8, r12, r8)
            r11 = r46
            k0.i r6 = androidx.compose.foundation.layout.q.h(r11, r6, r7, r8)
            r7 = 3
            k0.i r6 = androidx.compose.foundation.layout.q.v(r6, r8, r9, r7, r8)
            C.c r7 = C.C1085c.f882a
            C.c$f r7 = r7.b()
            k0.c$a r8 = k0.c.f23044a
            k0.c$c r8 = r8.i()
            H0.F r5 = C.W.b(r7, r8, r4, r5)
            int r7 = Y.C1494j.a(r4, r9)
            Y.y r8 = r4.p()
            k0.i r6 = k0.h.e(r4, r6)
            J0.g$a r12 = J0.C1241g.f3853J
            yf.a r13 = r12.a()
            Y.f r14 = r4.j()
            if (r14 != 0) goto L_0x03db
            Y.C1494j.c()
        L_0x03db:
            r4.F()
            boolean r14 = r4.f()
            if (r14 == 0) goto L_0x03e8
            r4.U(r13)
            goto L_0x03eb
        L_0x03e8:
            r4.q()
        L_0x03eb:
            Y.m r13 = Y.F1.a(r4)
            yf.p r14 = r12.c()
            Y.F1.b(r13, r5, r14)
            yf.p r5 = r12.e()
            Y.F1.b(r13, r8, r5)
            yf.p r5 = r12.b()
            boolean r8 = r13.f()
            if (r8 != 0) goto L_0x0415
            java.lang.Object r8 = r13.A()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.C6496s.c(r8, r14)
            if (r8 != 0) goto L_0x0423
        L_0x0415:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r13.r(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r13.V(r7, r5)
        L_0x0423:
            yf.p r5 = r12.d()
            Y.F1.b(r13, r6, r5)
            C.Z r5 = C.Z.f873a
            int r5 = io.intercom.android.sdk.R.drawable.intercom_ticket_detail_icon
            w0.c r15 = M0.e.c(r5, r4, r9)
            io.intercom.android.sdk.ui.theme.IntercomTheme r5 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r6 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomColors r7 = r5.getColors(r4, r6)
            long r18 = r7.m686getDescriptionText0d7_KjU()
            r21 = 56
            r22 = 4
            r16 = 0
            r17 = 0
            r20 = r4
            V.V.a(r15, r16, r17, r18, r20, r21, r22)
            k0.i$a r7 = k0.i.f23074a
            r8 = 8
            float r8 = (float) r8
            float r8 = c1.h.j(r8)
            k0.i r7 = androidx.compose.foundation.layout.q.r(r7, r8)
            C.a0.a(r7, r4, r10)
            io.intercom.android.sdk.ui.theme.IntercomColors r7 = r5.getColors(r4, r6)
            long r17 = r7.m686getDescriptionText0d7_KjU()
            io.intercom.android.sdk.ui.theme.IntercomTypography r5 = r5.getTypography(r4, r6)
            Q0.T r36 = r5.getType04Point5()
            r39 = 0
            r40 = 131066(0x1fffa, float:1.83663E-40)
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r38 = 0
            r15 = r3
            r37 = r4
            V.T0.c(r15, r16, r17, r19, r21, r22, r23, r24, r26, r27, r28, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r4.u()
            r4.M()
        L_0x049a:
            r5 = r41
            r6 = r42
        L_0x049e:
            Y.Y0 r9 = r4.k()
            if (r9 == 0) goto L_0x04b8
            io.intercom.android.sdk.m5.conversation.ui.components.row.z0 r10 = new io.intercom.android.sdk.m5.conversation.ui.components.row.z0
            r0 = r10
            r1 = r47
            r2 = r48
            r3 = r49
            r4 = r11
            r7 = r54
            r8 = r55
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x04b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.ui.components.row.TicketStatusRowKt.TicketStatusRow(java.lang.String, java.lang.String, java.lang.String, k0.i, java.lang.String, java.lang.String, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M TicketStatusRow$lambda$3(String str, String str2, String str3, i iVar, String str4, String str5, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(str, "$eventStatus");
        C6496s.h(str2, "$statusText");
        C6496s.h(str3, "$time");
        TicketStatusRow(str, str2, str3, iVar, str4, str5, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }
}
