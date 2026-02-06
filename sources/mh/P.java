package mh;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import ih.f;
import java.util.ArrayList;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lh.C6538b;
import lh.C6539c;
import lh.i;
import yf.C6798l;

final class P extends C6587d {

    /* renamed from: f  reason: collision with root package name */
    private final ArrayList f72137f = new ArrayList();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public P(C6538b bVar, C6798l lVar) {
        super(bVar, lVar, (DefaultConstructorMarker) null);
        C6496s.h(bVar, "json");
        C6496s.h(lVar, "nodeConsumer");
    }

    /* access modifiers changed from: protected */
    public String a0(f fVar, int i10) {
        C6496s.h(fVar, "descriptor");
        return String.valueOf(i10);
    }

    public i q0() {
        return new C6539c(this.f72137f);
    }

    public void u0(String str, i iVar) {
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        C6496s.h(iVar, "element");
        this.f72137f.add(Integer.parseInt(str), iVar);
    }
}
