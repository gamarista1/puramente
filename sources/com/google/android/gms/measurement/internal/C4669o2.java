package com.google.android.gms.measurement.internal;

import Ga.C4292d;
import Ga.C4293e;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzbz;

/* renamed from: com.google.android.gms.measurement.internal.o2  reason: case insensitive filesystem */
public final class C4669o2 {

    /* renamed from: a  reason: collision with root package name */
    final E2 f55248a;

    C4669o2(q5 q5Var) {
        this.f55248a = q5Var.j0();
    }

    /* access modifiers changed from: package-private */
    public final Bundle a(String str, zzbz zzbz) {
        this.f55248a.zzl().i();
        if (zzbz == null) {
            this.f55248a.zzj().G().a("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            Bundle zza = zzbz.zza(bundle);
            if (zza != null) {
                return zza;
            }
            this.f55248a.zzj().B().a("Install Referrer Service returned a null response");
            return null;
        } catch (Exception e10) {
            this.f55248a.zzj().B().b("Exception occurred while retrieving the Install Referrer", e10.getMessage());
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        try {
            C4292d a10 = C4293e.a(this.f55248a.zza());
            if (a10 == null) {
                this.f55248a.zzj().F().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                return false;
            } else if (a10.e("com.android.vending", 128).versionCode >= 80837300) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e10) {
            this.f55248a.zzj().F().b("Failed to retrieve Play Store version for Install Referrer", e10);
            return false;
        }
    }
}
