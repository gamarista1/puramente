package com.google.android.gms.internal.p002firebaseauthapi;

import Db.C4267o;
import Db.C4272u;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4536s;
import com.google.firebase.auth.C4789h;
import com.google.firebase.auth.O;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadb  reason: invalid package */
final class zzadb implements zzacg {
    final /* synthetic */ zzacz zza;

    zzadb(zzacz zzacz) {
        this.zza = zzacz;
    }

    private final void zza(zzadh zzadh) {
        this.zza.zzi.execute(new zzade(this, zzadh));
    }

    public final void zzb(String str) {
        int i10 = this.zza.zza;
        boolean z10 = i10 == 8;
        C4536s.p(z10, "Unexpected response type " + i10);
        this.zza.zzo = str;
        zza((zzadh) new zzada(this, str));
    }

    public final void zzc(String str) {
        int i10 = this.zza.zza;
        boolean z10 = i10 == 7;
        C4536s.p(z10, "Unexpected response type " + i10);
        zzacz zzacz = this.zza;
        zzacz.zzn = str;
        zzacz.zza(zzacz);
    }

    private final void zza(Status status, C4789h hVar, String str, String str2) {
        zzacz.zza(this.zza, status);
        zzacz zzacz = this.zza;
        zzacz.zzp = hVar;
        zzacz.zzq = str;
        zzacz.zzr = str2;
        C4272u uVar = zzacz.zzf;
        if (uVar != null) {
            uVar.zza(status);
        }
        this.zza.zza(status);
    }

    public final void zzb() {
        int i10 = this.zza.zza;
        boolean z10 = i10 == 6;
        C4536s.p(z10, "Unexpected response type " + i10);
        zzacz.zza(this.zza);
    }

    public final void zzc() {
        int i10 = this.zza.zza;
        boolean z10 = i10 == 9;
        C4536s.p(z10, "Unexpected response type " + i10);
        zzacz.zza(this.zza);
    }

    public final void zza(String str) {
        int i10 = this.zza.zza;
        boolean z10 = i10 == 8;
        C4536s.p(z10, "Unexpected response type " + i10);
        zzacz zzacz = this.zza;
        zzacz.zzo = str;
        zzacz.zzz = true;
        this.zza.zzx = true;
        zza((zzadh) new zzadc(this, str));
    }

    public final void zza(zzaem zzaem) {
        int i10 = this.zza.zza;
        boolean z10 = i10 == 3;
        C4536s.p(z10, "Unexpected response type " + i10);
        zzacz zzacz = this.zza;
        zzacz.zzl = zzaem;
        zzacz.zza(zzacz);
    }

    public final void zza() {
        int i10 = this.zza.zza;
        boolean z10 = i10 == 5;
        C4536s.p(z10, "Unexpected response type " + i10);
        zzacz.zza(this.zza);
    }

    public final void zza(zzyj zzyj) {
        zza(zzyj.zza(), zzyj.zzb(), zzyj.zzc(), zzyj.zzd());
    }

    public final void zza(zzym zzym) {
        zzacz zzacz = this.zza;
        zzacz.zzs = zzym;
        zzacz.zza(C4267o.a("REQUIRES_SECOND_FACTOR_AUTH"));
    }

    public final void zza(Status status, O o10) {
        int i10 = this.zza.zza;
        boolean z10 = i10 == 2;
        C4536s.p(z10, "Unexpected response type " + i10);
        zza(status, o10, (String) null, (String) null);
    }

    public final void zza(Status status) {
        String q02 = status.q0();
        if (q02 != null) {
            if (q02.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17081);
            } else if (q02.contains("MISSING_MFA_ENROLLMENT_ID")) {
                status = new Status(17082);
            } else if (q02.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17083);
            } else if (q02.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                status = new Status(17084);
            } else if (q02.contains("ADMIN_ONLY_OPERATION")) {
                status = new Status(17085);
            } else if (q02.contains("UNVERIFIED_EMAIL")) {
                status = new Status(17086);
            } else if (q02.contains("SECOND_FACTOR_EXISTS")) {
                status = new Status(17087);
            } else if (q02.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                status = new Status(17088);
            } else if (q02.contains("UNSUPPORTED_FIRST_FACTOR")) {
                status = new Status(17089);
            } else if (q02.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                status = new Status(17090);
            }
        }
        zzacz zzacz = this.zza;
        if (zzacz.zza == 8) {
            zzacz.zzz = true;
            this.zza.zzx = false;
            zza((zzadh) new zzadf(this, status));
            return;
        }
        zzacz.zza(zzacz, status);
        this.zza.zza(status);
    }

    public final void zza(zzafi zzafi) {
        zzacz zzacz = this.zza;
        zzacz.zzu = zzafi;
        zzacz.zza(zzacz);
    }

    public final void zza(zzafn zzafn) {
        zzacz zzacz = this.zza;
        zzacz.zzt = zzafn;
        zzacz.zza(zzacz);
    }

    public final void zza(zzafm zzafm, zzaff zzaff) {
        int i10 = this.zza.zza;
        boolean z10 = i10 == 2;
        C4536s.p(z10, "Unexpected response type: " + i10);
        zzacz zzacz = this.zza;
        zzacz.zzj = zzafm;
        zzacz.zzk = zzaff;
        zzacz.zza(zzacz);
    }

    public final void zza(zzafz zzafz) {
        int i10 = this.zza.zza;
        boolean z10 = i10 == 4;
        C4536s.p(z10, "Unexpected response type " + i10);
        zzacz zzacz = this.zza;
        zzacz.zzm = zzafz;
        zzacz.zza(zzacz);
    }

    public final void zza(zzaga zzaga) {
        zzacz zzacz = this.zza;
        zzacz.zzw = zzaga;
        zzacz.zza(zzacz);
    }

    public final void zza(zzagi zzagi) {
        zzacz zzacz = this.zza;
        zzacz.zzv = zzagi;
        zzacz.zza(zzacz);
    }

    public final void zza(zzafm zzafm) {
        int i10 = this.zza.zza;
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        C4536s.p(z10, "Unexpected response type: " + i10);
        zzacz zzacz = this.zza;
        zzacz.zzj = zzafm;
        zzacz.zza(zzacz);
    }

    public final void zza(O o10) {
        int i10 = this.zza.zza;
        boolean z10 = i10 == 8;
        C4536s.p(z10, "Unexpected response type " + i10);
        this.zza.zzz = true;
        this.zza.zzx = true;
        zza((zzadh) new zzadd(this, o10));
    }
}
