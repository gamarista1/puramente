package com.amazon.device.simplesignin.a.a;

import android.content.Context;
import android.content.Intent;
import com.amazon.device.simplesignin.a.a.a.a;
import com.amazon.device.simplesignin.model.RequestId;
import com.amazon.device.simplesignin.model.request.LinkUserAccountRequest;
import com.amazon.device.simplesignin.model.request.SSIEventRequest;
import java.util.Map;

public class b implements com.amazon.device.simplesignin.a.b {

    /* renamed from: a  reason: collision with root package name */
    private static final String f38031a = "b";

    public void a(RequestId requestId, String str) {
        new a(requestId, str).d();
    }

    public void a(RequestId requestId, LinkUserAccountRequest linkUserAccountRequest) {
        new com.amazon.device.simplesignin.a.a.b.a(requestId, linkUserAccountRequest).d();
    }

    public void a(RequestId requestId, Map<String, String> map) {
        new com.amazon.device.simplesignin.a.a.d.a(requestId, map).d();
    }

    public void a(RequestId requestId, SSIEventRequest sSIEventRequest) {
        new com.amazon.device.simplesignin.a.a.c.a(requestId, sSIEventRequest).d();
    }

    public void a(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra(a.f38015n);
        if (stringExtra == null) {
            com.amazon.device.simplesignin.a.d.a.b(f38031a, "Invalid response type: null");
            return;
        }
        String str = f38031a;
        com.amazon.device.simplesignin.a.d.a.a(str, "Found response type: " + stringExtra);
        if (a.f38024w.equals(stringExtra)) {
            new com.amazon.device.simplesignin.a.a.b.a.b(new RequestId(intent.getStringExtra(com.amazon.a.a.o.b.f37444B))).d();
        }
        if (a.f38025x.equals(stringExtra)) {
            new com.amazon.device.simplesignin.a.a.d.a.a(new RequestId(intent.getStringExtra(com.amazon.a.a.o.b.f37444B))).d();
        }
    }
}
