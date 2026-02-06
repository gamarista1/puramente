package com.google.android.gms.internal.gcm;

final class zzu extends zzr {
    private final zzs zzdw = new zzs();

    zzu() {
    }

    public final void zzd(Throwable th2, Throwable th3) {
        if (th3 == th2) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th3);
        } else if (th3 != null) {
            this.zzdw.zzd(th2, true).add(th3);
        } else {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
    }
}
