package mh;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import lf.C6535s;
import lh.C6538b;
import lh.C6539c;
import lh.C6540d;
import lh.i;
import lh.v;
import lh.w;
import lh.x;
import yf.C6798l;

final class S extends N {

    /* renamed from: g  reason: collision with root package name */
    private String f72142g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f72143h = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public S(C6538b bVar, C6798l lVar) {
        super(bVar, lVar);
        C6496s.h(bVar, "json");
        C6496s.h(lVar, "nodeConsumer");
    }

    public i q0() {
        return new v(v0());
    }

    public void u0(String str, i iVar) {
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        C6496s.h(iVar, "element");
        if (!this.f72143h) {
            Map v02 = v0();
            String str2 = this.f72142g;
            if (str2 == null) {
                C6496s.v("tag");
                str2 = null;
            }
            v02.put(str2, iVar);
            this.f72143h = true;
        } else if (iVar instanceof x) {
            this.f72142g = ((x) iVar).a();
            this.f72143h = false;
        } else if (iVar instanceof v) {
            throw F.d(w.f72014a.getDescriptor());
        } else if (iVar instanceof C6539c) {
            throw F.d(C6540d.f71956a.getDescriptor());
        } else {
            throw new C6535s();
        }
    }
}
