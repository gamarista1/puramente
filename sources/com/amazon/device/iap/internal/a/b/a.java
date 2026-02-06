package com.amazon.device.iap.internal.a.b;

import com.amazon.a.a.n.a.h;
import com.amazon.a.a.o.f;
import com.amazon.device.iap.internal.a.c;
import com.amazon.device.iap.internal.a.c.d;
import com.amazon.device.iap.internal.a.d.b;
import com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserDataRequest;
import java.util.HashSet;

public final class a extends c {
    public a(RequestId requestId, boolean z10) {
        super(requestId);
        d dVar = new d(this, (UserDataRequest) null);
        dVar.a((h) new d(this, z10));
        com.amazon.device.iap.internal.a.c.c cVar = new com.amazon.device.iap.internal.a.c.c(this);
        cVar.a((h) new c(this, z10));
        dVar.b((h) cVar);
        a((h) dVar);
    }

    public void b() {
        b bVar;
        PurchaseUpdatesResponse purchaseUpdatesResponse = (PurchaseUpdatesResponse) a().b();
        if (purchaseUpdatesResponse.getReceipts() == null || purchaseUpdatesResponse.getReceipts().size() <= 0) {
            bVar = null;
        } else {
            HashSet hashSet = new HashSet();
            for (Receipt next : purchaseUpdatesResponse.getReceipts()) {
                if (!f.a(next.getReceiptId())) {
                    hashSet.add(next.getReceiptId());
                }
            }
            bVar = new b(this, hashSet, com.amazon.device.iap.internal.model.a.DELIVERED.toString());
        }
        a(purchaseUpdatesResponse, bVar);
    }

    public void c() {
        PurchaseUpdatesResponse purchaseUpdatesResponse;
        Object b10 = a().b();
        if (b10 == null || !(b10 instanceof PurchaseUpdatesResponse)) {
            purchaseUpdatesResponse = new PurchaseUpdatesResponseBuilder().setRequestId(d()).setRequestStatus(PurchaseUpdatesResponse.RequestStatus.FAILED).build();
        } else {
            purchaseUpdatesResponse = (PurchaseUpdatesResponse) b10;
        }
        a((Object) purchaseUpdatesResponse);
    }
}
