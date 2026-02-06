package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class zzal extends zzaq implements zzan {
    zzal(IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingService");
    }

    public final int zza(int i10, String str, String str2) {
        Parcel zzu = zzu();
        zzu.writeInt(3);
        zzu.writeString(str);
        zzu.writeString(str2);
        Parcel zzv = zzv(5, zzu);
        int readInt = zzv.readInt();
        zzv.recycle();
        return readInt;
    }

    public final int zzc(int i10, String str, String str2, Bundle bundle) {
        Parcel zzu = zzu();
        zzu.writeInt(i10);
        zzu.writeString(str);
        zzu.writeString(str2);
        zzas.zzc(zzu, bundle);
        Parcel zzv = zzv(10, zzu);
        int readInt = zzv.readInt();
        zzv.recycle();
        return readInt;
    }

    public final Bundle zzd(int i10, String str, String str2, Bundle bundle) {
        Parcel zzu = zzu();
        zzu.writeInt(9);
        zzu.writeString(str);
        zzu.writeString(str2);
        zzas.zzc(zzu, bundle);
        Parcel zzv = zzv(902, zzu);
        Bundle bundle2 = (Bundle) zzas.zza(zzv, Bundle.CREATOR);
        zzv.recycle();
        return bundle2;
    }

    public final Bundle zze(int i10, String str, String str2, Bundle bundle) {
        Parcel zzu = zzu();
        zzu.writeInt(9);
        zzu.writeString(str);
        zzu.writeString(str2);
        zzas.zzc(zzu, bundle);
        Parcel zzv = zzv(12, zzu);
        Bundle bundle2 = (Bundle) zzas.zza(zzv, Bundle.CREATOR);
        zzv.recycle();
        return bundle2;
    }

    public final Bundle zzf(int i10, String str, String str2, String str3, String str4) {
        Parcel zzu = zzu();
        zzu.writeInt(3);
        zzu.writeString(str);
        zzu.writeString(str2);
        zzu.writeString(str3);
        zzu.writeString((String) null);
        Parcel zzv = zzv(3, zzu);
        Bundle bundle = (Bundle) zzas.zza(zzv, Bundle.CREATOR);
        zzv.recycle();
        return bundle;
    }

    public final Bundle zzg(int i10, String str, String str2, String str3, String str4, Bundle bundle) {
        Parcel zzu = zzu();
        zzu.writeInt(i10);
        zzu.writeString(str);
        zzu.writeString(str2);
        zzu.writeString(str3);
        zzu.writeString((String) null);
        zzas.zzc(zzu, bundle);
        Parcel zzv = zzv(8, zzu);
        Bundle bundle2 = (Bundle) zzas.zza(zzv, Bundle.CREATOR);
        zzv.recycle();
        return bundle2;
    }

    public final Bundle zzh(int i10, String str, String str2, String str3, Bundle bundle) {
        Parcel zzu = zzu();
        zzu.writeInt(6);
        zzu.writeString(str);
        zzu.writeString(str2);
        zzu.writeString(str3);
        zzas.zzc(zzu, bundle);
        Parcel zzv = zzv(9, zzu);
        Bundle bundle2 = (Bundle) zzas.zza(zzv, Bundle.CREATOR);
        zzv.recycle();
        return bundle2;
    }

    public final Bundle zzi(int i10, String str, String str2, String str3) {
        Parcel zzu = zzu();
        zzu.writeInt(3);
        zzu.writeString(str);
        zzu.writeString(str2);
        zzu.writeString(str3);
        Parcel zzv = zzv(4, zzu);
        Bundle bundle = (Bundle) zzas.zza(zzv, Bundle.CREATOR);
        zzv.recycle();
        return bundle;
    }

    public final Bundle zzj(int i10, String str, String str2, String str3, Bundle bundle) {
        Parcel zzu = zzu();
        zzu.writeInt(i10);
        zzu.writeString(str);
        zzu.writeString(str2);
        zzu.writeString(str3);
        zzas.zzc(zzu, bundle);
        Parcel zzv = zzv(11, zzu);
        Bundle bundle2 = (Bundle) zzas.zza(zzv, Bundle.CREATOR);
        zzv.recycle();
        return bundle2;
    }

    public final Bundle zzk(int i10, String str, String str2, Bundle bundle) {
        Parcel zzu = zzu();
        zzu.writeInt(3);
        zzu.writeString(str);
        zzu.writeString(str2);
        zzas.zzc(zzu, bundle);
        Parcel zzv = zzv(2, zzu);
        Bundle bundle2 = (Bundle) zzas.zza(zzv, Bundle.CREATOR);
        zzv.recycle();
        return bundle2;
    }

    public final Bundle zzl(int i10, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel zzu = zzu();
        zzu.writeInt(i10);
        zzu.writeString(str);
        zzu.writeString(str2);
        zzas.zzc(zzu, bundle);
        zzas.zzc(zzu, bundle2);
        Parcel zzv = zzv(901, zzu);
        Bundle bundle3 = (Bundle) zzas.zza(zzv, Bundle.CREATOR);
        zzv.recycle();
        return bundle3;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.google.android.gms.internal.play_billing.zzy, android.os.IBinder] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzm(int r2, java.lang.String r3, android.os.Bundle r4, com.google.android.gms.internal.play_billing.zzy r5) {
        /*
            r1 = this;
            android.os.Parcel r2 = r1.zzu()
            r0 = 21
            r2.writeInt(r0)
            r2.writeString(r3)
            com.google.android.gms.internal.play_billing.zzas.zzc(r2, r4)
            r2.writeStrongBinder(r5)
            r3 = 1501(0x5dd, float:2.103E-42)
            r1.zzx(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzal.zzm(int, java.lang.String, android.os.Bundle, com.google.android.gms.internal.play_billing.zzy):void");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.google.android.gms.internal.play_billing.zzaa, android.os.IBinder] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzn(int r2, java.lang.String r3, android.os.Bundle r4, com.google.android.gms.internal.play_billing.zzaa r5) {
        /*
            r1 = this;
            android.os.Parcel r2 = r1.zzu()
            r0 = 22
            r2.writeInt(r0)
            r2.writeString(r3)
            com.google.android.gms.internal.play_billing.zzas.zzc(r2, r4)
            r2.writeStrongBinder(r5)
            r3 = 1801(0x709, float:2.524E-42)
            r1.zzx(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzal.zzn(int, java.lang.String, android.os.Bundle, com.google.android.gms.internal.play_billing.zzaa):void");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.google.android.gms.internal.play_billing.zzac, android.os.IBinder] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzo(int r2, java.lang.String r3, android.os.Bundle r4, com.google.android.gms.internal.play_billing.zzac r5) {
        /*
            r1 = this;
            android.os.Parcel r2 = r1.zzu()
            r0 = 21
            r2.writeInt(r0)
            r2.writeString(r3)
            com.google.android.gms.internal.play_billing.zzas.zzc(r2, r4)
            r2.writeStrongBinder(r5)
            r3 = 1601(0x641, float:2.243E-42)
            r1.zzx(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzal.zzo(int, java.lang.String, android.os.Bundle, com.google.android.gms.internal.play_billing.zzac):void");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.google.android.gms.internal.play_billing.zzae, android.os.IBinder] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzp(int r2, java.lang.String r3, android.os.Bundle r4, com.google.android.gms.internal.play_billing.zzae r5) {
        /*
            r1 = this;
            android.os.Parcel r2 = r1.zzu()
            r0 = 18
            r2.writeInt(r0)
            r2.writeString(r3)
            com.google.android.gms.internal.play_billing.zzas.zzc(r2, r4)
            r2.writeStrongBinder(r5)
            r3 = 1301(0x515, float:1.823E-42)
            r1.zzw(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzal.zzp(int, java.lang.String, android.os.Bundle, com.google.android.gms.internal.play_billing.zzae):void");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.google.android.gms.internal.play_billing.zzag, android.os.IBinder] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzq(int r2, java.lang.String r3, android.os.Bundle r4, com.google.android.gms.internal.play_billing.zzag r5) {
        /*
            r1 = this;
            android.os.Parcel r2 = r1.zzu()
            r0 = 22
            r2.writeInt(r0)
            r2.writeString(r3)
            com.google.android.gms.internal.play_billing.zzas.zzc(r2, r4)
            r2.writeStrongBinder(r5)
            r3 = 1901(0x76d, float:2.664E-42)
            r1.zzx(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzal.zzq(int, java.lang.String, android.os.Bundle, com.google.android.gms.internal.play_billing.zzag):void");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.google.android.gms.internal.play_billing.zzai, android.os.IBinder] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzr(int r2, java.lang.String r3, android.os.Bundle r4, com.google.android.gms.internal.play_billing.zzai r5) {
        /*
            r1 = this;
            android.os.Parcel r2 = r1.zzu()
            r0 = 21
            r2.writeInt(r0)
            r2.writeString(r3)
            com.google.android.gms.internal.play_billing.zzas.zzc(r2, r4)
            r2.writeStrongBinder(r5)
            r3 = 1401(0x579, float:1.963E-42)
            r1.zzx(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzal.zzr(int, java.lang.String, android.os.Bundle, com.google.android.gms.internal.play_billing.zzai):void");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.google.android.gms.internal.play_billing.zzak, android.os.IBinder] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzs(int r2, java.lang.String r3, android.os.Bundle r4, com.google.android.gms.internal.play_billing.zzak r5) {
        /*
            r1 = this;
            android.os.Parcel r2 = r1.zzu()
            r0 = 22
            r2.writeInt(r0)
            r2.writeString(r3)
            com.google.android.gms.internal.play_billing.zzas.zzc(r2, r4)
            r2.writeStrongBinder(r5)
            r3 = 1701(0x6a5, float:2.384E-42)
            r1.zzx(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzal.zzs(int, java.lang.String, android.os.Bundle, com.google.android.gms.internal.play_billing.zzak):void");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.google.android.gms.internal.play_billing.zzap, android.os.IBinder] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzt(int r2, java.lang.String r3, android.os.Bundle r4, com.google.android.gms.internal.play_billing.zzap r5) {
        /*
            r1 = this;
            android.os.Parcel r2 = r1.zzu()
            r0 = 12
            r2.writeInt(r0)
            r2.writeString(r3)
            com.google.android.gms.internal.play_billing.zzas.zzc(r2, r4)
            r2.writeStrongBinder(r5)
            r3 = 1201(0x4b1, float:1.683E-42)
            r1.zzw(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzal.zzt(int, java.lang.String, android.os.Bundle, com.google.android.gms.internal.play_billing.zzap):void");
    }

    public final int zzy(int i10, String str, String str2) {
        Parcel zzu = zzu();
        zzu.writeInt(i10);
        zzu.writeString(str);
        zzu.writeString(str2);
        Parcel zzv = zzv(1, zzu);
        int readInt = zzv.readInt();
        zzv.recycle();
        return readInt;
    }
}
