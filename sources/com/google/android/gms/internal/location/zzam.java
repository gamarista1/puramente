package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IInterface;
import com.google.android.gms.common.api.internal.C4496h;
import com.google.android.gms.location.C4547d;
import com.google.android.gms.location.C4551h;
import com.google.android.gms.location.C4555l;
import com.google.android.gms.location.C4560q;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.P;

public interface zzam extends IInterface {
    void zzd(C4551h hVar, PendingIntent pendingIntent, zzak zzak);

    void zze(PendingIntent pendingIntent, zzak zzak, String str);

    void zzf(String[] strArr, zzak zzak, String str);

    void zzg(P p10, zzak zzak);

    void zzh(long j10, boolean z10, PendingIntent pendingIntent);

    void zzi(C4547d dVar, PendingIntent pendingIntent, C4496h hVar);

    void zzj(PendingIntent pendingIntent, C4496h hVar);

    void zzk(PendingIntent pendingIntent);

    void zzl(PendingIntent pendingIntent, C4496h hVar);

    @Deprecated
    Location zzm();

    Location zzn(String str);

    void zzo(zzbc zzbc);

    void zzp(boolean z10);

    void zzq(Location location);

    void zzr(zzai zzai);

    LocationAvailability zzs(String str);

    void zzt(C4555l lVar, zzao zzao, String str);

    void zzu(zzl zzl);

    void zzv(PendingIntent pendingIntent, C4560q qVar, C4496h hVar);
}
