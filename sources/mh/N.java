package mh;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import gh.C5987k;
import ih.f;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lh.C6538b;
import lh.i;
import lh.v;
import yf.C6798l;

class N extends C6587d {

    /* renamed from: f  reason: collision with root package name */
    private final Map f72133f = new LinkedHashMap();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public N(C6538b bVar, C6798l lVar) {
        super(bVar, lVar, (DefaultConstructorMarker) null);
        C6496s.h(bVar, "json");
        C6496s.h(lVar, "nodeConsumer");
    }

    public void p(f fVar, int i10, C5987k kVar, Object obj) {
        C6496s.h(fVar, "descriptor");
        C6496s.h(kVar, "serializer");
        if (obj != null || this.f72194d.i()) {
            super.p(fVar, i10, kVar, obj);
        }
    }

    public i q0() {
        return new v(this.f72133f);
    }

    public void u0(String str, i iVar) {
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        C6496s.h(iVar, "element");
        this.f72133f.put(str, iVar);
    }

    /* access modifiers changed from: protected */
    public final Map v0() {
        return this.f72133f;
    }
}
