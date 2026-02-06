package com.amazon.device.simplesignin.a.a.b;

import android.app.Activity;
import android.content.Intent;
import com.amazon.a.a.k.a;
import com.amazon.a.a.n.b.d;
import com.amazon.d.a.j;
import com.amazon.device.simplesignin.model.request.LinkUserAccountRequest;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class b extends c {

    /* renamed from: d  reason: collision with root package name */
    private static final String f38034d = "SSI_LinkUserAccount";

    /* renamed from: e  reason: collision with root package name */
    private static final String f38035e = "1.0";
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final String f38036f = "b";
    @a

    /* renamed from: b  reason: collision with root package name */
    protected com.amazon.a.a.n.b f38037b;
    @a

    /* renamed from: c  reason: collision with root package name */
    protected com.amazon.a.a.a.a f38038c;

    b(a aVar, LinkUserAccountRequest linkUserAccountRequest) {
        super(aVar, f38034d, "1.0");
        super.a(com.amazon.device.simplesignin.a.a.a.f38005d, linkUserAccountRequest.getPartnerUserId());
        super.a(com.amazon.device.simplesignin.a.a.a.f38002a, linkUserAccountRequest.getIdentityProviderName());
        super.a(com.amazon.device.simplesignin.a.a.a.f38006e, linkUserAccountRequest.getUserLoginName());
        super.a(com.amazon.device.simplesignin.a.a.a.f38009h, com.amazon.device.simplesignin.a.a.a.f38010i);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("token", linkUserAccountRequest.getLinkToken().getToken());
            jSONObject.put(com.amazon.device.simplesignin.a.a.a.f37994E, linkUserAccountRequest.getLinkToken().getSchema());
            super.a(com.amazon.device.simplesignin.a.a.a.f38008g, jSONObject.toString());
            super.a(com.amazon.device.simplesignin.a.a.a.f38007f, linkUserAccountRequest.getLinkSigningKey());
        } catch (JSONException e10) {
            com.amazon.device.simplesignin.a.d.a.b(f38036f, "Unable to create linkToken json");
            throw new IllegalStateException("Unable to create linkToken json", e10);
        }
    }

    private void a(final Intent intent) {
        this.f38037b.b(d.FOREGROUND, new com.amazon.a.a.n.a() {
            public void a() {
                try {
                    Activity b10 = b.this.f38038c.b();
                    if (b10 == null) {
                        b10 = b.this.f38038c.a();
                    }
                    String p10 = b.f38036f;
                    com.amazon.device.simplesignin.a.d.a.a(p10, "Consent activity is about to start: " + b10);
                    b10.startActivity(intent);
                } catch (Exception e10) {
                    String p11 = b.f38036f;
                    com.amazon.device.simplesignin.a.d.a.a(p11, "Exception when starting consent activity: " + e10);
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public boolean b(j jVar) {
        Map b10 = jVar.b();
        if (!b10.containsKey(com.amazon.device.simplesignin.a.a.a.f38011j) || b10.get(com.amazon.device.simplesignin.a.a.a.f38011j) == null) {
            return super.a(b10);
        }
        a((Intent) b10.get(com.amazon.device.simplesignin.a.a.a.f38011j));
        return true;
    }
}
