package io.intercom.android.sdk.views.compose;

import V.B0;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import g0.c;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.models.Attribute;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import java.util.List;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import mf.C6565s;
import r0.g2;
import x.C2868g;
import yf.C6798l;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001ao\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0013\u0010\u0012\u001a\u000f\u0010\u0014\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0014\u0010\u0012\u001a\u000f\u0010\u0015\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0015\u0010\u0012¨\u0006\u0017²\u0006\u000e\u0010\u0016\u001a\u00020\u00058\n@\nX\u0002"}, d2 = {"Lk0/i;", "modifier", "", "Lio/intercom/android/sdk/models/Attribute;", "attributes", "", "failedAttributeIdentifiers", "loadingAttributeIdentifiers", "partId", "", "isFormDisabled", "Lkotlin/Function1;", "Lio/intercom/android/sdk/m5/conversation/states/AttributeData;", "Llf/M;", "onSubmitAttribute", "AttributeCollectorCard", "(Lk0/i;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZLyf/l;LY/m;II)V", "BooleanAttributeCard", "(LY/m;I)V", "ListAttributeCard", "TextAttributeCard", "MultipleAttributeCard", "validationError", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AttributeCollectorCardKt {
    public static final void AttributeCollectorCard(i iVar, List<Attribute> list, List<String> list2, List<String> list3, String str, boolean z10, C6798l lVar, C1500m mVar, int i10, int i11) {
        i.a aVar;
        List<String> list4;
        List<String> list5;
        boolean z11;
        C6362e eVar;
        C6496s.h(list, "attributes");
        C6496s.h(str, "partId");
        C1500m h10 = mVar.h(-136461083);
        if ((i11 & 1) != 0) {
            aVar = i.f23074a;
        } else {
            aVar = iVar;
        }
        if ((i11 & 4) != 0) {
            list4 = C6565s.n();
        } else {
            list4 = list2;
        }
        if ((i11 & 8) != 0) {
            list5 = C6565s.n();
        } else {
            list5 = list3;
        }
        if ((i11 & 32) != 0) {
            z11 = false;
        } else {
            z11 = z10;
        }
        if ((i11 & 64) != 0) {
            eVar = new C6362e();
        } else {
            eVar = lVar;
        }
        IntercomCardKt.IntercomCard(aVar, IntercomCardStyle.INSTANCE.m590conversationCardStylePEIptTM((g2) null, 0, 0, 0.0f, (C2868g) null, h10, IntercomCardStyle.$stable << 15, 31), c.e(-1007698855, true, new AttributeCollectorCardKt$AttributeCollectorCard$2(list, list4, ((Context) h10.m(AndroidCompositionLocals_androidKt.g())).getResources(), list5, str, z11, eVar), h10, 54), h10, (i10 & 14) | 384 | (IntercomCardStyle.Style.$stable << 3), 0);
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6363f(aVar, list, list4, list5, str, z11, eVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M AttributeCollectorCard$lambda$0(AttributeData attributeData) {
        C6496s.h(attributeData, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M AttributeCollectorCard$lambda$1(i iVar, List list, List list2, List list3, String str, boolean z10, C6798l lVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(list, "$attributes");
        C6496s.h(str, "$partId");
        AttributeCollectorCard(iVar, list, list2, list3, str, z10, lVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void BooleanAttributeCard(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-96019153);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$AttributeCollectorCardKt.INSTANCE.m723getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6358a(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M BooleanAttributeCard$lambda$2(int i10, C1500m mVar, int i11) {
        BooleanAttributeCard(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void ListAttributeCard(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-100505407);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$AttributeCollectorCardKt.INSTANCE.m725getLambda4$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6361d(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M ListAttributeCard$lambda$3(int i10, C1500m mVar, int i11) {
        ListAttributeCard(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void MultipleAttributeCard(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(327354419);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$AttributeCollectorCardKt.INSTANCE.m729getLambda8$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6360c(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M MultipleAttributeCard$lambda$5(int i10, C1500m mVar, int i11) {
        MultipleAttributeCard(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void TextAttributeCard(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1807263952);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$AttributeCollectorCardKt.INSTANCE.m727getLambda6$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6359b(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TextAttributeCard$lambda$4(int i10, C1500m mVar, int i11) {
        TextAttributeCard(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
