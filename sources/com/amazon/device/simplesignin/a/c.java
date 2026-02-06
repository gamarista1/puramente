package com.amazon.device.simplesignin.a;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.amazon.a.a.o.f;
import com.amazon.device.simplesignin.ISimpleSignInResponseHandler;
import com.amazon.device.simplesignin.a.d.a;
import com.amazon.device.simplesignin.model.RequestId;
import com.amazon.device.simplesignin.model.SSIEvent;
import com.amazon.device.simplesignin.model.request.LinkUserAccountRequest;
import com.amazon.device.simplesignin.model.request.SSIEventRequest;
import java.util.Map;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private static String f38063a = "c";

    /* renamed from: b  reason: collision with root package name */
    private static final c f38064b = new c();

    /* renamed from: c  reason: collision with root package name */
    private static final IllegalStateException f38065c = new IllegalStateException(String.format("%s. %s", new Object[]{"Simple Sign-In SDK not initialized", "To initialize and register responseHandler, call SimpleSignInService.registerResponseHandler()"}));

    /* renamed from: d  reason: collision with root package name */
    private Context f38066d;

    /* renamed from: e  reason: collision with root package name */
    private ISimpleSignInResponseHandler f38067e;

    /* renamed from: f  reason: collision with root package name */
    private b f38068f;

    private c() {
    }

    public static c a() {
        return f38064b;
    }

    private boolean f() {
        if (this.f38066d != null) {
            return true;
        }
        return false;
    }

    private void g() {
        if (!f()) {
            a.b(f38063a, "Simple Sign-In SDK not initialized.");
            throw f38065c;
        }
    }

    public String b() {
        if (!f()) {
            a.b(f38063a, "Application context not initialized, SDK mode is unknown.");
            return com.amazon.device.simplesignin.a.b.a.UNKNOWN.name();
        } else if (a.a().b(this.f38066d)) {
            return com.amazon.device.simplesignin.a.b.a.SANDBOX.name();
        } else {
            return com.amazon.device.simplesignin.a.b.a.PRODUCTION.name();
        }
    }

    public Context c() {
        return this.f38066d;
    }

    public ISimpleSignInResponseHandler d() {
        return this.f38067e;
    }

    public b e() {
        return this.f38068f;
    }

    public void a(Context context, ISimpleSignInResponseHandler iSimpleSignInResponseHandler) {
        com.amazon.a.a.a(context.getApplicationContext());
        this.f38066d = context;
        this.f38067e = iSimpleSignInResponseHandler;
        this.f38068f = a.a().a(context);
    }

    public RequestId a(String str) {
        g();
        f.a(str, com.amazon.device.simplesignin.a.a.a.f38027z);
        RequestId requestId = new RequestId();
        this.f38068f.a(requestId, str);
        return requestId;
    }

    private void b(LinkUserAccountRequest linkUserAccountRequest) {
        f.a(linkUserAccountRequest.getPartnerUserId(), com.amazon.device.simplesignin.a.a.a.f37990A);
        f.a(linkUserAccountRequest.getIdentityProviderName(), com.amazon.device.simplesignin.a.a.a.f38027z);
        f.a((Object) linkUserAccountRequest.getLinkToken(), "linkToken");
        f.a(linkUserAccountRequest.getLinkToken().getToken(), "linkToken.token");
        f.a(linkUserAccountRequest.getLinkToken().getSchema(), "linkToken.schema");
        f.a(linkUserAccountRequest.getUserLoginName(), "userLoginName");
        f.a(linkUserAccountRequest.getLinkSigningKey(), "linkSigningKey");
    }

    public RequestId a(LinkUserAccountRequest linkUserAccountRequest) {
        g();
        b(linkUserAccountRequest);
        RequestId requestId = new RequestId();
        this.f38068f.a(requestId, linkUserAccountRequest);
        return requestId;
    }

    public RequestId a(Map<String, String> map) {
        g();
        if (!map.isEmpty()) {
            RequestId requestId = new RequestId();
            this.f38068f.a(requestId, map);
            return requestId;
        }
        throw new IllegalArgumentException("loginNames must not be empty");
    }

    public RequestId a(SSIEventRequest sSIEventRequest) {
        g();
        if (!sSIEventRequest.getEvent().equals(SSIEvent.LOGIN_FAILURE) || sSIEventRequest.getFailureReason() != null) {
            RequestId requestId = new RequestId();
            this.f38068f.a(requestId, sSIEventRequest);
            String str = f38063a;
            Log.i(str, "Initiating record event with requestId : " + requestId.toString());
            return requestId;
        }
        throw new IllegalArgumentException("failureReason must not be empty for login failure");
    }

    public void a(Context context, Intent intent) {
        this.f38068f.a(context, intent);
    }
}
