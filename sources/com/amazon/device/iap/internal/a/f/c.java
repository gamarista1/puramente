package com.amazon.device.iap.internal.a.f;

import com.amazon.a.a.o.b;
import com.amazon.a.a.o.f;
import com.amazon.d.a.j;
import com.amazon.device.iap.internal.model.PurchaseResponseBuilder;
import com.amazon.device.iap.internal.model.UserDataBuilder;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.Receipt;
import java.util.Map;
import org.json.JSONObject;

public final class c extends a {

    /* renamed from: c  reason: collision with root package name */
    private static final String f37869c = "c";

    public c(com.amazon.device.iap.internal.a.c cVar) {
        super(cVar, b.f37477ah);
    }

    /* access modifiers changed from: protected */
    public boolean b(j jVar) {
        Receipt receipt;
        Map b10 = jVar.b();
        String str = f37869c;
        com.amazon.device.iap.internal.util.b.a(str, "data: " + b10);
        String str2 = (String) b().get(b.f37444B);
        String str3 = (String) b10.get("userId");
        String str4 = (String) b10.get(b.f37490m);
        String str5 = (String) b10.get(b.f37446D);
        if (f.a(str5)) {
            a(str3, str4, str2, PurchaseResponse.RequestStatus.FAILED);
            return false;
        }
        JSONObject jSONObject = new JSONObject(str5);
        PurchaseResponse.RequestStatus safeValueOf = PurchaseResponse.RequestStatus.safeValueOf(jSONObject.getString(b.f37491n));
        if (safeValueOf == PurchaseResponse.RequestStatus.SUCCESSFUL) {
            try {
                receipt = com.amazon.device.iap.internal.util.c.a(jSONObject, str3, str2);
            } catch (Throwable unused) {
                a(str3, str4, str2, PurchaseResponse.RequestStatus.FAILED);
                return false;
            }
        } else {
            receipt = null;
        }
        com.amazon.device.iap.internal.a.c cVar = (com.amazon.device.iap.internal.a.c) j();
        cVar.a().a((Object) new PurchaseResponseBuilder().setRequestId(cVar.d()).setRequestStatus(safeValueOf).setUserData(new UserDataBuilder().setUserId(str3).setMarketplace(str4).build()).setReceipt(receipt).build());
        return true;
    }
}
