package io.intercom.android.sdk.views.compose;

import Y.C1500m;
import androidx.compose.foundation.layout.n;
import c1.h;
import com.amazon.a.a.o.b;
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
/* renamed from: io.intercom.android.sdk.views.compose.ComposableSingletons$BooleanAttributeCollectorKt$lambda-7$1  reason: invalid class name */
final class ComposableSingletons$BooleanAttributeCollectorKt$lambda7$1 implements p {
    public static final ComposableSingletons$BooleanAttributeCollectorKt$lambda7$1 INSTANCE = new ComposableSingletons$BooleanAttributeCollectorKt$lambda7$1();

    ComposableSingletons$BooleanAttributeCollectorKt$lambda7$1() {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            BooleanAttributeCollectorKt.BooleanAttributeCollector(n.i(i.f23074a, h.j((float) 8)), new AttributeData(new Attribute("", "", "", true, (String) null, (List) null, (Boolean) null, b.f37476ag, 112, (DefaultConstructorMarker) null), "123", true), false, false, (C6798l) null, mVar, 70, 28);
        } else {
            mVar.I();
        }
    }
}
