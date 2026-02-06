package io.intercom.android.sdk.views.compose;

import Y.C1500m;
import androidx.compose.foundation.layout.n;
import c1.h;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.models.Attribute;
import java.util.List;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import yf.C6798l;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.views.compose.ComposableSingletons$TextAttributeCollectorKt$lambda-1$1  reason: invalid class name */
final class ComposableSingletons$TextAttributeCollectorKt$lambda1$1 implements p {
    public static final ComposableSingletons$TextAttributeCollectorKt$lambda1$1 INSTANCE = new ComposableSingletons$TextAttributeCollectorKt$lambda1$1();

    ComposableSingletons$TextAttributeCollectorKt$lambda1$1() {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            TextAttributeCollectorKt.TextAttributeCollector(n.i(i.f23074a, h.j((float) 4)), new AttributeData(new Attribute("", "Name", "string", false, (String) null, (List) null, (Boolean) null, "Filled", 112, (DefaultConstructorMarker) null), "123", false), false, (C6798l) null, (C6798l) null, mVar, 70, 28);
        } else {
            mVar.I();
        }
    }
}
