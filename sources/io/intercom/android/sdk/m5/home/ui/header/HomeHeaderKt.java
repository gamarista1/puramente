package io.intercom.android.sdk.m5.home.ui.header;

import C.C1085c;
import C.C1090h;
import C.C1093k;
import C.W;
import C.Y;
import C.Z;
import C.a0;
import H0.C1187h;
import H0.F;
import J0.C1241g;
import Q0.T;
import V.B0;
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
import c1.h;
import io.intercom.android.sdk.m5.components.AvatarGroupKt;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.m5.home.ui.components.WrapReportingTextKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import j4.C3622i;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import r0.C2547y0;
import x.C2842F;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\f\u0010\r\u001a\u000f\u0010\u000e\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Lk0/i;", "modifier", "Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader;", "header", "Llf/M;", "HomeContentHeader", "(Lk0/i;Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader;LY/m;II)V", "Lio/intercom/android/sdk/m5/home/states/HomeUiState$Error$ErrorHeader;", "Lkotlin/Function0;", "onCloseClick", "HomeErrorHeader", "(Lk0/i;Lio/intercom/android/sdk/m5/home/states/HomeUiState$Error$ErrorHeader;Lyf/a;LY/m;II)V", "HomeContentHeaderPreview", "(LY/m;I)V", "HomeErrorHeaderPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class HomeHeaderKt {
    public static final void HomeContentHeader(i iVar, HomeUiState.Content.ContentHeader contentHeader, C1500m mVar, int i10, int i11) {
        i.a aVar;
        float f10;
        C1510r0 r0Var;
        int i12;
        C1510r0 r0Var2;
        int i13 = i11;
        C6496s.h(contentHeader, "header");
        C1500m h10 = mVar.h(-1992208830);
        i.a aVar2 = (i13 & 1) != 0 ? i.f23074a : iVar;
        T type02 = IntercomTheme.INSTANCE.getTypography(h10, IntercomTheme.$stable).getType02();
        h10.T(-1302173781);
        Object A10 = h10.A();
        C1500m.a aVar3 = C1500m.f10026a;
        if (A10 == aVar3.a()) {
            A10 = u1.d(type02, (o1) null, 2, (Object) null);
            h10.r(A10);
        }
        C1510r0 r0Var3 = (C1510r0) A10;
        h10.M();
        h10.T(-1302171483);
        Object A11 = h10.A();
        if (A11 == aVar3.a()) {
            A11 = u1.d(Boolean.FALSE, (o1) null, 2, (Object) null);
            h10.r(A11);
        }
        C1510r0 r0Var4 = (C1510r0) A11;
        h10.M();
        float f11 = (float) 32;
        float f12 = f11;
        float f13 = (float) 24;
        i m10 = n.m(n.m(aVar2, 0.0f, h.j((float) 10), 0.0f, h.j(f11), 5, (Object) null), h.j(f12), 0.0f, h.j(f13), 0.0f, 10, (Object) null);
        C1085c cVar = C1085c.f882a;
        C1085c.m g10 = cVar.g();
        c.a aVar4 = c.f23044a;
        F a10 = C1090h.a(g10, aVar4.k(), h10, 0);
        int a11 = C1494j.a(h10, 0);
        C1523y p10 = h10.p();
        i e10 = k0.h.e(h10, m10);
        C1241g.a aVar5 = C1241g.f3853J;
        C6787a a12 = aVar5.a();
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
        F1.b(a13, a10, aVar5.c());
        F1.b(a13, p10, aVar5.e());
        p b10 = aVar5.b();
        if (a13.f() || !C6496s.c(a13.A(), Integer.valueOf(a11))) {
            a13.r(Integer.valueOf(a11));
            a13.V(Integer.valueOf(a11), b10);
        }
        F1.b(a13, e10, aVar5.d());
        C1093k kVar = C1093k.f978a;
        i.a aVar6 = i.f23074a;
        i h11 = q.h(aVar6, 0.0f, 1, (Object) null);
        F b11 = W.b(cVar.f(), aVar4.i(), h10, 48);
        int a14 = C1494j.a(h10, 0);
        C1523y p11 = h10.p();
        i e11 = k0.h.e(h10, h11);
        C6787a a15 = aVar5.a();
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
        F1.b(a16, b11, aVar5.c());
        F1.b(a16, p11, aVar5.e());
        p b12 = aVar5.b();
        if (a16.f() || !C6496s.c(a16.A(), Integer.valueOf(a14))) {
            a16.r(Integer.valueOf(a14));
            a16.V(Integer.valueOf(a14), b12);
        }
        F1.b(a16, e11, aVar5.d());
        Z z10 = Z.f873a;
        h10.T(-827693122);
        if (contentHeader.getShowLogo()) {
            r0Var = r0Var4;
            aVar = aVar6;
            C1500m mVar2 = h10;
            f10 = f13;
            i12 = 48;
            C2842F.a(Z3.h.c(new C3622i.a((Context) h10.m(AndroidCompositionLocals_androidKt.g())).d(contentHeader.getLogoUrl()).c(true).a(), IntercomImageLoaderKt.getImageLoader((Context) h10.m(AndroidCompositionLocals_androidKt.g())), (C6798l) null, (C6798l) null, (C1187h) null, 0, (Z3.p) null, mVar2, 72, 124), (String) null, q.i(n.m(Y.b(z10, aVar, 1.0f, false, 2, (Object) null), 0.0f, 0.0f, h.j((float) 16), 0.0f, 11, (Object) null), h.j(f12)), aVar4.h(), C1187h.f2609a.b(), 0.0f, (C2547y0) null, mVar2, 27696, 96);
        } else {
            r0Var = r0Var4;
            aVar = aVar6;
            f10 = f13;
            i12 = 48;
        }
        h10.M();
        h10.T(-827668902);
        if (contentHeader.getShowAvatars()) {
            AvatarGroupKt.m136AvatarGroupJ8mCjc(contentHeader.getAdminsAvatars(), (i) null, 0.0f, 0, h10, 8, 14);
        }
        h10.M();
        h10.T(-827665635);
        if (!contentHeader.getShowLogo()) {
            a0.a(Y.b(z10, aVar, 1.0f, false, 2, (Object) null), h10, 0);
        }
        h10.M();
        i.a aVar7 = aVar;
        a0.a(q.n(aVar7, h.j(f10)), h10, 6);
        h10.u();
        a0.a(q.i(aVar7, h.j((float) i12)), h10, 6);
        h10.T(-2011777884);
        HomeUiState.Content.ContentHeader.ColoredText greeting = contentHeader.getGreeting();
        h10.T(-2011776778);
        if (!Sg.p.d0(greeting.getText())) {
            String text = greeting.getText();
            T t10 = (T) r0Var3.getValue();
            long composeColor = ColorExtensionsKt.toComposeColor(greeting.getColor(), greeting.getOpacity());
            h10.T(-827649106);
            Object A12 = h10.A();
            if (A12 == aVar3.a()) {
                r0Var2 = r0Var;
                A12 = new l(r0Var2);
                h10.r(A12);
            } else {
                r0Var2 = r0Var;
            }
            h10.M();
            WrapReportingTextKt.m381WrapReportingTextT042LqI((i) null, text, composeColor, t10, (C6798l) A12, h10, 24576, 1);
        } else {
            r0Var2 = r0Var;
        }
        h10.M();
        C6514M m11 = C6514M.f71813a;
        h10.M();
        h10.T(-2011764191);
        HomeUiState.Content.ContentHeader.ColoredText intro = contentHeader.getIntro();
        h10.T(-2011763178);
        if (!Sg.p.d0(intro.getText())) {
            String text2 = intro.getText();
            T t11 = (T) r0Var3.getValue();
            long composeColor2 = ColorExtensionsKt.toComposeColor(intro.getColor(), intro.getOpacity());
            h10.T(-827635506);
            Object A13 = h10.A();
            if (A13 == aVar3.a()) {
                A13 = new m(r0Var2);
                h10.r(A13);
            }
            h10.M();
            WrapReportingTextKt.m381WrapReportingTextT042LqI((i) null, text2, composeColor2, t11, (C6798l) A13, h10, 24576, 1);
        }
        h10.M();
        h10.M();
        h10.u();
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new n(aVar2, contentHeader, i10, i13));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M HomeContentHeader$lambda$10(i iVar, HomeUiState.Content.ContentHeader contentHeader, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(contentHeader, "$header");
        HomeContentHeader(iVar, contentHeader, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M HomeContentHeader$lambda$9$lambda$5$lambda$4$lambda$3(C1510r0 r0Var, boolean z10) {
        C6496s.h(r0Var, "$hasEitherTextWrapped");
        r0Var.setValue(Boolean.valueOf(z10 | ((Boolean) r0Var.getValue()).booleanValue()));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M HomeContentHeader$lambda$9$lambda$8$lambda$7$lambda$6(C1510r0 r0Var, boolean z10) {
        C6496s.h(r0Var, "$hasEitherTextWrapped");
        r0Var.setValue(Boolean.valueOf(z10 | ((Boolean) r0Var.getValue()).booleanValue()));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void HomeContentHeaderPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1555491493);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$HomeHeaderKt.INSTANCE.m387getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new r(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M HomeContentHeaderPreview$lambda$17(int i10, C1500m mVar, int i11) {
        HomeContentHeaderPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: yf.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void HomeErrorHeader(k0.i r24, io.intercom.android.sdk.m5.home.states.HomeUiState.Error.ErrorHeader r25, yf.C6787a r26, Y.C1500m r27, int r28, int r29) {
        /*
            r2 = r25
            r3 = r26
            r4 = r28
            r0 = 4
            java.lang.String r1 = "header"
            kotlin.jvm.internal.C6496s.h(r2, r1)
            java.lang.String r1 = "onCloseClick"
            kotlin.jvm.internal.C6496s.h(r3, r1)
            r1 = 964565742(0x397e1aee, float:2.423336E-4)
            r5 = r27
            Y.m r1 = r5.h(r1)
            r5 = 1
            r6 = r29 & 1
            r7 = 2
            if (r6 == 0) goto L_0x0026
            r8 = r4 | 6
            r9 = r8
            r8 = r24
            goto L_0x003a
        L_0x0026:
            r8 = r4 & 14
            if (r8 != 0) goto L_0x0037
            r8 = r24
            boolean r9 = r1.S(r8)
            if (r9 == 0) goto L_0x0034
            r9 = r0
            goto L_0x0035
        L_0x0034:
            r9 = r7
        L_0x0035:
            r9 = r9 | r4
            goto L_0x003a
        L_0x0037:
            r8 = r24
            r9 = r4
        L_0x003a:
            r10 = r29 & 2
            r11 = 16
            if (r10 == 0) goto L_0x0043
            r9 = r9 | 48
            goto L_0x0052
        L_0x0043:
            r10 = r4 & 112(0x70, float:1.57E-43)
            if (r10 != 0) goto L_0x0052
            boolean r10 = r1.S(r2)
            if (r10 == 0) goto L_0x0050
            r10 = 32
            goto L_0x0051
        L_0x0050:
            r10 = r11
        L_0x0051:
            r9 = r9 | r10
        L_0x0052:
            r0 = r29 & 4
            r10 = 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x005b
            r9 = r9 | 384(0x180, float:5.38E-43)
            goto L_0x006a
        L_0x005b:
            r0 = r4 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x006a
            boolean r0 = r1.C(r3)
            if (r0 == 0) goto L_0x0067
            r0 = r10
            goto L_0x0069
        L_0x0067:
            r0 = 128(0x80, float:1.794E-43)
        L_0x0069:
            r9 = r9 | r0
        L_0x006a:
            r0 = r9 & 731(0x2db, float:1.024E-42)
            r12 = 146(0x92, float:2.05E-43)
            if (r0 != r12) goto L_0x007c
            boolean r0 = r1.i()
            if (r0 != 0) goto L_0x0077
            goto L_0x007c
        L_0x0077:
            r1.I()
            goto L_0x0217
        L_0x007c:
            if (r6 == 0) goto L_0x0081
            k0.i$a r0 = k0.i.f23074a
            goto L_0x0082
        L_0x0081:
            r0 = r8
        L_0x0082:
            r6 = 0
            r8 = 0
            k0.i r12 = androidx.compose.foundation.layout.q.h(r0, r6, r5, r8)
            java.lang.String r13 = r25.getBackgroundColor()
            long r13 = io.intercom.android.sdk.utilities.ColorExtensionsKt.toComposeColor$default(r13, r6, r5, r8)
            r16 = 2
            r17 = 0
            r15 = 0
            k0.i r12 = androidx.compose.foundation.b.d(r12, r13, r15, r16, r17)
            float r11 = (float) r11
            float r11 = c1.h.j(r11)
            k0.i r7 = androidx.compose.foundation.layout.n.k(r12, r11, r6, r7, r8)
            r11 = 56
            float r11 = (float) r11
            float r11 = c1.h.j(r11)
            k0.i r7 = androidx.compose.foundation.layout.q.i(r7, r11)
            k0.c$a r11 = k0.c.f23044a
            k0.c$c r12 = r11.i()
            C.c r13 = C.C1085c.f882a
            C.c$e r13 = r13.f()
            r14 = 54
            H0.F r12 = C.W.b(r13, r12, r1, r14)
            r13 = 0
            int r14 = Y.C1494j.a(r1, r13)
            Y.y r15 = r1.p()
            k0.i r7 = k0.h.e(r1, r7)
            J0.g$a r16 = J0.C1241g.f3853J
            yf.a r5 = r16.a()
            Y.f r17 = r1.j()
            if (r17 != 0) goto L_0x00db
            Y.C1494j.c()
        L_0x00db:
            r1.F()
            boolean r17 = r1.f()
            if (r17 == 0) goto L_0x00e8
            r1.U(r5)
            goto L_0x00eb
        L_0x00e8:
            r1.q()
        L_0x00eb:
            Y.m r5 = Y.F1.a(r1)
            yf.p r6 = r16.c()
            Y.F1.b(r5, r12, r6)
            yf.p r6 = r16.e()
            Y.F1.b(r5, r15, r6)
            yf.p r6 = r16.b()
            boolean r12 = r5.f()
            if (r12 != 0) goto L_0x0115
            java.lang.Object r12 = r5.A()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)
            boolean r12 = kotlin.jvm.internal.C6496s.c(r12, r15)
            if (r12 != 0) goto L_0x0123
        L_0x0115:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r14)
            r5.r(r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r14)
            r5.V(r12, r6)
        L_0x0123:
            yf.p r6 = r16.d()
            Y.F1.b(r5, r7, r6)
            C.Z r5 = C.Z.f873a
            r5 = 941676622(0x3820d84e, float:3.8348422E-5)
            r1.T(r5)
            java.lang.String r5 = r25.getForegroundColor()
            k0.i$a r6 = k0.i.f23074a
            r7 = 1204003554(0x47c3a2e2, float:100165.766)
            r1.T(r7)
            r7 = r9 & 896(0x380, float:1.256E-42)
            if (r7 != r10) goto L_0x0144
            r7 = 1
            goto L_0x0145
        L_0x0144:
            r7 = r13
        L_0x0145:
            java.lang.Object r9 = r1.A()
            if (r7 != 0) goto L_0x0153
            Y.m$a r7 = Y.C1500m.f10026a
            java.lang.Object r7 = r7.a()
            if (r9 != r7) goto L_0x015b
        L_0x0153:
            io.intercom.android.sdk.m5.home.ui.header.o r9 = new io.intercom.android.sdk.m5.home.ui.header.o
            r9.<init>(r3)
            r1.r(r9)
        L_0x015b:
            r21 = r9
            yf.a r21 = (yf.C6787a) r21
            r1.M()
            r22 = 7
            r23 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r17 = r6
            k0.i r7 = androidx.compose.foundation.d.d(r17, r18, r19, r20, r21, r22, r23)
            k0.c r9 = r11.o()
            H0.F r9 = androidx.compose.foundation.layout.d.h(r9, r13)
            int r10 = Y.C1494j.a(r1, r13)
            Y.y r12 = r1.p()
            k0.i r7 = k0.h.e(r1, r7)
            yf.a r14 = r16.a()
            Y.f r15 = r1.j()
            if (r15 != 0) goto L_0x0193
            Y.C1494j.c()
        L_0x0193:
            r1.F()
            boolean r15 = r1.f()
            if (r15 == 0) goto L_0x01a0
            r1.U(r14)
            goto L_0x01a3
        L_0x01a0:
            r1.q()
        L_0x01a3:
            Y.m r14 = Y.F1.a(r1)
            yf.p r15 = r16.c()
            Y.F1.b(r14, r9, r15)
            yf.p r9 = r16.e()
            Y.F1.b(r14, r12, r9)
            yf.p r9 = r16.b()
            boolean r12 = r14.f()
            if (r12 != 0) goto L_0x01cd
            java.lang.Object r12 = r14.A()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r10)
            boolean r12 = kotlin.jvm.internal.C6496s.c(r12, r15)
            if (r12 != 0) goto L_0x01db
        L_0x01cd:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            r14.r(r12)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r14.V(r10, r9)
        L_0x01db:
            yf.p r9 = r16.d()
            Y.F1.b(r14, r7, r9)
            androidx.compose.foundation.layout.f r7 = androidx.compose.foundation.layout.f.f12848a
            k0.c r9 = r11.e()
            k0.i r7 = r7.e(r6, r9)
            Q.b r6 = Q.b.f5154a
            Q.b$a r6 = r6.a()
            x0.d r6 = S.d.a(r6)
            int r9 = io.intercom.android.sdk.R.string.intercom_close
            java.lang.String r9 = M0.i.a(r9, r1, r13)
            r10 = 1
            r11 = 0
            long r10 = io.intercom.android.sdk.utilities.ColorExtensionsKt.toComposeColor$default(r5, r11, r10, r8)
            r12 = 0
            r13 = 0
            r5 = r6
            r6 = r9
            r8 = r10
            r10 = r1
            r11 = r12
            r12 = r13
            V.V.b(r5, r6, r7, r8, r10, r11, r12)
            r1.u()
            r1.M()
            r1.u()
            r8 = r0
        L_0x0217:
            Y.Y0 r6 = r1.k()
            if (r6 == 0) goto L_0x022f
            io.intercom.android.sdk.m5.home.ui.header.p r7 = new io.intercom.android.sdk.m5.home.ui.header.p
            r0 = r7
            r1 = r8
            r2 = r25
            r3 = r26
            r4 = r28
            r5 = r29
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x022f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.home.ui.header.HomeHeaderKt.HomeErrorHeader(k0.i, io.intercom.android.sdk.m5.home.states.HomeUiState$Error$ErrorHeader, yf.a, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M HomeErrorHeader$lambda$15$lambda$14$lambda$12$lambda$11(C6787a aVar) {
        C6496s.h(aVar, "$onCloseClick");
        aVar.invoke();
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M HomeErrorHeader$lambda$16(i iVar, HomeUiState.Error.ErrorHeader errorHeader, C6787a aVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(errorHeader, "$header");
        C6496s.h(aVar, "$onCloseClick");
        HomeErrorHeader(iVar, errorHeader, aVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    private static final void HomeErrorHeaderPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-484536790);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$HomeHeaderKt.INSTANCE.m389getLambda4$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new q(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M HomeErrorHeaderPreview$lambda$18(int i10, C1500m mVar, int i11) {
        HomeErrorHeaderPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
