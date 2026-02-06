package io.intercom.android.sdk.views.compose;

import C.C1092j;
import Y.C1500m;
import Y.C1510r0;
import Y.o1;
import android.content.res.Resources;
import io.intercom.android.sdk.models.Attribute;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6798l;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class AttributeCollectorCardKt$AttributeCollectorCard$2 implements q {
    final /* synthetic */ List<Attribute> $attributes;
    final /* synthetic */ List<String> $failedAttributeIdentifiers;
    final /* synthetic */ boolean $isFormDisabled;
    final /* synthetic */ List<String> $loadingAttributeIdentifiers;
    final /* synthetic */ C6798l $onSubmitAttribute;
    final /* synthetic */ String $partId;
    final /* synthetic */ Resources $resources;

    AttributeCollectorCardKt$AttributeCollectorCard$2(List<Attribute> list, List<String> list2, Resources resources, List<String> list3, String str, boolean z10, C6798l lVar) {
        this.$attributes = list;
        this.$failedAttributeIdentifiers = list2;
        this.$resources = resources;
        this.$loadingAttributeIdentifiers = list3;
        this.$partId = str;
        this.$isFormDisabled = z10;
        this.$onSubmitAttribute = lVar;
    }

    /* access modifiers changed from: private */
    public static final C1510r0 invoke$lambda$10$lambda$9$lambda$2() {
        return u1.d("", (o1) null, 2, (Object) null);
    }

    private static final String invoke$lambda$10$lambda$9$lambda$3(C1510r0 r0Var) {
        return (String) r0Var.getValue();
    }

    private static final void invoke$lambda$10$lambda$9$lambda$4(C1510r0 r0Var, String str) {
        r0Var.setValue(str);
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$10$lambda$9$lambda$7$lambda$6(C1510r0 r0Var, String str) {
        C6496s.h(r0Var, "$validationError$delegate");
        C6496s.h(str, "it");
        invoke$lambda$10$lambda$9$lambda$4(r0Var, str);
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1092j) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0455, code lost:
        if (r1.equals(io.intercom.android.sdk.models.AttributeType.NUMBER) == false) goto L_0x0457;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0457, code lost:
        r11.T(-639614028);
        r49.M();
        r1 = lf.C6514M.f71813a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0463, code lost:
        r11.T(672066800);
        r11.T(672076166);
        r8 = r44;
        r1 = r11.S(r8);
        r4 = r49.A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0479, code lost:
        if (r1 != false) goto L_0x0483;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0481, code lost:
        if (r4 != Y.C1500m.f10026a.a()) goto L_0x048b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0483, code lost:
        r4 = new io.intercom.android.sdk.views.compose.C6365h(r8);
        r11.r(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x048b, code lost:
        r49.M();
        r17 = r8;
        io.intercom.android.sdk.views.compose.TextAttributeCollectorKt.TextAttributeCollector(r3, r2, r32, (yf.C6798l) r4, r30, r49, 70, 0);
        r49.M();
        r1 = lf.C6514M.f71813a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x04a7, code lost:
        r11.T(672105265);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x04b5, code lost:
        if (invoke$lambda$10$lambda$9$lambda$3(r17).length() <= 0) goto L_0x04b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x04bc, code lost:
        if (r31.length() <= 0) goto L_0x0527;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x04be, code lost:
        r2 = androidx.compose.foundation.layout.n.m(androidx.compose.foundation.layout.q.h(r0, 0.0f, 1, (java.lang.Object) null), 0.0f, c1.h.j(r10), 0.0f, 0.0f, 13, (java.lang.Object) null);
        r0 = invoke$lambda$10$lambda$9$lambda$3(r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x04d8, code lost:
        if (r0.length() != 0) goto L_0x04e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x04da, code lost:
        r1 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x04e1, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x04e3, code lost:
        r21 = r46.getTypography(r11, r45).getType04();
        r3 = M0.b.a(io.intercom.android.sdk.R.color.intercom_attribute_collector_error, r11, 0);
        r16 = r33.b();
        r32 = r14;
        r33 = r15;
        V.T0.b(r1, r2, r3, 0, (V0.n) null, (V0.p) null, (V0.h) null, 0, (b1.k) null, (b1.j) null, 0, r16, false, 3, 0, (yf.C6798l) null, r21, r49, 48, 3120, 55288);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0527, code lost:
        r32 = r14;
        r33 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0530, code lost:
        r49.M();
        r49.u();
        r4 = r27 + 1;
        r0 = r47;
        r14 = r49;
        r9 = r28;
        r5 = r29;
        r6 = r30;
        r8 = r32;
        r7 = r33;
        r12 = r37;
        r13 = r38;
        r10 = r39;
        r11 = r40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x03b7, code lost:
        r11 = r49;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x03c1, code lost:
        if (r1.equals(io.intercom.android.sdk.models.AttributeType.PHONE) == false) goto L_0x03b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x03c4, code lost:
        r11 = r49;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x03ce, code lost:
        if (r1.equals(io.intercom.android.sdk.models.AttributeType.FLOAT) == false) goto L_0x03b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x03d7, code lost:
        if (r1.equals("email") == false) goto L_0x03b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x03e0, code lost:
        if (r1.equals(io.intercom.android.sdk.models.AttributeType.WEBSITE) != false) goto L_0x03c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0410, code lost:
        r17 = r44;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x041c, code lost:
        if (r1.equals(io.intercom.android.sdk.models.AttributeType.TEXT) == false) goto L_0x0457;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(C.C1092j r48, Y.C1500m r49, int r50) {
        /*
            r47 = this;
            r0 = r47
            r14 = r49
            java.lang.String r1 = "$this$IntercomCard"
            r2 = r48
            kotlin.jvm.internal.C6496s.h(r2, r1)
            r1 = r50 & 81
            r2 = 16
            if (r1 != r2) goto L_0x001d
            boolean r1 = r49.i()
            if (r1 != 0) goto L_0x0018
            goto L_0x001d
        L_0x0018:
            r49.I()
            goto L_0x0556
        L_0x001d:
            k0.i$a r1 = k0.i.f23074a
            r2 = 24
            float r13 = (float) r2
            float r2 = c1.h.j(r13)
            k0.i r1 = androidx.compose.foundation.layout.n.i(r1, r2)
            java.util.List<io.intercom.android.sdk.models.Attribute> r12 = r0.$attributes
            java.util.List<java.lang.String> r10 = r0.$failedAttributeIdentifiers
            android.content.res.Resources r11 = r0.$resources
            java.util.List<java.lang.String> r9 = r0.$loadingAttributeIdentifiers
            java.lang.String r8 = r0.$partId
            boolean r7 = r0.$isFormDisabled
            yf.l r6 = r0.$onSubmitAttribute
            C.c r2 = C.C1085c.f882a
            C.c$m r2 = r2.g()
            k0.c$a r3 = k0.c.f23044a
            k0.c$b r3 = r3.k()
            r5 = 0
            H0.F r2 = C.C1090h.a(r2, r3, r14, r5)
            int r3 = Y.C1494j.a(r14, r5)
            Y.y r4 = r49.p()
            k0.i r1 = k0.h.e(r14, r1)
            J0.g$a r16 = J0.C1241g.f3853J
            yf.a r5 = r16.a()
            Y.f r17 = r49.j()
            if (r17 != 0) goto L_0x0064
            Y.C1494j.c()
        L_0x0064:
            r49.F()
            boolean r17 = r49.f()
            if (r17 == 0) goto L_0x0071
            r14.U(r5)
            goto L_0x0074
        L_0x0071:
            r49.q()
        L_0x0074:
            Y.m r5 = Y.F1.a(r49)
            yf.p r15 = r16.c()
            Y.F1.b(r5, r2, r15)
            yf.p r2 = r16.e()
            Y.F1.b(r5, r4, r2)
            yf.p r2 = r16.b()
            boolean r4 = r5.f()
            if (r4 != 0) goto L_0x009e
            java.lang.Object r4 = r5.A()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r3)
            boolean r4 = kotlin.jvm.internal.C6496s.c(r4, r15)
            if (r4 != 0) goto L_0x00ac
        L_0x009e:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r5.r(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5.V(r3, r2)
        L_0x00ac:
            yf.p r2 = r16.d()
            Y.F1.b(r5, r1, r2)
            C.k r1 = C.C1093k.f978a
            java.util.Iterator r1 = r12.iterator()
            r2 = 0
        L_0x00ba:
            boolean r3 = r1.hasNext()
            r4 = -1
            if (r3 == 0) goto L_0x00d1
            java.lang.Object r3 = r1.next()
            io.intercom.android.sdk.models.Attribute r3 = (io.intercom.android.sdk.models.Attribute) r3
            boolean r3 = r3.hasValue()
            if (r3 != 0) goto L_0x00ce
            goto L_0x00d2
        L_0x00ce:
            r3 = 1
            int r2 = r2 + r3
            goto L_0x00ba
        L_0x00d1:
            r2 = r4
        L_0x00d2:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            int r2 = r1.intValue()
            if (r2 == r4) goto L_0x00dd
            goto L_0x00de
        L_0x00dd:
            r1 = 0
        L_0x00de:
            if (r1 == 0) goto L_0x00e6
            int r1 = r1.intValue()
            r2 = 1
            goto L_0x00ec
        L_0x00e6:
            int r1 = r12.size()
            r2 = 1
            int r1 = r1 - r2
        L_0x00ec:
            r3 = 1866899712(0x6f46a100, float:6.147267E28)
            r14.T(r3)
            int r5 = r1 + 1
            r4 = 0
        L_0x00f5:
            if (r4 >= r5) goto L_0x0550
            java.lang.Object r1 = r12.get(r4)
            r3 = r1
            io.intercom.android.sdk.models.Attribute r3 = (io.intercom.android.sdk.models.Attribute) r3
            k0.i$a r2 = k0.i.f23074a
            C.c r16 = C.C1085c.f882a
            C.c$m r1 = r16.g()
            k0.c$a r18 = k0.c.f23044a
            k0.c$b r15 = r18.k()
            r0 = 0
            H0.F r1 = C.C1090h.a(r1, r15, r14, r0)
            int r15 = Y.C1494j.a(r14, r0)
            Y.y r0 = r49.p()
            r19 = r3
            k0.i r3 = k0.h.e(r14, r2)
            J0.g$a r20 = J0.C1241g.f3853J
            r21 = r2
            yf.a r2 = r20.a()
            Y.f r22 = r49.j()
            if (r22 != 0) goto L_0x0130
            Y.C1494j.c()
        L_0x0130:
            r49.F()
            boolean r22 = r49.f()
            if (r22 == 0) goto L_0x013d
            r14.U(r2)
            goto L_0x0140
        L_0x013d:
            r49.q()
        L_0x0140:
            Y.m r2 = Y.F1.a(r49)
            r22 = r4
            yf.p r4 = r20.c()
            Y.F1.b(r2, r1, r4)
            yf.p r1 = r20.e()
            Y.F1.b(r2, r0, r1)
            yf.p r0 = r20.b()
            boolean r1 = r2.f()
            if (r1 != 0) goto L_0x016c
            java.lang.Object r1 = r2.A()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)
            boolean r1 = kotlin.jvm.internal.C6496s.c(r1, r4)
            if (r1 != 0) goto L_0x017a
        L_0x016c:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r2.r(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r2.V(r1, r0)
        L_0x017a:
            yf.p r0 = r20.d()
            Y.F1.b(r2, r3, r0)
            C.k r0 = C.C1093k.f978a
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            io.intercom.android.sdk.views.compose.g r4 = new io.intercom.android.sdk.views.compose.g
            r4.<init>()
            r15 = 3080(0xc08, float:4.316E-42)
            r23 = 6
            r2 = 0
            r3 = 0
            r0 = r21
            r26 = r19
            r27 = r22
            r29 = r5
            r28 = r8
            r8 = 0
            r5 = r49
            r30 = r6
            r6 = r15
            r15 = r7
            r7 = r23
            java.lang.Object r1 = h0.C2018b.e(r1, r2, r3, r4, r5, r6, r7)
            r2 = r1
            Y.r0 r2 = (Y.C1510r0) r2
            java.lang.String r1 = r26.getIdentifier()
            boolean r1 = r10.contains(r1)
            if (r1 == 0) goto L_0x01be
            int r1 = io.intercom.android.sdk.R.string.intercom_something_went_wrong_try_again
            java.lang.String r1 = r11.getString(r1)
        L_0x01bb:
            r31 = r1
            goto L_0x01c1
        L_0x01be:
            java.lang.String r1 = ""
            goto L_0x01bb
        L_0x01c1:
            kotlin.jvm.internal.C6496s.e(r31)
            java.lang.String r1 = r26.getIdentifier()
            boolean r32 = r9.contains(r1)
            r1 = 672001750(0x280deed6, float:7.878862E-15)
            r14.T(r1)
            if (r27 <= 0) goto L_0x01e0
            float r1 = c1.h.j(r13)
            k0.i r1 = androidx.compose.foundation.layout.q.i(r0, r1)
            r3 = 6
            C.a0.a(r1, r14, r3)
        L_0x01e0:
            r49.M()
            r1 = 0
            r3 = 1
            r7 = 0
            k0.i r4 = androidx.compose.foundation.layout.q.h(r0, r1, r3, r7)
            C.c$e r3 = r16.f()
            k0.c$c r5 = r18.l()
            H0.F r3 = C.W.b(r3, r5, r14, r8)
            int r5 = Y.C1494j.a(r14, r8)
            Y.y r6 = r49.p()
            k0.i r4 = k0.h.e(r14, r4)
            yf.a r1 = r20.a()
            Y.f r16 = r49.j()
            if (r16 != 0) goto L_0x020f
            Y.C1494j.c()
        L_0x020f:
            r49.F()
            boolean r16 = r49.f()
            if (r16 == 0) goto L_0x021c
            r14.U(r1)
            goto L_0x021f
        L_0x021c:
            r49.q()
        L_0x021f:
            Y.m r1 = Y.F1.a(r49)
            yf.p r7 = r20.c()
            Y.F1.b(r1, r3, r7)
            yf.p r3 = r20.e()
            Y.F1.b(r1, r6, r3)
            yf.p r3 = r20.b()
            boolean r6 = r1.f()
            if (r6 != 0) goto L_0x0249
            java.lang.Object r6 = r1.A()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            boolean r6 = kotlin.jvm.internal.C6496s.c(r6, r7)
            if (r6 != 0) goto L_0x0257
        L_0x0249:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r1.r(r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1.V(r5, r3)
        L_0x0257:
            yf.p r3 = r20.d()
            Y.F1.b(r1, r4, r3)
            C.Z r18 = C.Z.f873a
            r22 = 2
            r23 = 0
            r20 = 1065353216(0x3f800000, float:1.0)
            r21 = 0
            r19 = r0
            k0.i r22 = C.Y.b(r18, r19, r20, r21, r22, r23)
            int r1 = r12.size()
            r7 = 1
            if (r1 <= r7) goto L_0x0290
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r4 = r27 + 1
            r1.append(r4)
            java.lang.String r3 = ". "
            r1.append(r3)
            java.lang.String r3 = r26.getName()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            goto L_0x0294
        L_0x0290:
            java.lang.String r1 = r26.getName()
        L_0x0294:
            io.intercom.android.sdk.ui.theme.IntercomTheme r5 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r6 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomTypography r3 = r5.getTypography(r14, r6)
            Q0.T r21 = r3.getType04()
            b1.t$a r33 = b1.t.f19154a
            int r16 = r33.b()
            r24 = 3120(0xc30, float:4.372E-42)
            r25 = 55292(0xd7fc, float:7.748E-41)
            r3 = 0
            r17 = 0
            r34 = r5
            r35 = r6
            r5 = r17
            r17 = 0
            r19 = r7
            r18 = 0
            r7 = r17
            r36 = r28
            r8 = r17
            r28 = r9
            r9 = r17
            r37 = 0
            r39 = r10
            r40 = r11
            r10 = r37
            r37 = r12
            r12 = r17
            r38 = r13
            r13 = r17
            r41 = 0
            r43 = r15
            r14 = r41
            r17 = 0
            r18 = 2
            r19 = 0
            r20 = 0
            r23 = 0
            r44 = r2
            r2 = r22
            r22 = r49
            V.T0.b(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r1 = -86962638(0xfffffffffad10e32, float:-5.4273898E35)
            r14 = r49
            r14.T(r1)
            if (r27 != 0) goto L_0x037b
            int r1 = r37.size()
            r15 = 1
            if (r1 <= r15) goto L_0x037b
            r1 = 8
            float r1 = (float) r1
            float r19 = c1.h.j(r1)
            r23 = 14
            r24 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r18 = r0
            k0.i r2 = androidx.compose.foundation.layout.n.m(r18, r19, r20, r21, r22, r23, r24)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r3 = 40
            r1.append(r3)
            r13 = r29
            r1.append(r13)
            java.lang.String r3 = " / "
            r1.append(r3)
            int r3 = r37.size()
            r1.append(r3)
            r3 = 41
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r12 = r34
            r10 = r35
            io.intercom.android.sdk.ui.theme.IntercomTypography r3 = r12.getTypography(r14, r10)
            Q0.T r21 = r3.getType04()
            int r3 = io.intercom.android.sdk.R.color.intercom_attribute_input_hint
            r11 = 0
            long r3 = M0.b.a(r3, r14, r11)
            r24 = 0
            r25 = 65528(0xfff8, float:9.1824E-41)
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r16 = 0
            r45 = r10
            r10 = r16
            r16 = 0
            r46 = r12
            r12 = r16
            r13 = r16
            r16 = 0
            r14 = r16
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r23 = 48
            r22 = r49
            V.T0.b(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            goto L_0x037f
        L_0x037b:
            r46 = r34
            r45 = r35
        L_0x037f:
            r49.M()
            r49.u()
            io.intercom.android.sdk.m5.conversation.states.AttributeData r2 = new io.intercom.android.sdk.m5.conversation.states.AttributeData
            r1 = r26
            r14 = r36
            r15 = r43
            r2.<init>(r1, r14, r15)
            r9 = 0
            r12 = 1
            r13 = 0
            k0.i r16 = androidx.compose.foundation.layout.q.h(r0, r9, r12, r13)
            r3 = 12
            float r10 = (float) r3
            float r18 = c1.h.j(r10)
            r21 = 13
            r22 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            k0.i r3 = androidx.compose.foundation.layout.n.m(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r1 = r1.getRenderType()
            int r4 = r1.hashCode()
            switch(r4) {
                case -1034364087: goto L_0x044d;
                case 3322014: goto L_0x041f;
                case 3556653: goto L_0x0414;
                case 64711720: goto L_0x03e3;
                case 75849770: goto L_0x03da;
                case 96619420: goto L_0x03d1;
                case 97526364: goto L_0x03c8;
                case 106642798: goto L_0x03bb;
                default: goto L_0x03b7;
            }
        L_0x03b7:
            r11 = r49
            goto L_0x0457
        L_0x03bb:
            java.lang.String r4 = "phone"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x03c4
            goto L_0x03b7
        L_0x03c4:
            r11 = r49
            goto L_0x0463
        L_0x03c8:
            java.lang.String r4 = "float"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x03c4
            goto L_0x03b7
        L_0x03d1:
            java.lang.String r4 = "email"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x03c4
            goto L_0x03b7
        L_0x03da:
            java.lang.String r4 = "company.website"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x03b7
            goto L_0x03c4
        L_0x03e3:
            java.lang.String r4 = "boolean"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x03ec
            goto L_0x03b7
        L_0x03ec:
            r1 = 672079756(0x280f1f8c, float:7.944935E-15)
            r11 = r49
            r11.T(r1)
            int r1 = r31.length()
            if (r1 <= 0) goto L_0x03fc
            r4 = r12
            goto L_0x03fd
        L_0x03fc:
            r4 = 0
        L_0x03fd:
            r7 = 70
            r8 = 0
            r1 = r3
            r3 = r4
            r4 = r32
            r5 = r30
            r6 = r49
            io.intercom.android.sdk.views.compose.BooleanAttributeCollectorKt.BooleanAttributeCollector(r1, r2, r3, r4, r5, r6, r7, r8)
            r49.M()
            lf.M r1 = lf.C6514M.f71813a
        L_0x0410:
            r17 = r44
            goto L_0x04a7
        L_0x0414:
            r11 = r49
            java.lang.String r4 = "text"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0463
            goto L_0x0457
        L_0x041f:
            r11 = r49
            java.lang.String r4 = "list"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x042a
            goto L_0x0457
        L_0x042a:
            r1 = 672092489(0x280f5149, float:7.9557205E-15)
            r11.T(r1)
            int r1 = r31.length()
            if (r1 <= 0) goto L_0x0438
            r4 = r12
            goto L_0x0439
        L_0x0438:
            r4 = 0
        L_0x0439:
            r7 = 70
            r8 = 0
            r1 = r3
            r3 = r4
            r4 = r32
            r5 = r30
            r6 = r49
            io.intercom.android.sdk.views.compose.ListAttributeCollectorKt.ListAttributeCollector(r1, r2, r3, r4, r5, r6, r7, r8)
            r49.M()
            lf.M r1 = lf.C6514M.f71813a
            goto L_0x0410
        L_0x044d:
            r11 = r49
            java.lang.String r4 = "number"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0463
        L_0x0457:
            r1 = -639614028(0xffffffffd9e043b4, float:-7.8906044E15)
            r11.T(r1)
            r49.M()
            lf.M r1 = lf.C6514M.f71813a
            goto L_0x0410
        L_0x0463:
            r1 = 672066800(0x280eecf0, float:7.933961E-15)
            r11.T(r1)
            r1 = 672076166(0x280f1186, float:7.941894E-15)
            r11.T(r1)
            r8 = r44
            boolean r1 = r11.S(r8)
            java.lang.Object r4 = r49.A()
            if (r1 != 0) goto L_0x0483
            Y.m$a r1 = Y.C1500m.f10026a
            java.lang.Object r1 = r1.a()
            if (r4 != r1) goto L_0x048b
        L_0x0483:
            io.intercom.android.sdk.views.compose.h r4 = new io.intercom.android.sdk.views.compose.h
            r4.<init>(r8)
            r11.r(r4)
        L_0x048b:
            yf.l r4 = (yf.C6798l) r4
            r49.M()
            r7 = 70
            r16 = 0
            r1 = r3
            r3 = r32
            r5 = r30
            r6 = r49
            r17 = r8
            r8 = r16
            io.intercom.android.sdk.views.compose.TextAttributeCollectorKt.TextAttributeCollector(r1, r2, r3, r4, r5, r6, r7, r8)
            r49.M()
            lf.M r1 = lf.C6514M.f71813a
        L_0x04a7:
            r1 = 672105265(0x280f8331, float:7.966542E-15)
            r11.T(r1)
            java.lang.String r1 = invoke$lambda$10$lambda$9$lambda$3(r17)
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x04b8
            goto L_0x04be
        L_0x04b8:
            int r1 = r31.length()
            if (r1 <= 0) goto L_0x0527
        L_0x04be:
            k0.i r2 = androidx.compose.foundation.layout.q.h(r0, r9, r12, r13)
            float r4 = c1.h.j(r10)
            r7 = 13
            r8 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            k0.i r2 = androidx.compose.foundation.layout.n.m(r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r0 = invoke$lambda$10$lambda$9$lambda$3(r17)
            int r1 = r0.length()
            if (r1 != 0) goto L_0x04e1
            r1 = r31
        L_0x04dc:
            r3 = r45
            r0 = r46
            goto L_0x04e3
        L_0x04e1:
            r1 = r0
            goto L_0x04dc
        L_0x04e3:
            io.intercom.android.sdk.ui.theme.IntercomTypography r0 = r0.getTypography(r11, r3)
            Q0.T r21 = r0.getType04()
            int r0 = io.intercom.android.sdk.R.color.intercom_attribute_collector_error
            r10 = 0
            long r3 = M0.b.a(r0, r11, r10)
            int r16 = r33.b()
            r24 = 3120(0xc30, float:4.372E-42)
            r25 = 55288(0xd7f8, float:7.7475E-41)
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r17 = 0
            r0 = r10
            r10 = r17
            r17 = 0
            r26 = r12
            r12 = r17
            r31 = r13
            r13 = r17
            r17 = 0
            r32 = r14
            r33 = r15
            r14 = r17
            r17 = 0
            r18 = 3
            r19 = 0
            r20 = 0
            r23 = 48
            r22 = r49
            V.T0.b(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            goto L_0x0530
        L_0x0527:
            r26 = r12
            r31 = r13
            r32 = r14
            r33 = r15
            r0 = 0
        L_0x0530:
            r49.M()
            r49.u()
            int r4 = r27 + 1
            r0 = r47
            r14 = r49
            r9 = r28
            r5 = r29
            r6 = r30
            r8 = r32
            r7 = r33
            r12 = r37
            r13 = r38
            r10 = r39
            r11 = r40
            goto L_0x00f5
        L_0x0550:
            r49.M()
            r49.u()
        L_0x0556:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.views.compose.AttributeCollectorCardKt$AttributeCollectorCard$2.invoke(C.j, Y.m, int):void");
    }
}
