package com.google.android.recaptcha.internal;

import java.util.List;
import java.util.concurrent.TimeUnit;
import lf.C6506E;
import mf.C6565s;

public final class zzeg implements zzee {
    private final zzef zza;
    private final zzed zzb;

    public zzeg(zzef zzef, zzed zzed) {
        this.zza = zzef;
        this.zzb = zzed;
    }

    private final zzpf zzb(String str, List list) {
        if (str.length() != 0) {
            try {
                zzec zzec = new zzec(this.zza.zza(C6565s.f1(list)), 255, zzec.zzb);
                StringBuilder sb2 = new StringBuilder(str.length());
                for (int i10 = 0; i10 < str.length(); i10++) {
                    sb2.append((char) C6506E.b(C6506E.b(str.charAt(i10)) ^ C6506E.b((int) zzec.zza())));
                }
                return zzpf.zzg(zzfy.zzh().zzj(sb2.toString()));
            } catch (Exception e10) {
                throw new zzae(3, 18, e10);
            }
        } else {
            throw new zzae(3, 17, (Throwable) null);
        }
    }

    public final zzpf zza(zzpn zzpn) {
        zzfh zzb2 = zzfh.zzb();
        zzpf zzb3 = zzb(zzpn.zzi(), zzpn.zzj());
        zzb2.zzf();
        long zza2 = zzb2.zza(TimeUnit.MICROSECONDS);
        zzv zzv = zzv.zza;
        zzv.zza(zzx.zzm.zza(), zza2);
        return zzb3;
    }
}
