package com.amazon.device.simplesignin.a.a.d.a;

import com.amazon.d.a.j;
import com.amazon.device.simplesignin.a.a.a;
import com.amazon.device.simplesignin.a.a.c;
import com.amazon.device.simplesignin.a.a.d;
import com.amazon.device.simplesignin.model.RequestStatus;
import com.amazon.device.simplesignin.model.response.ShowLoginSelectionResponse;
import java.util.Map;

class b extends c {

    /* renamed from: b  reason: collision with root package name */
    private static final String f38049b = "SSI_LoginSelectionResponse";

    /* renamed from: c  reason: collision with root package name */
    private static final String f38050c = "1.0";

    b(a aVar) {
        super(aVar, f38049b, "1.0");
    }

    /* access modifiers changed from: protected */
    public void a(RequestStatus requestStatus) {
        if (RequestStatus.INVALID_LINK_SIGNING_KEY_ENCRYPTION.equals(requestStatus) || RequestStatus.INVALID_LINK_SIGNING_KEY.equals(requestStatus)) {
            a(RequestStatus.FAILURE, (String) null, (ShowLoginSelectionResponse.UserSelection) null);
        } else {
            a(requestStatus, (String) null, (ShowLoginSelectionResponse.UserSelection) null);
        }
    }

    /* access modifiers changed from: protected */
    public boolean b(j jVar) {
        Map b10 = jVar.b();
        if (!b10.containsKey(a.f38018q)) {
            a(RequestStatus.FAILURE);
            return false;
        }
        String str = (String) b10.get(a.f38018q);
        if (str == null) {
            a(RequestStatus.FAILURE);
            return false;
        }
        String str2 = (String) b10.get(a.f38019r);
        ShowLoginSelectionResponse.UserSelection userSelection = ShowLoginSelectionResponse.UserSelection.LoginSelected;
        if (!userSelection.name().equals(str) || str2 == null) {
            a(RequestStatus.SUCCESSFUL, (String) null, ShowLoginSelectionResponse.UserSelection.ManualSignIn);
            return true;
        }
        a(RequestStatus.SUCCESSFUL, str2, userSelection);
        return true;
    }

    private void a(RequestStatus requestStatus, String str, ShowLoginSelectionResponse.UserSelection userSelection) {
        ShowLoginSelectionResponse showLoginSelectionResponse = new ShowLoginSelectionResponse();
        showLoginSelectionResponse.setRequestId(((d) j()).e());
        showLoginSelectionResponse.setRequestStatus(requestStatus);
        showLoginSelectionResponse.setUserSelection(userSelection);
        showLoginSelectionResponse.setLinkId(str);
        super.a((Object) showLoginSelectionResponse);
    }
}
