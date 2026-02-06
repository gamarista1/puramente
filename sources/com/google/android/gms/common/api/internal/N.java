package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.internal.C4535q;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import ya.C5286c;

final class N {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C4490b f53973a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C5286c f53974b;

    /* synthetic */ N(C4490b bVar, C5286c cVar, M m10) {
        this.f53973a = bVar;
        this.f53974b = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof N)) {
            N n10 = (N) obj;
            if (!C4535q.b(this.f53973a, n10.f53973a) || !C4535q.b(this.f53974b, n10.f53974b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C4535q.c(this.f53973a, this.f53974b);
    }

    public final String toString() {
        return C4535q.d(this).a(SubscriberAttributeKt.JSON_NAME_KEY, this.f53973a).a("feature", this.f53974b).toString();
    }
}
