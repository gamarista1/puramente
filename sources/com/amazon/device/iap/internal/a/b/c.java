package com.amazon.device.iap.internal.a.b;

import com.amazon.d.a.j;
import com.amazon.device.iap.internal.a.e;
import com.amazon.device.iap.internal.a.f;
import com.amazon.device.iap.internal.b.a;
import com.amazon.device.iap.internal.b.d;
import com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder;
import com.amazon.device.iap.internal.model.ReceiptBuilder;
import com.amazon.device.iap.internal.model.UserDataBuilder;
import com.amazon.device.iap.internal.util.b;
import com.amazon.device.iap.model.ProductType;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.Receipt;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

public final class c extends b {

    /* renamed from: d  reason: collision with root package name */
    private static final String f37831d = "c";

    /* renamed from: e  reason: collision with root package name */
    private static final Date f37832e = new Date(0);

    public c(com.amazon.device.iap.internal.a.c cVar, boolean z10) {
        super(cVar, "1.0", z10);
    }

    /* access modifiers changed from: protected */
    public boolean b(j jVar) {
        Map b10 = jVar.b();
        b.a(f37831d, "data: " + b10);
        String str = (String) b10.get("userId");
        String str2 = (String) b10.get(com.amazon.a.a.o.b.f37444B);
        String str3 = (String) b10.get(com.amazon.a.a.o.b.f37490m);
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray((String) b10.get(com.amazon.a.a.o.b.f37449G));
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                Receipt a10 = com.amazon.device.iap.internal.util.c.a(jSONArray.getJSONObject(i10), str, (String) null);
                arrayList.add(a10);
                if (ProductType.ENTITLED == a10.getProductType()) {
                    a.a().a(str, a10.getReceiptId(), a10.getSku());
                }
            } catch (e e10) {
                b.b(f37831d, "fail to parse receipt, requestId:" + e10.a());
            } catch (f e11) {
                b.b(f37831d, "fail to verify receipt, requestId:" + e11.a());
            } catch (Throwable th2) {
                b.b(f37831d, "fail to verify receipt, requestId:" + th2.getMessage());
            }
        }
        JSONArray jSONArray2 = new JSONArray((String) b10.get(com.amazon.a.a.o.b.f37450H));
        for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
            try {
                String string = jSONArray2.getString(i11);
                arrayList.add(new ReceiptBuilder().setSku(string).setProductType(ProductType.ENTITLED).setPurchaseDate((Date) null).setCancelDate(f37832e).setReceiptId(a.a().a(str, string)).build());
            } catch (JSONException unused) {
                b.b(f37831d, "fail to parse JSON[" + i11 + "] in \"" + jSONArray2 + "\"");
            }
        }
        boolean equalsIgnoreCase = com.amazon.a.a.o.b.f37475af.equalsIgnoreCase((String) b10.get(com.amazon.a.a.o.b.f37486i));
        com.amazon.device.iap.internal.a.c cVar = (com.amazon.device.iap.internal.a.c) j();
        PurchaseUpdatesResponse build = new PurchaseUpdatesResponseBuilder().setRequestId(cVar.d()).setRequestStatus(PurchaseUpdatesResponse.RequestStatus.SUCCESSFUL).setUserData(new UserDataBuilder().setUserId(str).setMarketplace(str3).build()).setReceipts(arrayList).setHasMore(equalsIgnoreCase).build();
        build.getReceipts().addAll(d.a().b(build.getUserData().getUserId()));
        cVar.a().a((Object) build);
        cVar.a().a(com.amazon.a.a.o.b.ap, (String) b10.get(com.amazon.a.a.o.b.f37479b));
        return true;
    }
}
