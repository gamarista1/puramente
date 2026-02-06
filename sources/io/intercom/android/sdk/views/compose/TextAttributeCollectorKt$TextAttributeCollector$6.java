package io.intercom.android.sdk.views.compose;

import I.a;
import Y.C1500m;
import Y.C1510r0;
import android.content.res.Resources;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.models.Attribute;
import io.intercom.android.sdk.utilities.AttributeCollectorValidatorKt;
import io.intercom.android.sdk.utilities.AttributeValidatorUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6798l;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class TextAttributeCollectorKt$TextAttributeCollector$6 implements p {
    final /* synthetic */ AttributeData $attributeData;
    final /* synthetic */ boolean $disabled;
    final /* synthetic */ boolean $loading;
    final /* synthetic */ C6798l $onSubmitAttribute;
    final /* synthetic */ C6798l $onValidationError;
    final /* synthetic */ Resources $resources;
    final /* synthetic */ a $shape;
    final /* synthetic */ boolean $submitted;
    final /* synthetic */ C1510r0 $value$delegate;

    TextAttributeCollectorKt$TextAttributeCollector$6(boolean z10, boolean z11, boolean z12, a aVar, C6798l lVar, Resources resources, AttributeData attributeData, C6798l lVar2, C1510r0 r0Var) {
        this.$disabled = z10;
        this.$submitted = z11;
        this.$loading = z12;
        this.$shape = aVar;
        this.$onValidationError = lVar;
        this.$resources = resources;
        this.$attributeData = attributeData;
        this.$onSubmitAttribute = lVar2;
        this.$value$delegate = r0Var;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$0(C6798l lVar, Resources resources, AttributeData attributeData, C6798l lVar2, C1510r0 r0Var) {
        C6798l lVar3 = lVar;
        Resources resources2 = resources;
        C6496s.h(attributeData, "$attributeData");
        C6496s.h(r0Var, "$value$delegate");
        String obj = Sg.p.g1(TextAttributeCollectorKt.TextAttributeCollector$lambda$3(r0Var)).toString();
        if (obj.length() == 0) {
            String string = resources2.getString(R.string.intercom_string_is_incorrect);
            C6496s.g(string, "getString(...)");
            lVar.invoke(string);
        } else {
            Attribute attribute = attributeData.getAttribute();
            int validateAttribute = AttributeValidatorUtils.validateAttribute(obj, attribute.getRenderType());
            if (validateAttribute == 0) {
                lVar.invoke("");
                C6798l lVar4 = lVar2;
                lVar4.invoke(AttributeData.copy$default(attributeData, Attribute.copy$default(attribute, (String) null, (String) null, (String) null, false, (String) null, (List) null, (Boolean) null, obj, 127, (Object) null), (String) null, false, 6, (Object) null));
            } else {
                C6496s.e(resources);
                lVar.invoke(AttributeCollectorValidatorKt.getErrorStringFromCode(resources2, validateAttribute));
            }
        }
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            TextAttributeCollectorKt.TextAttributeTrailingComponent(this.$disabled, this.$submitted, this.$loading, this.$shape, new T(this.$onValidationError, this.$resources, this.$attributeData, this.$onSubmitAttribute, this.$value$delegate), mVar, 0);
        } else {
            mVar.I();
        }
    }
}
