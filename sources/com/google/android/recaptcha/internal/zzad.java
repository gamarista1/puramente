package com.google.android.recaptcha.internal;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import wf.k;

public final class zzad {
    private final Context zza;

    public zzad(Context context) {
        this.zza = context;
    }

    public static final byte[] zza(File file) {
        return k.f(file);
    }

    public static final void zzb(File file, byte[] bArr) {
        if (!file.exists() || file.delete()) {
            k.i(file, bArr);
            return;
        }
        throw new IOException("Unable to delete existing encrypted file");
    }
}
