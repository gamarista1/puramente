package mh;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lh.C6538b;
import lh.i;
import yf.C6798l;

final class J extends C6587d {

    /* renamed from: f  reason: collision with root package name */
    private i f72125f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J(C6538b bVar, C6798l lVar) {
        super(bVar, lVar, (DefaultConstructorMarker) null);
        C6496s.h(bVar, "json");
        C6496s.h(lVar, "nodeConsumer");
        Y("primitive");
    }

    public i q0() {
        i iVar = this.f72125f;
        if (iVar != null) {
            return iVar;
        }
        throw new IllegalArgumentException("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?");
    }

    public void u0(String str, i iVar) {
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        C6496s.h(iVar, "element");
        if (str != "primitive") {
            throw new IllegalArgumentException("This output can only consume primitives with 'primitive' tag");
        } else if (this.f72125f == null) {
            this.f72125f = iVar;
            r0().invoke(iVar);
        } else {
            throw new IllegalArgumentException("Primitive element was already recorded. Does call to .encodeXxx happen more than once?");
        }
    }
}
