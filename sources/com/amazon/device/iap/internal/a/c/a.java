package com.amazon.device.iap.internal.a.c;

import com.amazon.a.a.n.a.h;
import com.amazon.device.iap.internal.a.c;
import com.amazon.device.iap.internal.model.UserDataResponseBuilder;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserDataRequest;
import com.amazon.device.iap.model.UserDataResponse;

public final class a extends c {
    public a(RequestId requestId, UserDataRequest userDataRequest) {
        super(requestId);
        d dVar = new d(this, userDataRequest);
        dVar.b((h) new c(this));
        a((h) dVar);
    }

    public void b() {
        a((Object) (UserDataResponse) a().b());
    }

    public void c() {
        UserDataResponse userDataResponse = (UserDataResponse) a().b();
        if (userDataResponse == null) {
            userDataResponse = new UserDataResponseBuilder().setRequestId(d()).setRequestStatus(UserDataResponse.RequestStatus.FAILED).build();
        }
        a((Object) userDataResponse);
    }
}
