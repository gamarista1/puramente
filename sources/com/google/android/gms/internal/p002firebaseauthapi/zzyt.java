package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.firebase.auth.C0;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyt  reason: invalid package */
final class zzyt implements zzadm<zzafc> {
    private final /* synthetic */ zzadn zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ Boolean zzd;
    private final /* synthetic */ C0 zze;
    private final /* synthetic */ zzacf zzf;
    private final /* synthetic */ zzafm zzg;

    zzyt(zzyl zzyl, zzadn zzadn, String str, String str2, Boolean bool, C0 c02, zzacf zzacf, zzafm zzafm) {
        this.zza = zzadn;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bool;
        this.zze = c02;
        this.zzf = zzacf;
        this.zzg = zzafm;
    }

    public final void zza(String str) {
        this.zza.zza(str);
    }

    public final /* synthetic */ void zza(Object obj) {
        List<zzaff> zza2 = ((zzafc) obj).zza();
        if (zza2 == null || zza2.isEmpty()) {
            this.zza.zza("No users.");
            return;
        }
        boolean z10 = false;
        zzaff zzaff = zza2.get(0);
        zzafu zzf2 = zzaff.zzf();
        List<zzafv> zza3 = zzf2 != null ? zzf2.zza() : null;
        if (zza3 != null && !zza3.isEmpty()) {
            if (!TextUtils.isEmpty(this.zzb)) {
                int i10 = 0;
                while (true) {
                    if (i10 >= zza3.size()) {
                        break;
                    } else if (zza3.get(i10).zzf().equals(this.zzb)) {
                        zza3.get(i10).zza(this.zzc);
                        break;
                    } else {
                        i10++;
                    }
                }
            } else {
                zza3.get(0).zza(this.zzc);
            }
        }
        Boolean bool = this.zzd;
        if (bool != null) {
            zzaff.zza(bool.booleanValue());
        } else {
            if (zzaff.zzb() - zzaff.zza() < 1000) {
                z10 = true;
            }
            zzaff.zza(z10);
        }
        zzaff.zza(this.zze);
        this.zzf.zza(this.zzg, zzaff);
    }
}
