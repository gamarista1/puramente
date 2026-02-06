package io.intercom.android.sdk.views.compose;

import Y.C1500m;
import androidx.compose.foundation.layout.n;
import c1.h;
import com.amazon.a.a.o.b;
import io.intercom.android.sdk.models.Attribute;
import io.intercom.android.sdk.models.AttributeType;
import java.util.List;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import yf.C6798l;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.views.compose.ComposableSingletons$AttributeCollectorCardKt$lambda-7$1  reason: invalid class name */
final class ComposableSingletons$AttributeCollectorCardKt$lambda7$1 implements p {
    public static final ComposableSingletons$AttributeCollectorCardKt$lambda7$1 INSTANCE = new ComposableSingletons$AttributeCollectorCardKt$lambda7$1();

    ComposableSingletons$AttributeCollectorCardKt$lambda7$1() {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            AttributeCollectorCardKt.AttributeCollectorCard(n.i(i.f23074a, h.j((float) 8)), C6565s.q(new Attribute("string", "Provide text", "string", false, (String) null, (List) null, (Boolean) null, (String) null, 240, (DefaultConstructorMarker) null), new Attribute(AttributeType.BOOLEAN, "Yes or no?", AttributeType.BOOLEAN, true, (String) null, (List) null, (Boolean) null, b.f37475af, 112, (DefaultConstructorMarker) null), new Attribute(AttributeType.LIST, "Choose one", "string", false, (String) null, C6565s.q("Apple", "Orange", "Kiwi"), (Boolean) null, (String) null, 208, (DefaultConstructorMarker) null)), (List<String>) null, (List<String>) null, "", false, (C6798l) null, mVar, 24646, 108);
        } else {
            mVar.I();
        }
    }
}
