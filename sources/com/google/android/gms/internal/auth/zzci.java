package com.google.android.gms.internal.auth;

import android.net.Uri;
import androidx.collection.Y;

public final class zzci {
    private final Y zza;

    zzci(Y y10) {
        this.zza = y10;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        Y y10;
        if (uri != null) {
            y10 = (Y) this.zza.get(uri.toString());
        } else {
            y10 = null;
        }
        if (y10 == null) {
            return null;
        }
        return (String) y10.get("".concat(str3));
    }
}
