package com.google.android.gms.internal.p001authapi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.C4510w;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.Task;
import ra.C5183a;
import ra.n;

/* renamed from: com.google.android.gms.internal.auth-api.zbz  reason: invalid package */
public final class zbz extends e {
    private static final a.g zba;
    private static final a.C0818a zbb;
    private static final a zbc;
    private final String zbd = zbas.zba();

    static {
        a.g gVar = new a.g();
        zba = gVar;
        zbx zbx = new zbx();
        zbb = zbx;
        zbc = new a("Auth.Api.Identity.Authorization.API", zbx, gVar);
    }

    public zbz(Activity activity, n nVar) {
        super(activity, zbc, (a.d) nVar, e.a.f53922c);
    }

    public final Task<C5183a> authorize(AuthorizationRequest authorizationRequest) {
        C4536s.l(authorizationRequest);
        AuthorizationRequest.a x02 = AuthorizationRequest.x0(authorizationRequest);
        x02.i(this.zbd);
        return doRead(C4510w.a().d(zbar.zbc).b(new zbw(this, x02.b())).c(false).e(1534).a());
    }

    public final C5183a getAuthorizationResultFromIntent(Intent intent) {
        if (intent != null) {
            Status status = (Status) za.e.b(intent, "status", Status.CREATOR);
            if (status == null) {
                throw new b(Status.f53911j);
            } else if (status.s0()) {
                C5183a aVar = (C5183a) za.e.b(intent, "authorization_result", C5183a.CREATOR);
                if (aVar != null) {
                    return aVar;
                }
                throw new b(Status.f53909h);
            } else {
                throw new b(status);
            }
        } else {
            throw new b(Status.f53909h);
        }
    }

    public zbz(Context context, n nVar) {
        super(context, zbc, (a.d) nVar, e.a.f53922c);
    }
}
