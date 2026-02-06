package io.intercom.android.sdk.views.compose;

import C.C1085c;
import C.W;
import C.Y;
import C.Z;
import C.a0;
import H0.F;
import I.a;
import J0.C1241g;
import O0.g;
import Q0.T;
import V.B0;
import V.C1400p0;
import V.D;
import V.T0;
import V0.n;
import Y.C1494j;
import Y.C1500m;
import Y.C1510r0;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.Y0;
import Y.o1;
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.q;
import b1.j;
import b1.k;
import c1.h;
import com.amazon.a.a.o.b;
import h0.C2018b;
import h0.C2026j;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.models.Attribute;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import java.util.List;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import o0.C2342e;
import r0.C2544x0;
import r0.g2;
import x.C2866e;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001aK\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001aS\u0010\u0015\u001a\u00020\b*\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0013H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u000f\u0010\u0017\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u000f\u0010\u0019\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0019\u0010\u0018\u001a\u000f\u0010\u001a\u001a\u00020\bH\u0001¢\u0006\u0004\b\u001a\u0010\u0018\u001a\u000f\u0010\u001b\u001a\u00020\bH\u0001¢\u0006\u0004\b\u001b\u0010\u0018¨\u0006\u001c²\u0006\u0010\u0010\r\u001a\u0004\u0018\u00010\u00048\n@\nX\u0002"}, d2 = {"Lk0/i;", "modifier", "Lio/intercom/android/sdk/m5/conversation/states/AttributeData;", "attributeData", "", "hasErrors", "loading", "Lkotlin/Function1;", "Llf/M;", "onSubmitAttribute", "BooleanAttributeCollector", "(Lk0/i;Lio/intercom/android/sdk/m5/conversation/states/AttributeData;ZZLyf/l;LY/m;II)V", "LC/Y;", "value", "yesOption", "LI/a;", "shape", "disabled", "submitted", "Lkotlin/Function0;", "onClick", "BooleanAttributeCollectorOption", "(LC/Y;Ljava/lang/Boolean;ZLI/a;ZZZLyf/a;LY/m;I)V", "BooleanAttributePreview", "(LY/m;I)V", "SubmittedBooleanAttributePreview", "DisabledBooleanAttributePreview", "SubmittedAndDisabledBooleanAttributePreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BooleanAttributeCollectorKt {
    public static final void BooleanAttributeCollector(i iVar, AttributeData attributeData, boolean z10, boolean z11, C6798l lVar, C1500m mVar, int i10, int i11) {
        i iVar2;
        boolean z12;
        boolean z13;
        C6369l lVar2;
        Boolean bool;
        boolean z14;
        Boolean bool2;
        boolean z15;
        AttributeData attributeData2 = attributeData;
        C6496s.h(attributeData2, "attributeData");
        C1500m h10 = mVar.h(2100686120);
        if ((i11 & 1) != 0) {
            iVar2 = i.f23074a;
        } else {
            iVar2 = iVar;
        }
        if ((i11 & 4) != 0) {
            z12 = false;
        } else {
            z12 = z10;
        }
        if ((i11 & 8) != 0) {
            z13 = false;
        } else {
            z13 = z11;
        }
        if ((i11 & 16) != 0) {
            lVar2 = new C6369l();
        } else {
            lVar2 = lVar;
        }
        boolean isFormDisabled = attributeData.isFormDisabled();
        boolean submitted = attributeData.getAttribute().getSubmitted();
        C1510r0 r0Var = (C1510r0) C2018b.e(new Object[0], (C2026j) null, (String) null, new C6370m(submitted, isFormDisabled, attributeData2), h10, 8, 6);
        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
        int i12 = IntercomTheme.$stable;
        long r72 = intercomTheme.getColors(h10, i12).m684getCollectorBorder0d7_KjU();
        float j10 = h.j((float) 1);
        a e10 = intercomTheme.getShapes(h10, i12).e();
        i iVar3 = iVar2;
        i f10 = C2866e.f(q.i(q.h(C2342e.a(iVar2, e10), 0.0f, 1, (Object) null), h.j((float) 40)), j10, r72, e10);
        F b10 = W.b(C1085c.f882a.e(), c.f23044a.i(), h10, 54);
        int a10 = C1494j.a(h10, 0);
        C1523y p10 = h10.p();
        i e11 = k0.h.e(h10, f10);
        C1241g.a aVar = C1241g.f3853J;
        a aVar2 = e10;
        C6787a a11 = aVar.a();
        if (h10.j() == null) {
            C1494j.c();
        }
        h10.F();
        if (h10.f()) {
            h10.U(a11);
        } else {
            h10.q();
        }
        C1500m a12 = F1.a(h10);
        float f11 = j10;
        F1.b(a12, b10, aVar.c());
        F1.b(a12, p10, aVar.e());
        p b11 = aVar.b();
        if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
            a12.r(Integer.valueOf(a10));
            a12.V(Integer.valueOf(a10), b11);
        }
        F1.b(a12, e11, aVar.d());
        Z z16 = Z.f873a;
        if (z12) {
            bool = null;
        } else {
            bool = BooleanAttributeCollector$lambda$2(r0Var);
        }
        if (!z13 || !C6496s.c(BooleanAttributeCollector$lambda$2(r0Var), Boolean.TRUE)) {
            z14 = false;
        } else {
            z14 = true;
        }
        C6371n nVar = new C6371n(lVar2, attributeData2, r0Var);
        boolean z17 = submitted;
        C1510r0 r0Var2 = r0Var;
        boolean z18 = z14;
        boolean z19 = submitted;
        C6371n nVar2 = nVar;
        boolean z20 = isFormDisabled;
        boolean z21 = z19;
        C6798l lVar3 = lVar2;
        BooleanAttributeCollectorOption(z16, bool, true, aVar2, isFormDisabled, z17, z18, nVar2, h10, 390);
        D.b(q.d(i.f23074a, 0.0f, 1, (Object) null), f11, r72, h10, 54, 0);
        if (z12) {
            bool2 = null;
        } else {
            bool2 = BooleanAttributeCollector$lambda$2(r0Var2);
        }
        if (!z13 || !C6496s.c(BooleanAttributeCollector$lambda$2(r0Var2), Boolean.FALSE)) {
            z15 = false;
        } else {
            z15 = true;
        }
        BooleanAttributeCollectorOption(z16, bool2, false, aVar2, z20, z21, z15, new C6372o(lVar3, attributeData2, r0Var2), h10, 390);
        h10.u();
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6373p(iVar3, attributeData, z12, z13, lVar3, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M BooleanAttributeCollector$lambda$0(AttributeData attributeData) {
        C6496s.h(attributeData, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C1510r0 BooleanAttributeCollector$lambda$1(boolean z10, boolean z11, AttributeData attributeData) {
        Boolean bool;
        String value;
        C6496s.h(attributeData, "$attributeData");
        if ((z10 || z11) && (value = attributeData.getAttribute().getValue()) != null) {
            bool = Sg.p.f1(value);
        } else {
            bool = null;
        }
        return u1.d(bool, (o1) null, 2, (Object) null);
    }

    private static final Boolean BooleanAttributeCollector$lambda$2(C1510r0 r0Var) {
        return (Boolean) r0Var.getValue();
    }

    private static final void BooleanAttributeCollector$lambda$3(C1510r0 r0Var, Boolean bool) {
        r0Var.setValue(bool);
    }

    /* access modifiers changed from: private */
    public static final C6514M BooleanAttributeCollector$lambda$6$lambda$4(C6798l lVar, AttributeData attributeData, C1510r0 r0Var) {
        C1510r0 r0Var2 = r0Var;
        C6496s.h(attributeData, "$attributeData");
        C6496s.h(r0Var2, "$value$delegate");
        BooleanAttributeCollector$lambda$3(r0Var2, Boolean.TRUE);
        C6798l lVar2 = lVar;
        lVar.invoke(AttributeData.copy$default(attributeData, Attribute.copy$default(attributeData.getAttribute(), (String) null, (String) null, (String) null, false, (String) null, (List) null, (Boolean) null, b.f37475af, 127, (Object) null), (String) null, false, 6, (Object) null));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M BooleanAttributeCollector$lambda$6$lambda$5(C6798l lVar, AttributeData attributeData, C1510r0 r0Var) {
        C1510r0 r0Var2 = r0Var;
        C6496s.h(attributeData, "$attributeData");
        C6496s.h(r0Var2, "$value$delegate");
        BooleanAttributeCollector$lambda$3(r0Var2, Boolean.FALSE);
        C6798l lVar2 = lVar;
        lVar.invoke(AttributeData.copy$default(attributeData, Attribute.copy$default(attributeData.getAttribute(), (String) null, (String) null, (String) null, false, (String) null, (List) null, (Boolean) null, b.f37476ag, 127, (Object) null), (String) null, false, 6, (Object) null));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M BooleanAttributeCollector$lambda$7(i iVar, AttributeData attributeData, boolean z10, boolean z11, C6798l lVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(attributeData, "$attributeData");
        BooleanAttributeCollector(iVar, attributeData, z10, z11, lVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    private static final void BooleanAttributeCollectorOption(Y y10, Boolean bool, boolean z10, a aVar, boolean z11, boolean z12, boolean z13, C6787a aVar2, C1500m mVar, int i10) {
        int i11;
        a aVar3;
        boolean z14;
        int i12;
        int i13;
        long j10;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        Boolean bool2 = bool;
        boolean z15 = z10;
        boolean z16 = z11;
        boolean z17 = z12;
        boolean z18 = z13;
        int i22 = i10;
        C1500m h10 = mVar.h(1323902640);
        if ((i22 & 14) == 0) {
            if (h10.S(y10)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i11 = i21 | i22;
        } else {
            Y y11 = y10;
            i11 = i22;
        }
        if ((i22 & 112) == 0) {
            if (h10.S(bool2)) {
                i20 = 32;
            } else {
                i20 = 16;
            }
            i11 |= i20;
        }
        if ((i22 & 896) == 0) {
            if (h10.b(z15)) {
                i19 = 256;
            } else {
                i19 = 128;
            }
            i11 |= i19;
        }
        if ((i22 & 7168) == 0) {
            if (h10.S(aVar)) {
                i18 = 2048;
            } else {
                i18 = 1024;
            }
            i11 |= i18;
        } else {
            a aVar4 = aVar;
        }
        if ((57344 & i22) == 0) {
            if (h10.b(z16)) {
                i17 = 16384;
            } else {
                i17 = 8192;
            }
            i11 |= i17;
        }
        if ((458752 & i22) == 0) {
            if (h10.b(z17)) {
                i16 = 131072;
            } else {
                i16 = 65536;
            }
            i11 |= i16;
        }
        if ((3670016 & i22) == 0) {
            if (h10.b(z18)) {
                i15 = 1048576;
            } else {
                i15 = 524288;
            }
            i11 |= i15;
        }
        C6787a aVar5 = aVar2;
        if ((29360128 & i22) == 0) {
            if (h10.C(aVar5)) {
                i14 = 8388608;
            } else {
                i14 = 4194304;
            }
            i11 |= i14;
        }
        if ((i11 & 23967451) != 4793490 || !h10.i()) {
            I.b b10 = I.c.b(h.j((float) 0));
            if (z15) {
                aVar3 = a.b(aVar, (I.b) null, b10, b10, (I.b) null, 9, (Object) null);
            } else {
                aVar3 = a.b(aVar, b10, (I.b) null, (I.b) null, b10, 6, (Object) null);
            }
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i23 = IntercomTheme.$stable;
            long r16 = intercomTheme.getColors(h10, i23).m685getCollectorSelected0d7_KjU();
            long o10 = C2544x0.o(intercomTheme.getColors(h10, i23).m700getPrimaryText0d7_KjU(), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
            i.a aVar6 = i.f23074a;
            i a10 = C2342e.a(q.d(aVar6, 0.0f, 1, (Object) null), aVar3);
            if (!C6496s.c(bool2, Boolean.valueOf(z10))) {
                r16 = C2544x0.f25560b.g();
            }
            i d10 = androidx.compose.foundation.b.d(a10, r16, (g2) null, 2, (Object) null);
            if (z16 || z17) {
                z14 = false;
            } else {
                z14 = true;
            }
            i.a aVar7 = aVar6;
            i iVar = d10;
            int i24 = i23;
            IntercomTheme intercomTheme2 = intercomTheme;
            i b11 = Y.b(y10, d.d(iVar, z14, (String) null, (g) null, aVar2, 6, (Object) null), 1.0f, false, 2, (Object) null);
            F b12 = W.b(C1085c.f882a.b(), c.f23044a.i(), h10, 54);
            int a11 = C1494j.a(h10, 0);
            C1523y p10 = h10.p();
            i e10 = k0.h.e(h10, b11);
            C1241g.a aVar8 = C1241g.f3853J;
            C6787a a12 = aVar8.a();
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
            F1.b(a13, b12, aVar8.c());
            F1.b(a13, p10, aVar8.e());
            p b13 = aVar8.b();
            if (a13.f() || !C6496s.c(a13.A(), Integer.valueOf(a11))) {
                a13.r(Integer.valueOf(a11));
                a13.V(Integer.valueOf(a11), b13);
            }
            F1.b(a13, e10, aVar8.d());
            Z z19 = Z.f873a;
            h10.T(872785261);
            IntercomTheme intercomTheme3 = intercomTheme2;
            if (z18) {
                i12 = 0;
                C1400p0.a(q.n(aVar7, h.j((float) 20)), intercomTheme3.getColors(h10, i24).m700getPrimaryText0d7_KjU(), h.j((float) 3), 0, 0, h10, 390, 24);
                a0.a(q.r(aVar7, h.j((float) 4)), h10, 6);
            } else {
                i12 = 0;
            }
            h10.M();
            if (z15) {
                i13 = R.string.intercom_attribute_collector_positive;
            } else {
                i13 = R.string.intercom_attribute_collector_negative;
            }
            String a14 = M0.i.a(i13, h10, i12);
            int a15 = j.f19110b.a();
            h10.T(872804846);
            if (!z16 && !C6496s.c(bool2, Boolean.valueOf(true ^ z15))) {
                j10 = intercomTheme3.getColors(h10, i24).m700getPrimaryText0d7_KjU();
            } else {
                j10 = o10;
            }
            h10.M();
            T0.b(a14, (i) null, j10, 0, (n) null, (V0.p) null, (V0.h) null, 0, (k) null, j.h(a15), 0, 0, false, 0, 0, (C6798l) null, (T) null, h10, 0, 0, 130554);
            h10.u();
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6366i(y10, bool, z10, aVar, z11, z12, z13, aVar2, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M BooleanAttributeCollectorOption$lambda$9(Y y10, Boolean bool, boolean z10, a aVar, boolean z11, boolean z12, boolean z13, C6787a aVar2, int i10, C1500m mVar, int i11) {
        C6496s.h(y10, "$this_BooleanAttributeCollectorOption");
        C6496s.h(aVar, "$shape");
        C6787a aVar3 = aVar2;
        C6496s.h(aVar3, "$onClick");
        BooleanAttributeCollectorOption(y10, bool, z10, aVar, z11, z12, z13, aVar3, mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void BooleanAttributePreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1269323591);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$BooleanAttributeCollectorKt.INSTANCE.m731getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6368k(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M BooleanAttributePreview$lambda$10(int i10, C1500m mVar, int i11) {
        BooleanAttributePreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void DisabledBooleanAttributePreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-2015578211);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$BooleanAttributeCollectorKt.INSTANCE.m735getLambda6$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new r(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M DisabledBooleanAttributePreview$lambda$12(int i10, C1500m mVar, int i11) {
        DisabledBooleanAttributePreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void SubmittedAndDisabledBooleanAttributePreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1476435233);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$BooleanAttributeCollectorKt.INSTANCE.m737getLambda8$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6367j(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M SubmittedAndDisabledBooleanAttributePreview$lambda$13(int i10, C1500m mVar, int i11) {
        SubmittedAndDisabledBooleanAttributePreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void SubmittedBooleanAttributePreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-875849702);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$BooleanAttributeCollectorKt.INSTANCE.m733getLambda4$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6374q(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M SubmittedBooleanAttributePreview$lambda$11(int i10, C1500m mVar, int i11) {
        SubmittedBooleanAttributePreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
