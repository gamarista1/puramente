package com.amazon.device.simplesignin.a.a.d;

import android.app.Activity;
import android.content.Intent;
import com.amazon.a.a.k.a;
import com.amazon.d.a.j;
import com.amazon.device.simplesignin.a.a.c;
import com.amazon.device.simplesignin.a.a.d;
import com.amazon.device.simplesignin.model.RequestStatus;
import com.amazon.device.simplesignin.model.response.ShowLoginSelectionResponse;
import java.util.HashMap;
import java.util.Map;

public class b extends c {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final String f38051d = a.class.getSimpleName();

    /* renamed from: e  reason: collision with root package name */
    private static final String f38052e = "SSI_ShowLoginSelection";

    /* renamed from: f  reason: collision with root package name */
    private static final String f38053f = "1.0";
    @a

    /* renamed from: b  reason: collision with root package name */
    protected com.amazon.a.a.n.b f38054b;
    @a

    /* renamed from: c  reason: collision with root package name */
    protected com.amazon.a.a.a.a f38055c;

    /* renamed from: g  reason: collision with root package name */
    private final Map<String, String> f38056g;

    b(a aVar, Map<String, String> map) {
        super(aVar, f38052e, "1.0");
        this.f38056g = map;
    }

    /* access modifiers changed from: protected */
    public void a(RequestStatus requestStatus) {
        ShowLoginSelectionResponse showLoginSelectionResponse = new ShowLoginSelectionResponse();
        showLoginSelectionResponse.setRequestId(((d) j()).e());
        if (RequestStatus.INVALID_LINK_SIGNING_KEY_ENCRYPTION.equals(requestStatus) || RequestStatus.INVALID_LINK_SIGNING_KEY.equals(requestStatus)) {
            showLoginSelectionResponse.setRequestStatus(RequestStatus.FAILURE);
            return;
        }
        showLoginSelectionResponse.setRequestStatus(requestStatus);
        super.a((Object) showLoginSelectionResponse);
    }

    /* access modifiers changed from: protected */
    public boolean b(j jVar) {
        Map b10 = jVar.b();
        if (!b10.containsKey(com.amazon.device.simplesignin.a.a.a.f38017p)) {
            a(RequestStatus.FAILURE);
            return false;
        }
        Intent intent = (Intent) b10.get(com.amazon.device.simplesignin.a.a.a.f38017p);
        if (intent == null) {
            a(RequestStatus.FAILURE);
            return false;
        }
        intent.putExtra(com.amazon.device.simplesignin.a.a.a.f38016o, new HashMap(this.f38056g));
        a(intent);
        return true;
    }

    private void a(final Intent intent) {
        this.f38054b.b(com.amazon.a.a.n.b.d.FOREGROUND, new com.amazon.a.a.n.a() {
            public void a() {
                try {
                    Activity b10 = b.this.f38055c.b();
                    if (b10 == null) {
                        b10 = b.this.f38055c.a();
                    }
                    com.amazon.device.simplesignin.a.d.a.a(b.f38051d, "ShowLoginSelection activity initiated through startActivity");
                    b10.startActivity(intent);
                } catch (Exception e10) {
                    String p10 = b.f38051d;
                    com.amazon.device.simplesignin.a.d.a.a(p10, "Exception when starting show login selection activity: " + e10);
                }
            }
        });
    }
}
