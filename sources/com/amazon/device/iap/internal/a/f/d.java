package com.amazon.device.iap.internal.a.f;

import com.amazon.a.a.n.a.h;
import com.amazon.device.iap.internal.a.c;
import com.amazon.device.iap.internal.a.g.b;
import com.amazon.device.iap.internal.model.PurchaseResponseBuilder;
import com.amazon.device.iap.model.ProductType;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.RequestId;

public final class d extends c {
    public d(RequestId requestId) {
        super(requestId);
        c cVar = new c(this);
        cVar.b((h) new b(this));
        a((h) cVar);
    }

    public void b() {
        boolean z10;
        PurchaseResponse purchaseResponse = (PurchaseResponse) a().b();
        if (purchaseResponse != null) {
            Receipt receipt = purchaseResponse.getReceipt();
            if (receipt != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            com.amazon.device.iap.internal.a.g.c cVar = new com.amazon.device.iap.internal.a.g.c(this, z10);
            if (z10 && (ProductType.ENTITLED == receipt.getProductType() || ProductType.SUBSCRIPTION == receipt.getProductType())) {
                cVar.b((h) new b(this, d().toString()));
            }
            a(purchaseResponse, cVar);
        }
    }

    public void c() {
        PurchaseResponse purchaseResponse = (PurchaseResponse) a().b();
        if (purchaseResponse == null) {
            purchaseResponse = new PurchaseResponseBuilder().setRequestId(d()).setRequestStatus(PurchaseResponse.RequestStatus.FAILED).build();
        }
        a(purchaseResponse, new com.amazon.device.iap.internal.a.g.c(this, false));
    }
}
