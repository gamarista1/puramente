package com.google.android.recaptcha.internal;

import Sg.C5541d;
import com.amazon.a.a.o.b.f;
import java.util.Collection;
import java.util.Objects;
import mf.C6559l;
import mf.C6565s;
import yf.C6798l;

public final class zzcv implements zzdd {
    public static final zzcv zza = new zzcv();

    private zzcv() {
    }

    public final void zza(int i10, zzcj zzcj, zzpq... zzpqArr) {
        String str;
        String str2;
        zzpq[] zzpqArr2 = zzpqArr;
        if (zzpqArr2.length == 1) {
            Object zza2 = zzcj.zzc().zza(zzpqArr2[0]);
            if (true != Objects.nonNull(zza2)) {
                zza2 = null;
            }
            if (zza2 != null) {
                if (zza2 instanceof int[]) {
                    str = C6559l.K0((int[]) zza2, f.f37529a, "[", "]", 0, (CharSequence) null, (C6798l) null, 56, (Object) null);
                } else {
                    if (zza2 instanceof byte[]) {
                        str2 = new String((byte[]) zza2, C5541d.f65029b);
                    } else if (zza2 instanceof long[]) {
                        str = C6559l.L0((long[]) zza2, f.f37529a, "[", "]", 0, (CharSequence) null, (C6798l) null, 56, (Object) null);
                    } else if (zza2 instanceof short[]) {
                        str = C6559l.N0((short[]) zza2, f.f37529a, "[", "]", 0, (CharSequence) null, (C6798l) null, 56, (Object) null);
                    } else if (zza2 instanceof float[]) {
                        str = C6559l.J0((float[]) zza2, f.f37529a, "[", "]", 0, (CharSequence) null, (C6798l) null, 56, (Object) null);
                    } else if (zza2 instanceof double[]) {
                        str = C6559l.I0((double[]) zza2, f.f37529a, "[", "]", 0, (CharSequence) null, (C6798l) null, 56, (Object) null);
                    } else if (zza2 instanceof char[]) {
                        str2 = new String((char[]) zza2);
                    } else if (zza2 instanceof Object[]) {
                        str = C6559l.M0((Object[]) zza2, f.f37529a, "[", "]", 0, (CharSequence) null, (C6798l) null, 56, (Object) null);
                    } else if (zza2 instanceof Collection) {
                        str = C6565s.x0((Iterable) zza2, f.f37529a, "[", "]", 0, (CharSequence) null, (C6798l) null, 56, (Object) null);
                    } else {
                        throw new zzae(4, 5, (Throwable) null);
                    }
                    str = str2;
                }
                int i11 = i10;
                zzcj.zzc().zzf(i10, str);
                return;
            }
            throw new zzae(4, 5, (Throwable) null);
        }
        throw new zzae(4, 3, (Throwable) null);
    }
}
