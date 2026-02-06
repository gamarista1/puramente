package Db;

import com.google.android.gms.internal.p002firebaseauthapi.zzafz;
import com.google.firebase.auth.C4777b;
import com.google.firebase.auth.C4781d;

public final class t0 implements C4781d {

    /* renamed from: a  reason: collision with root package name */
    private final int f50559a;

    /* renamed from: b  reason: collision with root package name */
    private final String f50560b;

    /* renamed from: c  reason: collision with root package name */
    private final String f50561c;

    /* renamed from: d  reason: collision with root package name */
    private final C4777b f50562d;

    public t0(zzafz zzafz) {
        String str;
        int i10 = 5;
        if (zzafz.zzg()) {
            str = zzafz.zzc();
        } else {
            str = zzafz.zzb();
        }
        this.f50560b = str;
        this.f50561c = zzafz.zzb();
        C4777b bVar = null;
        if (!zzafz.zzh()) {
            this.f50559a = 3;
            this.f50562d = null;
            return;
        }
        String zzd = zzafz.zzd();
        zzd.hashCode();
        char c10 = 65535;
        switch (zzd.hashCode()) {
            case -1874510116:
                if (zzd.equals("REVERT_SECOND_FACTOR_ADDITION")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1452371317:
                if (zzd.equals("PASSWORD_RESET")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1341836234:
                if (zzd.equals("VERIFY_EMAIL")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1099157829:
                if (zzd.equals("VERIFY_AND_CHANGE_EMAIL")) {
                    c10 = 3;
                    break;
                }
                break;
            case 870738373:
                if (zzd.equals("EMAIL_SIGNIN")) {
                    c10 = 4;
                    break;
                }
                break;
            case 970484929:
                if (zzd.equals("RECOVER_EMAIL")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                i10 = 6;
                break;
            case 1:
                i10 = 0;
                break;
            case 2:
                i10 = 1;
                break;
            case 3:
                break;
            case 4:
                i10 = 4;
                break;
            case 5:
                i10 = 2;
                break;
            default:
                i10 = 3;
                break;
        }
        this.f50559a = i10;
        if (i10 == 4 || i10 == 3) {
            this.f50562d = null;
            return;
        }
        if (zzafz.zzf()) {
            bVar = new u0(zzafz.zzb(), K.a(zzafz.zza()));
        } else if (zzafz.zzg()) {
            bVar = new s0(zzafz.zzc(), zzafz.zzb());
        } else if (zzafz.zze()) {
            bVar = new r0(zzafz.zzb());
        }
        this.f50562d = bVar;
    }

    public final String a(int i10) {
        if (this.f50559a == 4) {
            return null;
        }
        if (i10 == 0) {
            return this.f50560b;
        }
        if (i10 != 1) {
            return null;
        }
        return this.f50561c;
    }

    public final int b() {
        return this.f50559a;
    }
}
