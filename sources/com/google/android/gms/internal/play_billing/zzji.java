package com.google.android.gms.internal.play_billing;

public final class zzji extends RuntimeException {
    public zzji(zzim zzim) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzhr zza() {
        return new zzhr(getMessage());
    }
}
