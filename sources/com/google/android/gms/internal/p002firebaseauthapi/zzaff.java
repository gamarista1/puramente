package com.google.android.gms.internal.p002firebaseauthapi;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4536s;
import com.google.firebase.auth.C0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaff  reason: invalid package */
public final class zzaff {
    private String zza;
    private String zzb;
    private boolean zzc;
    private String zzd;
    private String zze;
    private zzafu zzf;
    private String zzg;
    private String zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private C0 zzl;
    private List<zzafq> zzm;
    private zzaq<zzaft> zzn;

    public zzaff() {
        this.zzf = new zzafu();
        this.zzn = zzaq.zzh();
    }

    public final long zza() {
        return this.zzi;
    }

    public final long zzb() {
        return this.zzj;
    }

    public final Uri zzc() {
        if (!TextUtils.isEmpty(this.zze)) {
            return Uri.parse(this.zze);
        }
        return null;
    }

    public final zzaq<zzaft> zzd() {
        return this.zzn;
    }

    public final C0 zze() {
        return this.zzl;
    }

    public final zzafu zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zzd;
    }

    public final String zzh() {
        return this.zzb;
    }

    public final String zzi() {
        return this.zza;
    }

    public final String zzj() {
        return this.zzh;
    }

    public final List<zzafq> zzk() {
        return this.zzm;
    }

    public final List<zzafv> zzl() {
        return this.zzf.zza();
    }

    public final boolean zzm() {
        return this.zzc;
    }

    public final boolean zzn() {
        return this.zzk;
    }

    public final zzaff zza(C0 c02) {
        this.zzl = c02;
        return this;
    }

    public final zzaff zzb(String str) {
        this.zzb = str;
        return this;
    }

    public final zzaff zzd(String str) {
        this.zze = str;
        return this;
    }

    public final zzaff zza(String str) {
        this.zzd = str;
        return this;
    }

    public final zzaff zzc(String str) {
        C4536s.f(str);
        this.zzg = str;
        return this;
    }

    public zzaff(String str, String str2, boolean z10, String str3, String str4, zzafu zzafu, String str5, String str6, long j10, long j11, boolean z11, C0 c02, List<zzafq> list, zzaq<zzaft> zzaq) {
        zzafu zzafu2;
        this.zza = str;
        this.zzb = str2;
        this.zzc = z10;
        this.zzd = str3;
        this.zze = str4;
        if (zzafu == null) {
            zzafu2 = new zzafu();
        } else {
            List<zzafv> zza2 = zzafu.zza();
            zzafu zzafu3 = new zzafu();
            if (zza2 != null) {
                zzafu3.zza().addAll(zza2);
            }
            zzafu2 = zzafu3;
        }
        this.zzf = zzafu2;
        this.zzg = str5;
        this.zzh = str6;
        this.zzi = j10;
        this.zzj = j11;
        this.zzk = false;
        this.zzl = null;
        this.zzm = list == null ? new ArrayList<>() : list;
        this.zzn = zzaq;
    }

    public final zzaff zza(boolean z10) {
        this.zzk = z10;
        return this;
    }

    public final zzaff zza(zzaq<zzaft> zzaq) {
        C4536s.l(zzaq);
        this.zzn = zzaq;
        return this;
    }

    public final zzaff zza(List<zzafv> list) {
        C4536s.l(list);
        zzafu zzafu = new zzafu();
        this.zzf = zzafu;
        zzafu.zza().addAll(list);
        return this;
    }
}
