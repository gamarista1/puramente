package com.google.android.gms.auth.account;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.C4522e;
import com.google.android.gms.internal.auth.zzam;

final class h extends a.C0818a {
    h() {
    }

    public final /* synthetic */ a.f buildClient(Context context, Looper looper, C4522e eVar, Object obj, f.b bVar, f.c cVar) {
        a.d.C0819a aVar = (a.d.C0819a) obj;
        return new zzam(context, looper, eVar, bVar, cVar);
    }
}
