package com.amazon.device.simplesignin.a.a.b;

import com.amazon.device.simplesignin.a.a.a;
import com.amazon.device.simplesignin.a.a.d;
import com.amazon.device.simplesignin.a.d.b;
import com.amazon.device.simplesignin.model.RequestStatus;
import com.amazon.device.simplesignin.model.response.LinkUserAccountResponse;
import java.util.Map;

public abstract class c extends com.amazon.device.simplesignin.a.a.c {
    protected c(d dVar, String str, String str2) {
        super(dVar, str, str2);
    }

    /* access modifiers changed from: protected */
    public void a(RequestStatus requestStatus) {
        a(requestStatus, (String) null, (LinkUserAccountResponse.SuccessCode) null);
    }

    /* access modifiers changed from: protected */
    public void a(RequestStatus requestStatus, String str, LinkUserAccountResponse.SuccessCode successCode) {
        LinkUserAccountResponse linkUserAccountResponse = new LinkUserAccountResponse();
        linkUserAccountResponse.setRequestId(((d) j()).e());
        linkUserAccountResponse.setRequestStatus(requestStatus);
        linkUserAccountResponse.setLinkId(str);
        linkUserAccountResponse.setSuccessCode(successCode);
        super.a((Object) linkUserAccountResponse);
    }

    /* access modifiers changed from: protected */
    public boolean a(Map map) {
        if (!map.containsKey(a.f38014m)) {
            a(RequestStatus.FAILURE);
            return false;
        }
        String str = (String) map.get(a.f38014m);
        if (str == null) {
            a(RequestStatus.FAILURE);
            return false;
        }
        String str2 = (!map.containsKey(a.f38012k) || map.get(a.f38012k) == null) ? null : (String) map.get(a.f38012k);
        if (map.containsKey(a.f38013l) && map.get(a.f38013l) != null) {
            str2 = b.a((String) map.get(a.f38013l));
        }
        a(RequestStatus.SUCCESSFUL, str2, LinkUserAccountResponse.SuccessCode.valueOf(str));
        return true;
    }
}
