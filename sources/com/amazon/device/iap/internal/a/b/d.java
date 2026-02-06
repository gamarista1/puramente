package com.amazon.device.iap.internal.a.b;

import com.amazon.a.a.o.b;
import com.amazon.d.a.j;
import com.amazon.device.iap.internal.a.c;
import com.amazon.device.iap.internal.a.e;
import com.amazon.device.iap.internal.a.f;
import com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder;
import com.amazon.device.iap.internal.model.UserDataBuilder;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.Receipt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

public final class d extends b {

    /* renamed from: d  reason: collision with root package name */
    private static final String f37833d = "d";

    public d(c cVar, boolean z10) {
        super(cVar, b.f37477ah, z10);
    }

    private List<Receipt> a(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray(str2);
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                arrayList.add(com.amazon.device.iap.internal.util.c.a(jSONArray.getJSONObject(i10), str, str3));
            } catch (e e10) {
                String str4 = f37833d;
                com.amazon.device.iap.internal.util.b.b(str4, "fail to parse receipt, requestId:" + e10.a());
            } catch (f e11) {
                String str5 = f37833d;
                com.amazon.device.iap.internal.util.b.b(str5, "fail to verify receipt, requestId:" + e11.a());
            } catch (Throwable th2) {
                String str6 = f37833d;
                com.amazon.device.iap.internal.util.b.b(str6, "fail to verify receipt, requestId:" + th2.getMessage());
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public boolean b(j jVar) {
        Map b10 = jVar.b();
        String str = f37833d;
        com.amazon.device.iap.internal.util.b.a(str, "data: " + b10);
        String str2 = (String) b10.get("userId");
        List<Receipt> a10 = a(str2, (String) b10.get(b.f37449G), (String) b10.get(b.f37444B));
        boolean booleanValue = Boolean.valueOf((String) b10.get(b.f37486i)).booleanValue();
        c cVar = (c) j();
        PurchaseUpdatesResponse build = new PurchaseUpdatesResponseBuilder().setRequestId(cVar.d()).setRequestStatus(PurchaseUpdatesResponse.RequestStatus.SUCCESSFUL).setUserData(new UserDataBuilder().setUserId(str2).setMarketplace((String) b10.get(b.f37490m)).build()).setReceipts(a10).setHasMore(booleanValue).build();
        cVar.a().a(b.ap, (String) b10.get(b.f37479b));
        cVar.a().a((Object) build);
        return true;
    }
}
