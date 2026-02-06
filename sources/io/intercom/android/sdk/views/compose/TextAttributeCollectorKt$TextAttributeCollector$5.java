package io.intercom.android.sdk.views.compose;

import Q0.T;
import V.T0;
import V0.h;
import V0.n;
import Y.C1500m;
import b1.j;
import b1.k;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.models.CountryAreaCode;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6798l;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class TextAttributeCollectorKt$TextAttributeCollector$5 implements p {
    final /* synthetic */ AttributeData $attributeData;
    final /* synthetic */ CountryAreaCode $countryAreaCode;

    TextAttributeCollectorKt$TextAttributeCollector$5(AttributeData attributeData, CountryAreaCode countryAreaCode) {
        this.$attributeData = attributeData;
        this.$countryAreaCode = countryAreaCode;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            AttributeData attributeData = this.$attributeData;
            CountryAreaCode countryAreaCode = this.$countryAreaCode;
            C6496s.e(countryAreaCode);
            T0.b(TextAttributeCollectorKt.getHint(attributeData, countryAreaCode), (i) null, IntercomTheme.INSTANCE.getColors(mVar, IntercomTheme.$stable).m692getHintText0d7_KjU(), 0, (n) null, (V0.p) null, (h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, (T) null, mVar, 0, 0, 131066);
            return;
        }
        mVar.I();
    }
}
