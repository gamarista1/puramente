package com.amazon.device.simplesignin.a.a.a;

import com.amazon.d.a.j;
import com.amazon.device.simplesignin.a.a.a;
import com.amazon.device.simplesignin.a.a.c;
import com.amazon.device.simplesignin.a.a.d;
import com.amazon.device.simplesignin.model.Link;
import com.amazon.device.simplesignin.model.RequestStatus;
import com.amazon.device.simplesignin.model.response.GetUserAndLinksResponse;
import java.util.List;
import java.util.Map;

public class b extends c {

    /* renamed from: b  reason: collision with root package name */
    private static final String f38028b = "SSI_GetUserAndLinks";

    /* renamed from: c  reason: collision with root package name */
    private static final String f38029c = "1.0";

    /* renamed from: d  reason: collision with root package name */
    private static final String f38030d = "b";

    b(a aVar, String str) {
        super(aVar, f38028b, "1.0");
        super.a(a.f38002a, str);
    }

    /* access modifiers changed from: protected */
    public void a(RequestStatus requestStatus) {
        if (RequestStatus.INVALID_LINK_SIGNING_KEY_ENCRYPTION.equals(requestStatus) || RequestStatus.INVALID_LINK_SIGNING_KEY.equals(requestStatus)) {
            a(RequestStatus.FAILURE, (String) null, (List<Link>) null);
        } else {
            a(requestStatus, (String) null, (List<Link>) null);
        }
    }

    /* access modifiers changed from: protected */
    public boolean b(j jVar) {
        Map b10 = jVar.b();
        if (!b10.containsKey(a.f38003b) || !b10.containsKey(a.f38004c)) {
            a(RequestStatus.FAILURE);
            return false;
        }
        String str = (String) b10.get(a.f38003b);
        String str2 = (String) b10.get(a.f38004c);
        if (str == null || str2 == null) {
            a(RequestStatus.FAILURE);
            return false;
        }
        List<Link> a10 = com.amazon.device.simplesignin.a.d.b.a(str, str2);
        if (a10 == null) {
            a(RequestStatus.FAILURE);
            return false;
        }
        a(RequestStatus.SUCCESSFUL, str, a10);
        return true;
    }

    private void a(RequestStatus requestStatus, String str, List<Link> list) {
        GetUserAndLinksResponse getUserAndLinksResponse = new GetUserAndLinksResponse();
        getUserAndLinksResponse.setRequestId(((d) j()).e());
        getUserAndLinksResponse.setRequestStatus(requestStatus);
        getUserAndLinksResponse.setAmazonUserId(str);
        getUserAndLinksResponse.setLinks(list);
        super.a((Object) getUserAndLinksResponse);
    }
}
