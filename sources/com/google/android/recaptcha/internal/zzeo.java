package com.google.android.recaptcha.internal;

import android.content.Context;
import io.intercom.android.sdk.models.AttributeType;
import java.util.Map;
import lf.C6502A;
import mf.O;

public final class zzeo implements zzen {
    private final Context zzb;
    private final Map zzc = O.l(C6502A.a(2, "activity"), C6502A.a(3, AttributeType.PHONE), C6502A.a(4, "input_method"), C6502A.a(5, "audio"));

    public zzeo(Context context) {
        this.zzb = context;
    }

    public final /* synthetic */ Object cs(Object[] objArr) {
        return zzel.zza(this, objArr);
    }

    public final Object zza(Object... objArr) {
        Integer num = objArr[0];
        if (true != (num instanceof Integer)) {
            num = null;
        }
        Integer num2 = num;
        if (num2 != null) {
            Object obj = this.zzc.get(Integer.valueOf(num2.intValue()));
            if (obj != null) {
                return this.zzb.getSystemService((String) obj);
            }
            throw new zzae(4, 4, (Throwable) null);
        }
        throw new zzae(4, 5, (Throwable) null);
    }
}
