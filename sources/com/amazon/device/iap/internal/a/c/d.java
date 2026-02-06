package com.amazon.device.iap.internal.a.c;

import com.amazon.a.a.o.b;
import com.amazon.a.a.o.f;
import com.amazon.d.a.j;
import com.amazon.device.iap.internal.a.c;
import com.amazon.device.iap.internal.model.UserDataBuilder;
import com.amazon.device.iap.internal.model.UserDataResponseBuilder;
import com.amazon.device.iap.model.UserData;
import com.amazon.device.iap.model.UserDataRequest;
import com.amazon.device.iap.model.UserDataResponse;
import java.util.Map;

public final class d extends b {

    /* renamed from: d  reason: collision with root package name */
    private static final String f37843d = "d";

    public d(c cVar, UserDataRequest userDataRequest) {
        super(cVar, b.f37477ah);
        if (userDataRequest != null) {
            a("UserDataRequest.fetchLWAConsentStatus", Boolean.valueOf(userDataRequest.getFetchLWAConsentStatus()));
        }
    }

    /* access modifiers changed from: protected */
    public boolean b(j jVar) {
        String str = f37843d;
        com.amazon.device.iap.internal.util.b.a(str, "onResult: result = " + jVar);
        Map b10 = jVar.b();
        com.amazon.device.iap.internal.util.b.a(str, "data: " + b10);
        String str2 = (String) b10.get("userId");
        String str3 = (String) b10.get(b.f37490m);
        String str4 = (String) b10.get("UserDataResponse.LWAConsentStatus");
        c cVar = (c) j();
        if (f.a(str2) || f.a(str3)) {
            cVar.a().a((Object) new UserDataResponseBuilder().setRequestId(cVar.d()).setRequestStatus(UserDataResponse.RequestStatus.FAILED).build());
            return false;
        }
        UserData build = new UserDataBuilder().setUserId(str2).setMarketplace(str3).setLWAConsentStatus(str4).build();
        UserDataResponse build2 = new UserDataResponseBuilder().setRequestId(cVar.d()).setRequestStatus(UserDataResponse.RequestStatus.SUCCESSFUL).setUserData(build).build();
        cVar.a().a("userId", build.getUserId());
        cVar.a().a((Object) build2);
        return true;
    }
}
