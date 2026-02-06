package io.intercom.android.sdk.views.compose;

import V.B0;
import V.I;
import Y.C1500m;
import Y.C1510r0;
import Y.M0;
import Y.Y0;
import Y.o1;
import androidx.compose.foundation.layout.q;
import g0.c;
import h0.C2018b;
import h0.C2026j;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6798l;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aK\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u00020\bH\u0001¢\u0006\u0004\b\f\u0010\r\u001a\u000f\u0010\u000e\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000e\u0010\r\u001a\u000f\u0010\u000f\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000f\u0010\r\u001a\u000f\u0010\u0010\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0010\u0010\r¨\u0006\u0014²\u0006\u000e\u0010\u0011\u001a\u00020\u00048\n@\nX\u0002²\u0006\u000e\u0010\u0013\u001a\u00020\u00128\n@\nX\u0002"}, d2 = {"Lk0/i;", "modifier", "Lio/intercom/android/sdk/m5/conversation/states/AttributeData;", "attributeData", "", "hasErrors", "loading", "Lkotlin/Function1;", "Llf/M;", "onSubmitAttribute", "ListAttributeCollector", "(Lk0/i;Lio/intercom/android/sdk/m5/conversation/states/AttributeData;ZZLyf/l;LY/m;II)V", "ListAttributePreview", "(LY/m;I)V", "SubmittedListAttributePreview", "DisabledListAttributePreview", "SubmittedAndDisabledListAttributePreview", "expanded", "", "value", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ListAttributeCollectorKt {
    public static final void DisabledListAttributePreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(865192767);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$ListAttributeCollectorKt.INSTANCE.m744getLambda7$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new v(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M DisabledListAttributePreview$lambda$12(int i10, C1500m mVar, int i11) {
        DisabledListAttributePreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void ListAttributeCollector(i iVar, AttributeData attributeData, boolean z10, boolean z11, C6798l lVar, C1500m mVar, int i10, int i11) {
        i.a aVar;
        boolean z12;
        boolean z13;
        y yVar;
        boolean z14;
        AttributeData attributeData2 = attributeData;
        C6496s.h(attributeData2, "attributeData");
        C1500m h10 = mVar.h(1993212876);
        if ((i11 & 1) != 0) {
            aVar = i.f23074a;
        } else {
            aVar = iVar;
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
            yVar = new y();
        } else {
            yVar = lVar;
        }
        boolean isFormDisabled = attributeData.isFormDisabled();
        boolean submitted = attributeData.getAttribute().getSubmitted();
        h10.T(497283745);
        Object A10 = h10.A();
        C1500m.a aVar2 = C1500m.f10026a;
        if (A10 == aVar2.a()) {
            A10 = u1.d(Boolean.FALSE, (o1) null, 2, (Object) null);
            h10.r(A10);
        }
        C1510r0 r0Var = (C1510r0) A10;
        h10.M();
        C1510r0 r0Var2 = (C1510r0) C2018b.e(new Object[0], (C2026j) null, (String) null, new z(attributeData2), h10, 8, 6);
        if (!z12 && (isFormDisabled || submitted)) {
            z14 = false;
        } else {
            z14 = true;
        }
        i h11 = q.h(aVar, 0.0f, 1, (Object) null);
        boolean ListAttributeCollector$lambda$2 = ListAttributeCollector$lambda$2(r0Var);
        h10.T(497294500);
        Object A11 = h10.A();
        if (A11 == aVar2.a()) {
            A11 = new A(r0Var);
            h10.r(A11);
        }
        h10.M();
        ListAttributeCollectorKt$ListAttributeCollector$3 listAttributeCollectorKt$ListAttributeCollector$3 = r0;
        ListAttributeCollectorKt$ListAttributeCollector$3 listAttributeCollectorKt$ListAttributeCollector$32 = new ListAttributeCollectorKt$ListAttributeCollector$3(isFormDisabled, z14, attributeData, r0Var2, submitted, z13, r0Var, yVar);
        I.a(ListAttributeCollector$lambda$2, (C6798l) A11, h11, c.e(1992435426, true, listAttributeCollectorKt$ListAttributeCollector$3, h10, 54), h10, 3120, 0);
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new B(aVar, attributeData, z12, z13, yVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M ListAttributeCollector$lambda$0(AttributeData attributeData) {
        C6496s.h(attributeData, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final boolean ListAttributeCollector$lambda$2(C1510r0 r0Var) {
        return ((Boolean) r0Var.getValue()).booleanValue();
    }

    /* access modifiers changed from: private */
    public static final void ListAttributeCollector$lambda$3(C1510r0 r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C1510r0 ListAttributeCollector$lambda$4(AttributeData attributeData) {
        C6496s.h(attributeData, "$attributeData");
        String value = attributeData.getAttribute().getValue();
        if (value == null) {
            value = "";
        }
        return u1.d(value, (o1) null, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final String ListAttributeCollector$lambda$5(C1510r0 r0Var) {
        return (String) r0Var.getValue();
    }

    /* access modifiers changed from: private */
    public static final void ListAttributeCollector$lambda$6(C1510r0 r0Var, String str) {
        r0Var.setValue(str);
    }

    /* access modifiers changed from: private */
    public static final C6514M ListAttributeCollector$lambda$8$lambda$7(C1510r0 r0Var, boolean z10) {
        C6496s.h(r0Var, "$expanded$delegate");
        ListAttributeCollector$lambda$3(r0Var, z10);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ListAttributeCollector$lambda$9(i iVar, AttributeData attributeData, boolean z10, boolean z11, C6798l lVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(attributeData, "$attributeData");
        ListAttributeCollector(iVar, attributeData, z10, z11, lVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void ListAttributePreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1324269915);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$ListAttributeCollectorKt.INSTANCE.m740getLambda3$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new x(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M ListAttributePreview$lambda$10(int i10, C1500m mVar, int i11) {
        ListAttributePreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void SubmittedAndDisabledListAttributePreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1340154819);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$ListAttributeCollectorKt.INSTANCE.m746getLambda9$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new u(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M SubmittedAndDisabledListAttributePreview$lambda$13(int i10, C1500m mVar, int i11) {
        SubmittedAndDisabledListAttributePreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void SubmittedListAttributePreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-899805828);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$ListAttributeCollectorKt.INSTANCE.m742getLambda5$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new w(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M SubmittedListAttributePreview$lambda$11(int i10, C1500m mVar, int i11) {
        SubmittedListAttributePreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
