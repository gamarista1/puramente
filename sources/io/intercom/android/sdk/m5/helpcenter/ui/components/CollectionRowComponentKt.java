package io.intercom.android.sdk.m5.helpcenter.ui.components;

import V.B0;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionRowData;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a5\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lio/intercom/android/sdk/m5/helpcenter/states/CollectionRowData;", "rowData", "Lkotlin/Function1;", "", "Llf/M;", "onClick", "Lk0/i;", "modifier", "CollectionRowComponent", "(Lio/intercom/android/sdk/m5/helpcenter/states/CollectionRowData;Lyf/l;Lk0/i;LY/m;II)V", "RowPreview", "(LY/m;I)V", "RowWithNoDescriptionPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CollectionRowComponentKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: yf.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: k0.i$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0371  */
    /* JADX WARNING: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void CollectionRowComponent(io.intercom.android.sdk.m5.helpcenter.states.CollectionRowData r35, yf.C6798l r36, k0.i r37, Y.C1500m r38, int r39, int r40) {
        /*
            r1 = r35
            r2 = r36
            r4 = r39
            r0 = 48
            r3 = 6
            java.lang.String r5 = "rowData"
            kotlin.jvm.internal.C6496s.h(r1, r5)
            java.lang.String r5 = "onClick"
            kotlin.jvm.internal.C6496s.h(r2, r5)
            r5 = -471072842(0xffffffffe3ebffb6, float:-8.7068215E21)
            r6 = r38
            Y.m r5 = r6.h(r5)
            r15 = 1
            r6 = r40 & 1
            r14 = 2
            r12 = 4
            if (r6 == 0) goto L_0x0026
            r6 = r4 | 6
            goto L_0x0036
        L_0x0026:
            r6 = r4 & 14
            if (r6 != 0) goto L_0x0035
            boolean r6 = r5.S(r1)
            if (r6 == 0) goto L_0x0032
            r6 = r12
            goto L_0x0033
        L_0x0032:
            r6 = r14
        L_0x0033:
            r6 = r6 | r4
            goto L_0x0036
        L_0x0035:
            r6 = r4
        L_0x0036:
            r7 = r40 & 2
            r8 = 16
            r9 = 32
            if (r7 == 0) goto L_0x0040
            r6 = r6 | r0
            goto L_0x004e
        L_0x0040:
            r7 = r4 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x004e
            boolean r7 = r5.C(r2)
            if (r7 == 0) goto L_0x004c
            r7 = r9
            goto L_0x004d
        L_0x004c:
            r7 = r8
        L_0x004d:
            r6 = r6 | r7
        L_0x004e:
            r7 = r40 & 4
            if (r7 == 0) goto L_0x0057
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x0054:
            r10 = r37
            goto L_0x0069
        L_0x0057:
            r10 = r4 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x0054
            r10 = r37
            boolean r11 = r5.S(r10)
            if (r11 == 0) goto L_0x0066
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0068
        L_0x0066:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0068:
            r6 = r6 | r11
        L_0x0069:
            r11 = r6 & 731(0x2db, float:1.024E-42)
            r13 = 146(0x92, float:2.05E-43)
            if (r11 != r13) goto L_0x007c
            boolean r11 = r5.i()
            if (r11 != 0) goto L_0x0076
            goto L_0x007c
        L_0x0076:
            r5.I()
            r3 = r10
            goto L_0x036b
        L_0x007c:
            if (r7 == 0) goto L_0x0081
            k0.i$a r7 = k0.i.f23074a
            r10 = r7
        L_0x0081:
            r11 = 0
            r7 = 0
            k0.i r16 = androidx.compose.foundation.layout.q.h(r10, r11, r15, r7)
            r13 = 1498669980(0x5953e39c, float:3.72759245E15)
            r5.T(r13)
            r13 = r6 & 112(0x70, float:1.57E-43)
            r3 = 0
            if (r13 != r9) goto L_0x0094
            r9 = r15
            goto L_0x0095
        L_0x0094:
            r9 = r3
        L_0x0095:
            r6 = r6 & 14
            if (r6 != r12) goto L_0x009b
            r6 = r15
            goto L_0x009c
        L_0x009b:
            r6 = r3
        L_0x009c:
            r6 = r6 | r9
            java.lang.Object r9 = r5.A()
            if (r6 != 0) goto L_0x00ab
            Y.m$a r6 = Y.C1500m.f10026a
            java.lang.Object r6 = r6.a()
            if (r9 != r6) goto L_0x00b3
        L_0x00ab:
            io.intercom.android.sdk.m5.helpcenter.ui.components.t r9 = new io.intercom.android.sdk.m5.helpcenter.ui.components.t
            r9.<init>(r2, r1)
            r5.r(r9)
        L_0x00b3:
            r20 = r9
            yf.a r20 = (yf.C6787a) r20
            r5.M()
            r21 = 7
            r22 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            k0.i r23 = androidx.compose.foundation.d.d(r16, r17, r18, r19, r20, r21, r22)
            float r8 = (float) r8
            float r25 = c1.h.j(r8)
            float r24 = c1.h.j(r8)
            r28 = 12
            r29 = 0
            r26 = 0
            r27 = 0
            k0.i r6 = androidx.compose.foundation.layout.n.m(r23, r24, r25, r26, r27, r28, r29)
            C.c r9 = C.C1085c.f882a
            C.c$m r13 = r9.g()
            k0.c$a r16 = k0.c.f23044a
            k0.c$b r7 = r16.k()
            H0.F r7 = C.C1090h.a(r13, r7, r5, r3)
            int r13 = Y.C1494j.a(r5, r3)
            Y.y r11 = r5.p()
            k0.i r6 = k0.h.e(r5, r6)
            J0.g$a r17 = J0.C1241g.f3853J
            yf.a r12 = r17.a()
            Y.f r19 = r5.j()
            if (r19 != 0) goto L_0x0108
            Y.C1494j.c()
        L_0x0108:
            r5.F()
            boolean r19 = r5.f()
            if (r19 == 0) goto L_0x0115
            r5.U(r12)
            goto L_0x0118
        L_0x0115:
            r5.q()
        L_0x0118:
            Y.m r12 = Y.F1.a(r5)
            yf.p r14 = r17.c()
            Y.F1.b(r12, r7, r14)
            yf.p r7 = r17.e()
            Y.F1.b(r12, r11, r7)
            yf.p r7 = r17.b()
            boolean r11 = r12.f()
            if (r11 != 0) goto L_0x0142
            java.lang.Object r11 = r12.A()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            boolean r11 = kotlin.jvm.internal.C6496s.c(r11, r14)
            if (r11 != 0) goto L_0x0150
        L_0x0142:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r13)
            r12.r(r11)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r13)
            r12.V(r11, r7)
        L_0x0150:
            yf.p r7 = r17.d()
            Y.F1.b(r12, r6, r7)
            C.k r6 = C.C1093k.f978a
            k0.c$c r6 = r16.i()
            k0.i$a r14 = k0.i.f23074a
            C.c$e r7 = r9.f()
            H0.F r0 = C.W.b(r7, r6, r5, r0)
            int r6 = Y.C1494j.a(r5, r3)
            Y.y r7 = r5.p()
            k0.i r11 = k0.h.e(r5, r14)
            yf.a r12 = r17.a()
            Y.f r13 = r5.j()
            if (r13 != 0) goto L_0x0180
            Y.C1494j.c()
        L_0x0180:
            r5.F()
            boolean r13 = r5.f()
            if (r13 == 0) goto L_0x018d
            r5.U(r12)
            goto L_0x0190
        L_0x018d:
            r5.q()
        L_0x0190:
            Y.m r12 = Y.F1.a(r5)
            yf.p r13 = r17.c()
            Y.F1.b(r12, r0, r13)
            yf.p r0 = r17.e()
            Y.F1.b(r12, r7, r0)
            yf.p r0 = r17.b()
            boolean r7 = r12.f()
            if (r7 != 0) goto L_0x01ba
            java.lang.Object r7 = r12.A()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r6)
            boolean r7 = kotlin.jvm.internal.C6496s.c(r7, r13)
            if (r7 != 0) goto L_0x01c8
        L_0x01ba:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r12.r(r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r12.V(r6, r0)
        L_0x01c8:
            yf.p r0 = r17.d()
            Y.F1.b(r12, r11, r0)
            C.Z r20 = C.Z.f873a
            r24 = 2
            r25 = 0
            r22 = 1065353216(0x3f800000, float:1.0)
            r23 = 0
            r21 = r14
            k0.i r0 = C.Y.b(r20, r21, r22, r23, r24, r25)
            C.c$m r6 = r9.g()
            k0.c$b r7 = r16.k()
            H0.F r6 = C.C1090h.a(r6, r7, r5, r3)
            int r7 = Y.C1494j.a(r5, r3)
            Y.y r9 = r5.p()
            k0.i r0 = k0.h.e(r5, r0)
            yf.a r11 = r17.a()
            Y.f r12 = r5.j()
            if (r12 != 0) goto L_0x0204
            Y.C1494j.c()
        L_0x0204:
            r5.F()
            boolean r12 = r5.f()
            if (r12 == 0) goto L_0x0211
            r5.U(r11)
            goto L_0x0214
        L_0x0211:
            r5.q()
        L_0x0214:
            Y.m r11 = Y.F1.a(r5)
            yf.p r12 = r17.c()
            Y.F1.b(r11, r6, r12)
            yf.p r6 = r17.e()
            Y.F1.b(r11, r9, r6)
            yf.p r6 = r17.b()
            boolean r9 = r11.f()
            if (r9 != 0) goto L_0x023e
            java.lang.Object r9 = r11.A()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)
            boolean r9 = kotlin.jvm.internal.C6496s.c(r9, r12)
            if (r9 != 0) goto L_0x024c
        L_0x023e:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            r11.r(r9)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r11.V(r7, r6)
        L_0x024c:
            yf.p r6 = r17.d()
            Y.F1.b(r11, r0, r6)
            java.lang.String r6 = r35.getTitleText()
            io.intercom.android.sdk.ui.theme.IntercomTheme r0 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r12 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomTypography r7 = r0.getTypography(r5, r12)
            Q0.T r26 = r7.getType04Point5()
            V0.p$a r7 = V0.p.f8210b
            V0.p r13 = r7.d()
            r29 = 0
            r30 = 65502(0xffde, float:9.1788E-41)
            r7 = 0
            r11 = 0
            r16 = 0
            r31 = r8
            r8 = r16
            r32 = r10
            r10 = r16
            r16 = 0
            r33 = r12
            r3 = 4
            r12 = r16
            r34 = r14
            r14 = r16
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r28 = 196608(0x30000, float:2.75506E-40)
            r27 = r5
            V.T0.b(r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            int r6 = r35.getDescriptionVisibility()
            if (r6 != 0) goto L_0x0313
            java.lang.String r6 = r35.getDescriptionText()
            boolean r6 = Sg.p.d0(r6)
            if (r6 != 0) goto L_0x0313
            r6 = -516077564(0xffffffffe13d4804, float:-2.182265E20)
            r5.T(r6)
            float r3 = (float) r3
            float r3 = c1.h.j(r3)
            r15 = r34
            k0.i r3 = androidx.compose.foundation.layout.q.i(r15, r3)
            r6 = 6
            C.a0.a(r3, r5, r6)
            java.lang.String r6 = r35.getDescriptionText()
            r3 = r33
            io.intercom.android.sdk.ui.theme.IntercomTypography r0 = r0.getTypography(r5, r3)
            Q0.T r26 = r0.getType04Point5()
            b1.t$a r0 = b1.t.f19154a
            int r21 = r0.b()
            r29 = 3120(0xc30, float:4.372E-42)
            r30 = 55294(0xd7fe, float:7.7483E-41)
            r7 = 0
            r8 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r0 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r22 = 0
            r23 = 3
            r24 = 0
            r25 = 0
            r28 = 0
            r27 = r5
            V.T0.b(r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r3 = 8
            float r3 = (float) r3
            float r3 = c1.h.j(r3)
            k0.i r3 = androidx.compose.foundation.layout.q.i(r0, r3)
            r6 = 6
            C.a0.a(r3, r5, r6)
            r5.M()
            goto L_0x032b
        L_0x0313:
            r0 = r34
            r6 = 6
            r7 = -515673200(0xffffffffe1437390, float:-2.2534014E20)
            r5.T(r7)
            float r3 = (float) r3
            float r3 = c1.h.j(r3)
            k0.i r3 = androidx.compose.foundation.layout.q.i(r0, r3)
            C.a0.a(r3, r5, r6)
            r5.M()
        L_0x032b:
            int r3 = r35.getArticlesCount()
            r7 = 1
            r8 = 0
            r9 = 0
            io.intercom.android.sdk.m5.helpcenter.ui.components.ArticleCountComponentKt.ArticleCountComponent(r8, r3, r5, r9, r7)
            r5.u()
            r3 = 22
            float r3 = (float) r3
            float r3 = c1.h.j(r3)
            r7 = 2
            r10 = 0
            k0.i r3 = androidx.compose.foundation.layout.n.k(r0, r3, r10, r7, r8)
            io.intercom.android.sdk.m5.components.IntercomChevronKt.IntercomChevron(r3, r5, r6, r9)
            r5.u()
            float r22 = c1.h.j(r31)
            float r23 = c1.h.j(r31)
            r25 = 9
            r26 = 0
            r21 = 0
            r24 = 0
            r20 = r0
            k0.i r0 = androidx.compose.foundation.layout.n.m(r20, r21, r22, r23, r24, r25, r26)
            r3 = 0
            r6 = 6
            io.intercom.android.sdk.ui.component.IntercomDividerKt.IntercomDivider(r0, r5, r6, r3)
            r5.u()
            r3 = r32
        L_0x036b:
            Y.Y0 r6 = r5.k()
            if (r6 == 0) goto L_0x0382
            io.intercom.android.sdk.m5.helpcenter.ui.components.u r7 = new io.intercom.android.sdk.m5.helpcenter.ui.components.u
            r0 = r7
            r1 = r35
            r2 = r36
            r4 = r39
            r5 = r40
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x0382:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.helpcenter.ui.components.CollectionRowComponentKt.CollectionRowComponent(io.intercom.android.sdk.m5.helpcenter.states.CollectionRowData, yf.l, k0.i, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M CollectionRowComponent$lambda$1$lambda$0(C6798l lVar, CollectionRowData collectionRowData) {
        C6496s.h(lVar, "$onClick");
        C6496s.h(collectionRowData, "$rowData");
        lVar.invoke(collectionRowData.getId());
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M CollectionRowComponent$lambda$5(CollectionRowData collectionRowData, C6798l lVar, i iVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(collectionRowData, "$rowData");
        C6496s.h(lVar, "$onClick");
        CollectionRowComponent(collectionRowData, lVar, iVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void RowPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(2042373209);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$CollectionRowComponentKt.INSTANCE.m351getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new s(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M RowPreview$lambda$6(int i10, C1500m mVar, int i11) {
        RowPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void RowWithNoDescriptionPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-613238090);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$CollectionRowComponentKt.INSTANCE.m353getLambda4$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new r(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M RowWithNoDescriptionPreview$lambda$7(int i10, C1500m mVar, int i11) {
        RowWithNoDescriptionPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
