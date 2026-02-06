package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.C4496h;
import com.google.android.gms.location.C4547d;
import com.google.android.gms.location.C4551h;
import com.google.android.gms.location.C4555l;
import com.google.android.gms.location.C4560q;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.P;

public final class zzal extends zza implements zzam {
    zzal(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    public final void zzd(C4551h hVar, PendingIntent pendingIntent, zzak zzak) {
        Parcel zza = zza();
        zzc.zzc(zza, hVar);
        zzc.zzc(zza, pendingIntent);
        zzc.zzd(zza, zzak);
        zzx(57, zza);
    }

    public final void zze(PendingIntent pendingIntent, zzak zzak, String str) {
        Parcel zza = zza();
        zzc.zzc(zza, pendingIntent);
        zzc.zzd(zza, zzak);
        zza.writeString(str);
        zzx(2, zza);
    }

    public final void zzf(String[] strArr, zzak zzak, String str) {
        Parcel zza = zza();
        zza.writeStringArray(strArr);
        zzc.zzd(zza, zzak);
        zza.writeString(str);
        zzx(3, zza);
    }

    public final void zzg(P p10, zzak zzak) {
        Parcel zza = zza();
        zzc.zzc(zza, p10);
        zzc.zzd(zza, zzak);
        zzx(74, zza);
    }

    public final void zzh(long j10, boolean z10, PendingIntent pendingIntent) {
        Parcel zza = zza();
        zza.writeLong(j10);
        zzc.zza(zza, true);
        zzc.zzc(zza, pendingIntent);
        zzx(5, zza);
    }

    public final void zzi(C4547d dVar, PendingIntent pendingIntent, C4496h hVar) {
        Parcel zza = zza();
        zzc.zzc(zza, dVar);
        zzc.zzc(zza, pendingIntent);
        zzc.zzd(zza, hVar);
        zzx(72, zza);
    }

    public final void zzj(PendingIntent pendingIntent, C4496h hVar) {
        Parcel zza = zza();
        zzc.zzc(zza, pendingIntent);
        zzc.zzd(zza, hVar);
        zzx(73, zza);
    }

    public final void zzk(PendingIntent pendingIntent) {
        Parcel zza = zza();
        zzc.zzc(zza, pendingIntent);
        zzx(6, zza);
    }

    public final void zzl(PendingIntent pendingIntent, C4496h hVar) {
        Parcel zza = zza();
        zzc.zzc(zza, pendingIntent);
        zzc.zzd(zza, hVar);
        zzx(69, zza);
    }

    public final Location zzm() {
        Parcel zzw = zzw(7, zza());
        Location location = (Location) zzc.zzb(zzw, Location.CREATOR);
        zzw.recycle();
        return location;
    }

    public final Location zzn(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzw = zzw(80, zza);
        Location location = (Location) zzc.zzb(zzw, Location.CREATOR);
        zzw.recycle();
        return location;
    }

    public final void zzo(zzbc zzbc) {
        Parcel zza = zza();
        zzc.zzc(zza, zzbc);
        zzx(59, zza);
    }

    public final void zzp(boolean z10) {
        Parcel zza = zza();
        zzc.zza(zza, z10);
        zzx(12, zza);
    }

    public final void zzq(Location location) {
        Parcel zza = zza();
        zzc.zzc(zza, location);
        zzx(13, zza);
    }

    public final void zzr(zzai zzai) {
        Parcel zza = zza();
        zzc.zzd(zza, zzai);
        zzx(67, zza);
    }

    public final LocationAvailability zzs(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzw = zzw(34, zza);
        LocationAvailability locationAvailability = (LocationAvailability) zzc.zzb(zzw, LocationAvailability.CREATOR);
        zzw.recycle();
        return locationAvailability;
    }

    public final void zzt(C4555l lVar, zzao zzao, String str) {
        Parcel zza = zza();
        zzc.zzc(zza, lVar);
        zzc.zzd(zza, zzao);
        zza.writeString((String) null);
        zzx(63, zza);
    }

    public final void zzu(zzl zzl) {
        Parcel zza = zza();
        zzc.zzc(zza, zzl);
        zzx(75, zza);
    }

    public final void zzv(PendingIntent pendingIntent, C4560q qVar, C4496h hVar) {
        Parcel zza = zza();
        zzc.zzc(zza, pendingIntent);
        zzc.zzc(zza, qVar);
        zzc.zzd(zza, hVar);
        zzx(79, zza);
    }
}
