package com.google.android.gms.internal.auth;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.C4510w;
import com.google.android.gms.tasks.Task;
import pa.C5125b;
import pa.C5126c;
import ta.C5204b;
import ta.C5205c;

public final class zzbo extends e {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzbo(Activity activity, C5126c cVar) {
        super(activity, C5125b.f61224a, (a.d) cVar == null ? C5126c.f61228b : cVar, e.a.f53922c);
    }

    public final Task<String> getSpatulaHeader() {
        return doRead(C4510w.a().b(new zzbk(this)).e(1520).a());
    }

    public final Task<C5205c> performProxyRequest(C5204b bVar) {
        return doWrite(C4510w.a().b(new zzbl(this, bVar)).e(1518).a());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzbo(Context context, C5126c cVar) {
        super(context, C5125b.f61224a, (a.d) cVar == null ? C5126c.f61228b : cVar, e.a.f53922c);
    }
}
