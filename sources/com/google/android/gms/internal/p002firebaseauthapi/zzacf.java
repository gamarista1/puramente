package com.google.android.gms.internal.p002firebaseauthapi;

import Ba.C4246a;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4536s;
import com.google.firebase.auth.O;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacf  reason: invalid package */
public class zzacf {
    private final zzacg zza;
    private final C4246a zzb;

    public zzacf(zzacf zzacf) {
        this(zzacf.zza, zzacf.zzb);
    }

    public final void zza(String str) {
        try {
            this.zza.zza(str);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending auto retrieval timeout response.", e10, new Object[0]);
        }
    }

    public void zzb(String str) {
        try {
            this.zza.zzb(str);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending send verification code response.", e10, new Object[0]);
        }
    }

    public final void zzc(String str) {
        try {
            this.zza.zzc(str);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending set account info response.", e10, new Object[0]);
        }
    }

    public final void zza(zzaem zzaem) {
        try {
            this.zza.zza(zzaem);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending create auth uri response.", e10, new Object[0]);
        }
    }

    public final void zzb() {
        try {
            this.zza.zzb();
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending email verification response.", e10, new Object[0]);
        }
    }

    public final void zzc() {
        try {
            this.zza.zzc();
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when setting FirebaseUI Version", e10, new Object[0]);
        }
    }

    public zzacf(zzacg zzacg, C4246a aVar) {
        this.zza = (zzacg) C4536s.l(zzacg);
        this.zzb = (C4246a) C4536s.l(aVar);
    }

    public final void zza() {
        try {
            this.zza.zza();
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending delete account response.", e10, new Object[0]);
        }
    }

    public final void zza(zzyj zzyj) {
        try {
            this.zza.zza(zzyj);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending failure result with credential", e10, new Object[0]);
        }
    }

    public final void zza(zzym zzym) {
        try {
            this.zza.zza(zzym);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending failure result for mfa", e10, new Object[0]);
        }
    }

    public final void zza(Status status, O o10) {
        try {
            this.zza.zza(status, o10);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending failure result.", e10, new Object[0]);
        }
    }

    public void zza(Status status) {
        try {
            this.zza.zza(status);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending failure result.", e10, new Object[0]);
        }
    }

    public final void zza(zzafi zzafi) {
        try {
            this.zza.zza(zzafi);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending Play Integrity Producer project response.", e10, new Object[0]);
        }
    }

    public final void zza(zzafn zzafn) {
        try {
            this.zza.zza(zzafn);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending get recaptcha config response.", e10, new Object[0]);
        }
    }

    public final void zza(zzafm zzafm, zzaff zzaff) {
        try {
            this.zza.zza(zzafm, zzaff);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending get token and account info user response", e10, new Object[0]);
        }
    }

    public final void zza(zzafz zzafz) {
        try {
            this.zza.zza(zzafz);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending password reset response.", e10, new Object[0]);
        }
    }

    public final void zza(zzaga zzaga) {
        try {
            this.zza.zza(zzaga);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending revoke token response.", e10, new Object[0]);
        }
    }

    public final void zza(zzagi zzagi) {
        try {
            this.zza.zza(zzagi);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending start mfa enrollment response.", e10, new Object[0]);
        }
    }

    public final void zza(zzafm zzafm) {
        try {
            this.zza.zza(zzafm);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending token result.", e10, new Object[0]);
        }
    }

    public final void zza(O o10) {
        try {
            this.zza.zza(o10);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending verification completed response.", e10, new Object[0]);
        }
    }
}
