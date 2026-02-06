package com.amazon.device.iap.internal.a.e;

import com.amazon.a.a.n.a.h;
import com.amazon.device.iap.internal.a.c;
import com.amazon.device.iap.internal.model.PurchaseResponseBuilder;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.RequestId;

public final class d extends c {
    public d(RequestId requestId, String str) {
        super(requestId);
        c cVar = new c(this, str);
        cVar.b((h) new b(this, str));
        a((h) cVar);
    }

    public void b() {
    }

    public void c() {
        PurchaseResponse purchaseResponse = (PurchaseResponse) a().b();
        if (purchaseResponse == null) {
            purchaseResponse = new PurchaseResponseBuilder().setRequestId(d()).setRequestStatus(PurchaseResponse.RequestStatus.FAILED).build();
        }
        a((Object) purchaseResponse);
    }
}
