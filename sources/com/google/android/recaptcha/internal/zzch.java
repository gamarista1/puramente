package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6559l;
import mf.C6565s;

public final class zzch extends zzce {
    private final zzcg zza;
    private final String zzb;

    public zzch(zzcg zzcg, String str, Object obj) {
        super(obj);
        this.zza = zzcg;
        this.zzb = str;
    }

    public final boolean zza(Object obj, Method method, Object[] objArr) {
        List list;
        if (!C6496s.c(method.getName(), this.zzb)) {
            return false;
        }
        zzcg zzcg = this.zza;
        if (objArr == null || (list = C6559l.e(objArr)) == null) {
            list = C6565s.n();
        }
        zzcg.zzb(list);
        return true;
    }
}
