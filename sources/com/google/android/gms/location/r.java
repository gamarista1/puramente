package com.google.android.gms.location;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.C4522e;
import com.google.android.gms.internal.location.zzaz;

final class r extends a.C0818a {
    r() {
    }

    public final /* bridge */ /* synthetic */ a.f buildClient(Context context, Looper looper, C4522e eVar, Object obj, f.b bVar, f.c cVar) {
        a.d.C0819a aVar = (a.d.C0819a) obj;
        return new zzaz(context, looper, bVar, cVar, "activity_recognition", C4522e.a(context));
    }
}
