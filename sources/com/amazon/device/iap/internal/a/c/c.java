package com.amazon.device.iap.internal.a.c;

import com.amazon.a.a.o.f;
import com.amazon.d.a.j;
import com.amazon.device.iap.internal.model.UserDataBuilder;
import com.amazon.device.iap.internal.model.UserDataResponseBuilder;
import com.amazon.device.iap.internal.util.b;
import com.amazon.device.iap.model.UserData;
import com.amazon.device.iap.model.UserDataResponse;
import java.util.Map;

public final class c extends b {

    /* renamed from: d  reason: collision with root package name */
    private static final String f37842d = "c";

    public c(com.amazon.device.iap.internal.a.c cVar) {
        super(cVar, "1.0");
    }

    /* access modifiers changed from: protected */
    public boolean b(j jVar) {
        String str = f37842d;
        b.a(str, "onSuccessInternal: result = " + jVar);
        Map b10 = jVar.b();
        b.a(str, "data: " + b10);
        String str2 = (String) b10.get("userId");
        com.amazon.device.iap.internal.a.c cVar = (com.amazon.device.iap.internal.a.c) j();
        if (f.a(str2)) {
            cVar.a().a((Object) new UserDataResponseBuilder().setRequestId(cVar.d()).setRequestStatus(UserDataResponse.RequestStatus.FAILED).build());
            return false;
        }
        UserData build = new UserDataBuilder().setUserId(str2).setMarketplace(b.f37841c).build();
        UserDataResponse build2 = new UserDataResponseBuilder().setRequestId(cVar.d()).setRequestStatus(UserDataResponse.RequestStatus.SUCCESSFUL).setUserData(build).build();
        cVar.a().a("userId", build.getUserId());
        cVar.a().a((Object) build2);
        return true;
    }
}
