package io.intercom.android.sdk.views.compose;

import B.l;
import C.I;
import C.N;
import H0.F;
import I.a;
import J.C1226w;
import J.C1227x;
import J0.C1241g;
import O0.g;
import Q0.T;
import V.B0;
import V.C1400p0;
import V.P0;
import V.V;
import W0.C1456y;
import W0.K;
import W0.c0;
import X0.e;
import Y.C1494j;
import Y.C1500m;
import Y.C1510r0;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.Y0;
import Y.o1;
import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.b;
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.n;
import androidx.compose.foundation.layout.q;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c1.h;
import g0.C2005a;
import g0.c;
import h0.C2018b;
import h0.C2026j;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.models.CountryAreaCode;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import io.intercom.android.sdk.utilities.PhoneNumberValidator;
import io.intercom.android.sdk.utilities.UtilsKt;
import java.util.Locale;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import o0.C2342e;
import r0.C2544x0;
import r0.g2;
import w0.C2817c;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\u001aW\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0006H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a=\u0010\u0013\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0011H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001b\u0010\u001a\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0013\u0010\u001d\u001a\u00020\u001c*\u00020\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0013\u0010\u001f\u001a\u00020\u0004*\u00020\u0002H\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\u000f\u0010!\u001a\u00020\bH\u0001¢\u0006\u0004\b!\u0010\"\u001a\u000f\u0010#\u001a\u00020\bH\u0001¢\u0006\u0004\b#\u0010\"\u001a\u000f\u0010$\u001a\u00020\bH\u0001¢\u0006\u0004\b$\u0010\"\u001a\u000f\u0010%\u001a\u00020\bH\u0001¢\u0006\u0004\b%\u0010\"\u001a\u000f\u0010&\u001a\u00020\bH\u0001¢\u0006\u0004\b&\u0010\"\u001a\u000f\u0010'\u001a\u00020\bH\u0001¢\u0006\u0004\b'\u0010\"¨\u0006+²\u0006\u000e\u0010(\u001a\u00020\u00078\n@\nX\u0002²\u0006\u0016\u0010*\u001a\n )*\u0004\u0018\u00010\u00070\u00078\n@\nX\u0002"}, d2 = {"Lk0/i;", "modifier", "Lio/intercom/android/sdk/m5/conversation/states/AttributeData;", "attributeData", "", "loading", "Lkotlin/Function1;", "", "Llf/M;", "onValidationError", "onSubmitAttribute", "TextAttributeCollector", "(Lk0/i;Lio/intercom/android/sdk/m5/conversation/states/AttributeData;ZLyf/l;Lyf/l;LY/m;II)V", "disabled", "submitted", "LI/a;", "shape", "Lkotlin/Function0;", "onClick", "TextAttributeTrailingComponent", "(ZZZLI/a;Lyf/a;LY/m;I)V", "text", "Lio/intercom/android/sdk/models/CountryAreaCode;", "getCountryAreaCodeFromText", "(Ljava/lang/String;)Lio/intercom/android/sdk/models/CountryAreaCode;", "countryAreaCode", "getHint", "(Lio/intercom/android/sdk/m5/conversation/states/AttributeData;Lio/intercom/android/sdk/models/CountryAreaCode;)Ljava/lang/String;", "LW0/y;", "getKeyboardType", "(Lio/intercom/android/sdk/m5/conversation/states/AttributeData;)I", "isPhoneType", "(Lio/intercom/android/sdk/m5/conversation/states/AttributeData;)Z", "FilledTextAttributePreview", "(LY/m;I)V", "EmptyTextAttributePreview", "SubmittedTextAttributePreview", "DisabledTextAttributePreview", "SubmittedAndDisabledTextAttributePreview", "PhoneAttributePreview", "value", "kotlin.jvm.PlatformType", "countryFlag", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TextAttributeCollectorKt {
    public static final void DisabledTextAttributePreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1615951967);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$TextAttributeCollectorKt.INSTANCE.m757getLambda8$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new K(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M DisabledTextAttributePreview$lambda$15(int i10, C1500m mVar, int i11) {
        DisabledTextAttributePreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void EmptyTextAttributePreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(990171980);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$TextAttributeCollectorKt.INSTANCE.m753getLambda4$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new H(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M EmptyTextAttributePreview$lambda$13(int i10, C1500m mVar, int i11) {
        EmptyTextAttributePreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void FilledTextAttributePreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1421911931);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$TextAttributeCollectorKt.INSTANCE.m751getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new M(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M FilledTextAttributePreview$lambda$12(int i10, C1500m mVar, int i11) {
        FilledTextAttributePreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void PhoneAttributePreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(2075517560);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$TextAttributeCollectorKt.INSTANCE.m750getLambda12$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new J(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M PhoneAttributePreview$lambda$17(int i10, C1500m mVar, int i11) {
        PhoneAttributePreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void SubmittedAndDisabledTextAttributePreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1140989915);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$TextAttributeCollectorKt.INSTANCE.m748getLambda10$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new L(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M SubmittedAndDisabledTextAttributePreview$lambda$16(int i10, C1500m mVar, int i11) {
        SubmittedAndDisabledTextAttributePreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void SubmittedTextAttributePreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(914016734);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$TextAttributeCollectorKt.INSTANCE.m755getLambda6$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new F(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M SubmittedTextAttributePreview$lambda$14(int i10, C1500m mVar, int i11) {
        SubmittedTextAttributePreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void TextAttributeCollector(i iVar, AttributeData attributeData, boolean z10, C6798l lVar, C6798l lVar2, C1500m mVar, int i10, int i11) {
        i.a aVar;
        boolean z11;
        N n10;
        O o10;
        CountryAreaCode countryAreaCode;
        i i12;
        int i13;
        C2005a aVar2;
        AttributeData attributeData2 = attributeData;
        C6496s.h(attributeData2, "attributeData");
        C1500m h10 = mVar.h(-1938202913);
        if ((i11 & 1) != 0) {
            aVar = i.f23074a;
        } else {
            aVar = iVar;
        }
        if ((i11 & 4) != 0) {
            z11 = false;
        } else {
            z11 = z10;
        }
        if ((i11 & 8) != 0) {
            n10 = new N();
        } else {
            n10 = lVar;
        }
        if ((i11 & 16) != 0) {
            o10 = new O();
        } else {
            o10 = lVar2;
        }
        Context context = (Context) h10.m(AndroidCompositionLocals_androidKt.g());
        Resources resources = context.getResources();
        Locale localeCompat = UtilsKt.getLocaleCompat(context);
        a e10 = IntercomTheme.INSTANCE.getShapes(h10, IntercomTheme.$stable).e();
        if (isPhoneType(attributeData)) {
            PhoneNumberValidator.loadCountryAreaCodes(context);
            countryAreaCode = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
        } else {
            countryAreaCode = CountryAreaCode.UNKNOWN;
        }
        boolean isFormDisabled = attributeData.isFormDisabled();
        boolean submitted = attributeData.getAttribute().getSubmitted();
        boolean c10 = C6496s.c(attributeData.getAttribute().getMultiline(), Boolean.TRUE);
        C1500m mVar2 = h10;
        C1510r0 r0Var = (C1510r0) C2018b.e(new Object[0], (C2026j) null, (String) null, new P(attributeData2), mVar2, 8, 6);
        C1510r0 r0Var2 = (C1510r0) C2018b.e(new Object[0], (C2026j) null, (String) null, new Q(attributeData2, countryAreaCode), mVar2, 8, 6);
        if (c10) {
            i12 = androidx.compose.foundation.layout.i.a(aVar, I.Max);
        } else {
            i12 = q.i(aVar, h.j((float) 40));
        }
        i iVar2 = i12;
        String TextAttributeCollector$lambda$3 = TextAttributeCollector$lambda$3(r0Var);
        boolean z12 = !isFormDisabled;
        C1227x xVar = new C1227x(0, (Boolean) null, getKeyboardType(attributeData), 0, (K) null, (Boolean) null, (e) null, 123, (DefaultConstructorMarker) null);
        boolean z13 = !c10;
        if (c10) {
            i13 = 2;
        } else {
            i13 = 1;
        }
        h10.T(1971829893);
        if (isPhoneType(attributeData)) {
            aVar2 = c.e(1105059993, true, new TextAttributeCollectorKt$TextAttributeCollector$3(r0Var2), h10, 54);
        } else {
            aVar2 = null;
        }
        C2005a aVar3 = aVar2;
        h10.M();
        S s10 = r2;
        S s11 = new S(attributeData2, r0Var, r0Var2);
        C2005a e11 = c.e(-1290485581, true, new TextAttributeCollectorKt$TextAttributeCollector$5(attributeData2, countryAreaCode), h10, 54);
        TextAttributeCollectorKt$TextAttributeCollector$6 textAttributeCollectorKt$TextAttributeCollector$6 = r0;
        TextAttributeCollectorKt$TextAttributeCollector$6 textAttributeCollectorKt$TextAttributeCollector$62 = new TextAttributeCollectorKt$TextAttributeCollector$6(isFormDisabled, submitted, z11, e10, n10, resources, attributeData, o10, r0Var);
        i iVar3 = aVar;
        C1500m mVar3 = h10;
        IntercomOutlinedTextFieldKt.IntercomOutlinedTextField(TextAttributeCollector$lambda$3, s10, iVar2, z12, submitted, (T) null, (p) null, e11, aVar3, c.e(930248561, true, textAttributeCollectorKt$TextAttributeCollector$6, h10, 54), false, (c0) null, xVar, (C1226w) null, z13, 3, i13, (l) null, e10, (P0) null, (N) null, mVar3, 817889280, 196608, 0, 1715296);
        Y0 k10 = mVar3.k();
        if (k10 != null) {
            k10.a(new G(iVar3, attributeData, z11, n10, o10, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TextAttributeCollector$lambda$0(String str) {
        C6496s.h(str, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M TextAttributeCollector$lambda$1(AttributeData attributeData) {
        C6496s.h(attributeData, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C1510r0 TextAttributeCollector$lambda$2(AttributeData attributeData) {
        C6496s.h(attributeData, "$attributeData");
        String value = attributeData.getAttribute().getValue();
        if (value == null) {
            value = "";
        }
        return u1.d(value, (o1) null, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final String TextAttributeCollector$lambda$3(C1510r0 r0Var) {
        return (String) r0Var.getValue();
    }

    private static final void TextAttributeCollector$lambda$4(C1510r0 r0Var, String str) {
        r0Var.setValue(str);
    }

    /* access modifiers changed from: private */
    public static final C1510r0 TextAttributeCollector$lambda$5(AttributeData attributeData, CountryAreaCode countryAreaCode) {
        String str;
        C6496s.h(attributeData, "$attributeData");
        if (isPhoneType(attributeData)) {
            str = countryAreaCode.getEmoji();
        } else {
            str = "";
        }
        return u1.d(str, (o1) null, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final String TextAttributeCollector$lambda$6(C1510r0 r0Var) {
        return (String) r0Var.getValue();
    }

    private static final void TextAttributeCollector$lambda$7(C1510r0 r0Var, String str) {
        r0Var.setValue(str);
    }

    /* access modifiers changed from: private */
    public static final C6514M TextAttributeCollector$lambda$8(AttributeData attributeData, C1510r0 r0Var, C1510r0 r0Var2, String str) {
        C6496s.h(attributeData, "$attributeData");
        C6496s.h(r0Var, "$value$delegate");
        C6496s.h(r0Var2, "$countryFlag$delegate");
        C6496s.h(str, "it");
        TextAttributeCollector$lambda$4(r0Var, str);
        if (isPhoneType(attributeData)) {
            TextAttributeCollector$lambda$7(r0Var2, getCountryAreaCodeFromText(str).getEmoji());
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M TextAttributeCollector$lambda$9(i iVar, AttributeData attributeData, boolean z10, C6798l lVar, C6798l lVar2, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(attributeData, "$attributeData");
        TextAttributeCollector(iVar, attributeData, z10, lVar, lVar2, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final void TextAttributeTrailingComponent(boolean z10, boolean z11, boolean z12, a aVar, C6787a aVar2, C1500m mVar, int i10) {
        int i11;
        long r72;
        boolean z13;
        long r42;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z14 = z10;
        boolean z15 = z11;
        boolean z16 = z12;
        int i17 = i10;
        C1500m h10 = mVar.h(1872215775);
        if ((i17 & 14) == 0) {
            if (h10.b(z14)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i11 = i16 | i17;
        } else {
            i11 = i17;
        }
        if ((i17 & 112) == 0) {
            if (h10.b(z15)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i11 |= i15;
        }
        if ((i17 & 896) == 0) {
            if (h10.b(z16)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i11 |= i14;
        }
        if ((i17 & 7168) == 0) {
            if (h10.S(aVar)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i11 |= i13;
        } else {
            a aVar3 = aVar;
        }
        C6787a aVar4 = aVar2;
        if ((57344 & i17) == 0) {
            if (h10.C(aVar4)) {
                i12 = 16384;
            } else {
                i12 = 8192;
            }
            i11 |= i12;
        }
        if ((i11 & 46811) != 9362 || !h10.i()) {
            if (z15) {
                h10.T(803987533);
                h10.M();
                r72 = C2544x0.f25560b.g();
            } else if (z14) {
                h10.T(803989226);
                r72 = IntercomTheme.INSTANCE.getColors(h10, IntercomTheme.$stable).m687getDisabled0d7_KjU();
                h10.M();
            } else {
                h10.T(803990696);
                r72 = IntercomTheme.INSTANCE.getColors(h10, IntercomTheme.$stable).m672getAction0d7_KjU();
                h10.M();
            }
            long j10 = r72;
            i.a aVar5 = i.f23074a;
            float f10 = (float) 0;
            i r10 = q.r(q.d(b.d(C2342e.a(n.m(aVar5, h.j((float) 8), 0.0f, 0.0f, 0.0f, 14, (Object) null), a.b(aVar, I.c.b(h.j(f10)), (I.b) null, (I.b) null, I.c.b(h.j(f10)), 6, (Object) null)), j10, (g2) null, 2, (Object) null), 0.0f, 1, (Object) null), h.j((float) 40));
            if (z15 || z16 || z14) {
                z13 = false;
            } else {
                z13 = true;
            }
            i d10 = d.d(r10, z13, (String) null, (g) null, aVar2, 6, (Object) null);
            F h11 = androidx.compose.foundation.layout.d.h(k0.c.f23044a.e(), false);
            int a10 = C1494j.a(h10, 0);
            C1523y p10 = h10.p();
            i e10 = k0.h.e(h10, d10);
            C1241g.a aVar6 = C1241g.f3853J;
            C6787a a11 = aVar6.a();
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
            F1.b(a12, h11, aVar6.c());
            F1.b(a12, p10, aVar6.e());
            p b10 = aVar6.b();
            if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
                a12.r(Integer.valueOf(a10));
                a12.V(Integer.valueOf(a10), b10);
            }
            F1.b(a12, e10, aVar6.d());
            f fVar = f.f12848a;
            if (z15) {
                h10.T(1118235440);
                V.a(M0.e.c(R.drawable.intercom_attribute_verified_tick, h10, 0), (String) null, (i) null, IntercomTheme.INSTANCE.getColors(h10, IntercomTheme.$stable).m674getActive0d7_KjU(), h10, 56, 4);
                h10.M();
            } else if (z16) {
                h10.T(305789581);
                C1400p0.a(q.n(aVar5, h.j((float) 20)), IntercomTheme.INSTANCE.getColors(h10, IntercomTheme.$stable).m694getOnAction0d7_KjU(), h.j((float) 3), 0, 0, h10, 390, 24);
                h10.M();
            } else {
                h10.T(1118249365);
                C2817c c10 = M0.e.c(R.drawable.intercom_chevron, h10, 0);
                if (z14) {
                    h10.T(1118255019);
                    r42 = IntercomTheme.INSTANCE.getColors(h10, IntercomTheme.$stable).m696getOnDisabled0d7_KjU();
                } else {
                    h10.T(1118256201);
                    r42 = IntercomTheme.INSTANCE.getColors(h10, IntercomTheme.$stable).m694getOnAction0d7_KjU();
                }
                h10.M();
                V.a(c10, (String) null, (i) null, r42, h10, 56, 4);
                h10.M();
            }
            h10.u();
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new I(z10, z11, z12, aVar, aVar2, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TextAttributeTrailingComponent$lambda$11(boolean z10, boolean z11, boolean z12, a aVar, C6787a aVar2, int i10, C1500m mVar, int i11) {
        C6496s.h(aVar, "$shape");
        C6496s.h(aVar2, "$onClick");
        TextAttributeTrailingComponent(z10, z11, z12, aVar, aVar2, mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    private static final CountryAreaCode getCountryAreaCodeFromText(String str) {
        CountryAreaCode countryAreaCodeFromNumber = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(PhoneNumberValidator.normalizeNumber(str)));
        C6496s.g(countryAreaCodeFromNumber, "getCountryAreaCodeFromNumber(...)");
        return countryAreaCodeFromNumber;
    }

    /* access modifiers changed from: private */
    public static final String getHint(AttributeData attributeData, CountryAreaCode countryAreaCode) {
        String str;
        String renderType = attributeData.getAttribute().getRenderType();
        if (C6496s.c(renderType, "email")) {
            return "email@domain.com";
        }
        if (!C6496s.c(renderType, AttributeType.PHONE)) {
            return "";
        }
        if (C6496s.c(countryAreaCode, CountryAreaCode.UNKNOWN)) {
            str = "+1";
        } else {
            str = '+' + countryAreaCode.getDialCode();
        }
        return str + " 123 456 7890";
    }

    private static final int getKeyboardType(AttributeData attributeData) {
        String renderType = attributeData.getAttribute().getRenderType();
        switch (renderType.hashCode()) {
            case -1034364087:
                if (renderType.equals(AttributeType.NUMBER)) {
                    return C1456y.f8623b.d();
                }
                break;
            case 96619420:
                if (renderType.equals("email")) {
                    return C1456y.f8623b.c();
                }
                break;
            case 97526364:
                if (renderType.equals(AttributeType.FLOAT)) {
                    return C1456y.f8623b.b();
                }
                break;
            case 106642798:
                if (renderType.equals(AttributeType.PHONE)) {
                    return C1456y.f8623b.g();
                }
                break;
        }
        return C1456y.f8623b.h();
    }

    private static final boolean isPhoneType(AttributeData attributeData) {
        return C6496s.c(attributeData.getAttribute().getRenderType(), AttributeType.PHONE);
    }
}
